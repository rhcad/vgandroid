#!/bin/sh
# Type './build.sh' to make Android native libraries.
# Type './build.sh -B' to rebuild the native libraries.
# Type `./build.sh -swig` to re-generate JNI classes too.
# Type `./build.sh APP_ABI=x86` to build for the x86 Emulator.
#
if [ "$1"x = "-swig"x ] || [ ! -f touchvg_java_wrap.cpp ] ; then # Make JNI classes
    mkdir -p ../src/rhcad/touchvg/core
    rm -rf ../src/rhcad/touchvg/core/*.*
    
    swig -c++ -java -package rhcad.touchvg.core -D__ANDROID__ \
        -features autodoc=1 \
        -outdir ../src/rhcad/touchvg/core \
        -o touchvg_java_wrap.cpp \
        -I../../../vgcore/core/include \
        -I../../../vgcore/core/include/canvas \
        -I../../../vgcore/core/include/graph \
        -I../../../vgcore/core/include/cmd \
        -I../../../vgcore/core/include/storage \
        -I../../../vgcore/core/include/geom \
        -I../../../vgcore/core/include/gshape \
        -I../../../vgcore/core/include/shape \
        -I../../../vgcore/core/include/cmdobserver \
        -I../../../vgcore/core/include/cmdbase \
        -I../../../vgcore/core/include/test \
        -I../../../vgcore/core/include/view \
        -I../../../vgcore/core/include/cmdbasic \
        -I../../../vgcore/core/include/shapedoc \
        -I../../../vgcore/core/include/jsonstorage \
        -I../../../vgcore/core/include/cmdmgr \
        -I../../../vgcore/core/include/record \
        -I../../../vgcore/core/src/view \
          ../../../vgcore/core/src/view/touchvg.swig
    python replacejstr.py
    #python addlog.py
fi
if [ "$1"x = "-swig"x ] ; then
    ndk-build $2
else
    ndk-build $1 $2
fi

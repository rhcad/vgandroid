# TouchVG-Android

This is a lightweight 2D vector drawing framework for Android.

Features described in [Online document](http://touchvg.github.io). Please visit [TouchVGTest](https://github.com/touchvg/TouchVGTest-Android) to see more examples.

![arch](http://touchvg.github.io/images/arch.svg) 
![android1](http://touchvg.github.io/images/android1.png)

## License

This is an open source [LGPL 2.1](LICENSE.md) licensed project. It uses the following open source projects:

- [TouchVGCore](https://github.com/touchvg/TouchVGCore) (LGPL): Cross-platform vector drawing libraries using C++.
- [svg-android](https://github.com/japgolly/svg-android) (Apache): Vector graphics support for Android.
- [simple-svg](http://code.google.com/p/simple-svg) (BSD): A C++ header file for creating SVG files.
- [rapidjson](https://github.com/Kanma/rapidjson) (MIT): A fast JSON parser/generator for C++ with both SAX/DOM style API.
- [x3py](https://github.com/rhcad/x3py) (Apache): Compile script files.
- [SWIG](https://github.com/swig/swig) (GPL): Use the tool to generate the glue code for Java and C#.

## How to Contribute

Contributors and sponsors are welcome. You may translate, commit issues or pull requests on this Github site.
To contribute, please follow the branching model outlined here: [A successful Git branching model](http://nvie.com/posts/a-successful-git-branching-model/).

Welcome to the Chinese QQ group `192093613` to discuss and share.

## Contributors

- [Zhang Yungui](https://github.com/rhcad)
- [Archer](https://github.com/a7ch3r)
- [ljlin](https://github.com/ljlin)
- [Pengjun](https://github.com/pengjun) / Line and triangle commands
- [Proteas](https://github.com/proteas)

# How to Compile

- Enter the directory of this project, then type `./build.sh` to generate libtouchvg.so and JNI classes.

  - Need to install the lastest version of [SWIG](http://sourceforge.net/projects/swig/files/), and add the location to PATH on Windows.
  
  - Need to add the [NDK](http://developer.android.com/tools/sdk/ndk/index.html) installation location to PATH.
  
  - If the error `build/gmsl/__gmsl:512: *** non-numeric second argument to wordlist function` occurs, then open the `build/gmsl/__gmsl` file in the NDK installation directory, and change line 512 to:
     `int_encode = $(__gmsl_tr1)$(wordlist 1,$(words $1),$(__gmsl_input_int))`

   - MSYS is recommended on Windows.

- Import this project in eclipse, then build  `touchvg` project.

  - Android SDK version of the projects may need to modify according to your installation.
  
  - Recommend using the newer [ADT Bundle](http://developer.android.com/sdk/index.html) to avoid complex configuration.

- Don't want to build libtouchvg.so and jar? Then you can download the [prebuilt libraries](https://github.com/touchvg/TouchVG-Android/archive/prebuilt.zip) and extract to `yourapp/libs`.

-  Regenerate libtouchvg.so and JNI classes:

   - Type `./build.sh -B` to rebuild the native libraries.
   
   - Type `./build.sh APP_ABI=x86` to build for the x86 (Intel Atom) Emulator.
   
   - Type `./build.sh -swig` to regenerate the kernel JNI classes.

# How to Debug native code

  - Add `#include "mglog.h"` and use `LOGD("your message %d", someint)` in the C++ files needed to debug.
  
  - Set LogCat filter in Eclipse: `tag:dalvikvm|AndroidRuntime|vgjni|touchvg|vgstack|libc|DEBUG`.
  
  - Print JNI functions to locate problems of libc crash:
    1. Add `python addlog.py` in [jni/build.sh](TouchVG/jni/build.sh).
    2. Type `./build.sh -swig` to add log in all JNI entry functions, or remove `touchvg_java_wrap.cpp` and type `./build.sh`.
 
# Add more shapes and commands

- You can use [newproj.py](https://github.com/touchvg/DemoCmds/blob/master/newproj.py) to create library project containing your own shapes and commands. So the TouchVG and TouchVGCore libraries does not require changes.

  - Checkout and enter [DemoCmds](https://github.com/touchvg/DemoCmds) directory, then type `python newproj.py YourCmds`:

     ```shell
     git clone https://github.com/touchvg/DemoCmds.git
     cd DemoCmds
     python newproj.py MyCmds
     ```

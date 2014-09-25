/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class MgRoundRect extends MgBaseRect {
  private long swigCPtr;

  protected MgRoundRect(long cPtr, boolean cMemoryOwn) {
    super(touchvgJNI.MgRoundRect_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MgRoundRect obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_MgRoundRect(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MgRoundRect() {
    this(touchvgJNI.new_MgRoundRect(), true);
  }

  public static MgRoundRect create() {
    long cPtr = touchvgJNI.MgRoundRect_create();
    return (cPtr == 0) ? null : new MgRoundRect(cPtr, false);
  }

  public static int Type() {
    return touchvgJNI.MgRoundRect_Type();
  }

  public MgObject clone() {
    long cPtr = touchvgJNI.MgRoundRect_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MgObject(cPtr, false);
  }

  public void copy(MgObject src) {
    touchvgJNI.MgRoundRect_copy(swigCPtr, this, MgObject.getCPtr(src), src);
  }

  public void release() {
    touchvgJNI.MgRoundRect_release(swigCPtr, this);
  }

  public boolean equals(MgObject src) {
    return touchvgJNI.MgRoundRect_equals(swigCPtr, this, MgObject.getCPtr(src), src);
  }

  public int getType() {
    return touchvgJNI.MgRoundRect_getType(swigCPtr, this);
  }

  public boolean isKindOf(int type) {
    return touchvgJNI.MgRoundRect_isKindOf(swigCPtr, this, type);
  }

  public Box2d getExtent() {
    return new Box2d(touchvgJNI.MgRoundRect_getExtent(swigCPtr, this), true);
  }

  public void update() {
    touchvgJNI.MgRoundRect_update(swigCPtr, this);
  }

  public void transform(Matrix2d mat) {
    touchvgJNI.MgRoundRect_transform(swigCPtr, this, Matrix2d.getCPtr(mat), mat);
  }

  public void clear() {
    touchvgJNI.MgRoundRect_clear(swigCPtr, this);
  }

  public void clearCachedData() {
    touchvgJNI.MgRoundRect_clearCachedData(swigCPtr, this);
  }

  public int getPointCount() {
    return touchvgJNI.MgRoundRect_getPointCount(swigCPtr, this);
  }

  public Point2d getPoint(int index) {
    return new Point2d(touchvgJNI.MgRoundRect_getPoint(swigCPtr, this, index), true);
  }

  public void setPoint(int index, Point2d pt) {
    touchvgJNI.MgRoundRect_setPoint(swigCPtr, this, index, Point2d.getCPtr(pt), pt);
  }

  public boolean isClosed() {
    return touchvgJNI.MgRoundRect_isClosed(swigCPtr, this);
  }

  public boolean hitTestBox(Box2d rect) {
    return touchvgJNI.MgRoundRect_hitTestBox(swigCPtr, this, Box2d.getCPtr(rect), rect);
  }

  public boolean draw(int mode, GiGraphics gs, GiContext ctx, int segment) {
    return touchvgJNI.MgRoundRect_draw(swigCPtr, this, mode, GiGraphics.getCPtr(gs), gs, GiContext.getCPtr(ctx), ctx, segment);
  }

  public void output(MgPath path) {
    touchvgJNI.MgRoundRect_output(swigCPtr, this, MgPath.getCPtr(path), path);
  }

  public boolean save(MgStorage s) {
    return touchvgJNI.MgRoundRect_save(swigCPtr, this, MgStorage.getCPtr(s), s);
  }

  public boolean load(MgShapeFactory factory, MgStorage s) {
    return touchvgJNI.MgRoundRect_load(swigCPtr, this, MgShapeFactory.getCPtr(factory), factory, MgStorage.getCPtr(s), s);
  }

  public int getHandleCount() {
    return touchvgJNI.MgRoundRect_getHandleCount(swigCPtr, this);
  }

  public Point2d getHandlePoint(int index) {
    return new Point2d(touchvgJNI.MgRoundRect_getHandlePoint(swigCPtr, this, index), true);
  }

  public boolean setHandlePoint(int index, Point2d pt, float tol) {
    return touchvgJNI.MgRoundRect_setHandlePoint(swigCPtr, this, index, Point2d.getCPtr(pt), pt, tol);
  }

  public boolean isHandleFixed(int index) {
    return touchvgJNI.MgRoundRect_isHandleFixed(swigCPtr, this, index);
  }

  public int getHandleType(int index) {
    return touchvgJNI.MgRoundRect_getHandleType(swigCPtr, this, index);
  }

  public boolean offset(Vector2d vec, int segment) {
    return touchvgJNI.MgRoundRect_offset(swigCPtr, this, Vector2d.getCPtr(vec), vec, segment);
  }

  public float hitTest(Point2d pt, float tol, MgHitResult res) {
    return touchvgJNI.MgRoundRect_hitTest(swigCPtr, this, Point2d.getCPtr(pt), pt, tol, MgHitResult.getCPtr(res), res);
  }

  public float getRadiusX() {
    return touchvgJNI.MgRoundRect_getRadiusX(swigCPtr, this);
  }

  public float getRadiusY() {
    return touchvgJNI.MgRoundRect_getRadiusY(swigCPtr, this);
  }

  public void setRadius(float rx, float ry) {
    touchvgJNI.MgRoundRect_setRadius__SWIG_0(swigCPtr, this, rx, ry);
  }

  public void setRadius(float rx) {
    touchvgJNI.MgRoundRect_setRadius__SWIG_1(swigCPtr, this, rx);
  }

}

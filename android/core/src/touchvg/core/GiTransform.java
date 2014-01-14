/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package touchvg.core;

public class GiTransform {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected GiTransform(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GiTransform obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_GiTransform(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GiTransform(boolean ydown) {
    this(touchvgJNI.new_GiTransform__SWIG_0(ydown), true);
  }

  public GiTransform() {
    this(touchvgJNI.new_GiTransform__SWIG_1(), true);
  }

  public GiTransform(GiTransform src) {
    this(touchvgJNI.new_GiTransform__SWIG_2(GiTransform.getCPtr(src), src), true);
  }

  public GiTransform copy(GiTransform src) {
    return new GiTransform(touchvgJNI.GiTransform_copy(swigCPtr, this, GiTransform.getCPtr(src), src), false);
  }

  public float getDpiX() {
    return touchvgJNI.GiTransform_getDpiX(swigCPtr, this);
  }

  public float getDpiY() {
    return touchvgJNI.GiTransform_getDpiY(swigCPtr, this);
  }

  public int getWidth() {
    return touchvgJNI.GiTransform_getWidth(swigCPtr, this);
  }

  public int getHeight() {
    return touchvgJNI.GiTransform_getHeight(swigCPtr, this);
  }

  public Point2d getCenterW() {
    return new Point2d(touchvgJNI.GiTransform_getCenterW(swigCPtr, this), true);
  }

  public float getViewScale() {
    return touchvgJNI.GiTransform_getViewScale(swigCPtr, this);
  }

  public float getWorldToDisplayX(boolean useViewScale) {
    return touchvgJNI.GiTransform_getWorldToDisplayX__SWIG_0(swigCPtr, this, useViewScale);
  }

  public float getWorldToDisplayX() {
    return touchvgJNI.GiTransform_getWorldToDisplayX__SWIG_1(swigCPtr, this);
  }

  public float getWorldToDisplayY(boolean useViewScale) {
    return touchvgJNI.GiTransform_getWorldToDisplayY__SWIG_0(swigCPtr, this, useViewScale);
  }

  public float getWorldToDisplayY() {
    return touchvgJNI.GiTransform_getWorldToDisplayY__SWIG_1(swigCPtr, this);
  }

  public float displayToModel(float dist, boolean mm) {
    return touchvgJNI.GiTransform_displayToModel__SWIG_0(swigCPtr, this, dist, mm);
  }

  public float displayToModel(float dist) {
    return touchvgJNI.GiTransform_displayToModel__SWIG_1(swigCPtr, this, dist);
  }

  public Matrix2d modelToWorld() {
    return new Matrix2d(touchvgJNI.GiTransform_modelToWorld(swigCPtr, this), false);
  }

  public Matrix2d worldToModel() {
    return new Matrix2d(touchvgJNI.GiTransform_worldToModel(swigCPtr, this), false);
  }

  public Matrix2d displayToWorld() {
    return new Matrix2d(touchvgJNI.GiTransform_displayToWorld(swigCPtr, this), false);
  }

  public Matrix2d worldToDisplay() {
    return new Matrix2d(touchvgJNI.GiTransform_worldToDisplay(swigCPtr, this), false);
  }

  public Matrix2d displayToModel() {
    return new Matrix2d(touchvgJNI.GiTransform_displayToModel__SWIG_2(swigCPtr, this), false);
  }

  public Matrix2d modelToDisplay() {
    return new Matrix2d(touchvgJNI.GiTransform_modelToDisplay(swigCPtr, this), false);
  }

  public boolean setWndSize(int width, int height) {
    return touchvgJNI.GiTransform_setWndSize(swigCPtr, this, width, height);
  }

  public void setResolution(float dpiX, float dpiY) {
    touchvgJNI.GiTransform_setResolution__SWIG_0(swigCPtr, this, dpiX, dpiY);
  }

  public void setResolution(float dpiX) {
    touchvgJNI.GiTransform_setResolution__SWIG_1(swigCPtr, this, dpiX);
  }

  public void setModelTransform(Matrix2d mat) {
    touchvgJNI.GiTransform_setModelTransform(swigCPtr, this, Matrix2d.getCPtr(mat), mat);
  }

  public Box2d getWndRectW() {
    return new Box2d(touchvgJNI.GiTransform_getWndRectW(swigCPtr, this), true);
  }

  public Box2d getWndRectM() {
    return new Box2d(touchvgJNI.GiTransform_getWndRectM(swigCPtr, this), true);
  }

  public Box2d getWndRect() {
    return new Box2d(touchvgJNI.GiTransform_getWndRect(swigCPtr, this), true);
  }

  public float getMinViewScale() {
    return touchvgJNI.GiTransform_getMinViewScale(swigCPtr, this);
  }

  public float getMaxViewScale() {
    return touchvgJNI.GiTransform_getMaxViewScale(swigCPtr, this);
  }

  public Box2d getWorldLimits() {
    return new Box2d(touchvgJNI.GiTransform_getWorldLimits(swigCPtr, this), true);
  }

  public void setViewScaleRange(float minScale, float maxScale) {
    touchvgJNI.GiTransform_setViewScaleRange(swigCPtr, this, minScale, maxScale);
  }

  public Box2d setWorldLimits(Box2d rect) {
    return new Box2d(touchvgJNI.GiTransform_setWorldLimits(swigCPtr, this, Box2d.getCPtr(rect), rect), true);
  }

  public boolean zoomWnd(Point2d pt1, Point2d pt2, boolean adjust) {
    return touchvgJNI.GiTransform_zoomWnd__SWIG_0(swigCPtr, this, Point2d.getCPtr(pt1), pt1, Point2d.getCPtr(pt2), pt2, adjust);
  }

  public boolean zoomWnd(Point2d pt1, Point2d pt2) {
    return touchvgJNI.GiTransform_zoomWnd__SWIG_1(swigCPtr, this, Point2d.getCPtr(pt1), pt1, Point2d.getCPtr(pt2), pt2);
  }

  public boolean zoomTo(Box2d rectWorld, RECT_2D rcTo, boolean adjust) {
    return touchvgJNI.GiTransform_zoomTo__SWIG_0(swigCPtr, this, Box2d.getCPtr(rectWorld), rectWorld, RECT_2D.getCPtr(rcTo), rcTo, adjust);
  }

  public boolean zoomTo(Box2d rectWorld, RECT_2D rcTo) {
    return touchvgJNI.GiTransform_zoomTo__SWIG_1(swigCPtr, this, Box2d.getCPtr(rectWorld), rectWorld, RECT_2D.getCPtr(rcTo), rcTo);
  }

  public boolean zoomTo(Box2d rectWorld) {
    return touchvgJNI.GiTransform_zoomTo__SWIG_2(swigCPtr, this, Box2d.getCPtr(rectWorld), rectWorld);
  }

  public boolean zoomTo(Point2d pntWorld, Point2d pxAt, boolean adjust) {
    return touchvgJNI.GiTransform_zoomTo__SWIG_3(swigCPtr, this, Point2d.getCPtr(pntWorld), pntWorld, Point2d.getCPtr(pxAt), pxAt, adjust);
  }

  public boolean zoomTo(Point2d pntWorld, Point2d pxAt) {
    return touchvgJNI.GiTransform_zoomTo__SWIG_4(swigCPtr, this, Point2d.getCPtr(pntWorld), pntWorld, Point2d.getCPtr(pxAt), pxAt);
  }

  public boolean zoomTo(Point2d pntWorld) {
    return touchvgJNI.GiTransform_zoomTo__SWIG_5(swigCPtr, this, Point2d.getCPtr(pntWorld), pntWorld);
  }

  public boolean zoomPan(float dxPixel, float dyPixel, boolean adjust) {
    return touchvgJNI.GiTransform_zoomPan__SWIG_0(swigCPtr, this, dxPixel, dyPixel, adjust);
  }

  public boolean zoomPan(float dxPixel, float dyPixel) {
    return touchvgJNI.GiTransform_zoomPan__SWIG_1(swigCPtr, this, dxPixel, dyPixel);
  }

  public boolean zoomByFactor(float factor, Point2d pxAt, boolean adjust) {
    return touchvgJNI.GiTransform_zoomByFactor__SWIG_0(swigCPtr, this, factor, Point2d.getCPtr(pxAt), pxAt, adjust);
  }

  public boolean zoomByFactor(float factor, Point2d pxAt) {
    return touchvgJNI.GiTransform_zoomByFactor__SWIG_1(swigCPtr, this, factor, Point2d.getCPtr(pxAt), pxAt);
  }

  public boolean zoomByFactor(float factor) {
    return touchvgJNI.GiTransform_zoomByFactor__SWIG_2(swigCPtr, this, factor);
  }

  public boolean zoomScale(float viewScale, Point2d pxAt, boolean adjust) {
    return touchvgJNI.GiTransform_zoomScale__SWIG_0(swigCPtr, this, viewScale, Point2d.getCPtr(pxAt), pxAt, adjust);
  }

  public boolean zoomScale(float viewScale, Point2d pxAt) {
    return touchvgJNI.GiTransform_zoomScale__SWIG_1(swigCPtr, this, viewScale, Point2d.getCPtr(pxAt), pxAt);
  }

  public boolean zoomScale(float viewScale) {
    return touchvgJNI.GiTransform_zoomScale__SWIG_2(swigCPtr, this, viewScale);
  }

  public boolean zoom(Point2d centerW, float viewScale) {
    return touchvgJNI.GiTransform_zoom(swigCPtr, this, Point2d.getCPtr(centerW), centerW, viewScale);
  }

  public boolean enableZoom(boolean enabled) {
    return touchvgJNI.GiTransform_enableZoom(swigCPtr, this, enabled);
  }

  public float getZoomValue(Point2d centerW) {
    return touchvgJNI.GiTransform_getZoomValue(swigCPtr, this, Point2d.getCPtr(centerW), centerW);
  }

  public int getZoomTimes() {
    return touchvgJNI.GiTransform_getZoomTimes(swigCPtr, this);
  }

}

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class btSphereShape extends btConvexInternalShape {
  private long swigCPtr;

  protected btSphereShape(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btSphereShape_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btSphereShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btSphereShape(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public btSphereShape(float radius) {
    this(gdxBulletJNI.new_btSphereShape(radius), true);
  }

  public float getRadius() {
    return gdxBulletJNI.btSphereShape_getRadius(swigCPtr, this);
  }

  public void setUnscaledRadius(float radius) {
    gdxBulletJNI.btSphereShape_setUnscaledRadius(swigCPtr, this, radius);
  }

}

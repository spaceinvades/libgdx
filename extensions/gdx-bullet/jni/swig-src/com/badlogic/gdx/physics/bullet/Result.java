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

public class Result {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Result(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Result obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_Result(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setShapeIdentifiersA(int partId0, int index0) {
    gdxBulletJNI.Result_setShapeIdentifiersA(swigCPtr, this, partId0, index0);
  }

  public void setShapeIdentifiersB(int partId1, int index1) {
    gdxBulletJNI.Result_setShapeIdentifiersB(swigCPtr, this, partId1, index1);
  }

  public void addContactPoint(Vector3 normalOnBInWorld, Vector3 pointInWorld, float depth) {
    gdxBulletJNI.Result_addContactPoint(swigCPtr, this, normalOnBInWorld, pointInWorld, depth);
  }

}

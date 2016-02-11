/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.ReDefine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Re Define</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ReDefineImpl#getObjName <em>Obj Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ReDefineImpl#getObj <em>Obj</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReDefineImpl extends MinimalEObjectImpl.Container implements ReDefine
{
  /**
   * The default value of the '{@link #getObjName() <em>Obj Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjName()
   * @generated
   * @ordered
   */
  protected static final String OBJ_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObjName() <em>Obj Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjName()
   * @generated
   * @ordered
   */
  protected String objName = OBJ_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getObj() <em>Obj</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObj()
   * @generated
   * @ordered
   */
  protected org.xtext.example.mydsl.myDsl.Object obj;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReDefineImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.RE_DEFINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getObjName()
  {
    return objName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjName(String newObjName)
  {
    String oldObjName = objName;
    objName = newObjName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RE_DEFINE__OBJ_NAME, oldObjName, objName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.mydsl.myDsl.Object getObj()
  {
    return obj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObj(org.xtext.example.mydsl.myDsl.Object newObj, NotificationChain msgs)
  {
    org.xtext.example.mydsl.myDsl.Object oldObj = obj;
    obj = newObj;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.RE_DEFINE__OBJ, oldObj, newObj);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObj(org.xtext.example.mydsl.myDsl.Object newObj)
  {
    if (newObj != obj)
    {
      NotificationChain msgs = null;
      if (obj != null)
        msgs = ((InternalEObject)obj).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RE_DEFINE__OBJ, null, msgs);
      if (newObj != null)
        msgs = ((InternalEObject)newObj).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RE_DEFINE__OBJ, null, msgs);
      msgs = basicSetObj(newObj, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RE_DEFINE__OBJ, newObj, newObj));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.RE_DEFINE__OBJ:
        return basicSetObj(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.RE_DEFINE__OBJ_NAME:
        return getObjName();
      case MyDslPackage.RE_DEFINE__OBJ:
        return getObj();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.RE_DEFINE__OBJ_NAME:
        setObjName((String)newValue);
        return;
      case MyDslPackage.RE_DEFINE__OBJ:
        setObj((org.xtext.example.mydsl.myDsl.Object)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.RE_DEFINE__OBJ_NAME:
        setObjName(OBJ_NAME_EDEFAULT);
        return;
      case MyDslPackage.RE_DEFINE__OBJ:
        setObj((org.xtext.example.mydsl.myDsl.Object)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.RE_DEFINE__OBJ_NAME:
        return OBJ_NAME_EDEFAULT == null ? objName != null : !OBJ_NAME_EDEFAULT.equals(objName);
      case MyDslPackage.RE_DEFINE__OBJ:
        return obj != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (objName: ");
    result.append(objName);
    result.append(')');
    return result.toString();
  }

} //ReDefineImpl
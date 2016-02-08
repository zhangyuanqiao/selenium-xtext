/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ObjectImpl#getHtmltype <em>Htmltype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ObjectImpl#getObjectName <em>Object Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectImpl extends MinimalEObjectImpl.Container implements org.xtext.example.mydsl.myDsl.Object
{
  /**
   * The default value of the '{@link #getHtmltype() <em>Htmltype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHtmltype()
   * @generated
   * @ordered
   */
  protected static final String HTMLTYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHtmltype() <em>Htmltype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHtmltype()
   * @generated
   * @ordered
   */
  protected String htmltype = HTMLTYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getObjectName() <em>Object Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectName()
   * @generated
   * @ordered
   */
  protected static final String OBJECT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObjectName() <em>Object Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectName()
   * @generated
   * @ordered
   */
  protected String objectName = OBJECT_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectImpl()
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
    return MyDslPackage.Literals.OBJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHtmltype()
  {
    return htmltype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHtmltype(String newHtmltype)
  {
    String oldHtmltype = htmltype;
    htmltype = newHtmltype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.OBJECT__HTMLTYPE, oldHtmltype, htmltype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getObjectName()
  {
    return objectName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjectName(String newObjectName)
  {
    String oldObjectName = objectName;
    objectName = newObjectName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.OBJECT__OBJECT_NAME, oldObjectName, objectName));
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
      case MyDslPackage.OBJECT__HTMLTYPE:
        return getHtmltype();
      case MyDslPackage.OBJECT__OBJECT_NAME:
        return getObjectName();
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
      case MyDslPackage.OBJECT__HTMLTYPE:
        setHtmltype((String)newValue);
        return;
      case MyDslPackage.OBJECT__OBJECT_NAME:
        setObjectName((String)newValue);
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
      case MyDslPackage.OBJECT__HTMLTYPE:
        setHtmltype(HTMLTYPE_EDEFAULT);
        return;
      case MyDslPackage.OBJECT__OBJECT_NAME:
        setObjectName(OBJECT_NAME_EDEFAULT);
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
      case MyDslPackage.OBJECT__HTMLTYPE:
        return HTMLTYPE_EDEFAULT == null ? htmltype != null : !HTMLTYPE_EDEFAULT.equals(htmltype);
      case MyDslPackage.OBJECT__OBJECT_NAME:
        return OBJECT_NAME_EDEFAULT == null ? objectName != null : !OBJECT_NAME_EDEFAULT.equals(objectName);
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
    result.append(" (htmltype: ");
    result.append(htmltype);
    result.append(", objectName: ");
    result.append(objectName);
    result.append(')');
    return result.toString();
  }

} //ObjectImpl

/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Collection;
import org.xtext.example.mydsl.myDsl.DoAll;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Do All</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DoAllImpl#getColl <em>Coll</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DoAllImpl#getTodo <em>Todo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoAllImpl extends StructureImpl implements DoAll
{
  /**
   * The cached value of the '{@link #getColl() <em>Coll</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColl()
   * @generated
   * @ordered
   */
  protected Collection coll;

  /**
   * The cached value of the '{@link #getTodo() <em>Todo</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTodo()
   * @generated
   * @ordered
   */
  protected EList<EObject> todo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DoAllImpl()
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
    return MyDslPackage.Literals.DO_ALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Collection getColl()
  {
    return coll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColl(Collection newColl, NotificationChain msgs)
  {
    Collection oldColl = coll;
    coll = newColl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DO_ALL__COLL, oldColl, newColl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColl(Collection newColl)
  {
    if (newColl != coll)
    {
      NotificationChain msgs = null;
      if (coll != null)
        msgs = ((InternalEObject)coll).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DO_ALL__COLL, null, msgs);
      if (newColl != null)
        msgs = ((InternalEObject)newColl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DO_ALL__COLL, null, msgs);
      msgs = basicSetColl(newColl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DO_ALL__COLL, newColl, newColl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getTodo()
  {
    if (todo == null)
    {
      todo = new EObjectContainmentEList<EObject>(EObject.class, this, MyDslPackage.DO_ALL__TODO);
    }
    return todo;
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
      case MyDslPackage.DO_ALL__COLL:
        return basicSetColl(null, msgs);
      case MyDslPackage.DO_ALL__TODO:
        return ((InternalEList<?>)getTodo()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.DO_ALL__COLL:
        return getColl();
      case MyDslPackage.DO_ALL__TODO:
        return getTodo();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.DO_ALL__COLL:
        setColl((Collection)newValue);
        return;
      case MyDslPackage.DO_ALL__TODO:
        getTodo().clear();
        getTodo().addAll((java.util.Collection<? extends EObject>)newValue);
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
      case MyDslPackage.DO_ALL__COLL:
        setColl((Collection)null);
        return;
      case MyDslPackage.DO_ALL__TODO:
        getTodo().clear();
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
      case MyDslPackage.DO_ALL__COLL:
        return coll != null;
      case MyDslPackage.DO_ALL__TODO:
        return todo != null && !todo.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DoAllImpl

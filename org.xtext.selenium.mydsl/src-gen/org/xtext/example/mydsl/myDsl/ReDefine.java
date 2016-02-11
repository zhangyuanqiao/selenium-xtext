/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Re Define</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ReDefine#getObjName <em>Obj Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ReDefine#getObj <em>Obj</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getReDefine()
 * @model
 * @generated
 */
public interface ReDefine extends EObject
{
  /**
   * Returns the value of the '<em><b>Obj Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Obj Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obj Name</em>' attribute.
   * @see #setObjName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getReDefine_ObjName()
   * @model
   * @generated
   */
  String getObjName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ReDefine#getObjName <em>Obj Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obj Name</em>' attribute.
   * @see #getObjName()
   * @generated
   */
  void setObjName(String value);

  /**
   * Returns the value of the '<em><b>Obj</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Obj</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obj</em>' containment reference.
   * @see #setObj(org.xtext.example.mydsl.myDsl.Object)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getReDefine_Obj()
   * @model containment="true"
   * @generated
   */
  org.xtext.example.mydsl.myDsl.Object getObj();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ReDefine#getObj <em>Obj</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obj</em>' containment reference.
   * @see #getObj()
   * @generated
   */
  void setObj(org.xtext.example.mydsl.myDsl.Object value);

} // ReDefine

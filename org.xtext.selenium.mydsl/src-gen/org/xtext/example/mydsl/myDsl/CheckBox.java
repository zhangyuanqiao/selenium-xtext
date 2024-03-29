/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.CheckBox#getNametag <em>Nametag</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.CheckBox#getNewValue <em>New Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCheckBox()
 * @model
 * @generated
 */
public interface CheckBox extends Action
{
  /**
   * Returns the value of the '<em><b>Nametag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nametag</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nametag</em>' attribute.
   * @see #setNametag(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCheckBox_Nametag()
   * @model
   * @generated
   */
  String getNametag();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.CheckBox#getNametag <em>Nametag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nametag</em>' attribute.
   * @see #getNametag()
   * @generated
   */
  void setNametag(String value);

  /**
   * Returns the value of the '<em><b>New Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Value</em>' attribute.
   * @see #setNewValue(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCheckBox_NewValue()
   * @model
   * @generated
   */
  String getNewValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.CheckBox#getNewValue <em>New Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Value</em>' attribute.
   * @see #getNewValue()
   * @generated
   */
  void setNewValue(String value);

} // CheckBox

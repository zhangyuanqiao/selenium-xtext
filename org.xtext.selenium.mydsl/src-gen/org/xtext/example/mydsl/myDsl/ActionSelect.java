/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ActionSelect#getOption <em>Option</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ActionSelect#getXpath <em>Xpath</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getActionSelect()
 * @model
 * @generated
 */
public interface ActionSelect extends Action
{
  /**
   * Returns the value of the '<em><b>Option</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Option</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Option</em>' attribute.
   * @see #setOption(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getActionSelect_Option()
   * @model
   * @generated
   */
  String getOption();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ActionSelect#getOption <em>Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Option</em>' attribute.
   * @see #getOption()
   * @generated
   */
  void setOption(String value);

  /**
   * Returns the value of the '<em><b>Xpath</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Xpath</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xpath</em>' attribute.
   * @see #setXpath(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getActionSelect_Xpath()
   * @model
   * @generated
   */
  String getXpath();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ActionSelect#getXpath <em>Xpath</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Xpath</em>' attribute.
   * @see #getXpath()
   * @generated
   */
  void setXpath(String value);

} // ActionSelect

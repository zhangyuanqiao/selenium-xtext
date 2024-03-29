/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.If#getCond <em>Cond</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.If#getActionThen <em>Action Then</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.If#getActionElse <em>Action Else</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIf()
 * @model
 * @generated
 */
public interface If extends Structure
{
  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(Condition)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIf_Cond()
   * @model containment="true"
   * @generated
   */
  Condition getCond();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.If#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(Condition value);

  /**
   * Returns the value of the '<em><b>Action Then</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action Then</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Then</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIf_ActionThen()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActionThen();

  /**
   * Returns the value of the '<em><b>Action Else</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action Else</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Else</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIf_ActionElse()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActionElse();

} // If

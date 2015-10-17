/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest Model Method Conclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.RestModelMethodConclusion#getRestModel <em>Rest Model</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.RestModelMethodConclusion#getException <em>Exception</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRestModelMethodConclusion()
 * @model
 * @generated
 */
public interface RestModelMethodConclusion extends EObject
{
  /**
   * Returns the value of the '<em><b>Rest Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rest Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rest Model</em>' reference.
   * @see #setRestModel(RestModel)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRestModelMethodConclusion_RestModel()
   * @model
   * @generated
   */
  RestModel getRestModel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.RestModelMethodConclusion#getRestModel <em>Rest Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rest Model</em>' reference.
   * @see #getRestModel()
   * @generated
   */
  void setRestModel(RestModel value);

  /**
   * Returns the value of the '<em><b>Exception</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.RestExceptionList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exception</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRestModelMethodConclusion_Exception()
   * @model containment="true"
   * @generated
   */
  EList<RestExceptionList> getException();

} // RestModelMethodConclusion

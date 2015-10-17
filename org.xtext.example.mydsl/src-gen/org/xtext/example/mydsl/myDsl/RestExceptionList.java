/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest Exception List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.RestExceptionList#getException <em>Exception</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRestExceptionList()
 * @model
 * @generated
 */
public interface RestExceptionList extends EObject
{
  /**
   * Returns the value of the '<em><b>Exception</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.RestException}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exception</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRestExceptionList_Exception()
   * @model containment="true"
   * @generated
   */
  EList<RestException> getException();

} // RestExceptionList

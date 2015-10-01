/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.RestException#getStatusCode <em>Status Code</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRestException()
 * @model
 * @generated
 */
public interface RestException extends EObject
{
  /**
   * Returns the value of the '<em><b>Status Code</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDsl.RestStatusCode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Status Code</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Status Code</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.RestStatusCode
   * @see #setStatusCode(RestStatusCode)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRestException_StatusCode()
   * @model
   * @generated
   */
  RestStatusCode getStatusCode();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.RestException#getStatusCode <em>Status Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status Code</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.RestStatusCode
   * @see #getStatusCode()
   * @generated
   */
  void setStatusCode(RestStatusCode value);

} // RestException

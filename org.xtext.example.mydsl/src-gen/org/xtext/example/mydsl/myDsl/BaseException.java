/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.BaseException#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.BaseException#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBaseException()
 * @model
 * @generated
 */
public interface BaseException extends EObject
{
  /**
   * Returns the value of the '<em><b>Error Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Error Code</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Error Code</em>' attribute.
   * @see #setErrorCode(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBaseException_ErrorCode()
   * @model
   * @generated
   */
  String getErrorCode();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.BaseException#getErrorCode <em>Error Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Error Code</em>' attribute.
   * @see #getErrorCode()
   * @generated
   */
  void setErrorCode(String value);

  /**
   * Returns the value of the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' attribute.
   * @see #setMessage(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBaseException_Message()
   * @model
   * @generated
   */
  String getMessage();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.BaseException#getMessage <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' attribute.
   * @see #getMessage()
   * @generated
   */
  void setMessage(String value);

} // BaseException

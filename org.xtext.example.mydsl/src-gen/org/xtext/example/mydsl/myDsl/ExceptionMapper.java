/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExceptionMapper#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExceptionMapper#getRestException <em>Rest Exception</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExceptionMapper#getBaseException <em>Base Exception</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExceptionMapper()
 * @model
 * @generated
 */
public interface ExceptionMapper extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExceptionMapper_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ExceptionMapper#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Rest Exception</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rest Exception</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rest Exception</em>' containment reference.
   * @see #setRestException(RestException)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExceptionMapper_RestException()
   * @model containment="true"
   * @generated
   */
  RestException getRestException();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ExceptionMapper#getRestException <em>Rest Exception</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rest Exception</em>' containment reference.
   * @see #getRestException()
   * @generated
   */
  void setRestException(RestException value);

  /**
   * Returns the value of the '<em><b>Base Exception</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Exception</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Exception</em>' containment reference.
   * @see #setBaseException(BaseException)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExceptionMapper_BaseException()
   * @model containment="true"
   * @generated
   */
  BaseException getBaseException();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ExceptionMapper#getBaseException <em>Base Exception</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Exception</em>' containment reference.
   * @see #getBaseException()
   * @generated
   */
  void setBaseException(BaseException value);

} // ExceptionMapper

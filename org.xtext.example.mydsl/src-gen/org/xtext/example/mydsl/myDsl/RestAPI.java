/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest API</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.RestAPI#getResource <em>Resource</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.RestAPI#getService <em>Service</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.RestAPI#getDao <em>Dao</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.RestAPI#getExceptionMapper <em>Exception Mapper</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRestAPI()
 * @model
 * @generated
 */
public interface RestAPI extends EObject
{
  /**
   * Returns the value of the '<em><b>Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource</em>' containment reference.
   * @see #setResource(Resource)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRestAPI_Resource()
   * @model containment="true"
   * @generated
   */
  Resource getResource();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.RestAPI#getResource <em>Resource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource</em>' containment reference.
   * @see #getResource()
   * @generated
   */
  void setResource(Resource value);

  /**
   * Returns the value of the '<em><b>Service</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Service}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRestAPI_Service()
   * @model containment="true"
   * @generated
   */
  EList<Service> getService();

  /**
   * Returns the value of the '<em><b>Dao</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.DataAccessObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dao</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dao</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRestAPI_Dao()
   * @model containment="true"
   * @generated
   */
  EList<DataAccessObject> getDao();

  /**
   * Returns the value of the '<em><b>Exception Mapper</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ExceptionMapper}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exception Mapper</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception Mapper</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRestAPI_ExceptionMapper()
   * @model containment="true"
   * @generated
   */
  EList<ExceptionMapper> getExceptionMapper();

} // RestAPI

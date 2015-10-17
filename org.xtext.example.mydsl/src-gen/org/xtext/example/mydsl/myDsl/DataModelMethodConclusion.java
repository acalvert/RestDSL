/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Model Method Conclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataModelMethodConclusion#getDataModel <em>Data Model</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataModelMethodConclusion#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataModelMethodConclusion()
 * @model
 * @generated
 */
public interface DataModelMethodConclusion extends EObject
{
  /**
   * Returns the value of the '<em><b>Data Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Model</em>' reference.
   * @see #setDataModel(DataModel)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataModelMethodConclusion_DataModel()
   * @model
   * @generated
   */
  DataModel getDataModel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataModelMethodConclusion#getDataModel <em>Data Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Model</em>' reference.
   * @see #getDataModel()
   * @generated
   */
  void setDataModel(DataModel value);

  /**
   * Returns the value of the '<em><b>Exceptions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.RestExceptionList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exceptions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exceptions</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataModelMethodConclusion_Exceptions()
   * @model containment="true"
   * @generated
   */
  EList<RestExceptionList> getExceptions();

} // DataModelMethodConclusion

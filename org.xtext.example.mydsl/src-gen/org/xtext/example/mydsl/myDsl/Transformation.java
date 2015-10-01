/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Transformation#getDataModel <em>Data Model</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Transformation#getRestModel <em>Rest Model</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends EObject
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTransformation_DataModel()
   * @model
   * @generated
   */
  DataModel getDataModel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Transformation#getDataModel <em>Data Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Model</em>' reference.
   * @see #getDataModel()
   * @generated
   */
  void setDataModel(DataModel value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTransformation_RestModel()
   * @model
   * @generated
   */
  RestModel getRestModel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Transformation#getRestModel <em>Rest Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rest Model</em>' reference.
   * @see #getRestModel()
   * @generated
   */
  void setRestModel(RestModel value);

} // Transformation

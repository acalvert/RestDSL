/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DomainModel#getElements <em>Elements</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DomainModel#getApis <em>Apis</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDomainModel()
 * @model
 * @generated
 */
public interface DomainModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDomainModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Type> getElements();

  /**
   * Returns the value of the '<em><b>Apis</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.RestAPI}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Apis</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Apis</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDomainModel_Apis()
   * @model containment="true"
   * @generated
   */
  EList<RestAPI> getApis();

} // DomainModel

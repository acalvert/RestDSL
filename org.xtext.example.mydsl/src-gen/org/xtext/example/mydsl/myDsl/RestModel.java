/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.RestModel#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.RestModel#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRestModel()
 * @model
 * @generated
 */
public interface RestModel extends Type
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(RestModel)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRestModel_SuperType()
   * @model
   * @generated
   */
  RestModel getSuperType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.RestModel#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(RestModel value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRestModel_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

} // RestModel

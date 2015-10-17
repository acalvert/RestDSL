/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ModelMapper#getTransformation <em>Transformation</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModelMapper()
 * @model
 * @generated
 */
public interface ModelMapper extends Type
{
  /**
   * Returns the value of the '<em><b>Transformation</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Transformation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transformation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transformation</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModelMapper_Transformation()
   * @model containment="true"
   * @generated
   */
  EList<Transformation> getTransformation();

} // ModelMapper

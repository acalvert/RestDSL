/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public interface MyDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslFactory eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Domain Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domain Model</em>'.
   * @generated
   */
  DomainModel createDomainModel();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Rest API</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rest API</em>'.
   * @generated
   */
  RestAPI createRestAPI();

  /**
   * Returns a new object of class '<em>Primitive Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primitive Type</em>'.
   * @generated
   */
  PrimitiveType createPrimitiveType();

  /**
   * Returns a new object of class '<em>Data Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Model</em>'.
   * @generated
   */
  DataModel createDataModel();

  /**
   * Returns a new object of class '<em>Rest Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rest Model</em>'.
   * @generated
   */
  RestModel createRestModel();

  /**
   * Returns a new object of class '<em>Mapping Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping Model</em>'.
   * @generated
   */
  MappingModel createMappingModel();

  /**
   * Returns a new object of class '<em>Transformation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transformation</em>'.
   * @generated
   */
  Transformation createTransformation();

  /**
   * Returns a new object of class '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();

  /**
   * Returns a new object of class '<em>Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource</em>'.
   * @generated
   */
  Resource createResource();

  /**
   * Returns a new object of class '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service</em>'.
   * @generated
   */
  Service createService();

  /**
   * Returns a new object of class '<em>Data Access Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Access Object</em>'.
   * @generated
   */
  DataAccessObject createDataAccessObject();

  /**
   * Returns a new object of class '<em>Rest Exception</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rest Exception</em>'.
   * @generated
   */
  RestException createRestException();

  /**
   * Returns a new object of class '<em>Java Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Java Method</em>'.
   * @generated
   */
  JavaMethod createJavaMethod();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyDslPackage getMyDslPackage();

} //MyDslFactory

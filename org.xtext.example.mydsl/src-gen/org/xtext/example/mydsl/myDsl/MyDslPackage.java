/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DomainModelImpl <em>Domain Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DomainModelImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDomainModel()
   * @generated
   */
  int DOMAIN_MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL__ELEMENTS = 0;

  /**
   * The feature id for the '<em><b>Apis</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL__APIS = 1;

  /**
   * The number of structural features of the '<em>Domain Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.TypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getType()
   * @generated
   */
  int TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RestAPIImpl <em>Rest API</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RestAPIImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRestAPI()
   * @generated
   */
  int REST_API = 2;

  /**
   * The feature id for the '<em><b>Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_API__RESOURCE = 0;

  /**
   * The feature id for the '<em><b>Service</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_API__SERVICE = 1;

  /**
   * The feature id for the '<em><b>Dao</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_API__DAO = 2;

  /**
   * The number of structural features of the '<em>Rest API</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_API_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PrimitiveTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPrimitiveType()
   * @generated
   */
  int PRIMITIVE_TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE__NAME = TYPE__NAME;

  /**
   * The number of structural features of the '<em>Primitive Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DataModelImpl <em>Data Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DataModelImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDataModel()
   * @generated
   */
  int DATA_MODEL = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL__SUPER_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL__FEATURES = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RestModelImpl <em>Rest Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RestModelImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRestModel()
   * @generated
   */
  int REST_MODEL = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_MODEL__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_MODEL__SUPER_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_MODEL__FEATURES = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Rest Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_MODEL_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.MappingModelImpl <em>Mapping Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.MappingModelImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMappingModel()
   * @generated
   */
  int MAPPING_MODEL = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODEL__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Transformation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODEL__TRANSFORMATION = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mapping Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODEL_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.TransformationImpl <em>Transformation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.TransformationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTransformation()
   * @generated
   */
  int TRANSFORMATION = 7;

  /**
   * The feature id for the '<em><b>Data Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__DATA_MODEL = 0;

  /**
   * The feature id for the '<em><b>Rest Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__REST_MODEL = 1;

  /**
   * The number of structural features of the '<em>Transformation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.FeatureImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 8;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ResourceImpl <em>Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ResourceImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getResource()
   * @generated
   */
  int RESOURCE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Create Rest Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__CREATE_REST_MODEL = 1;

  /**
   * The feature id for the '<em><b>Exception1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__EXCEPTION1 = 2;

  /**
   * The feature id for the '<em><b>Create Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__CREATE_METHOD = 3;

  /**
   * The feature id for the '<em><b>Created Rest Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__CREATED_REST_MODEL = 4;

  /**
   * The feature id for the '<em><b>Findby</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__FINDBY = 5;

  /**
   * The feature id for the '<em><b>Exception2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__EXCEPTION2 = 6;

  /**
   * The feature id for the '<em><b>Find Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__FIND_METHOD = 7;

  /**
   * The feature id for the '<em><b>Found Rest Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__FOUND_REST_MODEL = 8;

  /**
   * The feature id for the '<em><b>Updateby</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__UPDATEBY = 9;

  /**
   * The feature id for the '<em><b>Update Rest Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__UPDATE_REST_MODEL = 10;

  /**
   * The feature id for the '<em><b>Exception3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__EXCEPTION3 = 11;

  /**
   * The feature id for the '<em><b>Update Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__UPDATE_METHOD = 12;

  /**
   * The feature id for the '<em><b>Updated Rest Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__UPDATED_REST_MODEL = 13;

  /**
   * The feature id for the '<em><b>Deleteby</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__DELETEBY = 14;

  /**
   * The feature id for the '<em><b>Exception4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__EXCEPTION4 = 15;

  /**
   * The feature id for the '<em><b>Delete Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__DELETE_METHOD = 16;

  /**
   * The number of structural features of the '<em>Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_FEATURE_COUNT = 17;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ServiceImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getService()
   * @generated
   */
  int SERVICE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__NAME = 0;

  /**
   * The feature id for the '<em><b>Create Data Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__CREATE_DATA_MODEL = 1;

  /**
   * The feature id for the '<em><b>Exception1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__EXCEPTION1 = 2;

  /**
   * The feature id for the '<em><b>Create Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__CREATE_METHOD = 3;

  /**
   * The feature id for the '<em><b>Created Data Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__CREATED_DATA_MODEL = 4;

  /**
   * The feature id for the '<em><b>Findby</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__FINDBY = 5;

  /**
   * The feature id for the '<em><b>Exception2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__EXCEPTION2 = 6;

  /**
   * The feature id for the '<em><b>Find Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__FIND_METHOD = 7;

  /**
   * The feature id for the '<em><b>Found Data Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__FOUND_DATA_MODEL = 8;

  /**
   * The feature id for the '<em><b>Updateby</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__UPDATEBY = 9;

  /**
   * The feature id for the '<em><b>Update Data Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__UPDATE_DATA_MODEL = 10;

  /**
   * The feature id for the '<em><b>Exception3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__EXCEPTION3 = 11;

  /**
   * The feature id for the '<em><b>Update Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__UPDATE_METHOD = 12;

  /**
   * The feature id for the '<em><b>Updated Data Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__UPDATED_DATA_MODEL = 13;

  /**
   * The feature id for the '<em><b>Deleteby</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__DELETEBY = 14;

  /**
   * The feature id for the '<em><b>Exception4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__EXCEPTION4 = 15;

  /**
   * The feature id for the '<em><b>Delete Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__DELETE_METHOD = 16;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = 17;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DataAccessObjectImpl <em>Data Access Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DataAccessObjectImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDataAccessObject()
   * @generated
   */
  int DATA_ACCESS_OBJECT = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__NAME = 0;

  /**
   * The feature id for the '<em><b>Create Data Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__CREATE_DATA_MODEL = 1;

  /**
   * The feature id for the '<em><b>Exception1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__EXCEPTION1 = 2;

  /**
   * The feature id for the '<em><b>Create Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__CREATE_METHOD = 3;

  /**
   * The feature id for the '<em><b>Created Data Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__CREATED_DATA_MODEL = 4;

  /**
   * The feature id for the '<em><b>Findby</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__FINDBY = 5;

  /**
   * The feature id for the '<em><b>Exception2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__EXCEPTION2 = 6;

  /**
   * The feature id for the '<em><b>Find Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__FIND_METHOD = 7;

  /**
   * The feature id for the '<em><b>Found Data Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__FOUND_DATA_MODEL = 8;

  /**
   * The feature id for the '<em><b>Updateby</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__UPDATEBY = 9;

  /**
   * The feature id for the '<em><b>Update Data Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__UPDATE_DATA_MODEL = 10;

  /**
   * The feature id for the '<em><b>Exception3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__EXCEPTION3 = 11;

  /**
   * The feature id for the '<em><b>Update Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__UPDATE_METHOD = 12;

  /**
   * The feature id for the '<em><b>Updated Data Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__UPDATED_DATA_MODEL = 13;

  /**
   * The feature id for the '<em><b>Deleteby</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__DELETEBY = 14;

  /**
   * The feature id for the '<em><b>Exception4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__EXCEPTION4 = 15;

  /**
   * The feature id for the '<em><b>Delete Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__DELETE_METHOD = 16;

  /**
   * The number of structural features of the '<em>Data Access Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT_FEATURE_COUNT = 17;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RestExceptionImpl <em>Rest Exception</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RestExceptionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRestException()
   * @generated
   */
  int REST_EXCEPTION = 12;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_EXCEPTION__STATUS_CODE = 0;

  /**
   * The number of structural features of the '<em>Rest Exception</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_EXCEPTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.JavaMethodImpl <em>Java Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.JavaMethodImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getJavaMethod()
   * @generated
   */
  int JAVA_METHOD = 13;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_METHOD__CODE = 0;

  /**
   * The number of structural features of the '<em>Java Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_METHOD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.RestStatusCode <em>Rest Status Code</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.RestStatusCode
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRestStatusCode()
   * @generated
   */
  int REST_STATUS_CODE = 14;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DomainModel <em>Domain Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.DomainModel
   * @generated
   */
  EClass getDomainModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.DomainModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.example.mydsl.myDsl.DomainModel#getElements()
   * @see #getDomainModel()
   * @generated
   */
  EReference getDomainModel_Elements();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.DomainModel#getApis <em>Apis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Apis</em>'.
   * @see org.xtext.example.mydsl.myDsl.DomainModel#getApis()
   * @see #getDomainModel()
   * @generated
   */
  EReference getDomainModel_Apis();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.RestAPI <em>Rest API</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rest API</em>'.
   * @see org.xtext.example.mydsl.myDsl.RestAPI
   * @generated
   */
  EClass getRestAPI();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.RestAPI#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Resource</em>'.
   * @see org.xtext.example.mydsl.myDsl.RestAPI#getResource()
   * @see #getRestAPI()
   * @generated
   */
  EReference getRestAPI_Resource();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.RestAPI#getService <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Service</em>'.
   * @see org.xtext.example.mydsl.myDsl.RestAPI#getService()
   * @see #getRestAPI()
   * @generated
   */
  EReference getRestAPI_Service();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.RestAPI#getDao <em>Dao</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dao</em>'.
   * @see org.xtext.example.mydsl.myDsl.RestAPI#getDao()
   * @see #getRestAPI()
   * @generated
   */
  EReference getRestAPI_Dao();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.PrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.PrimitiveType
   * @generated
   */
  EClass getPrimitiveType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DataModel <em>Data Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataModel
   * @generated
   */
  EClass getDataModel();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.DataModel#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataModel#getSuperType()
   * @see #getDataModel()
   * @generated
   */
  EReference getDataModel_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.DataModel#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataModel#getFeatures()
   * @see #getDataModel()
   * @generated
   */
  EReference getDataModel_Features();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.RestModel <em>Rest Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rest Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.RestModel
   * @generated
   */
  EClass getRestModel();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.RestModel#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.RestModel#getSuperType()
   * @see #getRestModel()
   * @generated
   */
  EReference getRestModel_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.RestModel#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.xtext.example.mydsl.myDsl.RestModel#getFeatures()
   * @see #getRestModel()
   * @generated
   */
  EReference getRestModel_Features();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.MappingModel <em>Mapping Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.MappingModel
   * @generated
   */
  EClass getMappingModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.MappingModel#getTransformation <em>Transformation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transformation</em>'.
   * @see org.xtext.example.mydsl.myDsl.MappingModel#getTransformation()
   * @see #getMappingModel()
   * @generated
   */
  EReference getMappingModel_Transformation();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Transformation <em>Transformation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transformation</em>'.
   * @see org.xtext.example.mydsl.myDsl.Transformation
   * @generated
   */
  EClass getTransformation();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Transformation#getDataModel <em>Data Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Data Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.Transformation#getDataModel()
   * @see #getTransformation()
   * @generated
   */
  EReference getTransformation_DataModel();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Transformation#getRestModel <em>Rest Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rest Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.Transformation#getRestModel()
   * @see #getTransformation()
   * @generated
   */
  EReference getTransformation_RestModel();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see org.xtext.example.mydsl.myDsl.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Feature#isMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.example.mydsl.myDsl.Feature#isMany()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Many();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Feature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Feature#getType()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource</em>'.
   * @see org.xtext.example.mydsl.myDsl.Resource
   * @generated
   */
  EClass getResource();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Resource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Resource#getName()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Resource#getCreateRestModel <em>Create Rest Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Create Rest Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.Resource#getCreateRestModel()
   * @see #getResource()
   * @generated
   */
  EReference getResource_CreateRestModel();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Resource#getException1 <em>Exception1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception1</em>'.
   * @see org.xtext.example.mydsl.myDsl.Resource#getException1()
   * @see #getResource()
   * @generated
   */
  EReference getResource_Exception1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Resource#getCreateMethod <em>Create Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Create Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.Resource#getCreateMethod()
   * @see #getResource()
   * @generated
   */
  EReference getResource_CreateMethod();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Resource#getCreatedRestModel <em>Created Rest Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Created Rest Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.Resource#getCreatedRestModel()
   * @see #getResource()
   * @generated
   */
  EReference getResource_CreatedRestModel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Resource#getFindby <em>Findby</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Findby</em>'.
   * @see org.xtext.example.mydsl.myDsl.Resource#getFindby()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Findby();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Resource#getException2 <em>Exception2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception2</em>'.
   * @see org.xtext.example.mydsl.myDsl.Resource#getException2()
   * @see #getResource()
   * @generated
   */
  EReference getResource_Exception2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Resource#getFindMethod <em>Find Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Find Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.Resource#getFindMethod()
   * @see #getResource()
   * @generated
   */
  EReference getResource_FindMethod();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Resource#getFoundRestModel <em>Found Rest Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Found Rest Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.Resource#getFoundRestModel()
   * @see #getResource()
   * @generated
   */
  EReference getResource_FoundRestModel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Resource#getUpdateby <em>Updateby</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updateby</em>'.
   * @see org.xtext.example.mydsl.myDsl.Resource#getUpdateby()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Updateby();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Resource#getUpdateRestModel <em>Update Rest Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Update Rest Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.Resource#getUpdateRestModel()
   * @see #getResource()
   * @generated
   */
  EReference getResource_UpdateRestModel();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Resource#getException3 <em>Exception3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception3</em>'.
   * @see org.xtext.example.mydsl.myDsl.Resource#getException3()
   * @see #getResource()
   * @generated
   */
  EReference getResource_Exception3();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Resource#getUpdateMethod <em>Update Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Update Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.Resource#getUpdateMethod()
   * @see #getResource()
   * @generated
   */
  EReference getResource_UpdateMethod();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Resource#getUpdatedRestModel <em>Updated Rest Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Updated Rest Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.Resource#getUpdatedRestModel()
   * @see #getResource()
   * @generated
   */
  EReference getResource_UpdatedRestModel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Resource#getDeleteby <em>Deleteby</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deleteby</em>'.
   * @see org.xtext.example.mydsl.myDsl.Resource#getDeleteby()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Deleteby();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Resource#getException4 <em>Exception4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception4</em>'.
   * @see org.xtext.example.mydsl.myDsl.Resource#getException4()
   * @see #getResource()
   * @generated
   */
  EReference getResource_Exception4();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Resource#getDeleteMethod <em>Delete Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.Resource#getDeleteMethod()
   * @see #getResource()
   * @generated
   */
  EReference getResource_DeleteMethod();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Service#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service#getName()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Service#getCreateDataModel <em>Create Data Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Create Data Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service#getCreateDataModel()
   * @see #getService()
   * @generated
   */
  EReference getService_CreateDataModel();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Service#getException1 <em>Exception1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception1</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service#getException1()
   * @see #getService()
   * @generated
   */
  EReference getService_Exception1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Service#getCreateMethod <em>Create Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Create Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service#getCreateMethod()
   * @see #getService()
   * @generated
   */
  EReference getService_CreateMethod();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Service#getCreatedDataModel <em>Created Data Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Created Data Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service#getCreatedDataModel()
   * @see #getService()
   * @generated
   */
  EReference getService_CreatedDataModel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Service#getFindby <em>Findby</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Findby</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service#getFindby()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Findby();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Service#getException2 <em>Exception2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception2</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service#getException2()
   * @see #getService()
   * @generated
   */
  EReference getService_Exception2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Service#getFindMethod <em>Find Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Find Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service#getFindMethod()
   * @see #getService()
   * @generated
   */
  EReference getService_FindMethod();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Service#getFoundDataModel <em>Found Data Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Found Data Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service#getFoundDataModel()
   * @see #getService()
   * @generated
   */
  EReference getService_FoundDataModel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Service#getUpdateby <em>Updateby</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updateby</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service#getUpdateby()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Updateby();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Service#getUpdateDataModel <em>Update Data Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Update Data Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service#getUpdateDataModel()
   * @see #getService()
   * @generated
   */
  EReference getService_UpdateDataModel();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Service#getException3 <em>Exception3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception3</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service#getException3()
   * @see #getService()
   * @generated
   */
  EReference getService_Exception3();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Service#getUpdateMethod <em>Update Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Update Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service#getUpdateMethod()
   * @see #getService()
   * @generated
   */
  EReference getService_UpdateMethod();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Service#getUpdatedDataModel <em>Updated Data Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Updated Data Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service#getUpdatedDataModel()
   * @see #getService()
   * @generated
   */
  EReference getService_UpdatedDataModel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Service#getDeleteby <em>Deleteby</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deleteby</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service#getDeleteby()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Deleteby();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Service#getException4 <em>Exception4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception4</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service#getException4()
   * @see #getService()
   * @generated
   */
  EReference getService_Exception4();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Service#getDeleteMethod <em>Delete Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service#getDeleteMethod()
   * @see #getService()
   * @generated
   */
  EReference getService_DeleteMethod();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DataAccessObject <em>Data Access Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Access Object</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccessObject
   * @generated
   */
  EClass getDataAccessObject();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccessObject#getName()
   * @see #getDataAccessObject()
   * @generated
   */
  EAttribute getDataAccessObject_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getCreateDataModel <em>Create Data Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Create Data Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccessObject#getCreateDataModel()
   * @see #getDataAccessObject()
   * @generated
   */
  EReference getDataAccessObject_CreateDataModel();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getException1 <em>Exception1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception1</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccessObject#getException1()
   * @see #getDataAccessObject()
   * @generated
   */
  EReference getDataAccessObject_Exception1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getCreateMethod <em>Create Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Create Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccessObject#getCreateMethod()
   * @see #getDataAccessObject()
   * @generated
   */
  EReference getDataAccessObject_CreateMethod();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getCreatedDataModel <em>Created Data Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Created Data Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccessObject#getCreatedDataModel()
   * @see #getDataAccessObject()
   * @generated
   */
  EReference getDataAccessObject_CreatedDataModel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getFindby <em>Findby</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Findby</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccessObject#getFindby()
   * @see #getDataAccessObject()
   * @generated
   */
  EAttribute getDataAccessObject_Findby();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getException2 <em>Exception2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception2</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccessObject#getException2()
   * @see #getDataAccessObject()
   * @generated
   */
  EReference getDataAccessObject_Exception2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getFindMethod <em>Find Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Find Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccessObject#getFindMethod()
   * @see #getDataAccessObject()
   * @generated
   */
  EReference getDataAccessObject_FindMethod();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getFoundDataModel <em>Found Data Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Found Data Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccessObject#getFoundDataModel()
   * @see #getDataAccessObject()
   * @generated
   */
  EReference getDataAccessObject_FoundDataModel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getUpdateby <em>Updateby</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updateby</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccessObject#getUpdateby()
   * @see #getDataAccessObject()
   * @generated
   */
  EAttribute getDataAccessObject_Updateby();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getUpdateDataModel <em>Update Data Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Update Data Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccessObject#getUpdateDataModel()
   * @see #getDataAccessObject()
   * @generated
   */
  EReference getDataAccessObject_UpdateDataModel();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getException3 <em>Exception3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception3</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccessObject#getException3()
   * @see #getDataAccessObject()
   * @generated
   */
  EReference getDataAccessObject_Exception3();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getUpdateMethod <em>Update Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Update Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccessObject#getUpdateMethod()
   * @see #getDataAccessObject()
   * @generated
   */
  EReference getDataAccessObject_UpdateMethod();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getUpdatedDataModel <em>Updated Data Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Updated Data Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccessObject#getUpdatedDataModel()
   * @see #getDataAccessObject()
   * @generated
   */
  EReference getDataAccessObject_UpdatedDataModel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getDeleteby <em>Deleteby</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deleteby</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccessObject#getDeleteby()
   * @see #getDataAccessObject()
   * @generated
   */
  EAttribute getDataAccessObject_Deleteby();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getException4 <em>Exception4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception4</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccessObject#getException4()
   * @see #getDataAccessObject()
   * @generated
   */
  EReference getDataAccessObject_Exception4();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getDeleteMethod <em>Delete Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccessObject#getDeleteMethod()
   * @see #getDataAccessObject()
   * @generated
   */
  EReference getDataAccessObject_DeleteMethod();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.RestException <em>Rest Exception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rest Exception</em>'.
   * @see org.xtext.example.mydsl.myDsl.RestException
   * @generated
   */
  EClass getRestException();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.RestException#getStatusCode <em>Status Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status Code</em>'.
   * @see org.xtext.example.mydsl.myDsl.RestException#getStatusCode()
   * @see #getRestException()
   * @generated
   */
  EAttribute getRestException_StatusCode();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.JavaMethod <em>Java Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Java Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.JavaMethod
   * @generated
   */
  EClass getJavaMethod();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.JavaMethod#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see org.xtext.example.mydsl.myDsl.JavaMethod#getCode()
   * @see #getJavaMethod()
   * @generated
   */
  EAttribute getJavaMethod_Code();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.myDsl.RestStatusCode <em>Rest Status Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Rest Status Code</em>'.
   * @see org.xtext.example.mydsl.myDsl.RestStatusCode
   * @generated
   */
  EEnum getRestStatusCode();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DomainModelImpl <em>Domain Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DomainModelImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDomainModel()
     * @generated
     */
    EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_MODEL__ELEMENTS = eINSTANCE.getDomainModel_Elements();

    /**
     * The meta object literal for the '<em><b>Apis</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_MODEL__APIS = eINSTANCE.getDomainModel_Apis();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.TypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.RestAPIImpl <em>Rest API</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.RestAPIImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRestAPI()
     * @generated
     */
    EClass REST_API = eINSTANCE.getRestAPI();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REST_API__RESOURCE = eINSTANCE.getRestAPI_Resource();

    /**
     * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REST_API__SERVICE = eINSTANCE.getRestAPI_Service();

    /**
     * The meta object literal for the '<em><b>Dao</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REST_API__DAO = eINSTANCE.getRestAPI_Dao();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PrimitiveTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPrimitiveType()
     * @generated
     */
    EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DataModelImpl <em>Data Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DataModelImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDataModel()
     * @generated
     */
    EClass DATA_MODEL = eINSTANCE.getDataModel();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_MODEL__SUPER_TYPE = eINSTANCE.getDataModel_SuperType();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_MODEL__FEATURES = eINSTANCE.getDataModel_Features();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.RestModelImpl <em>Rest Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.RestModelImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRestModel()
     * @generated
     */
    EClass REST_MODEL = eINSTANCE.getRestModel();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REST_MODEL__SUPER_TYPE = eINSTANCE.getRestModel_SuperType();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REST_MODEL__FEATURES = eINSTANCE.getRestModel_Features();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.MappingModelImpl <em>Mapping Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.MappingModelImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMappingModel()
     * @generated
     */
    EClass MAPPING_MODEL = eINSTANCE.getMappingModel();

    /**
     * The meta object literal for the '<em><b>Transformation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_MODEL__TRANSFORMATION = eINSTANCE.getMappingModel_Transformation();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.TransformationImpl <em>Transformation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.TransformationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTransformation()
     * @generated
     */
    EClass TRANSFORMATION = eINSTANCE.getTransformation();

    /**
     * The meta object literal for the '<em><b>Data Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFORMATION__DATA_MODEL = eINSTANCE.getTransformation_DataModel();

    /**
     * The meta object literal for the '<em><b>Rest Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFORMATION__REST_MODEL = eINSTANCE.getTransformation_RestModel();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.FeatureImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__MANY = eINSTANCE.getFeature_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__TYPE = eINSTANCE.getFeature_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ResourceImpl <em>Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ResourceImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getResource()
     * @generated
     */
    EClass RESOURCE = eINSTANCE.getResource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

    /**
     * The meta object literal for the '<em><b>Create Rest Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__CREATE_REST_MODEL = eINSTANCE.getResource_CreateRestModel();

    /**
     * The meta object literal for the '<em><b>Exception1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__EXCEPTION1 = eINSTANCE.getResource_Exception1();

    /**
     * The meta object literal for the '<em><b>Create Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__CREATE_METHOD = eINSTANCE.getResource_CreateMethod();

    /**
     * The meta object literal for the '<em><b>Created Rest Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__CREATED_REST_MODEL = eINSTANCE.getResource_CreatedRestModel();

    /**
     * The meta object literal for the '<em><b>Findby</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__FINDBY = eINSTANCE.getResource_Findby();

    /**
     * The meta object literal for the '<em><b>Exception2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__EXCEPTION2 = eINSTANCE.getResource_Exception2();

    /**
     * The meta object literal for the '<em><b>Find Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__FIND_METHOD = eINSTANCE.getResource_FindMethod();

    /**
     * The meta object literal for the '<em><b>Found Rest Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__FOUND_REST_MODEL = eINSTANCE.getResource_FoundRestModel();

    /**
     * The meta object literal for the '<em><b>Updateby</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__UPDATEBY = eINSTANCE.getResource_Updateby();

    /**
     * The meta object literal for the '<em><b>Update Rest Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__UPDATE_REST_MODEL = eINSTANCE.getResource_UpdateRestModel();

    /**
     * The meta object literal for the '<em><b>Exception3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__EXCEPTION3 = eINSTANCE.getResource_Exception3();

    /**
     * The meta object literal for the '<em><b>Update Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__UPDATE_METHOD = eINSTANCE.getResource_UpdateMethod();

    /**
     * The meta object literal for the '<em><b>Updated Rest Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__UPDATED_REST_MODEL = eINSTANCE.getResource_UpdatedRestModel();

    /**
     * The meta object literal for the '<em><b>Deleteby</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__DELETEBY = eINSTANCE.getResource_Deleteby();

    /**
     * The meta object literal for the '<em><b>Exception4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__EXCEPTION4 = eINSTANCE.getResource_Exception4();

    /**
     * The meta object literal for the '<em><b>Delete Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__DELETE_METHOD = eINSTANCE.getResource_DeleteMethod();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ServiceImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getService()
     * @generated
     */
    EClass SERVICE = eINSTANCE.getService();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

    /**
     * The meta object literal for the '<em><b>Create Data Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__CREATE_DATA_MODEL = eINSTANCE.getService_CreateDataModel();

    /**
     * The meta object literal for the '<em><b>Exception1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__EXCEPTION1 = eINSTANCE.getService_Exception1();

    /**
     * The meta object literal for the '<em><b>Create Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__CREATE_METHOD = eINSTANCE.getService_CreateMethod();

    /**
     * The meta object literal for the '<em><b>Created Data Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__CREATED_DATA_MODEL = eINSTANCE.getService_CreatedDataModel();

    /**
     * The meta object literal for the '<em><b>Findby</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__FINDBY = eINSTANCE.getService_Findby();

    /**
     * The meta object literal for the '<em><b>Exception2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__EXCEPTION2 = eINSTANCE.getService_Exception2();

    /**
     * The meta object literal for the '<em><b>Find Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__FIND_METHOD = eINSTANCE.getService_FindMethod();

    /**
     * The meta object literal for the '<em><b>Found Data Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__FOUND_DATA_MODEL = eINSTANCE.getService_FoundDataModel();

    /**
     * The meta object literal for the '<em><b>Updateby</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__UPDATEBY = eINSTANCE.getService_Updateby();

    /**
     * The meta object literal for the '<em><b>Update Data Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__UPDATE_DATA_MODEL = eINSTANCE.getService_UpdateDataModel();

    /**
     * The meta object literal for the '<em><b>Exception3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__EXCEPTION3 = eINSTANCE.getService_Exception3();

    /**
     * The meta object literal for the '<em><b>Update Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__UPDATE_METHOD = eINSTANCE.getService_UpdateMethod();

    /**
     * The meta object literal for the '<em><b>Updated Data Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__UPDATED_DATA_MODEL = eINSTANCE.getService_UpdatedDataModel();

    /**
     * The meta object literal for the '<em><b>Deleteby</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__DELETEBY = eINSTANCE.getService_Deleteby();

    /**
     * The meta object literal for the '<em><b>Exception4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__EXCEPTION4 = eINSTANCE.getService_Exception4();

    /**
     * The meta object literal for the '<em><b>Delete Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__DELETE_METHOD = eINSTANCE.getService_DeleteMethod();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DataAccessObjectImpl <em>Data Access Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DataAccessObjectImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDataAccessObject()
     * @generated
     */
    EClass DATA_ACCESS_OBJECT = eINSTANCE.getDataAccessObject();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_ACCESS_OBJECT__NAME = eINSTANCE.getDataAccessObject_Name();

    /**
     * The meta object literal for the '<em><b>Create Data Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ACCESS_OBJECT__CREATE_DATA_MODEL = eINSTANCE.getDataAccessObject_CreateDataModel();

    /**
     * The meta object literal for the '<em><b>Exception1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ACCESS_OBJECT__EXCEPTION1 = eINSTANCE.getDataAccessObject_Exception1();

    /**
     * The meta object literal for the '<em><b>Create Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ACCESS_OBJECT__CREATE_METHOD = eINSTANCE.getDataAccessObject_CreateMethod();

    /**
     * The meta object literal for the '<em><b>Created Data Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ACCESS_OBJECT__CREATED_DATA_MODEL = eINSTANCE.getDataAccessObject_CreatedDataModel();

    /**
     * The meta object literal for the '<em><b>Findby</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_ACCESS_OBJECT__FINDBY = eINSTANCE.getDataAccessObject_Findby();

    /**
     * The meta object literal for the '<em><b>Exception2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ACCESS_OBJECT__EXCEPTION2 = eINSTANCE.getDataAccessObject_Exception2();

    /**
     * The meta object literal for the '<em><b>Find Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ACCESS_OBJECT__FIND_METHOD = eINSTANCE.getDataAccessObject_FindMethod();

    /**
     * The meta object literal for the '<em><b>Found Data Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ACCESS_OBJECT__FOUND_DATA_MODEL = eINSTANCE.getDataAccessObject_FoundDataModel();

    /**
     * The meta object literal for the '<em><b>Updateby</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_ACCESS_OBJECT__UPDATEBY = eINSTANCE.getDataAccessObject_Updateby();

    /**
     * The meta object literal for the '<em><b>Update Data Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ACCESS_OBJECT__UPDATE_DATA_MODEL = eINSTANCE.getDataAccessObject_UpdateDataModel();

    /**
     * The meta object literal for the '<em><b>Exception3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ACCESS_OBJECT__EXCEPTION3 = eINSTANCE.getDataAccessObject_Exception3();

    /**
     * The meta object literal for the '<em><b>Update Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ACCESS_OBJECT__UPDATE_METHOD = eINSTANCE.getDataAccessObject_UpdateMethod();

    /**
     * The meta object literal for the '<em><b>Updated Data Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ACCESS_OBJECT__UPDATED_DATA_MODEL = eINSTANCE.getDataAccessObject_UpdatedDataModel();

    /**
     * The meta object literal for the '<em><b>Deleteby</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_ACCESS_OBJECT__DELETEBY = eINSTANCE.getDataAccessObject_Deleteby();

    /**
     * The meta object literal for the '<em><b>Exception4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ACCESS_OBJECT__EXCEPTION4 = eINSTANCE.getDataAccessObject_Exception4();

    /**
     * The meta object literal for the '<em><b>Delete Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ACCESS_OBJECT__DELETE_METHOD = eINSTANCE.getDataAccessObject_DeleteMethod();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.RestExceptionImpl <em>Rest Exception</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.RestExceptionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRestException()
     * @generated
     */
    EClass REST_EXCEPTION = eINSTANCE.getRestException();

    /**
     * The meta object literal for the '<em><b>Status Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REST_EXCEPTION__STATUS_CODE = eINSTANCE.getRestException_StatusCode();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.JavaMethodImpl <em>Java Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.JavaMethodImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getJavaMethod()
     * @generated
     */
    EClass JAVA_METHOD = eINSTANCE.getJavaMethod();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_METHOD__CODE = eINSTANCE.getJavaMethod_Code();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.RestStatusCode <em>Rest Status Code</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.RestStatusCode
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRestStatusCode()
     * @generated
     */
    EEnum REST_STATUS_CODE = eINSTANCE.getRestStatusCode();

  }

} //MyDslPackage

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
   * The feature id for the '<em><b>Exception Mapper</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_API__EXCEPTION_MAPPER = 3;

  /**
   * The number of structural features of the '<em>Rest API</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_API_FEATURE_COUNT = 4;

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
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL__ID = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL__FEATURES = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Data Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

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
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_MODEL__ID = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_MODEL__FEATURES = TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Self</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_MODEL__SELF = TYPE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Rest Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_MODEL_FEATURE_COUNT = TYPE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelMapperImpl <em>Model Mapper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ModelMapperImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModelMapper()
   * @generated
   */
  int MODEL_MAPPER = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_MAPPER__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Transformation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_MAPPER__TRANSFORMATION = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Model Mapper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_MAPPER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

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
   * The feature id for the '<em><b>Service</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__SERVICE = 1;

  /**
   * The feature id for the '<em><b>Exception Mapper</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__EXCEPTION_MAPPER = 2;

  /**
   * The feature id for the '<em><b>Create Rest Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__CREATE_REST_MODEL = 3;

  /**
   * The feature id for the '<em><b>Create Val Service</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__CREATE_VAL_SERVICE = 4;

  /**
   * The feature id for the '<em><b>Create Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__CREATE_METHOD = 5;

  /**
   * The feature id for the '<em><b>Create Conclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__CREATE_CONCLUSION = 6;

  /**
   * The feature id for the '<em><b>Findby</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__FINDBY = 7;

  /**
   * The feature id for the '<em><b>Find Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__FIND_METHOD = 8;

  /**
   * The feature id for the '<em><b>Find Conclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__FIND_CONCLUSION = 9;

  /**
   * The feature id for the '<em><b>Updateby</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__UPDATEBY = 10;

  /**
   * The feature id for the '<em><b>Update Rest Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__UPDATE_REST_MODEL = 11;

  /**
   * The feature id for the '<em><b>Update Val Service</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__UPDATE_VAL_SERVICE = 12;

  /**
   * The feature id for the '<em><b>Update Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__UPDATE_METHOD = 13;

  /**
   * The feature id for the '<em><b>Update Conclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__UPDATE_CONCLUSION = 14;

  /**
   * The feature id for the '<em><b>Deleteby</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__DELETEBY = 15;

  /**
   * The feature id for the '<em><b>Delete Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__DELETE_METHOD = 16;

  /**
   * The feature id for the '<em><b>Exception4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__EXCEPTION4 = 17;

  /**
   * The number of structural features of the '<em>Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_FEATURE_COUNT = 18;

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
   * The feature id for the '<em><b>Dao</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__DAO = 1;

  /**
   * The feature id for the '<em><b>Create Data Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__CREATE_DATA_MODEL = 2;

  /**
   * The feature id for the '<em><b>Create Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__CREATE_METHOD = 3;

  /**
   * The feature id for the '<em><b>Create Conclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__CREATE_CONCLUSION = 4;

  /**
   * The feature id for the '<em><b>Findby</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__FINDBY = 5;

  /**
   * The feature id for the '<em><b>Find Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__FIND_METHOD = 6;

  /**
   * The feature id for the '<em><b>Find Conclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__FIND_CONCLUSION = 7;

  /**
   * The feature id for the '<em><b>Updateby</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__UPDATEBY = 8;

  /**
   * The feature id for the '<em><b>Update Data Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__UPDATE_DATA_MODEL = 9;

  /**
   * The feature id for the '<em><b>Update Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__UPDATE_METHOD = 10;

  /**
   * The feature id for the '<em><b>Update Conclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__UPDATE_CONCLUSION = 11;

  /**
   * The feature id for the '<em><b>Deleteby</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__DELETEBY = 12;

  /**
   * The feature id for the '<em><b>Delete Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__DELETE_METHOD = 13;

  /**
   * The feature id for the '<em><b>Exception4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__EXCEPTION4 = 14;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = 15;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ValidationServiceImpl <em>Validation Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ValidationServiceImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getValidationService()
   * @generated
   */
  int VALIDATION_SERVICE = 11;

  /**
   * The feature id for the '<em><b>Rest Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATION_SERVICE__REST_MODEL = 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATION_SERVICE__BLOCK = 1;

  /**
   * The number of structural features of the '<em>Validation Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATION_SERVICE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DataAccessObjectImpl <em>Data Access Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DataAccessObjectImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDataAccessObject()
   * @generated
   */
  int DATA_ACCESS_OBJECT = 12;

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
   * The feature id for the '<em><b>Create Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__CREATE_METHOD = 2;

  /**
   * The feature id for the '<em><b>Create Conclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__CREATE_CONCLUSION = 3;

  /**
   * The feature id for the '<em><b>Findby</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__FINDBY = 4;

  /**
   * The feature id for the '<em><b>Find Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__FIND_METHOD = 5;

  /**
   * The feature id for the '<em><b>Find Conclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__FIND_CONCLUSION = 6;

  /**
   * The feature id for the '<em><b>Updateby</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__UPDATEBY = 7;

  /**
   * The feature id for the '<em><b>Update Data Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__UPDATE_DATA_MODEL = 8;

  /**
   * The feature id for the '<em><b>Update Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__UPDATE_METHOD = 9;

  /**
   * The feature id for the '<em><b>Update Conclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__UPDATE_CONCLUSION = 10;

  /**
   * The feature id for the '<em><b>Deleteby</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__DELETEBY = 11;

  /**
   * The feature id for the '<em><b>Delete Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__DELETE_METHOD = 12;

  /**
   * The feature id for the '<em><b>Exceptions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT__EXCEPTIONS = 13;

  /**
   * The number of structural features of the '<em>Data Access Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_OBJECT_FEATURE_COUNT = 14;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DataModelMethodConclusionImpl <em>Data Model Method Conclusion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DataModelMethodConclusionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDataModelMethodConclusion()
   * @generated
   */
  int DATA_MODEL_METHOD_CONCLUSION = 13;

  /**
   * The feature id for the '<em><b>Data Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL_METHOD_CONCLUSION__DATA_MODEL = 0;

  /**
   * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL_METHOD_CONCLUSION__EXCEPTIONS = 1;

  /**
   * The number of structural features of the '<em>Data Model Method Conclusion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL_METHOD_CONCLUSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RestModelMethodConclusionImpl <em>Rest Model Method Conclusion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RestModelMethodConclusionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRestModelMethodConclusion()
   * @generated
   */
  int REST_MODEL_METHOD_CONCLUSION = 14;

  /**
   * The feature id for the '<em><b>Rest Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_MODEL_METHOD_CONCLUSION__REST_MODEL = 0;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_MODEL_METHOD_CONCLUSION__EXCEPTION = 1;

  /**
   * The number of structural features of the '<em>Rest Model Method Conclusion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_MODEL_METHOD_CONCLUSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RestExceptionListImpl <em>Rest Exception List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RestExceptionListImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRestExceptionList()
   * @generated
   */
  int REST_EXCEPTION_LIST = 15;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_EXCEPTION_LIST__EXCEPTION = 0;

  /**
   * The number of structural features of the '<em>Rest Exception List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_EXCEPTION_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.BaseExceptionImpl <em>Base Exception</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.BaseExceptionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBaseException()
   * @generated
   */
  int BASE_EXCEPTION = 16;

  /**
   * The feature id for the '<em><b>Error Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_EXCEPTION__ERROR_CODE = 0;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_EXCEPTION__MESSAGE = 1;

  /**
   * The number of structural features of the '<em>Base Exception</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_EXCEPTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ExceptionMapperImpl <em>Exception Mapper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ExceptionMapperImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExceptionMapper()
   * @generated
   */
  int EXCEPTION_MAPPER = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_MAPPER__NAME = 0;

  /**
   * The feature id for the '<em><b>Rest Exception</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_MAPPER__REST_EXCEPTION = 1;

  /**
   * The feature id for the '<em><b>Base Exception</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_MAPPER__BASE_EXCEPTION = 2;

  /**
   * The number of structural features of the '<em>Exception Mapper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_MAPPER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RestExceptionImpl <em>Rest Exception</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RestExceptionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRestException()
   * @generated
   */
  int REST_EXCEPTION = 18;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_EXCEPTION__STATUS_CODE = 0;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_EXCEPTION__MESSAGE = 1;

  /**
   * The number of structural features of the '<em>Rest Exception</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_EXCEPTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.BlockImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 19;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__CODE = 0;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.RestStatusCode <em>Rest Status Code</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.RestStatusCode
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRestStatusCode()
   * @generated
   */
  int REST_STATUS_CODE = 20;


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
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.RestAPI#getExceptionMapper <em>Exception Mapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exception Mapper</em>'.
   * @see org.xtext.example.mydsl.myDsl.RestAPI#getExceptionMapper()
   * @see #getRestAPI()
   * @generated
   */
  EReference getRestAPI_ExceptionMapper();

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
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DataModel#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataModel#getId()
   * @see #getDataModel()
   * @generated
   */
  EAttribute getDataModel_Id();

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
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.RestModel#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.example.mydsl.myDsl.RestModel#getId()
   * @see #getRestModel()
   * @generated
   */
  EAttribute getRestModel_Id();

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
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.RestModel#getSelf <em>Self</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Self</em>'.
   * @see org.xtext.example.mydsl.myDsl.RestModel#getSelf()
   * @see #getRestModel()
   * @generated
   */
  EAttribute getRestModel_Self();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ModelMapper <em>Model Mapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Mapper</em>'.
   * @see org.xtext.example.mydsl.myDsl.ModelMapper
   * @generated
   */
  EClass getModelMapper();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.ModelMapper#getTransformation <em>Transformation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transformation</em>'.
   * @see org.xtext.example.mydsl.myDsl.ModelMapper#getTransformation()
   * @see #getModelMapper()
   * @generated
   */
  EReference getModelMapper_Transformation();

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
   * Returns the meta object for the reference list '{@link org.xtext.example.mydsl.myDsl.Resource#getService <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Service</em>'.
   * @see org.xtext.example.mydsl.myDsl.Resource#getService()
   * @see #getResource()
   * @generated
   */
  EReference getResource_Service();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Resource#getExceptionMapper <em>Exception Mapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Exception Mapper</em>'.
   * @see org.xtext.example.mydsl.myDsl.Resource#getExceptionMapper()
   * @see #getResource()
   * @generated
   */
  EReference getResource_ExceptionMapper();

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
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Resource#getCreateValService <em>Create Val Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Create Val Service</em>'.
   * @see org.xtext.example.mydsl.myDsl.Resource#getCreateValService()
   * @see #getResource()
   * @generated
   */
  EReference getResource_CreateValService();

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
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Resource#getCreateConclusion <em>Create Conclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Create Conclusion</em>'.
   * @see org.xtext.example.mydsl.myDsl.Resource#getCreateConclusion()
   * @see #getResource()
   * @generated
   */
  EReference getResource_CreateConclusion();

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
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Resource#getFindConclusion <em>Find Conclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Find Conclusion</em>'.
   * @see org.xtext.example.mydsl.myDsl.Resource#getFindConclusion()
   * @see #getResource()
   * @generated
   */
  EReference getResource_FindConclusion();

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
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Resource#getUpdateValService <em>Update Val Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Update Val Service</em>'.
   * @see org.xtext.example.mydsl.myDsl.Resource#getUpdateValService()
   * @see #getResource()
   * @generated
   */
  EReference getResource_UpdateValService();

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
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Resource#getUpdateConclusion <em>Update Conclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Update Conclusion</em>'.
   * @see org.xtext.example.mydsl.myDsl.Resource#getUpdateConclusion()
   * @see #getResource()
   * @generated
   */
  EReference getResource_UpdateConclusion();

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
   * Returns the meta object for the reference list '{@link org.xtext.example.mydsl.myDsl.Service#getDao <em>Dao</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Dao</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service#getDao()
   * @see #getService()
   * @generated
   */
  EReference getService_Dao();

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
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Service#getCreateConclusion <em>Create Conclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Create Conclusion</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service#getCreateConclusion()
   * @see #getService()
   * @generated
   */
  EReference getService_CreateConclusion();

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
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Service#getFindConclusion <em>Find Conclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Find Conclusion</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service#getFindConclusion()
   * @see #getService()
   * @generated
   */
  EReference getService_FindConclusion();

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
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Service#getUpdateConclusion <em>Update Conclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Update Conclusion</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service#getUpdateConclusion()
   * @see #getService()
   * @generated
   */
  EReference getService_UpdateConclusion();

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
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ValidationService <em>Validation Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Validation Service</em>'.
   * @see org.xtext.example.mydsl.myDsl.ValidationService
   * @generated
   */
  EClass getValidationService();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.ValidationService#getRestModel <em>Rest Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rest Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.ValidationService#getRestModel()
   * @see #getValidationService()
   * @generated
   */
  EReference getValidationService_RestModel();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ValidationService#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.example.mydsl.myDsl.ValidationService#getBlock()
   * @see #getValidationService()
   * @generated
   */
  EReference getValidationService_Block();

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
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getCreateConclusion <em>Create Conclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Create Conclusion</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccessObject#getCreateConclusion()
   * @see #getDataAccessObject()
   * @generated
   */
  EReference getDataAccessObject_CreateConclusion();

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
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getFindConclusion <em>Find Conclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Find Conclusion</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccessObject#getFindConclusion()
   * @see #getDataAccessObject()
   * @generated
   */
  EReference getDataAccessObject_FindConclusion();

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
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getUpdateConclusion <em>Update Conclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Update Conclusion</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccessObject#getUpdateConclusion()
   * @see #getDataAccessObject()
   * @generated
   */
  EReference getDataAccessObject_UpdateConclusion();

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
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getExceptions <em>Exceptions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exceptions</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccessObject#getExceptions()
   * @see #getDataAccessObject()
   * @generated
   */
  EReference getDataAccessObject_Exceptions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DataModelMethodConclusion <em>Data Model Method Conclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Model Method Conclusion</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataModelMethodConclusion
   * @generated
   */
  EClass getDataModelMethodConclusion();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.DataModelMethodConclusion#getDataModel <em>Data Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Data Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataModelMethodConclusion#getDataModel()
   * @see #getDataModelMethodConclusion()
   * @generated
   */
  EReference getDataModelMethodConclusion_DataModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.DataModelMethodConclusion#getExceptions <em>Exceptions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exceptions</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataModelMethodConclusion#getExceptions()
   * @see #getDataModelMethodConclusion()
   * @generated
   */
  EReference getDataModelMethodConclusion_Exceptions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.RestModelMethodConclusion <em>Rest Model Method Conclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rest Model Method Conclusion</em>'.
   * @see org.xtext.example.mydsl.myDsl.RestModelMethodConclusion
   * @generated
   */
  EClass getRestModelMethodConclusion();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.RestModelMethodConclusion#getRestModel <em>Rest Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rest Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.RestModelMethodConclusion#getRestModel()
   * @see #getRestModelMethodConclusion()
   * @generated
   */
  EReference getRestModelMethodConclusion_RestModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.RestModelMethodConclusion#getException <em>Exception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exception</em>'.
   * @see org.xtext.example.mydsl.myDsl.RestModelMethodConclusion#getException()
   * @see #getRestModelMethodConclusion()
   * @generated
   */
  EReference getRestModelMethodConclusion_Exception();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.RestExceptionList <em>Rest Exception List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rest Exception List</em>'.
   * @see org.xtext.example.mydsl.myDsl.RestExceptionList
   * @generated
   */
  EClass getRestExceptionList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.RestExceptionList#getException <em>Exception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exception</em>'.
   * @see org.xtext.example.mydsl.myDsl.RestExceptionList#getException()
   * @see #getRestExceptionList()
   * @generated
   */
  EReference getRestExceptionList_Exception();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.BaseException <em>Base Exception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base Exception</em>'.
   * @see org.xtext.example.mydsl.myDsl.BaseException
   * @generated
   */
  EClass getBaseException();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.BaseException#getErrorCode <em>Error Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Error Code</em>'.
   * @see org.xtext.example.mydsl.myDsl.BaseException#getErrorCode()
   * @see #getBaseException()
   * @generated
   */
  EAttribute getBaseException_ErrorCode();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.BaseException#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see org.xtext.example.mydsl.myDsl.BaseException#getMessage()
   * @see #getBaseException()
   * @generated
   */
  EAttribute getBaseException_Message();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ExceptionMapper <em>Exception Mapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exception Mapper</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExceptionMapper
   * @generated
   */
  EClass getExceptionMapper();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ExceptionMapper#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExceptionMapper#getName()
   * @see #getExceptionMapper()
   * @generated
   */
  EAttribute getExceptionMapper_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExceptionMapper#getRestException <em>Rest Exception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rest Exception</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExceptionMapper#getRestException()
   * @see #getExceptionMapper()
   * @generated
   */
  EReference getExceptionMapper_RestException();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExceptionMapper#getBaseException <em>Base Exception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base Exception</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExceptionMapper#getBaseException()
   * @see #getExceptionMapper()
   * @generated
   */
  EReference getExceptionMapper_BaseException();

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
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.RestException#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see org.xtext.example.mydsl.myDsl.RestException#getMessage()
   * @see #getRestException()
   * @generated
   */
  EAttribute getRestException_Message();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see org.xtext.example.mydsl.myDsl.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Block#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see org.xtext.example.mydsl.myDsl.Block#getCode()
   * @see #getBlock()
   * @generated
   */
  EAttribute getBlock_Code();

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
     * The meta object literal for the '<em><b>Exception Mapper</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REST_API__EXCEPTION_MAPPER = eINSTANCE.getRestAPI_ExceptionMapper();

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
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_MODEL__ID = eINSTANCE.getDataModel_Id();

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
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REST_MODEL__ID = eINSTANCE.getRestModel_Id();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REST_MODEL__FEATURES = eINSTANCE.getRestModel_Features();

    /**
     * The meta object literal for the '<em><b>Self</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REST_MODEL__SELF = eINSTANCE.getRestModel_Self();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelMapperImpl <em>Model Mapper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ModelMapperImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModelMapper()
     * @generated
     */
    EClass MODEL_MAPPER = eINSTANCE.getModelMapper();

    /**
     * The meta object literal for the '<em><b>Transformation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_MAPPER__TRANSFORMATION = eINSTANCE.getModelMapper_Transformation();

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
     * The meta object literal for the '<em><b>Service</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__SERVICE = eINSTANCE.getResource_Service();

    /**
     * The meta object literal for the '<em><b>Exception Mapper</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__EXCEPTION_MAPPER = eINSTANCE.getResource_ExceptionMapper();

    /**
     * The meta object literal for the '<em><b>Create Rest Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__CREATE_REST_MODEL = eINSTANCE.getResource_CreateRestModel();

    /**
     * The meta object literal for the '<em><b>Create Val Service</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__CREATE_VAL_SERVICE = eINSTANCE.getResource_CreateValService();

    /**
     * The meta object literal for the '<em><b>Create Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__CREATE_METHOD = eINSTANCE.getResource_CreateMethod();

    /**
     * The meta object literal for the '<em><b>Create Conclusion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__CREATE_CONCLUSION = eINSTANCE.getResource_CreateConclusion();

    /**
     * The meta object literal for the '<em><b>Findby</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__FINDBY = eINSTANCE.getResource_Findby();

    /**
     * The meta object literal for the '<em><b>Find Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__FIND_METHOD = eINSTANCE.getResource_FindMethod();

    /**
     * The meta object literal for the '<em><b>Find Conclusion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__FIND_CONCLUSION = eINSTANCE.getResource_FindConclusion();

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
     * The meta object literal for the '<em><b>Update Val Service</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__UPDATE_VAL_SERVICE = eINSTANCE.getResource_UpdateValService();

    /**
     * The meta object literal for the '<em><b>Update Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__UPDATE_METHOD = eINSTANCE.getResource_UpdateMethod();

    /**
     * The meta object literal for the '<em><b>Update Conclusion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__UPDATE_CONCLUSION = eINSTANCE.getResource_UpdateConclusion();

    /**
     * The meta object literal for the '<em><b>Deleteby</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__DELETEBY = eINSTANCE.getResource_Deleteby();

    /**
     * The meta object literal for the '<em><b>Delete Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__DELETE_METHOD = eINSTANCE.getResource_DeleteMethod();

    /**
     * The meta object literal for the '<em><b>Exception4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__EXCEPTION4 = eINSTANCE.getResource_Exception4();

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
     * The meta object literal for the '<em><b>Dao</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__DAO = eINSTANCE.getService_Dao();

    /**
     * The meta object literal for the '<em><b>Create Data Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__CREATE_DATA_MODEL = eINSTANCE.getService_CreateDataModel();

    /**
     * The meta object literal for the '<em><b>Create Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__CREATE_METHOD = eINSTANCE.getService_CreateMethod();

    /**
     * The meta object literal for the '<em><b>Create Conclusion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__CREATE_CONCLUSION = eINSTANCE.getService_CreateConclusion();

    /**
     * The meta object literal for the '<em><b>Findby</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__FINDBY = eINSTANCE.getService_Findby();

    /**
     * The meta object literal for the '<em><b>Find Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__FIND_METHOD = eINSTANCE.getService_FindMethod();

    /**
     * The meta object literal for the '<em><b>Find Conclusion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__FIND_CONCLUSION = eINSTANCE.getService_FindConclusion();

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
     * The meta object literal for the '<em><b>Update Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__UPDATE_METHOD = eINSTANCE.getService_UpdateMethod();

    /**
     * The meta object literal for the '<em><b>Update Conclusion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__UPDATE_CONCLUSION = eINSTANCE.getService_UpdateConclusion();

    /**
     * The meta object literal for the '<em><b>Deleteby</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__DELETEBY = eINSTANCE.getService_Deleteby();

    /**
     * The meta object literal for the '<em><b>Delete Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__DELETE_METHOD = eINSTANCE.getService_DeleteMethod();

    /**
     * The meta object literal for the '<em><b>Exception4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__EXCEPTION4 = eINSTANCE.getService_Exception4();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ValidationServiceImpl <em>Validation Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ValidationServiceImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getValidationService()
     * @generated
     */
    EClass VALIDATION_SERVICE = eINSTANCE.getValidationService();

    /**
     * The meta object literal for the '<em><b>Rest Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALIDATION_SERVICE__REST_MODEL = eINSTANCE.getValidationService_RestModel();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALIDATION_SERVICE__BLOCK = eINSTANCE.getValidationService_Block();

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
     * The meta object literal for the '<em><b>Create Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ACCESS_OBJECT__CREATE_METHOD = eINSTANCE.getDataAccessObject_CreateMethod();

    /**
     * The meta object literal for the '<em><b>Create Conclusion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ACCESS_OBJECT__CREATE_CONCLUSION = eINSTANCE.getDataAccessObject_CreateConclusion();

    /**
     * The meta object literal for the '<em><b>Findby</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_ACCESS_OBJECT__FINDBY = eINSTANCE.getDataAccessObject_Findby();

    /**
     * The meta object literal for the '<em><b>Find Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ACCESS_OBJECT__FIND_METHOD = eINSTANCE.getDataAccessObject_FindMethod();

    /**
     * The meta object literal for the '<em><b>Find Conclusion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ACCESS_OBJECT__FIND_CONCLUSION = eINSTANCE.getDataAccessObject_FindConclusion();

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
     * The meta object literal for the '<em><b>Update Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ACCESS_OBJECT__UPDATE_METHOD = eINSTANCE.getDataAccessObject_UpdateMethod();

    /**
     * The meta object literal for the '<em><b>Update Conclusion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ACCESS_OBJECT__UPDATE_CONCLUSION = eINSTANCE.getDataAccessObject_UpdateConclusion();

    /**
     * The meta object literal for the '<em><b>Deleteby</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_ACCESS_OBJECT__DELETEBY = eINSTANCE.getDataAccessObject_Deleteby();

    /**
     * The meta object literal for the '<em><b>Delete Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ACCESS_OBJECT__DELETE_METHOD = eINSTANCE.getDataAccessObject_DeleteMethod();

    /**
     * The meta object literal for the '<em><b>Exceptions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ACCESS_OBJECT__EXCEPTIONS = eINSTANCE.getDataAccessObject_Exceptions();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DataModelMethodConclusionImpl <em>Data Model Method Conclusion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DataModelMethodConclusionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDataModelMethodConclusion()
     * @generated
     */
    EClass DATA_MODEL_METHOD_CONCLUSION = eINSTANCE.getDataModelMethodConclusion();

    /**
     * The meta object literal for the '<em><b>Data Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_MODEL_METHOD_CONCLUSION__DATA_MODEL = eINSTANCE.getDataModelMethodConclusion_DataModel();

    /**
     * The meta object literal for the '<em><b>Exceptions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_MODEL_METHOD_CONCLUSION__EXCEPTIONS = eINSTANCE.getDataModelMethodConclusion_Exceptions();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.RestModelMethodConclusionImpl <em>Rest Model Method Conclusion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.RestModelMethodConclusionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRestModelMethodConclusion()
     * @generated
     */
    EClass REST_MODEL_METHOD_CONCLUSION = eINSTANCE.getRestModelMethodConclusion();

    /**
     * The meta object literal for the '<em><b>Rest Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REST_MODEL_METHOD_CONCLUSION__REST_MODEL = eINSTANCE.getRestModelMethodConclusion_RestModel();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REST_MODEL_METHOD_CONCLUSION__EXCEPTION = eINSTANCE.getRestModelMethodConclusion_Exception();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.RestExceptionListImpl <em>Rest Exception List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.RestExceptionListImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRestExceptionList()
     * @generated
     */
    EClass REST_EXCEPTION_LIST = eINSTANCE.getRestExceptionList();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REST_EXCEPTION_LIST__EXCEPTION = eINSTANCE.getRestExceptionList_Exception();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.BaseExceptionImpl <em>Base Exception</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.BaseExceptionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBaseException()
     * @generated
     */
    EClass BASE_EXCEPTION = eINSTANCE.getBaseException();

    /**
     * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASE_EXCEPTION__ERROR_CODE = eINSTANCE.getBaseException_ErrorCode();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASE_EXCEPTION__MESSAGE = eINSTANCE.getBaseException_Message();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ExceptionMapperImpl <em>Exception Mapper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ExceptionMapperImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExceptionMapper()
     * @generated
     */
    EClass EXCEPTION_MAPPER = eINSTANCE.getExceptionMapper();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXCEPTION_MAPPER__NAME = eINSTANCE.getExceptionMapper_Name();

    /**
     * The meta object literal for the '<em><b>Rest Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCEPTION_MAPPER__REST_EXCEPTION = eINSTANCE.getExceptionMapper_RestException();

    /**
     * The meta object literal for the '<em><b>Base Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCEPTION_MAPPER__BASE_EXCEPTION = eINSTANCE.getExceptionMapper_BaseException();

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
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REST_EXCEPTION__MESSAGE = eINSTANCE.getRestException_Message();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.BlockImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BLOCK__CODE = eINSTANCE.getBlock_Code();

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

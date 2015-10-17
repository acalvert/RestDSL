/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.DOMAIN_MODEL: return createDomainModel();
      case MyDslPackage.TYPE: return createType();
      case MyDslPackage.REST_API: return createRestAPI();
      case MyDslPackage.PRIMITIVE_TYPE: return createPrimitiveType();
      case MyDslPackage.DATA_MODEL: return createDataModel();
      case MyDslPackage.REST_MODEL: return createRestModel();
      case MyDslPackage.MODEL_MAPPER: return createModelMapper();
      case MyDslPackage.TRANSFORMATION: return createTransformation();
      case MyDslPackage.FEATURE: return createFeature();
      case MyDslPackage.RESOURCE: return createResource();
      case MyDslPackage.SERVICE: return createService();
      case MyDslPackage.VALIDATION_SERVICE: return createValidationService();
      case MyDslPackage.DATA_ACCESS_OBJECT: return createDataAccessObject();
      case MyDslPackage.DATA_MODEL_METHOD_CONCLUSION: return createDataModelMethodConclusion();
      case MyDslPackage.REST_MODEL_METHOD_CONCLUSION: return createRestModelMethodConclusion();
      case MyDslPackage.REST_EXCEPTION_LIST: return createRestExceptionList();
      case MyDslPackage.BASE_EXCEPTION: return createBaseException();
      case MyDslPackage.EXCEPTION_MAPPER: return createExceptionMapper();
      case MyDslPackage.REST_EXCEPTION: return createRestException();
      case MyDslPackage.BLOCK: return createBlock();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MyDslPackage.REST_STATUS_CODE:
        return createRestStatusCodeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MyDslPackage.REST_STATUS_CODE:
        return convertRestStatusCodeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainModel createDomainModel()
  {
    DomainModelImpl domainModel = new DomainModelImpl();
    return domainModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestAPI createRestAPI()
  {
    RestAPIImpl restAPI = new RestAPIImpl();
    return restAPI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveType createPrimitiveType()
  {
    PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
    return primitiveType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataModel createDataModel()
  {
    DataModelImpl dataModel = new DataModelImpl();
    return dataModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestModel createRestModel()
  {
    RestModelImpl restModel = new RestModelImpl();
    return restModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelMapper createModelMapper()
  {
    ModelMapperImpl modelMapper = new ModelMapperImpl();
    return modelMapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transformation createTransformation()
  {
    TransformationImpl transformation = new TransformationImpl();
    return transformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource createResource()
  {
    ResourceImpl resource = new ResourceImpl();
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValidationService createValidationService()
  {
    ValidationServiceImpl validationService = new ValidationServiceImpl();
    return validationService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataAccessObject createDataAccessObject()
  {
    DataAccessObjectImpl dataAccessObject = new DataAccessObjectImpl();
    return dataAccessObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataModelMethodConclusion createDataModelMethodConclusion()
  {
    DataModelMethodConclusionImpl dataModelMethodConclusion = new DataModelMethodConclusionImpl();
    return dataModelMethodConclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestModelMethodConclusion createRestModelMethodConclusion()
  {
    RestModelMethodConclusionImpl restModelMethodConclusion = new RestModelMethodConclusionImpl();
    return restModelMethodConclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestExceptionList createRestExceptionList()
  {
    RestExceptionListImpl restExceptionList = new RestExceptionListImpl();
    return restExceptionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseException createBaseException()
  {
    BaseExceptionImpl baseException = new BaseExceptionImpl();
    return baseException;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExceptionMapper createExceptionMapper()
  {
    ExceptionMapperImpl exceptionMapper = new ExceptionMapperImpl();
    return exceptionMapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestException createRestException()
  {
    RestExceptionImpl restException = new RestExceptionImpl();
    return restException;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestStatusCode createRestStatusCodeFromString(EDataType eDataType, String initialValue)
  {
    RestStatusCode result = RestStatusCode.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRestStatusCodeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl

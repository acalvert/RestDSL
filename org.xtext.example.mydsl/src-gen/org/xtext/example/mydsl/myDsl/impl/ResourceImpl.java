/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.example.mydsl.myDsl.Block;
import org.xtext.example.mydsl.myDsl.ExceptionMapper;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Resource;
import org.xtext.example.mydsl.myDsl.RestExceptionList;
import org.xtext.example.mydsl.myDsl.RestModel;
import org.xtext.example.mydsl.myDsl.RestModelMethodConclusion;
import org.xtext.example.mydsl.myDsl.Service;
import org.xtext.example.mydsl.myDsl.ValidationService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ResourceImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ResourceImpl#getExceptionMapper <em>Exception Mapper</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ResourceImpl#getCreateRestModel <em>Create Rest Model</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ResourceImpl#getCreateValService <em>Create Val Service</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ResourceImpl#getCreateMethod <em>Create Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ResourceImpl#getCreateConclusion <em>Create Conclusion</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ResourceImpl#getFindby <em>Findby</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ResourceImpl#getFindMethod <em>Find Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ResourceImpl#getFindConclusion <em>Find Conclusion</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ResourceImpl#getUpdateby <em>Updateby</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ResourceImpl#getUpdateRestModel <em>Update Rest Model</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ResourceImpl#getUpdateValService <em>Update Val Service</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ResourceImpl#getUpdateMethod <em>Update Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ResourceImpl#getUpdateConclusion <em>Update Conclusion</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ResourceImpl#getDeleteby <em>Deleteby</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ResourceImpl#getDeleteMethod <em>Delete Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ResourceImpl#getException4 <em>Exception4</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends MinimalEObjectImpl.Container implements Resource
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getService() <em>Service</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getService()
   * @generated
   * @ordered
   */
  protected EList<Service> service;

  /**
   * The cached value of the '{@link #getExceptionMapper() <em>Exception Mapper</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExceptionMapper()
   * @generated
   * @ordered
   */
  protected ExceptionMapper exceptionMapper;

  /**
   * The cached value of the '{@link #getCreateRestModel() <em>Create Rest Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreateRestModel()
   * @generated
   * @ordered
   */
  protected RestModel createRestModel;

  /**
   * The cached value of the '{@link #getCreateValService() <em>Create Val Service</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreateValService()
   * @generated
   * @ordered
   */
  protected ValidationService createValService;

  /**
   * The cached value of the '{@link #getCreateMethod() <em>Create Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreateMethod()
   * @generated
   * @ordered
   */
  protected Block createMethod;

  /**
   * The cached value of the '{@link #getCreateConclusion() <em>Create Conclusion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreateConclusion()
   * @generated
   * @ordered
   */
  protected RestModelMethodConclusion createConclusion;

  /**
   * The default value of the '{@link #getFindby() <em>Findby</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFindby()
   * @generated
   * @ordered
   */
  protected static final String FINDBY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFindby() <em>Findby</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFindby()
   * @generated
   * @ordered
   */
  protected String findby = FINDBY_EDEFAULT;

  /**
   * The cached value of the '{@link #getFindMethod() <em>Find Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFindMethod()
   * @generated
   * @ordered
   */
  protected Block findMethod;

  /**
   * The cached value of the '{@link #getFindConclusion() <em>Find Conclusion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFindConclusion()
   * @generated
   * @ordered
   */
  protected RestModelMethodConclusion findConclusion;

  /**
   * The default value of the '{@link #getUpdateby() <em>Updateby</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdateby()
   * @generated
   * @ordered
   */
  protected static final String UPDATEBY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUpdateby() <em>Updateby</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdateby()
   * @generated
   * @ordered
   */
  protected String updateby = UPDATEBY_EDEFAULT;

  /**
   * The cached value of the '{@link #getUpdateRestModel() <em>Update Rest Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdateRestModel()
   * @generated
   * @ordered
   */
  protected RestModel updateRestModel;

  /**
   * The cached value of the '{@link #getUpdateValService() <em>Update Val Service</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdateValService()
   * @generated
   * @ordered
   */
  protected ValidationService updateValService;

  /**
   * The cached value of the '{@link #getUpdateMethod() <em>Update Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdateMethod()
   * @generated
   * @ordered
   */
  protected Block updateMethod;

  /**
   * The cached value of the '{@link #getUpdateConclusion() <em>Update Conclusion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdateConclusion()
   * @generated
   * @ordered
   */
  protected RestModelMethodConclusion updateConclusion;

  /**
   * The default value of the '{@link #getDeleteby() <em>Deleteby</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeleteby()
   * @generated
   * @ordered
   */
  protected static final String DELETEBY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDeleteby() <em>Deleteby</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeleteby()
   * @generated
   * @ordered
   */
  protected String deleteby = DELETEBY_EDEFAULT;

  /**
   * The cached value of the '{@link #getDeleteMethod() <em>Delete Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeleteMethod()
   * @generated
   * @ordered
   */
  protected Block deleteMethod;

  /**
   * The cached value of the '{@link #getException4() <em>Exception4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getException4()
   * @generated
   * @ordered
   */
  protected RestExceptionList exception4;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResourceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.RESOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Service> getService()
  {
    if (service == null)
    {
      service = new EObjectResolvingEList<Service>(Service.class, this, MyDslPackage.RESOURCE__SERVICE);
    }
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExceptionMapper getExceptionMapper()
  {
    if (exceptionMapper != null && exceptionMapper.eIsProxy())
    {
      InternalEObject oldExceptionMapper = (InternalEObject)exceptionMapper;
      exceptionMapper = (ExceptionMapper)eResolveProxy(oldExceptionMapper);
      if (exceptionMapper != oldExceptionMapper)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.RESOURCE__EXCEPTION_MAPPER, oldExceptionMapper, exceptionMapper));
      }
    }
    return exceptionMapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExceptionMapper basicGetExceptionMapper()
  {
    return exceptionMapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExceptionMapper(ExceptionMapper newExceptionMapper)
  {
    ExceptionMapper oldExceptionMapper = exceptionMapper;
    exceptionMapper = newExceptionMapper;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__EXCEPTION_MAPPER, oldExceptionMapper, exceptionMapper));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestModel getCreateRestModel()
  {
    if (createRestModel != null && createRestModel.eIsProxy())
    {
      InternalEObject oldCreateRestModel = (InternalEObject)createRestModel;
      createRestModel = (RestModel)eResolveProxy(oldCreateRestModel);
      if (createRestModel != oldCreateRestModel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.RESOURCE__CREATE_REST_MODEL, oldCreateRestModel, createRestModel));
      }
    }
    return createRestModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestModel basicGetCreateRestModel()
  {
    return createRestModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreateRestModel(RestModel newCreateRestModel)
  {
    RestModel oldCreateRestModel = createRestModel;
    createRestModel = newCreateRestModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__CREATE_REST_MODEL, oldCreateRestModel, createRestModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValidationService getCreateValService()
  {
    return createValService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreateValService(ValidationService newCreateValService, NotificationChain msgs)
  {
    ValidationService oldCreateValService = createValService;
    createValService = newCreateValService;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__CREATE_VAL_SERVICE, oldCreateValService, newCreateValService);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreateValService(ValidationService newCreateValService)
  {
    if (newCreateValService != createValService)
    {
      NotificationChain msgs = null;
      if (createValService != null)
        msgs = ((InternalEObject)createValService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RESOURCE__CREATE_VAL_SERVICE, null, msgs);
      if (newCreateValService != null)
        msgs = ((InternalEObject)newCreateValService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RESOURCE__CREATE_VAL_SERVICE, null, msgs);
      msgs = basicSetCreateValService(newCreateValService, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__CREATE_VAL_SERVICE, newCreateValService, newCreateValService));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getCreateMethod()
  {
    return createMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreateMethod(Block newCreateMethod, NotificationChain msgs)
  {
    Block oldCreateMethod = createMethod;
    createMethod = newCreateMethod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__CREATE_METHOD, oldCreateMethod, newCreateMethod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreateMethod(Block newCreateMethod)
  {
    if (newCreateMethod != createMethod)
    {
      NotificationChain msgs = null;
      if (createMethod != null)
        msgs = ((InternalEObject)createMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RESOURCE__CREATE_METHOD, null, msgs);
      if (newCreateMethod != null)
        msgs = ((InternalEObject)newCreateMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RESOURCE__CREATE_METHOD, null, msgs);
      msgs = basicSetCreateMethod(newCreateMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__CREATE_METHOD, newCreateMethod, newCreateMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestModelMethodConclusion getCreateConclusion()
  {
    return createConclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreateConclusion(RestModelMethodConclusion newCreateConclusion, NotificationChain msgs)
  {
    RestModelMethodConclusion oldCreateConclusion = createConclusion;
    createConclusion = newCreateConclusion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__CREATE_CONCLUSION, oldCreateConclusion, newCreateConclusion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreateConclusion(RestModelMethodConclusion newCreateConclusion)
  {
    if (newCreateConclusion != createConclusion)
    {
      NotificationChain msgs = null;
      if (createConclusion != null)
        msgs = ((InternalEObject)createConclusion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RESOURCE__CREATE_CONCLUSION, null, msgs);
      if (newCreateConclusion != null)
        msgs = ((InternalEObject)newCreateConclusion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RESOURCE__CREATE_CONCLUSION, null, msgs);
      msgs = basicSetCreateConclusion(newCreateConclusion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__CREATE_CONCLUSION, newCreateConclusion, newCreateConclusion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFindby()
  {
    return findby;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFindby(String newFindby)
  {
    String oldFindby = findby;
    findby = newFindby;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__FINDBY, oldFindby, findby));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getFindMethod()
  {
    return findMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFindMethod(Block newFindMethod, NotificationChain msgs)
  {
    Block oldFindMethod = findMethod;
    findMethod = newFindMethod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__FIND_METHOD, oldFindMethod, newFindMethod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFindMethod(Block newFindMethod)
  {
    if (newFindMethod != findMethod)
    {
      NotificationChain msgs = null;
      if (findMethod != null)
        msgs = ((InternalEObject)findMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RESOURCE__FIND_METHOD, null, msgs);
      if (newFindMethod != null)
        msgs = ((InternalEObject)newFindMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RESOURCE__FIND_METHOD, null, msgs);
      msgs = basicSetFindMethod(newFindMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__FIND_METHOD, newFindMethod, newFindMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestModelMethodConclusion getFindConclusion()
  {
    return findConclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFindConclusion(RestModelMethodConclusion newFindConclusion, NotificationChain msgs)
  {
    RestModelMethodConclusion oldFindConclusion = findConclusion;
    findConclusion = newFindConclusion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__FIND_CONCLUSION, oldFindConclusion, newFindConclusion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFindConclusion(RestModelMethodConclusion newFindConclusion)
  {
    if (newFindConclusion != findConclusion)
    {
      NotificationChain msgs = null;
      if (findConclusion != null)
        msgs = ((InternalEObject)findConclusion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RESOURCE__FIND_CONCLUSION, null, msgs);
      if (newFindConclusion != null)
        msgs = ((InternalEObject)newFindConclusion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RESOURCE__FIND_CONCLUSION, null, msgs);
      msgs = basicSetFindConclusion(newFindConclusion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__FIND_CONCLUSION, newFindConclusion, newFindConclusion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUpdateby()
  {
    return updateby;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpdateby(String newUpdateby)
  {
    String oldUpdateby = updateby;
    updateby = newUpdateby;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__UPDATEBY, oldUpdateby, updateby));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestModel getUpdateRestModel()
  {
    if (updateRestModel != null && updateRestModel.eIsProxy())
    {
      InternalEObject oldUpdateRestModel = (InternalEObject)updateRestModel;
      updateRestModel = (RestModel)eResolveProxy(oldUpdateRestModel);
      if (updateRestModel != oldUpdateRestModel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.RESOURCE__UPDATE_REST_MODEL, oldUpdateRestModel, updateRestModel));
      }
    }
    return updateRestModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestModel basicGetUpdateRestModel()
  {
    return updateRestModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpdateRestModel(RestModel newUpdateRestModel)
  {
    RestModel oldUpdateRestModel = updateRestModel;
    updateRestModel = newUpdateRestModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__UPDATE_REST_MODEL, oldUpdateRestModel, updateRestModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValidationService getUpdateValService()
  {
    return updateValService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUpdateValService(ValidationService newUpdateValService, NotificationChain msgs)
  {
    ValidationService oldUpdateValService = updateValService;
    updateValService = newUpdateValService;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__UPDATE_VAL_SERVICE, oldUpdateValService, newUpdateValService);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpdateValService(ValidationService newUpdateValService)
  {
    if (newUpdateValService != updateValService)
    {
      NotificationChain msgs = null;
      if (updateValService != null)
        msgs = ((InternalEObject)updateValService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RESOURCE__UPDATE_VAL_SERVICE, null, msgs);
      if (newUpdateValService != null)
        msgs = ((InternalEObject)newUpdateValService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RESOURCE__UPDATE_VAL_SERVICE, null, msgs);
      msgs = basicSetUpdateValService(newUpdateValService, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__UPDATE_VAL_SERVICE, newUpdateValService, newUpdateValService));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getUpdateMethod()
  {
    return updateMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUpdateMethod(Block newUpdateMethod, NotificationChain msgs)
  {
    Block oldUpdateMethod = updateMethod;
    updateMethod = newUpdateMethod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__UPDATE_METHOD, oldUpdateMethod, newUpdateMethod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpdateMethod(Block newUpdateMethod)
  {
    if (newUpdateMethod != updateMethod)
    {
      NotificationChain msgs = null;
      if (updateMethod != null)
        msgs = ((InternalEObject)updateMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RESOURCE__UPDATE_METHOD, null, msgs);
      if (newUpdateMethod != null)
        msgs = ((InternalEObject)newUpdateMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RESOURCE__UPDATE_METHOD, null, msgs);
      msgs = basicSetUpdateMethod(newUpdateMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__UPDATE_METHOD, newUpdateMethod, newUpdateMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestModelMethodConclusion getUpdateConclusion()
  {
    return updateConclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUpdateConclusion(RestModelMethodConclusion newUpdateConclusion, NotificationChain msgs)
  {
    RestModelMethodConclusion oldUpdateConclusion = updateConclusion;
    updateConclusion = newUpdateConclusion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__UPDATE_CONCLUSION, oldUpdateConclusion, newUpdateConclusion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpdateConclusion(RestModelMethodConclusion newUpdateConclusion)
  {
    if (newUpdateConclusion != updateConclusion)
    {
      NotificationChain msgs = null;
      if (updateConclusion != null)
        msgs = ((InternalEObject)updateConclusion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RESOURCE__UPDATE_CONCLUSION, null, msgs);
      if (newUpdateConclusion != null)
        msgs = ((InternalEObject)newUpdateConclusion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RESOURCE__UPDATE_CONCLUSION, null, msgs);
      msgs = basicSetUpdateConclusion(newUpdateConclusion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__UPDATE_CONCLUSION, newUpdateConclusion, newUpdateConclusion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDeleteby()
  {
    return deleteby;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeleteby(String newDeleteby)
  {
    String oldDeleteby = deleteby;
    deleteby = newDeleteby;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__DELETEBY, oldDeleteby, deleteby));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getDeleteMethod()
  {
    return deleteMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeleteMethod(Block newDeleteMethod, NotificationChain msgs)
  {
    Block oldDeleteMethod = deleteMethod;
    deleteMethod = newDeleteMethod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__DELETE_METHOD, oldDeleteMethod, newDeleteMethod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeleteMethod(Block newDeleteMethod)
  {
    if (newDeleteMethod != deleteMethod)
    {
      NotificationChain msgs = null;
      if (deleteMethod != null)
        msgs = ((InternalEObject)deleteMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RESOURCE__DELETE_METHOD, null, msgs);
      if (newDeleteMethod != null)
        msgs = ((InternalEObject)newDeleteMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RESOURCE__DELETE_METHOD, null, msgs);
      msgs = basicSetDeleteMethod(newDeleteMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__DELETE_METHOD, newDeleteMethod, newDeleteMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestExceptionList getException4()
  {
    return exception4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetException4(RestExceptionList newException4, NotificationChain msgs)
  {
    RestExceptionList oldException4 = exception4;
    exception4 = newException4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__EXCEPTION4, oldException4, newException4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setException4(RestExceptionList newException4)
  {
    if (newException4 != exception4)
    {
      NotificationChain msgs = null;
      if (exception4 != null)
        msgs = ((InternalEObject)exception4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RESOURCE__EXCEPTION4, null, msgs);
      if (newException4 != null)
        msgs = ((InternalEObject)newException4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RESOURCE__EXCEPTION4, null, msgs);
      msgs = basicSetException4(newException4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RESOURCE__EXCEPTION4, newException4, newException4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.RESOURCE__CREATE_VAL_SERVICE:
        return basicSetCreateValService(null, msgs);
      case MyDslPackage.RESOURCE__CREATE_METHOD:
        return basicSetCreateMethod(null, msgs);
      case MyDslPackage.RESOURCE__CREATE_CONCLUSION:
        return basicSetCreateConclusion(null, msgs);
      case MyDslPackage.RESOURCE__FIND_METHOD:
        return basicSetFindMethod(null, msgs);
      case MyDslPackage.RESOURCE__FIND_CONCLUSION:
        return basicSetFindConclusion(null, msgs);
      case MyDslPackage.RESOURCE__UPDATE_VAL_SERVICE:
        return basicSetUpdateValService(null, msgs);
      case MyDslPackage.RESOURCE__UPDATE_METHOD:
        return basicSetUpdateMethod(null, msgs);
      case MyDslPackage.RESOURCE__UPDATE_CONCLUSION:
        return basicSetUpdateConclusion(null, msgs);
      case MyDslPackage.RESOURCE__DELETE_METHOD:
        return basicSetDeleteMethod(null, msgs);
      case MyDslPackage.RESOURCE__EXCEPTION4:
        return basicSetException4(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.RESOURCE__NAME:
        return getName();
      case MyDslPackage.RESOURCE__SERVICE:
        return getService();
      case MyDslPackage.RESOURCE__EXCEPTION_MAPPER:
        if (resolve) return getExceptionMapper();
        return basicGetExceptionMapper();
      case MyDslPackage.RESOURCE__CREATE_REST_MODEL:
        if (resolve) return getCreateRestModel();
        return basicGetCreateRestModel();
      case MyDslPackage.RESOURCE__CREATE_VAL_SERVICE:
        return getCreateValService();
      case MyDslPackage.RESOURCE__CREATE_METHOD:
        return getCreateMethod();
      case MyDslPackage.RESOURCE__CREATE_CONCLUSION:
        return getCreateConclusion();
      case MyDslPackage.RESOURCE__FINDBY:
        return getFindby();
      case MyDslPackage.RESOURCE__FIND_METHOD:
        return getFindMethod();
      case MyDslPackage.RESOURCE__FIND_CONCLUSION:
        return getFindConclusion();
      case MyDslPackage.RESOURCE__UPDATEBY:
        return getUpdateby();
      case MyDslPackage.RESOURCE__UPDATE_REST_MODEL:
        if (resolve) return getUpdateRestModel();
        return basicGetUpdateRestModel();
      case MyDslPackage.RESOURCE__UPDATE_VAL_SERVICE:
        return getUpdateValService();
      case MyDslPackage.RESOURCE__UPDATE_METHOD:
        return getUpdateMethod();
      case MyDslPackage.RESOURCE__UPDATE_CONCLUSION:
        return getUpdateConclusion();
      case MyDslPackage.RESOURCE__DELETEBY:
        return getDeleteby();
      case MyDslPackage.RESOURCE__DELETE_METHOD:
        return getDeleteMethod();
      case MyDslPackage.RESOURCE__EXCEPTION4:
        return getException4();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.RESOURCE__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.RESOURCE__SERVICE:
        getService().clear();
        getService().addAll((Collection<? extends Service>)newValue);
        return;
      case MyDslPackage.RESOURCE__EXCEPTION_MAPPER:
        setExceptionMapper((ExceptionMapper)newValue);
        return;
      case MyDslPackage.RESOURCE__CREATE_REST_MODEL:
        setCreateRestModel((RestModel)newValue);
        return;
      case MyDslPackage.RESOURCE__CREATE_VAL_SERVICE:
        setCreateValService((ValidationService)newValue);
        return;
      case MyDslPackage.RESOURCE__CREATE_METHOD:
        setCreateMethod((Block)newValue);
        return;
      case MyDslPackage.RESOURCE__CREATE_CONCLUSION:
        setCreateConclusion((RestModelMethodConclusion)newValue);
        return;
      case MyDslPackage.RESOURCE__FINDBY:
        setFindby((String)newValue);
        return;
      case MyDslPackage.RESOURCE__FIND_METHOD:
        setFindMethod((Block)newValue);
        return;
      case MyDslPackage.RESOURCE__FIND_CONCLUSION:
        setFindConclusion((RestModelMethodConclusion)newValue);
        return;
      case MyDslPackage.RESOURCE__UPDATEBY:
        setUpdateby((String)newValue);
        return;
      case MyDslPackage.RESOURCE__UPDATE_REST_MODEL:
        setUpdateRestModel((RestModel)newValue);
        return;
      case MyDslPackage.RESOURCE__UPDATE_VAL_SERVICE:
        setUpdateValService((ValidationService)newValue);
        return;
      case MyDslPackage.RESOURCE__UPDATE_METHOD:
        setUpdateMethod((Block)newValue);
        return;
      case MyDslPackage.RESOURCE__UPDATE_CONCLUSION:
        setUpdateConclusion((RestModelMethodConclusion)newValue);
        return;
      case MyDslPackage.RESOURCE__DELETEBY:
        setDeleteby((String)newValue);
        return;
      case MyDslPackage.RESOURCE__DELETE_METHOD:
        setDeleteMethod((Block)newValue);
        return;
      case MyDslPackage.RESOURCE__EXCEPTION4:
        setException4((RestExceptionList)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.RESOURCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.RESOURCE__SERVICE:
        getService().clear();
        return;
      case MyDslPackage.RESOURCE__EXCEPTION_MAPPER:
        setExceptionMapper((ExceptionMapper)null);
        return;
      case MyDslPackage.RESOURCE__CREATE_REST_MODEL:
        setCreateRestModel((RestModel)null);
        return;
      case MyDslPackage.RESOURCE__CREATE_VAL_SERVICE:
        setCreateValService((ValidationService)null);
        return;
      case MyDslPackage.RESOURCE__CREATE_METHOD:
        setCreateMethod((Block)null);
        return;
      case MyDslPackage.RESOURCE__CREATE_CONCLUSION:
        setCreateConclusion((RestModelMethodConclusion)null);
        return;
      case MyDslPackage.RESOURCE__FINDBY:
        setFindby(FINDBY_EDEFAULT);
        return;
      case MyDslPackage.RESOURCE__FIND_METHOD:
        setFindMethod((Block)null);
        return;
      case MyDslPackage.RESOURCE__FIND_CONCLUSION:
        setFindConclusion((RestModelMethodConclusion)null);
        return;
      case MyDslPackage.RESOURCE__UPDATEBY:
        setUpdateby(UPDATEBY_EDEFAULT);
        return;
      case MyDslPackage.RESOURCE__UPDATE_REST_MODEL:
        setUpdateRestModel((RestModel)null);
        return;
      case MyDslPackage.RESOURCE__UPDATE_VAL_SERVICE:
        setUpdateValService((ValidationService)null);
        return;
      case MyDslPackage.RESOURCE__UPDATE_METHOD:
        setUpdateMethod((Block)null);
        return;
      case MyDslPackage.RESOURCE__UPDATE_CONCLUSION:
        setUpdateConclusion((RestModelMethodConclusion)null);
        return;
      case MyDslPackage.RESOURCE__DELETEBY:
        setDeleteby(DELETEBY_EDEFAULT);
        return;
      case MyDslPackage.RESOURCE__DELETE_METHOD:
        setDeleteMethod((Block)null);
        return;
      case MyDslPackage.RESOURCE__EXCEPTION4:
        setException4((RestExceptionList)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.RESOURCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.RESOURCE__SERVICE:
        return service != null && !service.isEmpty();
      case MyDslPackage.RESOURCE__EXCEPTION_MAPPER:
        return exceptionMapper != null;
      case MyDslPackage.RESOURCE__CREATE_REST_MODEL:
        return createRestModel != null;
      case MyDslPackage.RESOURCE__CREATE_VAL_SERVICE:
        return createValService != null;
      case MyDslPackage.RESOURCE__CREATE_METHOD:
        return createMethod != null;
      case MyDslPackage.RESOURCE__CREATE_CONCLUSION:
        return createConclusion != null;
      case MyDslPackage.RESOURCE__FINDBY:
        return FINDBY_EDEFAULT == null ? findby != null : !FINDBY_EDEFAULT.equals(findby);
      case MyDslPackage.RESOURCE__FIND_METHOD:
        return findMethod != null;
      case MyDslPackage.RESOURCE__FIND_CONCLUSION:
        return findConclusion != null;
      case MyDslPackage.RESOURCE__UPDATEBY:
        return UPDATEBY_EDEFAULT == null ? updateby != null : !UPDATEBY_EDEFAULT.equals(updateby);
      case MyDslPackage.RESOURCE__UPDATE_REST_MODEL:
        return updateRestModel != null;
      case MyDslPackage.RESOURCE__UPDATE_VAL_SERVICE:
        return updateValService != null;
      case MyDslPackage.RESOURCE__UPDATE_METHOD:
        return updateMethod != null;
      case MyDslPackage.RESOURCE__UPDATE_CONCLUSION:
        return updateConclusion != null;
      case MyDslPackage.RESOURCE__DELETEBY:
        return DELETEBY_EDEFAULT == null ? deleteby != null : !DELETEBY_EDEFAULT.equals(deleteby);
      case MyDslPackage.RESOURCE__DELETE_METHOD:
        return deleteMethod != null;
      case MyDslPackage.RESOURCE__EXCEPTION4:
        return exception4 != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", findby: ");
    result.append(findby);
    result.append(", updateby: ");
    result.append(updateby);
    result.append(", deleteby: ");
    result.append(deleteby);
    result.append(')');
    return result.toString();
  }

} //ResourceImpl

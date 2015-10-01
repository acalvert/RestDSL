/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.DataAccessObject;
import org.xtext.example.mydsl.myDsl.DataModel;
import org.xtext.example.mydsl.myDsl.JavaMethod;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.RestException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Access Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataAccessObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataAccessObjectImpl#getCreateDataModel <em>Create Data Model</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataAccessObjectImpl#getException1 <em>Exception1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataAccessObjectImpl#getCreateMethod <em>Create Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataAccessObjectImpl#getCreatedDataModel <em>Created Data Model</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataAccessObjectImpl#getFindby <em>Findby</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataAccessObjectImpl#getException2 <em>Exception2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataAccessObjectImpl#getFindMethod <em>Find Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataAccessObjectImpl#getFoundDataModel <em>Found Data Model</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataAccessObjectImpl#getUpdateby <em>Updateby</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataAccessObjectImpl#getUpdateDataModel <em>Update Data Model</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataAccessObjectImpl#getException3 <em>Exception3</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataAccessObjectImpl#getUpdateMethod <em>Update Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataAccessObjectImpl#getUpdatedDataModel <em>Updated Data Model</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataAccessObjectImpl#getDeleteby <em>Deleteby</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataAccessObjectImpl#getException4 <em>Exception4</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataAccessObjectImpl#getDeleteMethod <em>Delete Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataAccessObjectImpl extends MinimalEObjectImpl.Container implements DataAccessObject
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
   * The cached value of the '{@link #getCreateDataModel() <em>Create Data Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreateDataModel()
   * @generated
   * @ordered
   */
  protected DataModel createDataModel;

  /**
   * The cached value of the '{@link #getException1() <em>Exception1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getException1()
   * @generated
   * @ordered
   */
  protected RestException exception1;

  /**
   * The cached value of the '{@link #getCreateMethod() <em>Create Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreateMethod()
   * @generated
   * @ordered
   */
  protected JavaMethod createMethod;

  /**
   * The cached value of the '{@link #getCreatedDataModel() <em>Created Data Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreatedDataModel()
   * @generated
   * @ordered
   */
  protected DataModel createdDataModel;

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
   * The cached value of the '{@link #getException2() <em>Exception2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getException2()
   * @generated
   * @ordered
   */
  protected RestException exception2;

  /**
   * The cached value of the '{@link #getFindMethod() <em>Find Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFindMethod()
   * @generated
   * @ordered
   */
  protected JavaMethod findMethod;

  /**
   * The cached value of the '{@link #getFoundDataModel() <em>Found Data Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFoundDataModel()
   * @generated
   * @ordered
   */
  protected DataModel foundDataModel;

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
   * The cached value of the '{@link #getUpdateDataModel() <em>Update Data Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdateDataModel()
   * @generated
   * @ordered
   */
  protected DataModel updateDataModel;

  /**
   * The cached value of the '{@link #getException3() <em>Exception3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getException3()
   * @generated
   * @ordered
   */
  protected RestException exception3;

  /**
   * The cached value of the '{@link #getUpdateMethod() <em>Update Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdateMethod()
   * @generated
   * @ordered
   */
  protected JavaMethod updateMethod;

  /**
   * The cached value of the '{@link #getUpdatedDataModel() <em>Updated Data Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdatedDataModel()
   * @generated
   * @ordered
   */
  protected DataModel updatedDataModel;

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
   * The cached value of the '{@link #getException4() <em>Exception4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getException4()
   * @generated
   * @ordered
   */
  protected RestException exception4;

  /**
   * The cached value of the '{@link #getDeleteMethod() <em>Delete Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeleteMethod()
   * @generated
   * @ordered
   */
  protected JavaMethod deleteMethod;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataAccessObjectImpl()
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
    return MyDslPackage.Literals.DATA_ACCESS_OBJECT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS_OBJECT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataModel getCreateDataModel()
  {
    if (createDataModel != null && createDataModel.eIsProxy())
    {
      InternalEObject oldCreateDataModel = (InternalEObject)createDataModel;
      createDataModel = (DataModel)eResolveProxy(oldCreateDataModel);
      if (createDataModel != oldCreateDataModel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.DATA_ACCESS_OBJECT__CREATE_DATA_MODEL, oldCreateDataModel, createDataModel));
      }
    }
    return createDataModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataModel basicGetCreateDataModel()
  {
    return createDataModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreateDataModel(DataModel newCreateDataModel)
  {
    DataModel oldCreateDataModel = createDataModel;
    createDataModel = newCreateDataModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS_OBJECT__CREATE_DATA_MODEL, oldCreateDataModel, createDataModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestException getException1()
  {
    return exception1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetException1(RestException newException1, NotificationChain msgs)
  {
    RestException oldException1 = exception1;
    exception1 = newException1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION1, oldException1, newException1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setException1(RestException newException1)
  {
    if (newException1 != exception1)
    {
      NotificationChain msgs = null;
      if (exception1 != null)
        msgs = ((InternalEObject)exception1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION1, null, msgs);
      if (newException1 != null)
        msgs = ((InternalEObject)newException1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION1, null, msgs);
      msgs = basicSetException1(newException1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION1, newException1, newException1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavaMethod getCreateMethod()
  {
    return createMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreateMethod(JavaMethod newCreateMethod, NotificationChain msgs)
  {
    JavaMethod oldCreateMethod = createMethod;
    createMethod = newCreateMethod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS_OBJECT__CREATE_METHOD, oldCreateMethod, newCreateMethod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreateMethod(JavaMethod newCreateMethod)
  {
    if (newCreateMethod != createMethod)
    {
      NotificationChain msgs = null;
      if (createMethod != null)
        msgs = ((InternalEObject)createMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DATA_ACCESS_OBJECT__CREATE_METHOD, null, msgs);
      if (newCreateMethod != null)
        msgs = ((InternalEObject)newCreateMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DATA_ACCESS_OBJECT__CREATE_METHOD, null, msgs);
      msgs = basicSetCreateMethod(newCreateMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS_OBJECT__CREATE_METHOD, newCreateMethod, newCreateMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataModel getCreatedDataModel()
  {
    if (createdDataModel != null && createdDataModel.eIsProxy())
    {
      InternalEObject oldCreatedDataModel = (InternalEObject)createdDataModel;
      createdDataModel = (DataModel)eResolveProxy(oldCreatedDataModel);
      if (createdDataModel != oldCreatedDataModel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.DATA_ACCESS_OBJECT__CREATED_DATA_MODEL, oldCreatedDataModel, createdDataModel));
      }
    }
    return createdDataModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataModel basicGetCreatedDataModel()
  {
    return createdDataModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreatedDataModel(DataModel newCreatedDataModel)
  {
    DataModel oldCreatedDataModel = createdDataModel;
    createdDataModel = newCreatedDataModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS_OBJECT__CREATED_DATA_MODEL, oldCreatedDataModel, createdDataModel));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS_OBJECT__FINDBY, oldFindby, findby));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestException getException2()
  {
    return exception2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetException2(RestException newException2, NotificationChain msgs)
  {
    RestException oldException2 = exception2;
    exception2 = newException2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION2, oldException2, newException2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setException2(RestException newException2)
  {
    if (newException2 != exception2)
    {
      NotificationChain msgs = null;
      if (exception2 != null)
        msgs = ((InternalEObject)exception2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION2, null, msgs);
      if (newException2 != null)
        msgs = ((InternalEObject)newException2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION2, null, msgs);
      msgs = basicSetException2(newException2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION2, newException2, newException2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavaMethod getFindMethod()
  {
    return findMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFindMethod(JavaMethod newFindMethod, NotificationChain msgs)
  {
    JavaMethod oldFindMethod = findMethod;
    findMethod = newFindMethod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS_OBJECT__FIND_METHOD, oldFindMethod, newFindMethod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFindMethod(JavaMethod newFindMethod)
  {
    if (newFindMethod != findMethod)
    {
      NotificationChain msgs = null;
      if (findMethod != null)
        msgs = ((InternalEObject)findMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DATA_ACCESS_OBJECT__FIND_METHOD, null, msgs);
      if (newFindMethod != null)
        msgs = ((InternalEObject)newFindMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DATA_ACCESS_OBJECT__FIND_METHOD, null, msgs);
      msgs = basicSetFindMethod(newFindMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS_OBJECT__FIND_METHOD, newFindMethod, newFindMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataModel getFoundDataModel()
  {
    if (foundDataModel != null && foundDataModel.eIsProxy())
    {
      InternalEObject oldFoundDataModel = (InternalEObject)foundDataModel;
      foundDataModel = (DataModel)eResolveProxy(oldFoundDataModel);
      if (foundDataModel != oldFoundDataModel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.DATA_ACCESS_OBJECT__FOUND_DATA_MODEL, oldFoundDataModel, foundDataModel));
      }
    }
    return foundDataModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataModel basicGetFoundDataModel()
  {
    return foundDataModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFoundDataModel(DataModel newFoundDataModel)
  {
    DataModel oldFoundDataModel = foundDataModel;
    foundDataModel = newFoundDataModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS_OBJECT__FOUND_DATA_MODEL, oldFoundDataModel, foundDataModel));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS_OBJECT__UPDATEBY, oldUpdateby, updateby));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataModel getUpdateDataModel()
  {
    if (updateDataModel != null && updateDataModel.eIsProxy())
    {
      InternalEObject oldUpdateDataModel = (InternalEObject)updateDataModel;
      updateDataModel = (DataModel)eResolveProxy(oldUpdateDataModel);
      if (updateDataModel != oldUpdateDataModel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.DATA_ACCESS_OBJECT__UPDATE_DATA_MODEL, oldUpdateDataModel, updateDataModel));
      }
    }
    return updateDataModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataModel basicGetUpdateDataModel()
  {
    return updateDataModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpdateDataModel(DataModel newUpdateDataModel)
  {
    DataModel oldUpdateDataModel = updateDataModel;
    updateDataModel = newUpdateDataModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS_OBJECT__UPDATE_DATA_MODEL, oldUpdateDataModel, updateDataModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestException getException3()
  {
    return exception3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetException3(RestException newException3, NotificationChain msgs)
  {
    RestException oldException3 = exception3;
    exception3 = newException3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION3, oldException3, newException3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setException3(RestException newException3)
  {
    if (newException3 != exception3)
    {
      NotificationChain msgs = null;
      if (exception3 != null)
        msgs = ((InternalEObject)exception3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION3, null, msgs);
      if (newException3 != null)
        msgs = ((InternalEObject)newException3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION3, null, msgs);
      msgs = basicSetException3(newException3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION3, newException3, newException3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavaMethod getUpdateMethod()
  {
    return updateMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUpdateMethod(JavaMethod newUpdateMethod, NotificationChain msgs)
  {
    JavaMethod oldUpdateMethod = updateMethod;
    updateMethod = newUpdateMethod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS_OBJECT__UPDATE_METHOD, oldUpdateMethod, newUpdateMethod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpdateMethod(JavaMethod newUpdateMethod)
  {
    if (newUpdateMethod != updateMethod)
    {
      NotificationChain msgs = null;
      if (updateMethod != null)
        msgs = ((InternalEObject)updateMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DATA_ACCESS_OBJECT__UPDATE_METHOD, null, msgs);
      if (newUpdateMethod != null)
        msgs = ((InternalEObject)newUpdateMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DATA_ACCESS_OBJECT__UPDATE_METHOD, null, msgs);
      msgs = basicSetUpdateMethod(newUpdateMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS_OBJECT__UPDATE_METHOD, newUpdateMethod, newUpdateMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataModel getUpdatedDataModel()
  {
    if (updatedDataModel != null && updatedDataModel.eIsProxy())
    {
      InternalEObject oldUpdatedDataModel = (InternalEObject)updatedDataModel;
      updatedDataModel = (DataModel)eResolveProxy(oldUpdatedDataModel);
      if (updatedDataModel != oldUpdatedDataModel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.DATA_ACCESS_OBJECT__UPDATED_DATA_MODEL, oldUpdatedDataModel, updatedDataModel));
      }
    }
    return updatedDataModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataModel basicGetUpdatedDataModel()
  {
    return updatedDataModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpdatedDataModel(DataModel newUpdatedDataModel)
  {
    DataModel oldUpdatedDataModel = updatedDataModel;
    updatedDataModel = newUpdatedDataModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS_OBJECT__UPDATED_DATA_MODEL, oldUpdatedDataModel, updatedDataModel));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS_OBJECT__DELETEBY, oldDeleteby, deleteby));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestException getException4()
  {
    return exception4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetException4(RestException newException4, NotificationChain msgs)
  {
    RestException oldException4 = exception4;
    exception4 = newException4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION4, oldException4, newException4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setException4(RestException newException4)
  {
    if (newException4 != exception4)
    {
      NotificationChain msgs = null;
      if (exception4 != null)
        msgs = ((InternalEObject)exception4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION4, null, msgs);
      if (newException4 != null)
        msgs = ((InternalEObject)newException4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION4, null, msgs);
      msgs = basicSetException4(newException4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION4, newException4, newException4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavaMethod getDeleteMethod()
  {
    return deleteMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeleteMethod(JavaMethod newDeleteMethod, NotificationChain msgs)
  {
    JavaMethod oldDeleteMethod = deleteMethod;
    deleteMethod = newDeleteMethod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS_OBJECT__DELETE_METHOD, oldDeleteMethod, newDeleteMethod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeleteMethod(JavaMethod newDeleteMethod)
  {
    if (newDeleteMethod != deleteMethod)
    {
      NotificationChain msgs = null;
      if (deleteMethod != null)
        msgs = ((InternalEObject)deleteMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DATA_ACCESS_OBJECT__DELETE_METHOD, null, msgs);
      if (newDeleteMethod != null)
        msgs = ((InternalEObject)newDeleteMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DATA_ACCESS_OBJECT__DELETE_METHOD, null, msgs);
      msgs = basicSetDeleteMethod(newDeleteMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS_OBJECT__DELETE_METHOD, newDeleteMethod, newDeleteMethod));
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
      case MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION1:
        return basicSetException1(null, msgs);
      case MyDslPackage.DATA_ACCESS_OBJECT__CREATE_METHOD:
        return basicSetCreateMethod(null, msgs);
      case MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION2:
        return basicSetException2(null, msgs);
      case MyDslPackage.DATA_ACCESS_OBJECT__FIND_METHOD:
        return basicSetFindMethod(null, msgs);
      case MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION3:
        return basicSetException3(null, msgs);
      case MyDslPackage.DATA_ACCESS_OBJECT__UPDATE_METHOD:
        return basicSetUpdateMethod(null, msgs);
      case MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION4:
        return basicSetException4(null, msgs);
      case MyDslPackage.DATA_ACCESS_OBJECT__DELETE_METHOD:
        return basicSetDeleteMethod(null, msgs);
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
      case MyDslPackage.DATA_ACCESS_OBJECT__NAME:
        return getName();
      case MyDslPackage.DATA_ACCESS_OBJECT__CREATE_DATA_MODEL:
        if (resolve) return getCreateDataModel();
        return basicGetCreateDataModel();
      case MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION1:
        return getException1();
      case MyDslPackage.DATA_ACCESS_OBJECT__CREATE_METHOD:
        return getCreateMethod();
      case MyDslPackage.DATA_ACCESS_OBJECT__CREATED_DATA_MODEL:
        if (resolve) return getCreatedDataModel();
        return basicGetCreatedDataModel();
      case MyDslPackage.DATA_ACCESS_OBJECT__FINDBY:
        return getFindby();
      case MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION2:
        return getException2();
      case MyDslPackage.DATA_ACCESS_OBJECT__FIND_METHOD:
        return getFindMethod();
      case MyDslPackage.DATA_ACCESS_OBJECT__FOUND_DATA_MODEL:
        if (resolve) return getFoundDataModel();
        return basicGetFoundDataModel();
      case MyDslPackage.DATA_ACCESS_OBJECT__UPDATEBY:
        return getUpdateby();
      case MyDslPackage.DATA_ACCESS_OBJECT__UPDATE_DATA_MODEL:
        if (resolve) return getUpdateDataModel();
        return basicGetUpdateDataModel();
      case MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION3:
        return getException3();
      case MyDslPackage.DATA_ACCESS_OBJECT__UPDATE_METHOD:
        return getUpdateMethod();
      case MyDslPackage.DATA_ACCESS_OBJECT__UPDATED_DATA_MODEL:
        if (resolve) return getUpdatedDataModel();
        return basicGetUpdatedDataModel();
      case MyDslPackage.DATA_ACCESS_OBJECT__DELETEBY:
        return getDeleteby();
      case MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION4:
        return getException4();
      case MyDslPackage.DATA_ACCESS_OBJECT__DELETE_METHOD:
        return getDeleteMethod();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.DATA_ACCESS_OBJECT__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__CREATE_DATA_MODEL:
        setCreateDataModel((DataModel)newValue);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION1:
        setException1((RestException)newValue);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__CREATE_METHOD:
        setCreateMethod((JavaMethod)newValue);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__CREATED_DATA_MODEL:
        setCreatedDataModel((DataModel)newValue);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__FINDBY:
        setFindby((String)newValue);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION2:
        setException2((RestException)newValue);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__FIND_METHOD:
        setFindMethod((JavaMethod)newValue);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__FOUND_DATA_MODEL:
        setFoundDataModel((DataModel)newValue);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__UPDATEBY:
        setUpdateby((String)newValue);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__UPDATE_DATA_MODEL:
        setUpdateDataModel((DataModel)newValue);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION3:
        setException3((RestException)newValue);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__UPDATE_METHOD:
        setUpdateMethod((JavaMethod)newValue);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__UPDATED_DATA_MODEL:
        setUpdatedDataModel((DataModel)newValue);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__DELETEBY:
        setDeleteby((String)newValue);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION4:
        setException4((RestException)newValue);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__DELETE_METHOD:
        setDeleteMethod((JavaMethod)newValue);
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
      case MyDslPackage.DATA_ACCESS_OBJECT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__CREATE_DATA_MODEL:
        setCreateDataModel((DataModel)null);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION1:
        setException1((RestException)null);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__CREATE_METHOD:
        setCreateMethod((JavaMethod)null);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__CREATED_DATA_MODEL:
        setCreatedDataModel((DataModel)null);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__FINDBY:
        setFindby(FINDBY_EDEFAULT);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION2:
        setException2((RestException)null);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__FIND_METHOD:
        setFindMethod((JavaMethod)null);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__FOUND_DATA_MODEL:
        setFoundDataModel((DataModel)null);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__UPDATEBY:
        setUpdateby(UPDATEBY_EDEFAULT);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__UPDATE_DATA_MODEL:
        setUpdateDataModel((DataModel)null);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION3:
        setException3((RestException)null);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__UPDATE_METHOD:
        setUpdateMethod((JavaMethod)null);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__UPDATED_DATA_MODEL:
        setUpdatedDataModel((DataModel)null);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__DELETEBY:
        setDeleteby(DELETEBY_EDEFAULT);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION4:
        setException4((RestException)null);
        return;
      case MyDslPackage.DATA_ACCESS_OBJECT__DELETE_METHOD:
        setDeleteMethod((JavaMethod)null);
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
      case MyDslPackage.DATA_ACCESS_OBJECT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.DATA_ACCESS_OBJECT__CREATE_DATA_MODEL:
        return createDataModel != null;
      case MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION1:
        return exception1 != null;
      case MyDslPackage.DATA_ACCESS_OBJECT__CREATE_METHOD:
        return createMethod != null;
      case MyDslPackage.DATA_ACCESS_OBJECT__CREATED_DATA_MODEL:
        return createdDataModel != null;
      case MyDslPackage.DATA_ACCESS_OBJECT__FINDBY:
        return FINDBY_EDEFAULT == null ? findby != null : !FINDBY_EDEFAULT.equals(findby);
      case MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION2:
        return exception2 != null;
      case MyDslPackage.DATA_ACCESS_OBJECT__FIND_METHOD:
        return findMethod != null;
      case MyDslPackage.DATA_ACCESS_OBJECT__FOUND_DATA_MODEL:
        return foundDataModel != null;
      case MyDslPackage.DATA_ACCESS_OBJECT__UPDATEBY:
        return UPDATEBY_EDEFAULT == null ? updateby != null : !UPDATEBY_EDEFAULT.equals(updateby);
      case MyDslPackage.DATA_ACCESS_OBJECT__UPDATE_DATA_MODEL:
        return updateDataModel != null;
      case MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION3:
        return exception3 != null;
      case MyDslPackage.DATA_ACCESS_OBJECT__UPDATE_METHOD:
        return updateMethod != null;
      case MyDslPackage.DATA_ACCESS_OBJECT__UPDATED_DATA_MODEL:
        return updatedDataModel != null;
      case MyDslPackage.DATA_ACCESS_OBJECT__DELETEBY:
        return DELETEBY_EDEFAULT == null ? deleteby != null : !DELETEBY_EDEFAULT.equals(deleteby);
      case MyDslPackage.DATA_ACCESS_OBJECT__EXCEPTION4:
        return exception4 != null;
      case MyDslPackage.DATA_ACCESS_OBJECT__DELETE_METHOD:
        return deleteMethod != null;
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

} //DataAccessObjectImpl

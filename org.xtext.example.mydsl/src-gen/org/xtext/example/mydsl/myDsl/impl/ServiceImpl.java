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
import org.xtext.example.mydsl.myDsl.DataAccessObject;
import org.xtext.example.mydsl.myDsl.DataModel;
import org.xtext.example.mydsl.myDsl.DataModelMethodConclusion;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.RestExceptionList;
import org.xtext.example.mydsl.myDsl.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ServiceImpl#getDao <em>Dao</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ServiceImpl#getCreateDataModel <em>Create Data Model</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ServiceImpl#getCreateMethod <em>Create Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ServiceImpl#getCreateConclusion <em>Create Conclusion</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ServiceImpl#getFindby <em>Findby</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ServiceImpl#getFindMethod <em>Find Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ServiceImpl#getFindConclusion <em>Find Conclusion</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ServiceImpl#getUpdateby <em>Updateby</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ServiceImpl#getUpdateDataModel <em>Update Data Model</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ServiceImpl#getUpdateMethod <em>Update Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ServiceImpl#getUpdateConclusion <em>Update Conclusion</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ServiceImpl#getDeleteby <em>Deleteby</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ServiceImpl#getDeleteMethod <em>Delete Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ServiceImpl#getException4 <em>Exception4</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service
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
   * The cached value of the '{@link #getDao() <em>Dao</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDao()
   * @generated
   * @ordered
   */
  protected EList<DataAccessObject> dao;

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
  protected DataModelMethodConclusion createConclusion;

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
  protected DataModelMethodConclusion findConclusion;

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
  protected DataModelMethodConclusion updateConclusion;

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
  protected ServiceImpl()
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
    return MyDslPackage.Literals.SERVICE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataAccessObject> getDao()
  {
    if (dao == null)
    {
      dao = new EObjectResolvingEList<DataAccessObject>(DataAccessObject.class, this, MyDslPackage.SERVICE__DAO);
    }
    return dao;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.SERVICE__CREATE_DATA_MODEL, oldCreateDataModel, createDataModel));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE__CREATE_DATA_MODEL, oldCreateDataModel, createDataModel));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE__CREATE_METHOD, oldCreateMethod, newCreateMethod);
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
        msgs = ((InternalEObject)createMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SERVICE__CREATE_METHOD, null, msgs);
      if (newCreateMethod != null)
        msgs = ((InternalEObject)newCreateMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SERVICE__CREATE_METHOD, null, msgs);
      msgs = basicSetCreateMethod(newCreateMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE__CREATE_METHOD, newCreateMethod, newCreateMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataModelMethodConclusion getCreateConclusion()
  {
    return createConclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreateConclusion(DataModelMethodConclusion newCreateConclusion, NotificationChain msgs)
  {
    DataModelMethodConclusion oldCreateConclusion = createConclusion;
    createConclusion = newCreateConclusion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE__CREATE_CONCLUSION, oldCreateConclusion, newCreateConclusion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreateConclusion(DataModelMethodConclusion newCreateConclusion)
  {
    if (newCreateConclusion != createConclusion)
    {
      NotificationChain msgs = null;
      if (createConclusion != null)
        msgs = ((InternalEObject)createConclusion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SERVICE__CREATE_CONCLUSION, null, msgs);
      if (newCreateConclusion != null)
        msgs = ((InternalEObject)newCreateConclusion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SERVICE__CREATE_CONCLUSION, null, msgs);
      msgs = basicSetCreateConclusion(newCreateConclusion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE__CREATE_CONCLUSION, newCreateConclusion, newCreateConclusion));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE__FINDBY, oldFindby, findby));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE__FIND_METHOD, oldFindMethod, newFindMethod);
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
        msgs = ((InternalEObject)findMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SERVICE__FIND_METHOD, null, msgs);
      if (newFindMethod != null)
        msgs = ((InternalEObject)newFindMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SERVICE__FIND_METHOD, null, msgs);
      msgs = basicSetFindMethod(newFindMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE__FIND_METHOD, newFindMethod, newFindMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataModelMethodConclusion getFindConclusion()
  {
    return findConclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFindConclusion(DataModelMethodConclusion newFindConclusion, NotificationChain msgs)
  {
    DataModelMethodConclusion oldFindConclusion = findConclusion;
    findConclusion = newFindConclusion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE__FIND_CONCLUSION, oldFindConclusion, newFindConclusion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFindConclusion(DataModelMethodConclusion newFindConclusion)
  {
    if (newFindConclusion != findConclusion)
    {
      NotificationChain msgs = null;
      if (findConclusion != null)
        msgs = ((InternalEObject)findConclusion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SERVICE__FIND_CONCLUSION, null, msgs);
      if (newFindConclusion != null)
        msgs = ((InternalEObject)newFindConclusion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SERVICE__FIND_CONCLUSION, null, msgs);
      msgs = basicSetFindConclusion(newFindConclusion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE__FIND_CONCLUSION, newFindConclusion, newFindConclusion));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE__UPDATEBY, oldUpdateby, updateby));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.SERVICE__UPDATE_DATA_MODEL, oldUpdateDataModel, updateDataModel));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE__UPDATE_DATA_MODEL, oldUpdateDataModel, updateDataModel));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE__UPDATE_METHOD, oldUpdateMethod, newUpdateMethod);
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
        msgs = ((InternalEObject)updateMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SERVICE__UPDATE_METHOD, null, msgs);
      if (newUpdateMethod != null)
        msgs = ((InternalEObject)newUpdateMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SERVICE__UPDATE_METHOD, null, msgs);
      msgs = basicSetUpdateMethod(newUpdateMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE__UPDATE_METHOD, newUpdateMethod, newUpdateMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataModelMethodConclusion getUpdateConclusion()
  {
    return updateConclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUpdateConclusion(DataModelMethodConclusion newUpdateConclusion, NotificationChain msgs)
  {
    DataModelMethodConclusion oldUpdateConclusion = updateConclusion;
    updateConclusion = newUpdateConclusion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE__UPDATE_CONCLUSION, oldUpdateConclusion, newUpdateConclusion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpdateConclusion(DataModelMethodConclusion newUpdateConclusion)
  {
    if (newUpdateConclusion != updateConclusion)
    {
      NotificationChain msgs = null;
      if (updateConclusion != null)
        msgs = ((InternalEObject)updateConclusion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SERVICE__UPDATE_CONCLUSION, null, msgs);
      if (newUpdateConclusion != null)
        msgs = ((InternalEObject)newUpdateConclusion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SERVICE__UPDATE_CONCLUSION, null, msgs);
      msgs = basicSetUpdateConclusion(newUpdateConclusion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE__UPDATE_CONCLUSION, newUpdateConclusion, newUpdateConclusion));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE__DELETEBY, oldDeleteby, deleteby));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE__DELETE_METHOD, oldDeleteMethod, newDeleteMethod);
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
        msgs = ((InternalEObject)deleteMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SERVICE__DELETE_METHOD, null, msgs);
      if (newDeleteMethod != null)
        msgs = ((InternalEObject)newDeleteMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SERVICE__DELETE_METHOD, null, msgs);
      msgs = basicSetDeleteMethod(newDeleteMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE__DELETE_METHOD, newDeleteMethod, newDeleteMethod));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE__EXCEPTION4, oldException4, newException4);
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
        msgs = ((InternalEObject)exception4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SERVICE__EXCEPTION4, null, msgs);
      if (newException4 != null)
        msgs = ((InternalEObject)newException4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SERVICE__EXCEPTION4, null, msgs);
      msgs = basicSetException4(newException4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE__EXCEPTION4, newException4, newException4));
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
      case MyDslPackage.SERVICE__CREATE_METHOD:
        return basicSetCreateMethod(null, msgs);
      case MyDslPackage.SERVICE__CREATE_CONCLUSION:
        return basicSetCreateConclusion(null, msgs);
      case MyDslPackage.SERVICE__FIND_METHOD:
        return basicSetFindMethod(null, msgs);
      case MyDslPackage.SERVICE__FIND_CONCLUSION:
        return basicSetFindConclusion(null, msgs);
      case MyDslPackage.SERVICE__UPDATE_METHOD:
        return basicSetUpdateMethod(null, msgs);
      case MyDslPackage.SERVICE__UPDATE_CONCLUSION:
        return basicSetUpdateConclusion(null, msgs);
      case MyDslPackage.SERVICE__DELETE_METHOD:
        return basicSetDeleteMethod(null, msgs);
      case MyDslPackage.SERVICE__EXCEPTION4:
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
      case MyDslPackage.SERVICE__NAME:
        return getName();
      case MyDslPackage.SERVICE__DAO:
        return getDao();
      case MyDslPackage.SERVICE__CREATE_DATA_MODEL:
        if (resolve) return getCreateDataModel();
        return basicGetCreateDataModel();
      case MyDslPackage.SERVICE__CREATE_METHOD:
        return getCreateMethod();
      case MyDslPackage.SERVICE__CREATE_CONCLUSION:
        return getCreateConclusion();
      case MyDslPackage.SERVICE__FINDBY:
        return getFindby();
      case MyDslPackage.SERVICE__FIND_METHOD:
        return getFindMethod();
      case MyDslPackage.SERVICE__FIND_CONCLUSION:
        return getFindConclusion();
      case MyDslPackage.SERVICE__UPDATEBY:
        return getUpdateby();
      case MyDslPackage.SERVICE__UPDATE_DATA_MODEL:
        if (resolve) return getUpdateDataModel();
        return basicGetUpdateDataModel();
      case MyDslPackage.SERVICE__UPDATE_METHOD:
        return getUpdateMethod();
      case MyDslPackage.SERVICE__UPDATE_CONCLUSION:
        return getUpdateConclusion();
      case MyDslPackage.SERVICE__DELETEBY:
        return getDeleteby();
      case MyDslPackage.SERVICE__DELETE_METHOD:
        return getDeleteMethod();
      case MyDslPackage.SERVICE__EXCEPTION4:
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
      case MyDslPackage.SERVICE__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.SERVICE__DAO:
        getDao().clear();
        getDao().addAll((Collection<? extends DataAccessObject>)newValue);
        return;
      case MyDslPackage.SERVICE__CREATE_DATA_MODEL:
        setCreateDataModel((DataModel)newValue);
        return;
      case MyDslPackage.SERVICE__CREATE_METHOD:
        setCreateMethod((Block)newValue);
        return;
      case MyDslPackage.SERVICE__CREATE_CONCLUSION:
        setCreateConclusion((DataModelMethodConclusion)newValue);
        return;
      case MyDslPackage.SERVICE__FINDBY:
        setFindby((String)newValue);
        return;
      case MyDslPackage.SERVICE__FIND_METHOD:
        setFindMethod((Block)newValue);
        return;
      case MyDslPackage.SERVICE__FIND_CONCLUSION:
        setFindConclusion((DataModelMethodConclusion)newValue);
        return;
      case MyDslPackage.SERVICE__UPDATEBY:
        setUpdateby((String)newValue);
        return;
      case MyDslPackage.SERVICE__UPDATE_DATA_MODEL:
        setUpdateDataModel((DataModel)newValue);
        return;
      case MyDslPackage.SERVICE__UPDATE_METHOD:
        setUpdateMethod((Block)newValue);
        return;
      case MyDslPackage.SERVICE__UPDATE_CONCLUSION:
        setUpdateConclusion((DataModelMethodConclusion)newValue);
        return;
      case MyDslPackage.SERVICE__DELETEBY:
        setDeleteby((String)newValue);
        return;
      case MyDslPackage.SERVICE__DELETE_METHOD:
        setDeleteMethod((Block)newValue);
        return;
      case MyDslPackage.SERVICE__EXCEPTION4:
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
      case MyDslPackage.SERVICE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.SERVICE__DAO:
        getDao().clear();
        return;
      case MyDslPackage.SERVICE__CREATE_DATA_MODEL:
        setCreateDataModel((DataModel)null);
        return;
      case MyDslPackage.SERVICE__CREATE_METHOD:
        setCreateMethod((Block)null);
        return;
      case MyDslPackage.SERVICE__CREATE_CONCLUSION:
        setCreateConclusion((DataModelMethodConclusion)null);
        return;
      case MyDslPackage.SERVICE__FINDBY:
        setFindby(FINDBY_EDEFAULT);
        return;
      case MyDslPackage.SERVICE__FIND_METHOD:
        setFindMethod((Block)null);
        return;
      case MyDslPackage.SERVICE__FIND_CONCLUSION:
        setFindConclusion((DataModelMethodConclusion)null);
        return;
      case MyDslPackage.SERVICE__UPDATEBY:
        setUpdateby(UPDATEBY_EDEFAULT);
        return;
      case MyDslPackage.SERVICE__UPDATE_DATA_MODEL:
        setUpdateDataModel((DataModel)null);
        return;
      case MyDslPackage.SERVICE__UPDATE_METHOD:
        setUpdateMethod((Block)null);
        return;
      case MyDslPackage.SERVICE__UPDATE_CONCLUSION:
        setUpdateConclusion((DataModelMethodConclusion)null);
        return;
      case MyDslPackage.SERVICE__DELETEBY:
        setDeleteby(DELETEBY_EDEFAULT);
        return;
      case MyDslPackage.SERVICE__DELETE_METHOD:
        setDeleteMethod((Block)null);
        return;
      case MyDslPackage.SERVICE__EXCEPTION4:
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
      case MyDslPackage.SERVICE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.SERVICE__DAO:
        return dao != null && !dao.isEmpty();
      case MyDslPackage.SERVICE__CREATE_DATA_MODEL:
        return createDataModel != null;
      case MyDslPackage.SERVICE__CREATE_METHOD:
        return createMethod != null;
      case MyDslPackage.SERVICE__CREATE_CONCLUSION:
        return createConclusion != null;
      case MyDslPackage.SERVICE__FINDBY:
        return FINDBY_EDEFAULT == null ? findby != null : !FINDBY_EDEFAULT.equals(findby);
      case MyDslPackage.SERVICE__FIND_METHOD:
        return findMethod != null;
      case MyDslPackage.SERVICE__FIND_CONCLUSION:
        return findConclusion != null;
      case MyDslPackage.SERVICE__UPDATEBY:
        return UPDATEBY_EDEFAULT == null ? updateby != null : !UPDATEBY_EDEFAULT.equals(updateby);
      case MyDslPackage.SERVICE__UPDATE_DATA_MODEL:
        return updateDataModel != null;
      case MyDslPackage.SERVICE__UPDATE_METHOD:
        return updateMethod != null;
      case MyDslPackage.SERVICE__UPDATE_CONCLUSION:
        return updateConclusion != null;
      case MyDslPackage.SERVICE__DELETEBY:
        return DELETEBY_EDEFAULT == null ? deleteby != null : !DELETEBY_EDEFAULT.equals(deleteby);
      case MyDslPackage.SERVICE__DELETE_METHOD:
        return deleteMethod != null;
      case MyDslPackage.SERVICE__EXCEPTION4:
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

} //ServiceImpl

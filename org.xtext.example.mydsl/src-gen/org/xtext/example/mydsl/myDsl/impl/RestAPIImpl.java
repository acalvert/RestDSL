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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.DataAccessObject;
import org.xtext.example.mydsl.myDsl.ExceptionMapper;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Resource;
import org.xtext.example.mydsl.myDsl.RestAPI;
import org.xtext.example.mydsl.myDsl.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rest API</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RestAPIImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RestAPIImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RestAPIImpl#getDao <em>Dao</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RestAPIImpl#getExceptionMapper <em>Exception Mapper</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestAPIImpl extends MinimalEObjectImpl.Container implements RestAPI
{
  /**
   * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResource()
   * @generated
   * @ordered
   */
  protected Resource resource;

  /**
   * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getService()
   * @generated
   * @ordered
   */
  protected EList<Service> service;

  /**
   * The cached value of the '{@link #getDao() <em>Dao</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDao()
   * @generated
   * @ordered
   */
  protected EList<DataAccessObject> dao;

  /**
   * The cached value of the '{@link #getExceptionMapper() <em>Exception Mapper</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExceptionMapper()
   * @generated
   * @ordered
   */
  protected EList<ExceptionMapper> exceptionMapper;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RestAPIImpl()
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
    return MyDslPackage.Literals.REST_API;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource getResource()
  {
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResource(Resource newResource, NotificationChain msgs)
  {
    Resource oldResource = resource;
    resource = newResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.REST_API__RESOURCE, oldResource, newResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResource(Resource newResource)
  {
    if (newResource != resource)
    {
      NotificationChain msgs = null;
      if (resource != null)
        msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.REST_API__RESOURCE, null, msgs);
      if (newResource != null)
        msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.REST_API__RESOURCE, null, msgs);
      msgs = basicSetResource(newResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.REST_API__RESOURCE, newResource, newResource));
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
      service = new EObjectContainmentEList<Service>(Service.class, this, MyDslPackage.REST_API__SERVICE);
    }
    return service;
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
      dao = new EObjectContainmentEList<DataAccessObject>(DataAccessObject.class, this, MyDslPackage.REST_API__DAO);
    }
    return dao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExceptionMapper> getExceptionMapper()
  {
    if (exceptionMapper == null)
    {
      exceptionMapper = new EObjectContainmentEList<ExceptionMapper>(ExceptionMapper.class, this, MyDslPackage.REST_API__EXCEPTION_MAPPER);
    }
    return exceptionMapper;
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
      case MyDslPackage.REST_API__RESOURCE:
        return basicSetResource(null, msgs);
      case MyDslPackage.REST_API__SERVICE:
        return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
      case MyDslPackage.REST_API__DAO:
        return ((InternalEList<?>)getDao()).basicRemove(otherEnd, msgs);
      case MyDslPackage.REST_API__EXCEPTION_MAPPER:
        return ((InternalEList<?>)getExceptionMapper()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.REST_API__RESOURCE:
        return getResource();
      case MyDslPackage.REST_API__SERVICE:
        return getService();
      case MyDslPackage.REST_API__DAO:
        return getDao();
      case MyDslPackage.REST_API__EXCEPTION_MAPPER:
        return getExceptionMapper();
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
      case MyDslPackage.REST_API__RESOURCE:
        setResource((Resource)newValue);
        return;
      case MyDslPackage.REST_API__SERVICE:
        getService().clear();
        getService().addAll((Collection<? extends Service>)newValue);
        return;
      case MyDslPackage.REST_API__DAO:
        getDao().clear();
        getDao().addAll((Collection<? extends DataAccessObject>)newValue);
        return;
      case MyDslPackage.REST_API__EXCEPTION_MAPPER:
        getExceptionMapper().clear();
        getExceptionMapper().addAll((Collection<? extends ExceptionMapper>)newValue);
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
      case MyDslPackage.REST_API__RESOURCE:
        setResource((Resource)null);
        return;
      case MyDslPackage.REST_API__SERVICE:
        getService().clear();
        return;
      case MyDslPackage.REST_API__DAO:
        getDao().clear();
        return;
      case MyDslPackage.REST_API__EXCEPTION_MAPPER:
        getExceptionMapper().clear();
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
      case MyDslPackage.REST_API__RESOURCE:
        return resource != null;
      case MyDslPackage.REST_API__SERVICE:
        return service != null && !service.isEmpty();
      case MyDslPackage.REST_API__DAO:
        return dao != null && !dao.isEmpty();
      case MyDslPackage.REST_API__EXCEPTION_MAPPER:
        return exceptionMapper != null && !exceptionMapper.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RestAPIImpl

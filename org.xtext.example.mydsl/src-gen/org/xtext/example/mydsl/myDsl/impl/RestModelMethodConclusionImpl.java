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

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.RestExceptionList;
import org.xtext.example.mydsl.myDsl.RestModel;
import org.xtext.example.mydsl.myDsl.RestModelMethodConclusion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rest Model Method Conclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RestModelMethodConclusionImpl#getRestModel <em>Rest Model</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RestModelMethodConclusionImpl#getException <em>Exception</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestModelMethodConclusionImpl extends MinimalEObjectImpl.Container implements RestModelMethodConclusion
{
  /**
   * The cached value of the '{@link #getRestModel() <em>Rest Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestModel()
   * @generated
   * @ordered
   */
  protected RestModel restModel;

  /**
   * The cached value of the '{@link #getException() <em>Exception</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getException()
   * @generated
   * @ordered
   */
  protected EList<RestExceptionList> exception;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RestModelMethodConclusionImpl()
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
    return MyDslPackage.Literals.REST_MODEL_METHOD_CONCLUSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestModel getRestModel()
  {
    if (restModel != null && restModel.eIsProxy())
    {
      InternalEObject oldRestModel = (InternalEObject)restModel;
      restModel = (RestModel)eResolveProxy(oldRestModel);
      if (restModel != oldRestModel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.REST_MODEL_METHOD_CONCLUSION__REST_MODEL, oldRestModel, restModel));
      }
    }
    return restModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestModel basicGetRestModel()
  {
    return restModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRestModel(RestModel newRestModel)
  {
    RestModel oldRestModel = restModel;
    restModel = newRestModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.REST_MODEL_METHOD_CONCLUSION__REST_MODEL, oldRestModel, restModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RestExceptionList> getException()
  {
    if (exception == null)
    {
      exception = new EObjectContainmentEList<RestExceptionList>(RestExceptionList.class, this, MyDslPackage.REST_MODEL_METHOD_CONCLUSION__EXCEPTION);
    }
    return exception;
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
      case MyDslPackage.REST_MODEL_METHOD_CONCLUSION__EXCEPTION:
        return ((InternalEList<?>)getException()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.REST_MODEL_METHOD_CONCLUSION__REST_MODEL:
        if (resolve) return getRestModel();
        return basicGetRestModel();
      case MyDslPackage.REST_MODEL_METHOD_CONCLUSION__EXCEPTION:
        return getException();
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
      case MyDslPackage.REST_MODEL_METHOD_CONCLUSION__REST_MODEL:
        setRestModel((RestModel)newValue);
        return;
      case MyDslPackage.REST_MODEL_METHOD_CONCLUSION__EXCEPTION:
        getException().clear();
        getException().addAll((Collection<? extends RestExceptionList>)newValue);
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
      case MyDslPackage.REST_MODEL_METHOD_CONCLUSION__REST_MODEL:
        setRestModel((RestModel)null);
        return;
      case MyDslPackage.REST_MODEL_METHOD_CONCLUSION__EXCEPTION:
        getException().clear();
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
      case MyDslPackage.REST_MODEL_METHOD_CONCLUSION__REST_MODEL:
        return restModel != null;
      case MyDslPackage.REST_MODEL_METHOD_CONCLUSION__EXCEPTION:
        return exception != null && !exception.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RestModelMethodConclusionImpl

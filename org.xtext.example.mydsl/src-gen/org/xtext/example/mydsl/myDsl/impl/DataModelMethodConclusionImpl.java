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

import org.xtext.example.mydsl.myDsl.DataModel;
import org.xtext.example.mydsl.myDsl.DataModelMethodConclusion;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.RestExceptionList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Model Method Conclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataModelMethodConclusionImpl#getDataModel <em>Data Model</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataModelMethodConclusionImpl#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataModelMethodConclusionImpl extends MinimalEObjectImpl.Container implements DataModelMethodConclusion
{
  /**
   * The cached value of the '{@link #getDataModel() <em>Data Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataModel()
   * @generated
   * @ordered
   */
  protected DataModel dataModel;

  /**
   * The cached value of the '{@link #getExceptions() <em>Exceptions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExceptions()
   * @generated
   * @ordered
   */
  protected EList<RestExceptionList> exceptions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataModelMethodConclusionImpl()
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
    return MyDslPackage.Literals.DATA_MODEL_METHOD_CONCLUSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataModel getDataModel()
  {
    if (dataModel != null && dataModel.eIsProxy())
    {
      InternalEObject oldDataModel = (InternalEObject)dataModel;
      dataModel = (DataModel)eResolveProxy(oldDataModel);
      if (dataModel != oldDataModel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.DATA_MODEL_METHOD_CONCLUSION__DATA_MODEL, oldDataModel, dataModel));
      }
    }
    return dataModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataModel basicGetDataModel()
  {
    return dataModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataModel(DataModel newDataModel)
  {
    DataModel oldDataModel = dataModel;
    dataModel = newDataModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_MODEL_METHOD_CONCLUSION__DATA_MODEL, oldDataModel, dataModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RestExceptionList> getExceptions()
  {
    if (exceptions == null)
    {
      exceptions = new EObjectContainmentEList<RestExceptionList>(RestExceptionList.class, this, MyDslPackage.DATA_MODEL_METHOD_CONCLUSION__EXCEPTIONS);
    }
    return exceptions;
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
      case MyDslPackage.DATA_MODEL_METHOD_CONCLUSION__EXCEPTIONS:
        return ((InternalEList<?>)getExceptions()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.DATA_MODEL_METHOD_CONCLUSION__DATA_MODEL:
        if (resolve) return getDataModel();
        return basicGetDataModel();
      case MyDslPackage.DATA_MODEL_METHOD_CONCLUSION__EXCEPTIONS:
        return getExceptions();
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
      case MyDslPackage.DATA_MODEL_METHOD_CONCLUSION__DATA_MODEL:
        setDataModel((DataModel)newValue);
        return;
      case MyDslPackage.DATA_MODEL_METHOD_CONCLUSION__EXCEPTIONS:
        getExceptions().clear();
        getExceptions().addAll((Collection<? extends RestExceptionList>)newValue);
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
      case MyDslPackage.DATA_MODEL_METHOD_CONCLUSION__DATA_MODEL:
        setDataModel((DataModel)null);
        return;
      case MyDslPackage.DATA_MODEL_METHOD_CONCLUSION__EXCEPTIONS:
        getExceptions().clear();
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
      case MyDslPackage.DATA_MODEL_METHOD_CONCLUSION__DATA_MODEL:
        return dataModel != null;
      case MyDslPackage.DATA_MODEL_METHOD_CONCLUSION__EXCEPTIONS:
        return exceptions != null && !exceptions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DataModelMethodConclusionImpl

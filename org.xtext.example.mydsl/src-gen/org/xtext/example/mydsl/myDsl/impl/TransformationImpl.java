/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.DataModel;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.RestModel;
import org.xtext.example.mydsl.myDsl.Transformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TransformationImpl#getDataModel <em>Data Model</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TransformationImpl#getRestModel <em>Rest Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationImpl extends MinimalEObjectImpl.Container implements Transformation
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
   * The cached value of the '{@link #getRestModel() <em>Rest Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestModel()
   * @generated
   * @ordered
   */
  protected RestModel restModel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransformationImpl()
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
    return MyDslPackage.Literals.TRANSFORMATION;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.TRANSFORMATION__DATA_MODEL, oldDataModel, dataModel));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TRANSFORMATION__DATA_MODEL, oldDataModel, dataModel));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.TRANSFORMATION__REST_MODEL, oldRestModel, restModel));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TRANSFORMATION__REST_MODEL, oldRestModel, restModel));
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
      case MyDslPackage.TRANSFORMATION__DATA_MODEL:
        if (resolve) return getDataModel();
        return basicGetDataModel();
      case MyDslPackage.TRANSFORMATION__REST_MODEL:
        if (resolve) return getRestModel();
        return basicGetRestModel();
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
      case MyDslPackage.TRANSFORMATION__DATA_MODEL:
        setDataModel((DataModel)newValue);
        return;
      case MyDslPackage.TRANSFORMATION__REST_MODEL:
        setRestModel((RestModel)newValue);
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
      case MyDslPackage.TRANSFORMATION__DATA_MODEL:
        setDataModel((DataModel)null);
        return;
      case MyDslPackage.TRANSFORMATION__REST_MODEL:
        setRestModel((RestModel)null);
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
      case MyDslPackage.TRANSFORMATION__DATA_MODEL:
        return dataModel != null;
      case MyDslPackage.TRANSFORMATION__REST_MODEL:
        return restModel != null;
    }
    return super.eIsSet(featureID);
  }

} //TransformationImpl

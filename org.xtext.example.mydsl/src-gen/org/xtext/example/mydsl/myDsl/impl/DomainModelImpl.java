/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.DomainModel;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.RestAPI;
import org.xtext.example.mydsl.myDsl.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DomainModelImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DomainModelImpl#getApis <em>Apis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainModelImpl extends MinimalEObjectImpl.Container implements DomainModel
{
  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<Type> elements;

  /**
   * The cached value of the '{@link #getApis() <em>Apis</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApis()
   * @generated
   * @ordered
   */
  protected EList<RestAPI> apis;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainModelImpl()
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
    return MyDslPackage.Literals.DOMAIN_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<Type>(Type.class, this, MyDslPackage.DOMAIN_MODEL__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RestAPI> getApis()
  {
    if (apis == null)
    {
      apis = new EObjectContainmentEList<RestAPI>(RestAPI.class, this, MyDslPackage.DOMAIN_MODEL__APIS);
    }
    return apis;
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
      case MyDslPackage.DOMAIN_MODEL__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
      case MyDslPackage.DOMAIN_MODEL__APIS:
        return ((InternalEList<?>)getApis()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.DOMAIN_MODEL__ELEMENTS:
        return getElements();
      case MyDslPackage.DOMAIN_MODEL__APIS:
        return getApis();
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
      case MyDslPackage.DOMAIN_MODEL__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends Type>)newValue);
        return;
      case MyDslPackage.DOMAIN_MODEL__APIS:
        getApis().clear();
        getApis().addAll((Collection<? extends RestAPI>)newValue);
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
      case MyDslPackage.DOMAIN_MODEL__ELEMENTS:
        getElements().clear();
        return;
      case MyDslPackage.DOMAIN_MODEL__APIS:
        getApis().clear();
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
      case MyDslPackage.DOMAIN_MODEL__ELEMENTS:
        return elements != null && !elements.isEmpty();
      case MyDslPackage.DOMAIN_MODEL__APIS:
        return apis != null && !apis.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DomainModelImpl

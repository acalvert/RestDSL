/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.RestException;
import org.xtext.example.mydsl.myDsl.RestStatusCode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rest Exception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RestExceptionImpl#getStatusCode <em>Status Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestExceptionImpl extends MinimalEObjectImpl.Container implements RestException
{
  /**
   * The default value of the '{@link #getStatusCode() <em>Status Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatusCode()
   * @generated
   * @ordered
   */
  protected static final RestStatusCode STATUS_CODE_EDEFAULT = RestStatusCode.INFORMATIONAL;

  /**
   * The cached value of the '{@link #getStatusCode() <em>Status Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatusCode()
   * @generated
   * @ordered
   */
  protected RestStatusCode statusCode = STATUS_CODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RestExceptionImpl()
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
    return MyDslPackage.Literals.REST_EXCEPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestStatusCode getStatusCode()
  {
    return statusCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatusCode(RestStatusCode newStatusCode)
  {
    RestStatusCode oldStatusCode = statusCode;
    statusCode = newStatusCode == null ? STATUS_CODE_EDEFAULT : newStatusCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.REST_EXCEPTION__STATUS_CODE, oldStatusCode, statusCode));
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
      case MyDslPackage.REST_EXCEPTION__STATUS_CODE:
        return getStatusCode();
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
      case MyDslPackage.REST_EXCEPTION__STATUS_CODE:
        setStatusCode((RestStatusCode)newValue);
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
      case MyDslPackage.REST_EXCEPTION__STATUS_CODE:
        setStatusCode(STATUS_CODE_EDEFAULT);
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
      case MyDslPackage.REST_EXCEPTION__STATUS_CODE:
        return statusCode != STATUS_CODE_EDEFAULT;
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
    result.append(" (statusCode: ");
    result.append(statusCode);
    result.append(')');
    return result.toString();
  }

} //RestExceptionImpl

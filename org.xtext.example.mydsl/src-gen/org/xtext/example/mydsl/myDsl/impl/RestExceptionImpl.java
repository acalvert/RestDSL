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
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RestExceptionImpl#getMessage <em>Message</em>}</li>
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
   * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected static final String MESSAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected String message = MESSAGE_EDEFAULT;

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
  public String getMessage()
  {
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMessage(String newMessage)
  {
    String oldMessage = message;
    message = newMessage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.REST_EXCEPTION__MESSAGE, oldMessage, message));
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
      case MyDslPackage.REST_EXCEPTION__MESSAGE:
        return getMessage();
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
      case MyDslPackage.REST_EXCEPTION__MESSAGE:
        setMessage((String)newValue);
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
      case MyDslPackage.REST_EXCEPTION__MESSAGE:
        setMessage(MESSAGE_EDEFAULT);
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
      case MyDslPackage.REST_EXCEPTION__MESSAGE:
        return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
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
    result.append(", message: ");
    result.append(message);
    result.append(')');
    return result.toString();
  }

} //RestExceptionImpl

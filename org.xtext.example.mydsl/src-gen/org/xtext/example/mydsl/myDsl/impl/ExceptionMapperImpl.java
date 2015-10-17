/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.BaseException;
import org.xtext.example.mydsl.myDsl.ExceptionMapper;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.RestException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exception Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExceptionMapperImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExceptionMapperImpl#getRestException <em>Rest Exception</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExceptionMapperImpl#getBaseException <em>Base Exception</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExceptionMapperImpl extends MinimalEObjectImpl.Container implements ExceptionMapper
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
   * The cached value of the '{@link #getRestException() <em>Rest Exception</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestException()
   * @generated
   * @ordered
   */
  protected RestException restException;

  /**
   * The cached value of the '{@link #getBaseException() <em>Base Exception</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseException()
   * @generated
   * @ordered
   */
  protected BaseException baseException;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExceptionMapperImpl()
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
    return MyDslPackage.Literals.EXCEPTION_MAPPER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXCEPTION_MAPPER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestException getRestException()
  {
    return restException;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRestException(RestException newRestException, NotificationChain msgs)
  {
    RestException oldRestException = restException;
    restException = newRestException;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXCEPTION_MAPPER__REST_EXCEPTION, oldRestException, newRestException);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRestException(RestException newRestException)
  {
    if (newRestException != restException)
    {
      NotificationChain msgs = null;
      if (restException != null)
        msgs = ((InternalEObject)restException).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXCEPTION_MAPPER__REST_EXCEPTION, null, msgs);
      if (newRestException != null)
        msgs = ((InternalEObject)newRestException).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXCEPTION_MAPPER__REST_EXCEPTION, null, msgs);
      msgs = basicSetRestException(newRestException, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXCEPTION_MAPPER__REST_EXCEPTION, newRestException, newRestException));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseException getBaseException()
  {
    return baseException;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBaseException(BaseException newBaseException, NotificationChain msgs)
  {
    BaseException oldBaseException = baseException;
    baseException = newBaseException;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXCEPTION_MAPPER__BASE_EXCEPTION, oldBaseException, newBaseException);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBaseException(BaseException newBaseException)
  {
    if (newBaseException != baseException)
    {
      NotificationChain msgs = null;
      if (baseException != null)
        msgs = ((InternalEObject)baseException).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXCEPTION_MAPPER__BASE_EXCEPTION, null, msgs);
      if (newBaseException != null)
        msgs = ((InternalEObject)newBaseException).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXCEPTION_MAPPER__BASE_EXCEPTION, null, msgs);
      msgs = basicSetBaseException(newBaseException, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXCEPTION_MAPPER__BASE_EXCEPTION, newBaseException, newBaseException));
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
      case MyDslPackage.EXCEPTION_MAPPER__REST_EXCEPTION:
        return basicSetRestException(null, msgs);
      case MyDslPackage.EXCEPTION_MAPPER__BASE_EXCEPTION:
        return basicSetBaseException(null, msgs);
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
      case MyDslPackage.EXCEPTION_MAPPER__NAME:
        return getName();
      case MyDslPackage.EXCEPTION_MAPPER__REST_EXCEPTION:
        return getRestException();
      case MyDslPackage.EXCEPTION_MAPPER__BASE_EXCEPTION:
        return getBaseException();
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
      case MyDslPackage.EXCEPTION_MAPPER__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.EXCEPTION_MAPPER__REST_EXCEPTION:
        setRestException((RestException)newValue);
        return;
      case MyDslPackage.EXCEPTION_MAPPER__BASE_EXCEPTION:
        setBaseException((BaseException)newValue);
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
      case MyDslPackage.EXCEPTION_MAPPER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.EXCEPTION_MAPPER__REST_EXCEPTION:
        setRestException((RestException)null);
        return;
      case MyDslPackage.EXCEPTION_MAPPER__BASE_EXCEPTION:
        setBaseException((BaseException)null);
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
      case MyDslPackage.EXCEPTION_MAPPER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.EXCEPTION_MAPPER__REST_EXCEPTION:
        return restException != null;
      case MyDslPackage.EXCEPTION_MAPPER__BASE_EXCEPTION:
        return baseException != null;
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
    result.append(')');
    return result.toString();
  }

} //ExceptionMapperImpl

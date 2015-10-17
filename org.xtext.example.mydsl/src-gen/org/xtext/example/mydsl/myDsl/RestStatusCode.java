/**
 */
package org.xtext.example.mydsl.myDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Rest Status Code</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRestStatusCode()
 * @model
 * @generated
 */
public enum RestStatusCode implements Enumerator
{
  /**
   * The '<em><b>INFORMATIONAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INFORMATIONAL_VALUE
   * @generated
   * @ordered
   */
  INFORMATIONAL(0, "INFORMATIONAL", "INFORMATIONAL"),

  /**
   * The '<em><b>SUCCESS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUCCESS_VALUE
   * @generated
   * @ordered
   */
  SUCCESS(1, "SUCCESS", "SUCCESS"),

  /**
   * The '<em><b>REDIRECTION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REDIRECTION_VALUE
   * @generated
   * @ordered
   */
  REDIRECTION(2, "REDIRECTION", "REDIRECTION"),

  /**
   * The '<em><b>CLIENT ERROR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CLIENT_ERROR_VALUE
   * @generated
   * @ordered
   */
  CLIENT_ERROR(3, "CLIENT_ERROR", "CLIENT_ERROR"),

  /**
   * The '<em><b>SERVER ERROR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SERVER_ERROR_VALUE
   * @generated
   * @ordered
   */
  SERVER_ERROR(4, "SERVER_ERROR", "SERVER_ERROR"),

  /**
   * The '<em><b>NETWORK ERROR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NETWORK_ERROR_VALUE
   * @generated
   * @ordered
   */
  NETWORK_ERROR(5, "NETWORK_ERROR", "NETWORK_ERROR");

  /**
   * The '<em><b>INFORMATIONAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INFORMATIONAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INFORMATIONAL
   * @model
   * @generated
   * @ordered
   */
  public static final int INFORMATIONAL_VALUE = 0;

  /**
   * The '<em><b>SUCCESS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SUCCESS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SUCCESS
   * @model
   * @generated
   * @ordered
   */
  public static final int SUCCESS_VALUE = 1;

  /**
   * The '<em><b>REDIRECTION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>REDIRECTION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REDIRECTION
   * @model
   * @generated
   * @ordered
   */
  public static final int REDIRECTION_VALUE = 2;

  /**
   * The '<em><b>CLIENT ERROR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CLIENT ERROR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CLIENT_ERROR
   * @model
   * @generated
   * @ordered
   */
  public static final int CLIENT_ERROR_VALUE = 3;

  /**
   * The '<em><b>SERVER ERROR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SERVER ERROR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SERVER_ERROR
   * @model
   * @generated
   * @ordered
   */
  public static final int SERVER_ERROR_VALUE = 4;

  /**
   * The '<em><b>NETWORK ERROR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NETWORK ERROR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NETWORK_ERROR
   * @model
   * @generated
   * @ordered
   */
  public static final int NETWORK_ERROR_VALUE = 5;

  /**
   * An array of all the '<em><b>Rest Status Code</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final RestStatusCode[] VALUES_ARRAY =
    new RestStatusCode[]
    {
      INFORMATIONAL,
      SUCCESS,
      REDIRECTION,
      CLIENT_ERROR,
      SERVER_ERROR,
      NETWORK_ERROR,
    };

  /**
   * A public read-only list of all the '<em><b>Rest Status Code</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<RestStatusCode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Rest Status Code</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RestStatusCode get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RestStatusCode result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Rest Status Code</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RestStatusCode getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RestStatusCode result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Rest Status Code</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RestStatusCode get(int value)
  {
    switch (value)
    {
      case INFORMATIONAL_VALUE: return INFORMATIONAL;
      case SUCCESS_VALUE: return SUCCESS;
      case REDIRECTION_VALUE: return REDIRECTION;
      case CLIENT_ERROR_VALUE: return CLIENT_ERROR;
      case SERVER_ERROR_VALUE: return SERVER_ERROR;
      case NETWORK_ERROR_VALUE: return NETWORK_ERROR;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private RestStatusCode(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //RestStatusCode

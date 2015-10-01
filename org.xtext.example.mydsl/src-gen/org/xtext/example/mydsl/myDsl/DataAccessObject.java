/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Access Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getCreateDataModel <em>Create Data Model</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getException1 <em>Exception1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getCreateMethod <em>Create Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getCreatedDataModel <em>Created Data Model</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getFindby <em>Findby</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getException2 <em>Exception2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getFindMethod <em>Find Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getFoundDataModel <em>Found Data Model</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getUpdateby <em>Updateby</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getUpdateDataModel <em>Update Data Model</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getException3 <em>Exception3</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getUpdateMethod <em>Update Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getUpdatedDataModel <em>Updated Data Model</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getDeleteby <em>Deleteby</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getException4 <em>Exception4</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getDeleteMethod <em>Delete Method</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccessObject()
 * @model
 * @generated
 */
public interface DataAccessObject extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccessObject_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Create Data Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Data Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create Data Model</em>' reference.
   * @see #setCreateDataModel(DataModel)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccessObject_CreateDataModel()
   * @model
   * @generated
   */
  DataModel getCreateDataModel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getCreateDataModel <em>Create Data Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Create Data Model</em>' reference.
   * @see #getCreateDataModel()
   * @generated
   */
  void setCreateDataModel(DataModel value);

  /**
   * Returns the value of the '<em><b>Exception1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exception1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception1</em>' containment reference.
   * @see #setException1(RestException)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccessObject_Exception1()
   * @model containment="true"
   * @generated
   */
  RestException getException1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getException1 <em>Exception1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception1</em>' containment reference.
   * @see #getException1()
   * @generated
   */
  void setException1(RestException value);

  /**
   * Returns the value of the '<em><b>Create Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create Method</em>' containment reference.
   * @see #setCreateMethod(JavaMethod)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccessObject_CreateMethod()
   * @model containment="true"
   * @generated
   */
  JavaMethod getCreateMethod();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getCreateMethod <em>Create Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Create Method</em>' containment reference.
   * @see #getCreateMethod()
   * @generated
   */
  void setCreateMethod(JavaMethod value);

  /**
   * Returns the value of the '<em><b>Created Data Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Created Data Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Created Data Model</em>' reference.
   * @see #setCreatedDataModel(DataModel)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccessObject_CreatedDataModel()
   * @model
   * @generated
   */
  DataModel getCreatedDataModel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getCreatedDataModel <em>Created Data Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Created Data Model</em>' reference.
   * @see #getCreatedDataModel()
   * @generated
   */
  void setCreatedDataModel(DataModel value);

  /**
   * Returns the value of the '<em><b>Findby</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Findby</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Findby</em>' attribute.
   * @see #setFindby(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccessObject_Findby()
   * @model
   * @generated
   */
  String getFindby();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getFindby <em>Findby</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Findby</em>' attribute.
   * @see #getFindby()
   * @generated
   */
  void setFindby(String value);

  /**
   * Returns the value of the '<em><b>Exception2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exception2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception2</em>' containment reference.
   * @see #setException2(RestException)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccessObject_Exception2()
   * @model containment="true"
   * @generated
   */
  RestException getException2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getException2 <em>Exception2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception2</em>' containment reference.
   * @see #getException2()
   * @generated
   */
  void setException2(RestException value);

  /**
   * Returns the value of the '<em><b>Find Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Find Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Find Method</em>' containment reference.
   * @see #setFindMethod(JavaMethod)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccessObject_FindMethod()
   * @model containment="true"
   * @generated
   */
  JavaMethod getFindMethod();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getFindMethod <em>Find Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Find Method</em>' containment reference.
   * @see #getFindMethod()
   * @generated
   */
  void setFindMethod(JavaMethod value);

  /**
   * Returns the value of the '<em><b>Found Data Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Found Data Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Found Data Model</em>' reference.
   * @see #setFoundDataModel(DataModel)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccessObject_FoundDataModel()
   * @model
   * @generated
   */
  DataModel getFoundDataModel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getFoundDataModel <em>Found Data Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Found Data Model</em>' reference.
   * @see #getFoundDataModel()
   * @generated
   */
  void setFoundDataModel(DataModel value);

  /**
   * Returns the value of the '<em><b>Updateby</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Updateby</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Updateby</em>' attribute.
   * @see #setUpdateby(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccessObject_Updateby()
   * @model
   * @generated
   */
  String getUpdateby();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getUpdateby <em>Updateby</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Updateby</em>' attribute.
   * @see #getUpdateby()
   * @generated
   */
  void setUpdateby(String value);

  /**
   * Returns the value of the '<em><b>Update Data Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update Data Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update Data Model</em>' reference.
   * @see #setUpdateDataModel(DataModel)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccessObject_UpdateDataModel()
   * @model
   * @generated
   */
  DataModel getUpdateDataModel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getUpdateDataModel <em>Update Data Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update Data Model</em>' reference.
   * @see #getUpdateDataModel()
   * @generated
   */
  void setUpdateDataModel(DataModel value);

  /**
   * Returns the value of the '<em><b>Exception3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exception3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception3</em>' containment reference.
   * @see #setException3(RestException)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccessObject_Exception3()
   * @model containment="true"
   * @generated
   */
  RestException getException3();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getException3 <em>Exception3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception3</em>' containment reference.
   * @see #getException3()
   * @generated
   */
  void setException3(RestException value);

  /**
   * Returns the value of the '<em><b>Update Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update Method</em>' containment reference.
   * @see #setUpdateMethod(JavaMethod)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccessObject_UpdateMethod()
   * @model containment="true"
   * @generated
   */
  JavaMethod getUpdateMethod();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getUpdateMethod <em>Update Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update Method</em>' containment reference.
   * @see #getUpdateMethod()
   * @generated
   */
  void setUpdateMethod(JavaMethod value);

  /**
   * Returns the value of the '<em><b>Updated Data Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Updated Data Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Updated Data Model</em>' reference.
   * @see #setUpdatedDataModel(DataModel)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccessObject_UpdatedDataModel()
   * @model
   * @generated
   */
  DataModel getUpdatedDataModel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getUpdatedDataModel <em>Updated Data Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Updated Data Model</em>' reference.
   * @see #getUpdatedDataModel()
   * @generated
   */
  void setUpdatedDataModel(DataModel value);

  /**
   * Returns the value of the '<em><b>Deleteby</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deleteby</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deleteby</em>' attribute.
   * @see #setDeleteby(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccessObject_Deleteby()
   * @model
   * @generated
   */
  String getDeleteby();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getDeleteby <em>Deleteby</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deleteby</em>' attribute.
   * @see #getDeleteby()
   * @generated
   */
  void setDeleteby(String value);

  /**
   * Returns the value of the '<em><b>Exception4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exception4</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception4</em>' containment reference.
   * @see #setException4(RestException)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccessObject_Exception4()
   * @model containment="true"
   * @generated
   */
  RestException getException4();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getException4 <em>Exception4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception4</em>' containment reference.
   * @see #getException4()
   * @generated
   */
  void setException4(RestException value);

  /**
   * Returns the value of the '<em><b>Delete Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delete Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delete Method</em>' containment reference.
   * @see #setDeleteMethod(JavaMethod)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccessObject_DeleteMethod()
   * @model containment="true"
   * @generated
   */
  JavaMethod getDeleteMethod();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getDeleteMethod <em>Delete Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delete Method</em>' containment reference.
   * @see #getDeleteMethod()
   * @generated
   */
  void setDeleteMethod(JavaMethod value);

} // DataAccessObject

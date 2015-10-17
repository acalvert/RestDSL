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
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getCreateMethod <em>Create Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getCreateConclusion <em>Create Conclusion</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getFindby <em>Findby</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getFindMethod <em>Find Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getFindConclusion <em>Find Conclusion</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getUpdateby <em>Updateby</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getUpdateDataModel <em>Update Data Model</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getUpdateMethod <em>Update Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getUpdateConclusion <em>Update Conclusion</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getDeleteby <em>Deleteby</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getDeleteMethod <em>Delete Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getExceptions <em>Exceptions</em>}</li>
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
   * Returns the value of the '<em><b>Create Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create Method</em>' containment reference.
   * @see #setCreateMethod(Block)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccessObject_CreateMethod()
   * @model containment="true"
   * @generated
   */
  Block getCreateMethod();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getCreateMethod <em>Create Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Create Method</em>' containment reference.
   * @see #getCreateMethod()
   * @generated
   */
  void setCreateMethod(Block value);

  /**
   * Returns the value of the '<em><b>Create Conclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Conclusion</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create Conclusion</em>' containment reference.
   * @see #setCreateConclusion(DataModelMethodConclusion)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccessObject_CreateConclusion()
   * @model containment="true"
   * @generated
   */
  DataModelMethodConclusion getCreateConclusion();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getCreateConclusion <em>Create Conclusion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Create Conclusion</em>' containment reference.
   * @see #getCreateConclusion()
   * @generated
   */
  void setCreateConclusion(DataModelMethodConclusion value);

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
   * Returns the value of the '<em><b>Find Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Find Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Find Method</em>' containment reference.
   * @see #setFindMethod(Block)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccessObject_FindMethod()
   * @model containment="true"
   * @generated
   */
  Block getFindMethod();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getFindMethod <em>Find Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Find Method</em>' containment reference.
   * @see #getFindMethod()
   * @generated
   */
  void setFindMethod(Block value);

  /**
   * Returns the value of the '<em><b>Find Conclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Find Conclusion</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Find Conclusion</em>' containment reference.
   * @see #setFindConclusion(DataModelMethodConclusion)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccessObject_FindConclusion()
   * @model containment="true"
   * @generated
   */
  DataModelMethodConclusion getFindConclusion();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getFindConclusion <em>Find Conclusion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Find Conclusion</em>' containment reference.
   * @see #getFindConclusion()
   * @generated
   */
  void setFindConclusion(DataModelMethodConclusion value);

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
   * Returns the value of the '<em><b>Update Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update Method</em>' containment reference.
   * @see #setUpdateMethod(Block)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccessObject_UpdateMethod()
   * @model containment="true"
   * @generated
   */
  Block getUpdateMethod();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getUpdateMethod <em>Update Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update Method</em>' containment reference.
   * @see #getUpdateMethod()
   * @generated
   */
  void setUpdateMethod(Block value);

  /**
   * Returns the value of the '<em><b>Update Conclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update Conclusion</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update Conclusion</em>' containment reference.
   * @see #setUpdateConclusion(DataModelMethodConclusion)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccessObject_UpdateConclusion()
   * @model containment="true"
   * @generated
   */
  DataModelMethodConclusion getUpdateConclusion();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getUpdateConclusion <em>Update Conclusion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update Conclusion</em>' containment reference.
   * @see #getUpdateConclusion()
   * @generated
   */
  void setUpdateConclusion(DataModelMethodConclusion value);

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
   * Returns the value of the '<em><b>Delete Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delete Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delete Method</em>' containment reference.
   * @see #setDeleteMethod(Block)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccessObject_DeleteMethod()
   * @model containment="true"
   * @generated
   */
  Block getDeleteMethod();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getDeleteMethod <em>Delete Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delete Method</em>' containment reference.
   * @see #getDeleteMethod()
   * @generated
   */
  void setDeleteMethod(Block value);

  /**
   * Returns the value of the '<em><b>Exceptions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exceptions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exceptions</em>' containment reference.
   * @see #setExceptions(RestExceptionList)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccessObject_Exceptions()
   * @model containment="true"
   * @generated
   */
  RestExceptionList getExceptions();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccessObject#getExceptions <em>Exceptions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exceptions</em>' containment reference.
   * @see #getExceptions()
   * @generated
   */
  void setExceptions(RestExceptionList value);

} // DataAccessObject

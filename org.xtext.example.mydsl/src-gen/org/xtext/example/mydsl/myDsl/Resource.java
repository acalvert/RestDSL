/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Resource#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Resource#getService <em>Service</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Resource#getExceptionMapper <em>Exception Mapper</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Resource#getCreateRestModel <em>Create Rest Model</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Resource#getCreateValService <em>Create Val Service</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Resource#getCreateMethod <em>Create Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Resource#getCreateConclusion <em>Create Conclusion</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Resource#getFindby <em>Findby</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Resource#getFindMethod <em>Find Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Resource#getFindConclusion <em>Find Conclusion</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Resource#getUpdateby <em>Updateby</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Resource#getUpdateRestModel <em>Update Rest Model</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Resource#getUpdateValService <em>Update Val Service</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Resource#getUpdateMethod <em>Update Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Resource#getUpdateConclusion <em>Update Conclusion</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Resource#getDeleteby <em>Deleteby</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Resource#getDeleteMethod <em>Delete Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Resource#getException4 <em>Exception4</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getResource_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Resource#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Service</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Service}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getResource_Service()
   * @model
   * @generated
   */
  EList<Service> getService();

  /**
   * Returns the value of the '<em><b>Exception Mapper</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exception Mapper</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception Mapper</em>' reference.
   * @see #setExceptionMapper(ExceptionMapper)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getResource_ExceptionMapper()
   * @model
   * @generated
   */
  ExceptionMapper getExceptionMapper();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Resource#getExceptionMapper <em>Exception Mapper</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception Mapper</em>' reference.
   * @see #getExceptionMapper()
   * @generated
   */
  void setExceptionMapper(ExceptionMapper value);

  /**
   * Returns the value of the '<em><b>Create Rest Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Rest Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create Rest Model</em>' reference.
   * @see #setCreateRestModel(RestModel)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getResource_CreateRestModel()
   * @model
   * @generated
   */
  RestModel getCreateRestModel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Resource#getCreateRestModel <em>Create Rest Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Create Rest Model</em>' reference.
   * @see #getCreateRestModel()
   * @generated
   */
  void setCreateRestModel(RestModel value);

  /**
   * Returns the value of the '<em><b>Create Val Service</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Val Service</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create Val Service</em>' containment reference.
   * @see #setCreateValService(ValidationService)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getResource_CreateValService()
   * @model containment="true"
   * @generated
   */
  ValidationService getCreateValService();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Resource#getCreateValService <em>Create Val Service</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Create Val Service</em>' containment reference.
   * @see #getCreateValService()
   * @generated
   */
  void setCreateValService(ValidationService value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getResource_CreateMethod()
   * @model containment="true"
   * @generated
   */
  Block getCreateMethod();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Resource#getCreateMethod <em>Create Method</em>}' containment reference.
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
   * @see #setCreateConclusion(RestModelMethodConclusion)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getResource_CreateConclusion()
   * @model containment="true"
   * @generated
   */
  RestModelMethodConclusion getCreateConclusion();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Resource#getCreateConclusion <em>Create Conclusion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Create Conclusion</em>' containment reference.
   * @see #getCreateConclusion()
   * @generated
   */
  void setCreateConclusion(RestModelMethodConclusion value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getResource_Findby()
   * @model
   * @generated
   */
  String getFindby();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Resource#getFindby <em>Findby</em>}' attribute.
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getResource_FindMethod()
   * @model containment="true"
   * @generated
   */
  Block getFindMethod();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Resource#getFindMethod <em>Find Method</em>}' containment reference.
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
   * @see #setFindConclusion(RestModelMethodConclusion)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getResource_FindConclusion()
   * @model containment="true"
   * @generated
   */
  RestModelMethodConclusion getFindConclusion();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Resource#getFindConclusion <em>Find Conclusion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Find Conclusion</em>' containment reference.
   * @see #getFindConclusion()
   * @generated
   */
  void setFindConclusion(RestModelMethodConclusion value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getResource_Updateby()
   * @model
   * @generated
   */
  String getUpdateby();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Resource#getUpdateby <em>Updateby</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Updateby</em>' attribute.
   * @see #getUpdateby()
   * @generated
   */
  void setUpdateby(String value);

  /**
   * Returns the value of the '<em><b>Update Rest Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update Rest Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update Rest Model</em>' reference.
   * @see #setUpdateRestModel(RestModel)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getResource_UpdateRestModel()
   * @model
   * @generated
   */
  RestModel getUpdateRestModel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Resource#getUpdateRestModel <em>Update Rest Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update Rest Model</em>' reference.
   * @see #getUpdateRestModel()
   * @generated
   */
  void setUpdateRestModel(RestModel value);

  /**
   * Returns the value of the '<em><b>Update Val Service</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update Val Service</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update Val Service</em>' containment reference.
   * @see #setUpdateValService(ValidationService)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getResource_UpdateValService()
   * @model containment="true"
   * @generated
   */
  ValidationService getUpdateValService();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Resource#getUpdateValService <em>Update Val Service</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update Val Service</em>' containment reference.
   * @see #getUpdateValService()
   * @generated
   */
  void setUpdateValService(ValidationService value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getResource_UpdateMethod()
   * @model containment="true"
   * @generated
   */
  Block getUpdateMethod();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Resource#getUpdateMethod <em>Update Method</em>}' containment reference.
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
   * @see #setUpdateConclusion(RestModelMethodConclusion)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getResource_UpdateConclusion()
   * @model containment="true"
   * @generated
   */
  RestModelMethodConclusion getUpdateConclusion();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Resource#getUpdateConclusion <em>Update Conclusion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update Conclusion</em>' containment reference.
   * @see #getUpdateConclusion()
   * @generated
   */
  void setUpdateConclusion(RestModelMethodConclusion value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getResource_Deleteby()
   * @model
   * @generated
   */
  String getDeleteby();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Resource#getDeleteby <em>Deleteby</em>}' attribute.
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getResource_DeleteMethod()
   * @model containment="true"
   * @generated
   */
  Block getDeleteMethod();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Resource#getDeleteMethod <em>Delete Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delete Method</em>' containment reference.
   * @see #getDeleteMethod()
   * @generated
   */
  void setDeleteMethod(Block value);

  /**
   * Returns the value of the '<em><b>Exception4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exception4</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception4</em>' containment reference.
   * @see #setException4(RestExceptionList)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getResource_Exception4()
   * @model containment="true"
   * @generated
   */
  RestExceptionList getException4();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Resource#getException4 <em>Exception4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception4</em>' containment reference.
   * @see #getException4()
   * @generated
   */
  void setException4(RestExceptionList value);

} // Resource

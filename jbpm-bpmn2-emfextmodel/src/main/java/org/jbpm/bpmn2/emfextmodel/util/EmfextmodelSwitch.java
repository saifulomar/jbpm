/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jbpm.bpmn2.emfextmodel.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.jbpm.bpmn2.emfextmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.jbpm.bpmn2.emfextmodel.EmfextmodelPackage
 * @generated
 */
public class EmfextmodelSwitch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static EmfextmodelPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EmfextmodelSwitch() {
        if (modelPackage == null) {
            modelPackage = EmfextmodelPackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public T doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        }
        else {
            List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return
                eSuperTypes.isEmpty() ?
                    defaultCase(theEObject) :
                    doSwitch(eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case EmfextmodelPackage.DOCUMENT_ROOT: {
                DocumentRoot documentRoot = (DocumentRoot)theEObject;
                T result = caseDocumentRoot(documentRoot);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EmfextmodelPackage.ON_ENTRY_SCRIPT_TYPE: {
                OnEntryScriptType onEntryScriptType = (OnEntryScriptType)theEObject;
                T result = caseOnEntryScriptType(onEntryScriptType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EmfextmodelPackage.ON_EXIT_SCRIPT_TYPE: {
                OnExitScriptType onExitScriptType = (OnExitScriptType)theEObject;
                T result = caseOnExitScriptType(onExitScriptType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDocumentRoot(DocumentRoot object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>On Entry Script Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>On Entry Script Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOnEntryScriptType(OnEntryScriptType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>On Exit Script Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>On Exit Script Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOnExitScriptType(OnExitScriptType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    public T defaultCase(EObject object) {
        return null;
    }

} //EmfextmodelSwitch
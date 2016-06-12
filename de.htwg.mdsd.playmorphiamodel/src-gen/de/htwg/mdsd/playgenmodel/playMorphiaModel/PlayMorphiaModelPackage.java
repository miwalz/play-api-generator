/**
 * generated by Xtext 2.9.1
 */
package de.htwg.mdsd.playgenmodel.playMorphiaModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.PlayMorphiaModelFactory
 * @model kind="package"
 * @generated
 */
public interface PlayMorphiaModelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "playMorphiaModel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.htwg.de/mdsd/playgenmodel/PlayMorphiaModel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "playMorphiaModel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PlayMorphiaModelPackage eINSTANCE = de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.PlayMorphiaModelPackageImpl.init();

  /**
   * The meta object id for the '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.DomainmodelImpl
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.PlayMorphiaModelPackageImpl#getDomainmodel()
   * @generated
   */
  int DOMAINMODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Domainmodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.AbstractElementImpl
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.PlayMorphiaModelPackageImpl#getAbstractElement()
   * @generated
   */
  int ABSTRACT_ELEMENT = 2;

  /**
   * The number of structural features of the '<em>Abstract Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.PackageDeclarationImpl
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.PlayMorphiaModelPackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__ELEMENTS = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.TypeImpl
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.PlayMorphiaModelPackageImpl#getType()
   * @generated
   */
  int TYPE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.MorphiaModelImpl <em>Morphia Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.MorphiaModelImpl
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.PlayMorphiaModelPackageImpl#getMorphiaModel()
   * @generated
   */
  int MORPHIA_MODEL = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MORPHIA_MODEL__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MORPHIA_MODEL__IMPORTS = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MORPHIA_MODEL__ATTRIBUTES = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Morphia Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MORPHIA_MODEL_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.AttributeImpl
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.PlayMorphiaModelPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 4;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.DataTypeImpl
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.PlayMorphiaModelPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = TYPE__NAME;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.ImportImpl
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.PlayMorphiaModelPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 7;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.Domainmodel <em>Domainmodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domainmodel</em>'.
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.Domainmodel
   * @generated
   */
  EClass getDomainmodel();

  /**
   * Returns the meta object for the containment reference list '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.Domainmodel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.Domainmodel#getElements()
   * @see #getDomainmodel()
   * @generated
   */
  EReference getDomainmodel_Elements();

  /**
   * Returns the meta object for class '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.PackageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.PackageDeclaration#getName()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.PackageDeclaration#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.PackageDeclaration#getElements()
   * @see #getPackageDeclaration()
   * @generated
   */
  EReference getPackageDeclaration_Elements();

  /**
   * Returns the meta object for class '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.AbstractElement
   * @generated
   */
  EClass getAbstractElement();

  /**
   * Returns the meta object for class '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.MorphiaModel <em>Morphia Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Morphia Model</em>'.
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.MorphiaModel
   * @generated
   */
  EClass getMorphiaModel();

  /**
   * Returns the meta object for the containment reference list '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.MorphiaModel#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.MorphiaModel#getImports()
   * @see #getMorphiaModel()
   * @generated
   */
  EReference getMorphiaModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.MorphiaModel#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.MorphiaModel#getAttributes()
   * @see #getMorphiaModel()
   * @generated
   */
  EReference getMorphiaModel_Attributes();

  /**
   * Returns the meta object for class '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.Attribute#isMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.Attribute#isMany()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Many();

  /**
   * Returns the meta object for the attribute '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the reference '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Type();

  /**
   * Returns the meta object for class '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for class '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PlayMorphiaModelFactory getPlayMorphiaModelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.DomainmodelImpl
     * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.PlayMorphiaModelPackageImpl#getDomainmodel()
     * @generated
     */
    EClass DOMAINMODEL = eINSTANCE.getDomainmodel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAINMODEL__ELEMENTS = eINSTANCE.getDomainmodel_Elements();

    /**
     * The meta object literal for the '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.PackageDeclarationImpl
     * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.PlayMorphiaModelPackageImpl#getPackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__NAME = eINSTANCE.getPackageDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DECLARATION__ELEMENTS = eINSTANCE.getPackageDeclaration_Elements();

    /**
     * The meta object literal for the '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.AbstractElementImpl
     * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.PlayMorphiaModelPackageImpl#getAbstractElement()
     * @generated
     */
    EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

    /**
     * The meta object literal for the '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.MorphiaModelImpl <em>Morphia Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.MorphiaModelImpl
     * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.PlayMorphiaModelPackageImpl#getMorphiaModel()
     * @generated
     */
    EClass MORPHIA_MODEL = eINSTANCE.getMorphiaModel();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MORPHIA_MODEL__IMPORTS = eINSTANCE.getMorphiaModel_Imports();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MORPHIA_MODEL__ATTRIBUTES = eINSTANCE.getMorphiaModel_Attributes();

    /**
     * The meta object literal for the '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.AttributeImpl
     * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.PlayMorphiaModelPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__MANY = eINSTANCE.getAttribute_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.TypeImpl
     * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.PlayMorphiaModelPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.DataTypeImpl
     * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.PlayMorphiaModelPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '{@link de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.ImportImpl
     * @see de.htwg.mdsd.playgenmodel.playMorphiaModel.impl.PlayMorphiaModelPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

  }

} //PlayMorphiaModelPackage

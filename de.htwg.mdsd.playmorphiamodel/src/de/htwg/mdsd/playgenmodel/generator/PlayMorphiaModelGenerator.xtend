package de.htwg.mdsd.playgenmodel.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import de.htwg.mdsd.playgenmodel.playMorphiaModel.MorphiaModel
import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import de.htwg.mdsd.playgenmodel.generator.model.ModelGenerator
import de.htwg.mdsd.playgenmodel.generator.dao.DaoGenerator
import de.htwg.mdsd.playgenmodel.CustomOutputProvider
import de.htwg.mdsd.playgenmodel.generator.controller.ControllerGenerator

class PlayMorphiaModelGenerator extends AbstractGenerator {

	@Inject extension IQualifiedNameProvider
	
	@Inject ModelGenerator modelGenerator
	@Inject DaoGenerator daoGenerator
	@Inject ControllerGenerator controllerGenerator
	
	@Inject CustomOutputProvider customOutputProvider

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (model : resource.allContents.toIterable.filter(MorphiaModel)) {
			val name = model.fullyQualifiedName.toString("/")
			for (out : customOutputProvider.outputConfigurations) {
				fsa.generateFile("model/" + name + ".java", out.name, modelGenerator.compile(model))
				fsa.generateFile("dao/" + name + "Dao.java", out.name, daoGenerator.compile(model))
				fsa.generateFile("controller/" + name + "Controller.java", out.name, controllerGenerator.compile(model))
			}
		}
	}
}

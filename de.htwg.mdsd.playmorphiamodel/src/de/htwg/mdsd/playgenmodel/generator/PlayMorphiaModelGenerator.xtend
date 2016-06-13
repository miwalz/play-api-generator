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
import de.htwg.mdsd.playgenmodel.generator.routes.RoutesGenerator

class PlayMorphiaModelGenerator extends AbstractGenerator {

	@Inject extension IQualifiedNameProvider
	
	@Inject ModelGenerator modelGenerator
	@Inject DaoGenerator daoGenerator
	@Inject ControllerGenerator controllerGenerator
	@Inject RoutesGenerator routesGenerator
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var models = resource.allContents.toIterable.filter(MorphiaModel)
		for (model : models) {
			val name = model.fullyQualifiedName.toString("/")
			
			// src-gen
			fsa.generateFile("model/" + name + ".java", modelGenerator.compile(model))
			fsa.generateFile("dao/" + name + "Dao.java", daoGenerator.compile(model))
			fsa.generateFile("controller/" + name + "Controller.java", controllerGenerator.compile(model))
			
			// app/genapi
			fsa.generateFile("model/" + name + ".java", CustomOutputProvider::PLAY_OUTPUT_APP_GENAPI, modelGenerator.compile(model))
			fsa.generateFile("dao/" + name + "Dao.java", CustomOutputProvider::PLAY_OUTPUT_APP_GENAPI, daoGenerator.compile(model))
			fsa.generateFile("controller/" + name + "Controller.java", CustomOutputProvider::PLAY_OUTPUT_APP_GENAPI, controllerGenerator.compile(model))
			
		}
		
		var modelList = resource.allContents.filter(MorphiaModel).toList;
		
		// src-gen
		fsa.generateFile("routes", routesGenerator.compile(modelList))
		
		// conf
		fsa.generateFile("routes", CustomOutputProvider::PLAY_OUTPUT_CONF_ROUTES , routesGenerator.compile(modelList))
	}
}

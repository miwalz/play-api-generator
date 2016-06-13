package de.htwg.mdsd.playgenmodel.generator.routes

import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import de.htwg.mdsd.playgenmodel.playMorphiaModel.MorphiaModel
import java.util.List

class RoutesGenerator {

	@Inject extension IQualifiedNameProvider
	
	def compile(List<MorphiaModel> models) '''	
		«FOR model : models»
			POST	/«model.name.toFirstLower»     genapi.controller.«model.fullyQualifiedName»Controller.create«model.name»()
			GET		/«model.name.toFirstLower»     genapi.controller.«model.fullyQualifiedName»Controller.getAll«model.name»()
			GET     /«model.name.toFirstLower»/:id genapi.controller.«model.fullyQualifiedName»Controller.get«model.name»(id: String)
			PUT		/«model.name.toFirstLower»/:id genapi.controller.«model.fullyQualifiedName»Controller.update«model.name»(id: String)
			DELETE	/«model.name.toFirstLower»/:id genapi.controller.«model.fullyQualifiedName»Controller.delete«model.name»(id: String)
			«FOR attribute : model.attributes»
				«IF (attribute.type instanceof MorphiaModel) && attribute.many»
				POST    /«model.name.toFirstLower»/:«model.name.toFirstLower»Id/«attribute.name»/:«attribute.name»Id genapi.controller.«model.fullyQualifiedName»Controller.addTo«attribute.name.toFirstUpper»(«model.name.toFirstLower»Id: String, «attribute.name»Id: String)
				DELETE	/«model.name.toFirstLower»/:«model.name.toFirstLower»Id/«attribute.name»/:«attribute.name»Id genapi.controller.«model.fullyQualifiedName»Controller.removeFrom«attribute.name.toFirstUpper»(«model.name.toFirstLower»Id: String, «attribute.name»Id: String)
				«ENDIF»
			«ENDFOR»
			
		«ENDFOR»
		GET		/assets/*file controllers.Assets.versioned(path="/public", file: Asset)
	'''

}
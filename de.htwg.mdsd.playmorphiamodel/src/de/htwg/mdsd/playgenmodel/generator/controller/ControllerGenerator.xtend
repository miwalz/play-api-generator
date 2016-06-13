package de.htwg.mdsd.playgenmodel.generator.controller

import de.htwg.mdsd.playgenmodel.playMorphiaModel.MorphiaModel
import de.htwg.mdsd.playgenmodel.playMorphiaModel.Attribute
import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider

class ControllerGenerator {

	@Inject extension IQualifiedNameProvider

	def compile(MorphiaModel model) '''
		package genapi.controller;
		
		import genapi.dao.«model.name»Dao;
		import genapi.model.«model.name»;
		import org.bson.types.ObjectId;
		import org.mongodb.morphia.query.QueryResults;
		import com.google.inject.Inject;
		import play.mvc.Controller;
		import play.mvc.Result;
		import play.data.FormFactory;
		import play.libs.Json;
		import static play.libs.Json.toJson;
		import org.mongodb.morphia.query.Query;
		import org.mongodb.morphia.query.UpdateOperations;
		import core.util.DBWrapper;
		
		«model.compileForeignDaoImports»
		
		public class «model.name»Controller extends Controller {
			
			@Inject
			FormFactory formFactory;
			
			@Inject
			private «model.name»Dao «model.name.toFirstLower»Dao;
			
			«model.compileForeignDaoInjects»
			«model.compileCrudMethods»
			«model.compileForeignCollectionMethods»
		}
	'''
	
	def compileForeignDaoInjects(MorphiaModel model) {
		val daosToInject = newHashSet()
		for(Attribute attribute : model.attributes.filter[it.type instanceof MorphiaModel && it.many]) {
			daosToInject.add(attribute.type.name)
		}
		'''
		«FOR name : daosToInject»
		@Inject 
		private «name»Dao «name.toFirstLower»Dao;
		
		«ENDFOR»
		'''
	}
	
	def compileForeignDaoImports(MorphiaModel model) {
		val daosToImport = newHashSet()
		for(Attribute attribute : model.attributes.filter[it.type instanceof MorphiaModel && it.many]) {
			daosToImport.add(attribute.type.name)
		}
		'''
		«FOR name : daosToImport»
		import genapi.model.«name»;
		import genapi.dao.«name»Dao;
		«ENDFOR»
		'''
	}
	
	def compileCrudMethods(MorphiaModel model) '''
		public Result create«model.name»() {
			final «model.name» «model.name.toFirstLower» = formFactory.form(«model.name».class).bindFromRequest().get();
			«model.name.toFirstLower».setId(new ObjectId().toString());
			«model.name.toFirstLower»Dao.save(«model.name.toFirstLower»);
			return ok(toJson(«model.name.toFirstLower»));
		}

		public Result get«model.name»(String id) {
			final «model.name» «model.name.toFirstLower» = «model.name.toFirstLower»Dao.get(id);
			return ok(toJson(«model.name.toFirstLower»));
		}

		public Result getAll«model.name»() {
			QueryResults<«model.name»> queryResults = «model.name.toFirstLower»Dao.find();
			return ok(Json.toJson(queryResults.asList()));
		}

		public Result update«model.name»(String id) {
			final «model.name» «model.name.toFirstLower» = formFactory.form(«model.name».class).bindFromRequest().get();
			if (!«model.name.toFirstLower»Dao.exists(id)) {
				return notFound();
			}
			«model.name.toFirstLower».setId(id);
			«model.name.toFirstLower»Dao.save(«model.name.toFirstLower»);
			return ok(toJson(«model.name.toFirstLower»));
		}

		public Result delete«model.name»(String id) {
			«model.name.toFirstLower»Dao.deleteById(id);
			return ok(Json.toJson(id));
		}
		
	'''
	
	def compileForeignCollectionMethods(MorphiaModel model) {
		val targetAttributes = newArrayList()
		for(Attribute attribute : model.attributes.filter[it.type instanceof MorphiaModel && it.many]) {
			targetAttributes.add(attribute)
		}
		'''
		«FOR attribute : targetAttributes»
		public Result addTo«attribute.name.toFirstUpper»(String «model.name.toFirstLower»Id, String «attribute.name»Id) {
			final «attribute.type.fullyQualifiedName» entityToAdd = «attribute.type.name.toFirstLower»Dao.get(«attribute.name»Id);
			final Query<«model.fullyQualifiedName»> query = DBWrapper.datastore.createQuery(«model.fullyQualifiedName».class).filter("_id ==", «model.name.toFirstLower»Id);
			final UpdateOperations<«model.fullyQualifiedName»> operations = DBWrapper.datastore.createUpdateOperations(«model.fullyQualifiedName».class).add("«attribute.name»", entityToAdd);
			DBWrapper.datastore.update(query, operations);
			return ok(Json.toJson(entityToAdd));
		}
		
		public Result removeFrom«attribute.name.toFirstUpper»(String «model.name.toFirstLower»Id, String «attribute.name»Id) {
			final «attribute.type.fullyQualifiedName» entityToRemove = «attribute.type.name.toFirstLower»Dao.get(«attribute.name»Id);
			final Query<«model.fullyQualifiedName»> query = DBWrapper.datastore.createQuery(«model.fullyQualifiedName».class).filter("_id ==", «model.name.toFirstLower»Id);
			final UpdateOperations<«model.fullyQualifiedName»> operations = DBWrapper.datastore.createUpdateOperations(«model.fullyQualifiedName».class).removeAll("«attribute.name»", entityToRemove);
			DBWrapper.datastore.update(query, operations);
			return ok(Json.toJson(«attribute.name»Id));
		}
		
		«ENDFOR»
		'''
	}

}
package de.htwg.mdsd.playgenmodel.generator.dao

import de.htwg.mdsd.playgenmodel.playMorphiaModel.MorphiaModel

class DaoGenerator {
	
	def compile(MorphiaModel model) '''
		package genapi.dao;
		
		import genapi.model.«model.name»;
		import core.dao.BasicDao;
		
		public class «model.name»Dao extends BasicDao<«model.name», String> {}
	'''
	
}
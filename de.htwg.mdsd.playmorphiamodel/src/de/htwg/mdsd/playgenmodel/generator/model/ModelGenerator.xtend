package de.htwg.mdsd.playgenmodel.generator.model

import de.htwg.mdsd.playgenmodel.playMorphiaModel.MorphiaModel
import de.htwg.mdsd.playgenmodel.playMorphiaModel.Attribute
import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider

class ModelGenerator {
	
	@Inject extension IQualifiedNameProvider
	
	def compile(MorphiaModel model) '''
		package genapi.model;
		
		import org.mongodb.morphia.annotations.Entity;
		import core.model.BasicModel;
		import java.util.ArrayList;
		import java.util.List;
		import org.mongodb.morphia.annotations.Embedded;
		import org.mongodb.morphia.annotations.Reference;
		
		@Entity("�model.name.toFirstLower�")
		public class �model.name� extends BasicModel {
			
			�FOR attribute : model.attributes�
			�attribute.compile�
			�ENDFOR�
		}
	'''

	def compile(Attribute attribute) '''
		�IF attribute.type instanceof MorphiaModel�
			�IF attribute.embedded�
			@Embedded
			�ENDIF�
			�IF !attribute.embedded�
			@Reference
			�ENDIF�
		�ENDIF�
		�IF attribute.many�
		private List<�attribute.type.fullyQualifiedName�> �attribute.name� = new ArrayList<�attribute.type.fullyQualifiedName�>();
		
		public List<�attribute.type.fullyQualifiedName�> get�attribute.name.toFirstUpper�() {
			return this.�attribute.name�;
		}
		
		public void set�attribute.name.toFirstUpper�(List<�attribute.type.fullyQualifiedName�> �attribute.name�) {
			this.�attribute.name� = �attribute.name�;
		}
			
		�ENDIF�
		�IF !attribute.many�
		private �attribute.type.fullyQualifiedName� �attribute.name�;
		
		public �attribute.type.fullyQualifiedName� get�attribute.name.toFirstUpper�() {
		    return this.�attribute.name�;
		}
		
		public void set�attribute.name.toFirstUpper�(�attribute.type.fullyQualifiedName� �attribute.name�) {
		    this.�attribute.name� = �attribute.name�;
		}
			
		�ENDIF�
	'''	
	
}
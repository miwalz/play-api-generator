package de.htwg.mdsd.playgenmodel.generator.controller;

import com.google.inject.Inject;
import de.htwg.mdsd.playgenmodel.playMorphiaModel.Attribute;
import de.htwg.mdsd.playgenmodel.playMorphiaModel.MorphiaModel;
import de.htwg.mdsd.playgenmodel.playMorphiaModel.Type;
import java.util.ArrayList;
import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ControllerGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  public CharSequence compile(final MorphiaModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package genapi.controller;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import genapi.dao.");
    String _name = model.getName();
    _builder.append(_name, "");
    _builder.append("Dao;");
    _builder.newLineIfNotEmpty();
    _builder.append("import genapi.model.");
    String _name_1 = model.getName();
    _builder.append(_name_1, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import org.bson.types.ObjectId;");
    _builder.newLine();
    _builder.append("import org.mongodb.morphia.query.QueryResults;");
    _builder.newLine();
    _builder.append("import com.google.inject.Inject;");
    _builder.newLine();
    _builder.append("import play.mvc.Controller;");
    _builder.newLine();
    _builder.append("import play.mvc.Result;");
    _builder.newLine();
    _builder.append("import play.data.FormFactory;");
    _builder.newLine();
    _builder.append("import play.libs.Json;");
    _builder.newLine();
    _builder.append("import static play.libs.Json.toJson;");
    _builder.newLine();
    _builder.append("import org.mongodb.morphia.query.Query;");
    _builder.newLine();
    _builder.append("import org.mongodb.morphia.query.UpdateOperations;");
    _builder.newLine();
    _builder.append("import core.util.DBWrapper;");
    _builder.newLine();
    _builder.newLine();
    CharSequence _compileForeignDaoImports = this.compileForeignDaoImports(model);
    _builder.append(_compileForeignDaoImports, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _name_2 = model.getName();
    _builder.append(_name_2, "");
    _builder.append("Controller extends Controller {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Inject");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FormFactory formFactory;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Inject");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ");
    String _name_3 = model.getName();
    _builder.append(_name_3, "\t");
    _builder.append("Dao ");
    String _name_4 = model.getName();
    String _firstLower = StringExtensions.toFirstLower(_name_4);
    _builder.append(_firstLower, "\t");
    _builder.append("Dao;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _compileForeignDaoInjects = this.compileForeignDaoInjects(model);
    _builder.append(_compileForeignDaoInjects, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _compileCrudMethods = this.compileCrudMethods(model);
    _builder.append(_compileCrudMethods, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _compileForeignCollectionMethods = this.compileForeignCollectionMethods(model);
    _builder.append(_compileForeignCollectionMethods, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileForeignDaoInjects(final MorphiaModel model) {
    CharSequence _xblockexpression = null;
    {
      final HashSet<String> daosToInject = CollectionLiterals.<String>newHashSet();
      EList<Attribute> _attributes = model.getAttributes();
      final Function1<Attribute, Boolean> _function = (Attribute it) -> {
        boolean _and = false;
        Type _type = it.getType();
        if (!(_type instanceof MorphiaModel)) {
          _and = false;
        } else {
          boolean _isMany = it.isMany();
          _and = _isMany;
        }
        return Boolean.valueOf(_and);
      };
      Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(_attributes, _function);
      for (final Attribute attribute : _filter) {
        Type _type = attribute.getType();
        String _name = _type.getName();
        daosToInject.add(_name);
      }
      StringConcatenation _builder = new StringConcatenation();
      {
        for(final String name : daosToInject) {
          _builder.append("@Inject ");
          _builder.newLine();
          _builder.append("private ");
          _builder.append(name, "");
          _builder.append("Dao ");
          String _firstLower = StringExtensions.toFirstLower(name);
          _builder.append(_firstLower, "");
          _builder.append("Dao;");
          _builder.newLineIfNotEmpty();
          _builder.newLine();
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence compileForeignDaoImports(final MorphiaModel model) {
    CharSequence _xblockexpression = null;
    {
      final HashSet<String> daosToImport = CollectionLiterals.<String>newHashSet();
      EList<Attribute> _attributes = model.getAttributes();
      final Function1<Attribute, Boolean> _function = (Attribute it) -> {
        boolean _and = false;
        Type _type = it.getType();
        if (!(_type instanceof MorphiaModel)) {
          _and = false;
        } else {
          boolean _isMany = it.isMany();
          _and = _isMany;
        }
        return Boolean.valueOf(_and);
      };
      Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(_attributes, _function);
      for (final Attribute attribute : _filter) {
        Type _type = attribute.getType();
        String _name = _type.getName();
        daosToImport.add(_name);
      }
      StringConcatenation _builder = new StringConcatenation();
      {
        for(final String name : daosToImport) {
          _builder.append("import genapi.model.");
          _builder.append(name, "");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.append("import genapi.dao.");
          _builder.append(name, "");
          _builder.append("Dao;");
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence compileCrudMethods(final MorphiaModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public Result create");
    String _name = model.getName();
    _builder.append(_name, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("final ");
    String _name_1 = model.getName();
    _builder.append(_name_1, "\t");
    _builder.append(" ");
    String _name_2 = model.getName();
    String _firstLower = StringExtensions.toFirstLower(_name_2);
    _builder.append(_firstLower, "\t");
    _builder.append(" = formFactory.form(");
    String _name_3 = model.getName();
    _builder.append(_name_3, "\t");
    _builder.append(".class).bindFromRequest().get();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _name_4 = model.getName();
    String _firstLower_1 = StringExtensions.toFirstLower(_name_4);
    _builder.append(_firstLower_1, "\t");
    _builder.append(".setId(new ObjectId().toString());");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _name_5 = model.getName();
    String _firstLower_2 = StringExtensions.toFirstLower(_name_5);
    _builder.append(_firstLower_2, "\t");
    _builder.append("Dao.save(");
    String _name_6 = model.getName();
    String _firstLower_3 = StringExtensions.toFirstLower(_name_6);
    _builder.append(_firstLower_3, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ok(toJson(");
    String _name_7 = model.getName();
    String _firstLower_4 = StringExtensions.toFirstLower(_name_7);
    _builder.append(_firstLower_4, "\t");
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public Result get");
    String _name_8 = model.getName();
    _builder.append(_name_8, "");
    _builder.append("(String id) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("final ");
    String _name_9 = model.getName();
    _builder.append(_name_9, "\t");
    _builder.append(" ");
    String _name_10 = model.getName();
    String _firstLower_5 = StringExtensions.toFirstLower(_name_10);
    _builder.append(_firstLower_5, "\t");
    _builder.append(" = ");
    String _name_11 = model.getName();
    String _firstLower_6 = StringExtensions.toFirstLower(_name_11);
    _builder.append(_firstLower_6, "\t");
    _builder.append("Dao.get(id);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ok(toJson(");
    String _name_12 = model.getName();
    String _firstLower_7 = StringExtensions.toFirstLower(_name_12);
    _builder.append(_firstLower_7, "\t");
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public Result getAll");
    String _name_13 = model.getName();
    _builder.append(_name_13, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("QueryResults<");
    String _name_14 = model.getName();
    _builder.append(_name_14, "\t");
    _builder.append("> queryResults = ");
    String _name_15 = model.getName();
    String _firstLower_8 = StringExtensions.toFirstLower(_name_15);
    _builder.append(_firstLower_8, "\t");
    _builder.append("Dao.find();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ok(Json.toJson(queryResults.asList()));");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public Result update");
    String _name_16 = model.getName();
    _builder.append(_name_16, "");
    _builder.append("(String id) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("final ");
    String _name_17 = model.getName();
    _builder.append(_name_17, "\t");
    _builder.append(" ");
    String _name_18 = model.getName();
    String _firstLower_9 = StringExtensions.toFirstLower(_name_18);
    _builder.append(_firstLower_9, "\t");
    _builder.append(" = formFactory.form(");
    String _name_19 = model.getName();
    _builder.append(_name_19, "\t");
    _builder.append(".class).bindFromRequest().get();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("if (!");
    String _name_20 = model.getName();
    String _firstLower_10 = StringExtensions.toFirstLower(_name_20);
    _builder.append(_firstLower_10, "\t");
    _builder.append("Dao.exists(id)) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return notFound();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    String _name_21 = model.getName();
    String _firstLower_11 = StringExtensions.toFirstLower(_name_21);
    _builder.append(_firstLower_11, "\t");
    _builder.append(".setId(id);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _name_22 = model.getName();
    String _firstLower_12 = StringExtensions.toFirstLower(_name_22);
    _builder.append(_firstLower_12, "\t");
    _builder.append("Dao.save(");
    String _name_23 = model.getName();
    String _firstLower_13 = StringExtensions.toFirstLower(_name_23);
    _builder.append(_firstLower_13, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ok(toJson(");
    String _name_24 = model.getName();
    String _firstLower_14 = StringExtensions.toFirstLower(_name_24);
    _builder.append(_firstLower_14, "\t");
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public Result delete");
    String _name_25 = model.getName();
    _builder.append(_name_25, "");
    _builder.append("(String id) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _name_26 = model.getName();
    String _firstLower_15 = StringExtensions.toFirstLower(_name_26);
    _builder.append(_firstLower_15, "\t");
    _builder.append("Dao.deleteById(id);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ok(Json.toJson(id));");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileForeignCollectionMethods(final MorphiaModel model) {
    CharSequence _xblockexpression = null;
    {
      final ArrayList<Attribute> targetAttributes = CollectionLiterals.<Attribute>newArrayList();
      EList<Attribute> _attributes = model.getAttributes();
      final Function1<Attribute, Boolean> _function = (Attribute it) -> {
        boolean _and = false;
        Type _type = it.getType();
        if (!(_type instanceof MorphiaModel)) {
          _and = false;
        } else {
          boolean _isMany = it.isMany();
          _and = _isMany;
        }
        return Boolean.valueOf(_and);
      };
      Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(_attributes, _function);
      for (final Attribute attribute : _filter) {
        targetAttributes.add(attribute);
      }
      StringConcatenation _builder = new StringConcatenation();
      {
        for(final Attribute attribute_1 : targetAttributes) {
          _builder.append("public Result addTo");
          String _name = attribute_1.getName();
          String _firstUpper = StringExtensions.toFirstUpper(_name);
          _builder.append(_firstUpper, "");
          _builder.append("(String ");
          String _name_1 = model.getName();
          String _firstLower = StringExtensions.toFirstLower(_name_1);
          _builder.append(_firstLower, "");
          _builder.append("Id, String ");
          String _name_2 = attribute_1.getName();
          _builder.append(_name_2, "");
          _builder.append("Id) {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("final ");
          Type _type = attribute_1.getType();
          QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_type);
          _builder.append(_fullyQualifiedName, "\t");
          _builder.append(" entityToAdd = ");
          Type _type_1 = attribute_1.getType();
          String _name_3 = _type_1.getName();
          String _firstLower_1 = StringExtensions.toFirstLower(_name_3);
          _builder.append(_firstLower_1, "\t");
          _builder.append("Dao.get(");
          String _name_4 = attribute_1.getName();
          _builder.append(_name_4, "\t");
          _builder.append("Id);");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("final Query<");
          QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(model);
          _builder.append(_fullyQualifiedName_1, "\t");
          _builder.append("> query = DBWrapper.datastore.createQuery(");
          QualifiedName _fullyQualifiedName_2 = this._iQualifiedNameProvider.getFullyQualifiedName(model);
          _builder.append(_fullyQualifiedName_2, "\t");
          _builder.append(".class).filter(\"_id ==\", ");
          String _name_5 = model.getName();
          String _firstLower_2 = StringExtensions.toFirstLower(_name_5);
          _builder.append(_firstLower_2, "\t");
          _builder.append("Id);");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("final UpdateOperations<");
          QualifiedName _fullyQualifiedName_3 = this._iQualifiedNameProvider.getFullyQualifiedName(model);
          _builder.append(_fullyQualifiedName_3, "\t");
          _builder.append("> operations = DBWrapper.datastore.createUpdateOperations(");
          QualifiedName _fullyQualifiedName_4 = this._iQualifiedNameProvider.getFullyQualifiedName(model);
          _builder.append(_fullyQualifiedName_4, "\t");
          _builder.append(".class).add(\"");
          String _name_6 = attribute_1.getName();
          _builder.append(_name_6, "\t");
          _builder.append("\", entityToAdd);");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("DBWrapper.datastore.update(query, operations);");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("return ok(Json.toJson(entityToAdd));");
          _builder.newLine();
          _builder.append("}");
          _builder.newLine();
          _builder.newLine();
          _builder.append("public Result removeFrom");
          String _name_7 = attribute_1.getName();
          String _firstUpper_1 = StringExtensions.toFirstUpper(_name_7);
          _builder.append(_firstUpper_1, "");
          _builder.append("(String ");
          String _name_8 = model.getName();
          String _firstLower_3 = StringExtensions.toFirstLower(_name_8);
          _builder.append(_firstLower_3, "");
          _builder.append("Id, String ");
          String _name_9 = attribute_1.getName();
          _builder.append(_name_9, "");
          _builder.append("Id) {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("final ");
          Type _type_2 = attribute_1.getType();
          QualifiedName _fullyQualifiedName_5 = this._iQualifiedNameProvider.getFullyQualifiedName(_type_2);
          _builder.append(_fullyQualifiedName_5, "\t");
          _builder.append(" entityToRemove = ");
          Type _type_3 = attribute_1.getType();
          String _name_10 = _type_3.getName();
          String _firstLower_4 = StringExtensions.toFirstLower(_name_10);
          _builder.append(_firstLower_4, "\t");
          _builder.append("Dao.get(");
          String _name_11 = attribute_1.getName();
          _builder.append(_name_11, "\t");
          _builder.append("Id);");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("final Query<");
          QualifiedName _fullyQualifiedName_6 = this._iQualifiedNameProvider.getFullyQualifiedName(model);
          _builder.append(_fullyQualifiedName_6, "\t");
          _builder.append("> query = DBWrapper.datastore.createQuery(");
          QualifiedName _fullyQualifiedName_7 = this._iQualifiedNameProvider.getFullyQualifiedName(model);
          _builder.append(_fullyQualifiedName_7, "\t");
          _builder.append(".class).filter(\"_id ==\", ");
          String _name_12 = model.getName();
          String _firstLower_5 = StringExtensions.toFirstLower(_name_12);
          _builder.append(_firstLower_5, "\t");
          _builder.append("Id);");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("final UpdateOperations<");
          QualifiedName _fullyQualifiedName_8 = this._iQualifiedNameProvider.getFullyQualifiedName(model);
          _builder.append(_fullyQualifiedName_8, "\t");
          _builder.append("> operations = DBWrapper.datastore.createUpdateOperations(");
          QualifiedName _fullyQualifiedName_9 = this._iQualifiedNameProvider.getFullyQualifiedName(model);
          _builder.append(_fullyQualifiedName_9, "\t");
          _builder.append(".class).removeAll(\"");
          String _name_13 = attribute_1.getName();
          _builder.append(_name_13, "\t");
          _builder.append("\", entityToRemove);");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("DBWrapper.datastore.update(query, operations);");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("return ok(Json.toJson(");
          String _name_14 = attribute_1.getName();
          _builder.append(_name_14, "\t");
          _builder.append("Id));");
          _builder.newLineIfNotEmpty();
          _builder.append("}");
          _builder.newLine();
          _builder.newLine();
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
}

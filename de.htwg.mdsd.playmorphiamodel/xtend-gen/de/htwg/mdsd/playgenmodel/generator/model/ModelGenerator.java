package de.htwg.mdsd.playgenmodel.generator.model;

import com.google.inject.Inject;
import de.htwg.mdsd.playgenmodel.playMorphiaModel.Attribute;
import de.htwg.mdsd.playgenmodel.playMorphiaModel.MorphiaModel;
import de.htwg.mdsd.playgenmodel.playMorphiaModel.Type;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ModelGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  public CharSequence compile(final MorphiaModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package genapi.model;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.mongodb.morphia.annotations.Entity;");
    _builder.newLine();
    _builder.append("import core.model.BasicModel;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import org.mongodb.morphia.annotations.Embedded;");
    _builder.newLine();
    _builder.append("import org.mongodb.morphia.annotations.Reference;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Entity(\"");
    String _name = model.getName();
    String _firstLower = StringExtensions.toFirstLower(_name);
    _builder.append(_firstLower, "");
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    String _name_1 = model.getName();
    _builder.append(_name_1, "");
    _builder.append(" extends BasicModel {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Attribute> _attributes = model.getAttributes();
      for(final Attribute attribute : _attributes) {
        _builder.append("\t");
        CharSequence _compile = this.compile(attribute);
        _builder.append(_compile, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Attribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Type _type = attribute.getType();
      if ((_type instanceof MorphiaModel)) {
        {
          boolean _isEmbedded = attribute.isEmbedded();
          if (_isEmbedded) {
            _builder.append("@Embedded");
            _builder.newLine();
          }
        }
        {
          boolean _isEmbedded_1 = attribute.isEmbedded();
          boolean _not = (!_isEmbedded_1);
          if (_not) {
            _builder.append("@Reference");
            _builder.newLine();
          }
        }
      }
    }
    {
      boolean _isMany = attribute.isMany();
      if (_isMany) {
        _builder.append("private List<");
        Type _type_1 = attribute.getType();
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_type_1);
        _builder.append(_fullyQualifiedName, "");
        _builder.append("> ");
        String _name = attribute.getName();
        _builder.append(_name, "");
        _builder.append(" = new ArrayList<");
        Type _type_2 = attribute.getType();
        QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(_type_2);
        _builder.append(_fullyQualifiedName_1, "");
        _builder.append(">();");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("public List<");
        Type _type_3 = attribute.getType();
        QualifiedName _fullyQualifiedName_2 = this._iQualifiedNameProvider.getFullyQualifiedName(_type_3);
        _builder.append(_fullyQualifiedName_2, "");
        _builder.append("> get");
        String _name_1 = attribute.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name_1);
        _builder.append(_firstUpper, "");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return this.");
        String _name_2 = attribute.getName();
        _builder.append(_name_2, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("public void set");
        String _name_3 = attribute.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_3);
        _builder.append(_firstUpper_1, "");
        _builder.append("(List<");
        Type _type_4 = attribute.getType();
        QualifiedName _fullyQualifiedName_3 = this._iQualifiedNameProvider.getFullyQualifiedName(_type_4);
        _builder.append(_fullyQualifiedName_3, "");
        _builder.append("> ");
        String _name_4 = attribute.getName();
        _builder.append(_name_4, "");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("this.");
        String _name_5 = attribute.getName();
        _builder.append(_name_5, "\t");
        _builder.append(" = ");
        String _name_6 = attribute.getName();
        _builder.append(_name_6, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    {
      boolean _isMany_1 = attribute.isMany();
      boolean _not_1 = (!_isMany_1);
      if (_not_1) {
        _builder.append("private ");
        Type _type_5 = attribute.getType();
        QualifiedName _fullyQualifiedName_4 = this._iQualifiedNameProvider.getFullyQualifiedName(_type_5);
        _builder.append(_fullyQualifiedName_4, "");
        _builder.append(" ");
        String _name_7 = attribute.getName();
        _builder.append(_name_7, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("public ");
        Type _type_6 = attribute.getType();
        QualifiedName _fullyQualifiedName_5 = this._iQualifiedNameProvider.getFullyQualifiedName(_type_6);
        _builder.append(_fullyQualifiedName_5, "");
        _builder.append(" get");
        String _name_8 = attribute.getName();
        String _firstUpper_2 = StringExtensions.toFirstUpper(_name_8);
        _builder.append(_firstUpper_2, "");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("return this.");
        String _name_9 = attribute.getName();
        _builder.append(_name_9, "    ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("public void set");
        String _name_10 = attribute.getName();
        String _firstUpper_3 = StringExtensions.toFirstUpper(_name_10);
        _builder.append(_firstUpper_3, "");
        _builder.append("(");
        Type _type_7 = attribute.getType();
        QualifiedName _fullyQualifiedName_6 = this._iQualifiedNameProvider.getFullyQualifiedName(_type_7);
        _builder.append(_fullyQualifiedName_6, "");
        _builder.append(" ");
        String _name_11 = attribute.getName();
        _builder.append(_name_11, "");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("this.");
        String _name_12 = attribute.getName();
        _builder.append(_name_12, "    ");
        _builder.append(" = ");
        String _name_13 = attribute.getName();
        _builder.append(_name_13, "    ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    return _builder;
  }
}

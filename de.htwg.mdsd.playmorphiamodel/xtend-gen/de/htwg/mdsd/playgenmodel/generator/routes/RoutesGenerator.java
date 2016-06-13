package de.htwg.mdsd.playgenmodel.generator.routes;

import com.google.inject.Inject;
import de.htwg.mdsd.playgenmodel.playMorphiaModel.Attribute;
import de.htwg.mdsd.playgenmodel.playMorphiaModel.MorphiaModel;
import de.htwg.mdsd.playgenmodel.playMorphiaModel.Type;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class RoutesGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  public CharSequence compile(final List<MorphiaModel> models) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final MorphiaModel model : models) {
        _builder.append("POST\t/");
        String _name = model.getName();
        String _firstLower = StringExtensions.toFirstLower(_name);
        _builder.append(_firstLower, "");
        _builder.append("     genapi.controller.");
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(model);
        _builder.append(_fullyQualifiedName, "");
        _builder.append("Controller.create");
        String _name_1 = model.getName();
        _builder.append(_name_1, "");
        _builder.append("()");
        _builder.newLineIfNotEmpty();
        _builder.append("GET\t\t/");
        String _name_2 = model.getName();
        String _firstLower_1 = StringExtensions.toFirstLower(_name_2);
        _builder.append(_firstLower_1, "");
        _builder.append("     genapi.controller.");
        QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(model);
        _builder.append(_fullyQualifiedName_1, "");
        _builder.append("Controller.getAll");
        String _name_3 = model.getName();
        _builder.append(_name_3, "");
        _builder.append("()");
        _builder.newLineIfNotEmpty();
        _builder.append("GET     /");
        String _name_4 = model.getName();
        String _firstLower_2 = StringExtensions.toFirstLower(_name_4);
        _builder.append(_firstLower_2, "");
        _builder.append("/:id genapi.controller.");
        QualifiedName _fullyQualifiedName_2 = this._iQualifiedNameProvider.getFullyQualifiedName(model);
        _builder.append(_fullyQualifiedName_2, "");
        _builder.append("Controller.get");
        String _name_5 = model.getName();
        _builder.append(_name_5, "");
        _builder.append("(id: String)");
        _builder.newLineIfNotEmpty();
        _builder.append("PUT\t\t/");
        String _name_6 = model.getName();
        String _firstLower_3 = StringExtensions.toFirstLower(_name_6);
        _builder.append(_firstLower_3, "");
        _builder.append("/:id genapi.controller.");
        QualifiedName _fullyQualifiedName_3 = this._iQualifiedNameProvider.getFullyQualifiedName(model);
        _builder.append(_fullyQualifiedName_3, "");
        _builder.append("Controller.update");
        String _name_7 = model.getName();
        _builder.append(_name_7, "");
        _builder.append("(id: String)");
        _builder.newLineIfNotEmpty();
        _builder.append("DELETE\t/");
        String _name_8 = model.getName();
        String _firstLower_4 = StringExtensions.toFirstLower(_name_8);
        _builder.append(_firstLower_4, "");
        _builder.append("/:id genapi.controller.");
        QualifiedName _fullyQualifiedName_4 = this._iQualifiedNameProvider.getFullyQualifiedName(model);
        _builder.append(_fullyQualifiedName_4, "");
        _builder.append("Controller.delete");
        String _name_9 = model.getName();
        _builder.append(_name_9, "");
        _builder.append("(id: String)");
        _builder.newLineIfNotEmpty();
        {
          EList<Attribute> _attributes = model.getAttributes();
          for(final Attribute attribute : _attributes) {
            {
              boolean _and = false;
              Type _type = attribute.getType();
              if (!(_type instanceof MorphiaModel)) {
                _and = false;
              } else {
                boolean _isMany = attribute.isMany();
                _and = _isMany;
              }
              if (_and) {
                _builder.append("POST    /");
                String _name_10 = model.getName();
                String _firstLower_5 = StringExtensions.toFirstLower(_name_10);
                _builder.append(_firstLower_5, "");
                _builder.append("/:");
                String _name_11 = model.getName();
                String _firstLower_6 = StringExtensions.toFirstLower(_name_11);
                _builder.append(_firstLower_6, "");
                _builder.append("Id/");
                String _name_12 = attribute.getName();
                _builder.append(_name_12, "");
                _builder.append("/:");
                String _name_13 = attribute.getName();
                _builder.append(_name_13, "");
                _builder.append("Id genapi.controller.");
                QualifiedName _fullyQualifiedName_5 = this._iQualifiedNameProvider.getFullyQualifiedName(model);
                _builder.append(_fullyQualifiedName_5, "");
                _builder.append("Controller.addTo");
                String _name_14 = attribute.getName();
                String _firstUpper = StringExtensions.toFirstUpper(_name_14);
                _builder.append(_firstUpper, "");
                _builder.append("(");
                String _name_15 = model.getName();
                String _firstLower_7 = StringExtensions.toFirstLower(_name_15);
                _builder.append(_firstLower_7, "");
                _builder.append("Id: String, ");
                String _name_16 = attribute.getName();
                _builder.append(_name_16, "");
                _builder.append("Id: String)");
                _builder.newLineIfNotEmpty();
                _builder.append("DELETE\t/");
                String _name_17 = model.getName();
                String _firstLower_8 = StringExtensions.toFirstLower(_name_17);
                _builder.append(_firstLower_8, "");
                _builder.append("/:");
                String _name_18 = model.getName();
                String _firstLower_9 = StringExtensions.toFirstLower(_name_18);
                _builder.append(_firstLower_9, "");
                _builder.append("Id/");
                String _name_19 = attribute.getName();
                _builder.append(_name_19, "");
                _builder.append("/:");
                String _name_20 = attribute.getName();
                _builder.append(_name_20, "");
                _builder.append("Id genapi.controller.");
                QualifiedName _fullyQualifiedName_6 = this._iQualifiedNameProvider.getFullyQualifiedName(model);
                _builder.append(_fullyQualifiedName_6, "");
                _builder.append("Controller.removeFrom");
                String _name_21 = attribute.getName();
                String _firstUpper_1 = StringExtensions.toFirstUpper(_name_21);
                _builder.append(_firstUpper_1, "");
                _builder.append("(");
                String _name_22 = model.getName();
                String _firstLower_10 = StringExtensions.toFirstLower(_name_22);
                _builder.append(_firstLower_10, "");
                _builder.append("Id: String, ");
                String _name_23 = attribute.getName();
                _builder.append(_name_23, "");
                _builder.append("Id: String)");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.newLine();
      }
    }
    _builder.append("GET\t\t/assets/*file controllers.Assets.versioned(path=\"/public\", file: Asset)");
    _builder.newLine();
    return _builder;
  }
}

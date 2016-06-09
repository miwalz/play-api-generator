package de.htwg.mdsd.playgenmodel.generator.dao;

import de.htwg.mdsd.playgenmodel.playMorphiaModel.MorphiaModel;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class DaoGenerator {
  public CharSequence compile(final MorphiaModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package genapi.dao;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import genapi.model.");
    String _name = model.getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import core.dao.BasicDao;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name_1 = model.getName();
    _builder.append(_name_1, "");
    _builder.append("Dao extends BasicDao<");
    String _name_2 = model.getName();
    _builder.append(_name_2, "");
    _builder.append(", String> {}");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}

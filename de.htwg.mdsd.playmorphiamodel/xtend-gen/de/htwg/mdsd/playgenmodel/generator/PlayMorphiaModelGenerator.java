package de.htwg.mdsd.playgenmodel.generator;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import de.htwg.mdsd.playgenmodel.CustomOutputProvider;
import de.htwg.mdsd.playgenmodel.generator.controller.ControllerGenerator;
import de.htwg.mdsd.playgenmodel.generator.dao.DaoGenerator;
import de.htwg.mdsd.playgenmodel.generator.model.ModelGenerator;
import de.htwg.mdsd.playgenmodel.generator.routes.RoutesGenerator;
import de.htwg.mdsd.playgenmodel.playMorphiaModel.MorphiaModel;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class PlayMorphiaModelGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  private ModelGenerator modelGenerator;
  
  @Inject
  private DaoGenerator daoGenerator;
  
  @Inject
  private ControllerGenerator controllerGenerator;
  
  @Inject
  private RoutesGenerator routesGenerator;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<MorphiaModel> models = Iterables.<MorphiaModel>filter(_iterable, MorphiaModel.class);
    for (final MorphiaModel model : models) {
      {
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(model);
        final String name = _fullyQualifiedName.toString("/");
        CharSequence _compile = this.modelGenerator.compile(model);
        fsa.generateFile((("model/" + name) + ".java"), _compile);
        CharSequence _compile_1 = this.daoGenerator.compile(model);
        fsa.generateFile((("dao/" + name) + "Dao.java"), _compile_1);
        CharSequence _compile_2 = this.controllerGenerator.compile(model);
        fsa.generateFile((("controller/" + name) + "Controller.java"), _compile_2);
        CharSequence _compile_3 = this.modelGenerator.compile(model);
        fsa.generateFile((("model/" + name) + ".java"), CustomOutputProvider.PLAY_OUTPUT_APP_GENAPI, _compile_3);
        CharSequence _compile_4 = this.daoGenerator.compile(model);
        fsa.generateFile((("dao/" + name) + "Dao.java"), CustomOutputProvider.PLAY_OUTPUT_APP_GENAPI, _compile_4);
        CharSequence _compile_5 = this.controllerGenerator.compile(model);
        fsa.generateFile((("controller/" + name) + "Controller.java"), CustomOutputProvider.PLAY_OUTPUT_APP_GENAPI, _compile_5);
      }
    }
    TreeIterator<EObject> _allContents_1 = resource.getAllContents();
    Iterator<MorphiaModel> _filter = Iterators.<MorphiaModel>filter(_allContents_1, MorphiaModel.class);
    List<MorphiaModel> modelList = IteratorExtensions.<MorphiaModel>toList(_filter);
    CharSequence _compile = this.routesGenerator.compile(modelList);
    fsa.generateFile("routes", _compile);
    CharSequence _compile_1 = this.routesGenerator.compile(modelList);
    fsa.generateFile("routes", CustomOutputProvider.PLAY_OUTPUT_CONF_ROUTES, _compile_1);
  }
}

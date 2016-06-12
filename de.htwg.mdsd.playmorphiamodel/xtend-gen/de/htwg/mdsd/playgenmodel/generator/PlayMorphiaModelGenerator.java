package de.htwg.mdsd.playgenmodel.generator;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import de.htwg.mdsd.playgenmodel.CustomOutputProvider;
import de.htwg.mdsd.playgenmodel.generator.controller.ControllerGenerator;
import de.htwg.mdsd.playgenmodel.generator.dao.DaoGenerator;
import de.htwg.mdsd.playgenmodel.generator.model.ModelGenerator;
import de.htwg.mdsd.playgenmodel.playMorphiaModel.MorphiaModel;
import java.util.Set;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.generator.OutputConfiguration;
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
  private CustomOutputProvider customOutputProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<MorphiaModel> _filter = Iterables.<MorphiaModel>filter(_iterable, MorphiaModel.class);
    for (final MorphiaModel model : _filter) {
      {
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(model);
        final String name = _fullyQualifiedName.toString("/");
        Set<OutputConfiguration> _outputConfigurations = this.customOutputProvider.getOutputConfigurations();
        for (final OutputConfiguration out : _outputConfigurations) {
          {
            String _name = out.getName();
            CharSequence _compile = this.modelGenerator.compile(model);
            fsa.generateFile((("model/" + name) + ".java"), _name, _compile);
            String _name_1 = out.getName();
            CharSequence _compile_1 = this.daoGenerator.compile(model);
            fsa.generateFile((("dao/" + name) + "Dao.java"), _name_1, _compile_1);
            String _name_2 = out.getName();
            CharSequence _compile_2 = this.controllerGenerator.compile(model);
            fsa.generateFile((("controller/" + name) + "Controller.java"), _name_2, _compile_2);
          }
        }
      }
    }
  }
}

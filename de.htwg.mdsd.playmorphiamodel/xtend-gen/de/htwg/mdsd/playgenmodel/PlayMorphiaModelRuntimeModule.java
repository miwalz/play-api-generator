/**
 * generated by Xtext 2.9.1
 */
package de.htwg.mdsd.playgenmodel;

import com.google.inject.Binder;
import com.google.inject.binder.AnnotatedBindingBuilder;
import com.google.inject.binder.ScopedBindingBuilder;
import de.htwg.mdsd.playgenmodel.AbstractPlayMorphiaModelRuntimeModule;
import de.htwg.mdsd.playgenmodel.CustomOutputProvider;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class PlayMorphiaModelRuntimeModule extends AbstractPlayMorphiaModelRuntimeModule {
  @Override
  public void configure(final Binder binder) {
    super.configure(binder);
    AnnotatedBindingBuilder<IOutputConfigurationProvider> _bind = binder.<IOutputConfigurationProvider>bind(IOutputConfigurationProvider.class);
    ScopedBindingBuilder _to = _bind.to(CustomOutputProvider.class);
    _to.asEagerSingleton();
  }
}

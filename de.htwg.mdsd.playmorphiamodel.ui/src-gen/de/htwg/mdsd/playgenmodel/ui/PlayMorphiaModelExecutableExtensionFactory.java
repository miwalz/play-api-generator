/*
 * generated by Xtext 2.9.1
 */
package de.htwg.mdsd.playgenmodel.ui;

import com.google.inject.Injector;
import de.htwg.mdsd.playmorphiamodel.ui.internal.PlaymorphiamodelActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PlayMorphiaModelExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return PlaymorphiamodelActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return PlaymorphiamodelActivator.getInstance().getInjector(PlaymorphiamodelActivator.DE_HTWG_MDSD_PLAYGENMODEL_PLAYMORPHIAMODEL);
	}
	
}

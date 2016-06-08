/*
 * generated by Xtext 2.9.1
 */
package de.htwg.mdsd.playgenmodel;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.htwg.mdsd.playgenmodel.playMorphiaModel.PlayMorphiaModelPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.common.TerminalsStandaloneSetup;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;

@SuppressWarnings("all")
public class PlayMorphiaModelStandaloneSetupGenerated implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		TerminalsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new PlayMorphiaModelRuntimeModule());
	}
	
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.htwg.de/mdsd/playgenmodel/PlayMorphiaModel")) {
			EPackage.Registry.INSTANCE.put("http://www.htwg.de/mdsd/playgenmodel/PlayMorphiaModel", PlayMorphiaModelPackage.eINSTANCE);
		}
		IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
		IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("momo", resourceFactory);
		IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("momo", serviceProvider);
	}
}

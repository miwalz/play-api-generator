/**
 * generated by Xtext 2.9.1
 */
package de.htwg.mdsd.playgenmodel;

import de.htwg.mdsd.playgenmodel.PlayMorphiaModelStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class PlayMorphiaModelStandaloneSetup extends PlayMorphiaModelStandaloneSetupGenerated {
  public static void doSetup() {
    PlayMorphiaModelStandaloneSetup _playMorphiaModelStandaloneSetup = new PlayMorphiaModelStandaloneSetup();
    _playMorphiaModelStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}

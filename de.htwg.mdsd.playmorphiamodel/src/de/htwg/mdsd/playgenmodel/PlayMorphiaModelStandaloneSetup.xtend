/*
 * generated by Xtext 2.9.1
 */
package de.htwg.mdsd.playgenmodel


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class PlayMorphiaModelStandaloneSetup extends PlayMorphiaModelStandaloneSetupGenerated {

	def static void doSetup() {
		new PlayMorphiaModelStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}

/*
 * generated by Xtext 2.10.0
 */
package org.xtext.t3.turtle


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class TurtleStandaloneSetup extends TurtleStandaloneSetupGenerated {

	def static void doSetup() {
		new TurtleStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}

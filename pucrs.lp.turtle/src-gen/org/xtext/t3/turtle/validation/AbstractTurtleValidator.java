/*
 * generated by Xtext 2.10.0
 */
package org.xtext.t3.turtle.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractTurtleValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.t3.turtle.turtle.TurtlePackage.eINSTANCE);
		return result;
	}
	
}

/*
 * generated by Xtext 2.10.0
 */
package org.xtext.t3.turtle.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class TurtleAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/t3/turtle/parser/antlr/internal/InternalTurtle.tokens");
	}
}

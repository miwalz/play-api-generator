/*
 * generated by Xtext 2.9.1
 */
package de.htwg.mdsd.playgenmodel.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class PlayMorphiaModelAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("de/htwg/mdsd/playgenmodel/parser/antlr/internal/InternalPlayMorphiaModel.tokens");
	}
}

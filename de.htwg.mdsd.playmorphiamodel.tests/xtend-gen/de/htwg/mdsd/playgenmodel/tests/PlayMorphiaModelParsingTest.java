/**
 * generated by Xtext 2.9.1
 */
package de.htwg.mdsd.playgenmodel.tests;

import com.google.inject.Inject;
import de.htwg.mdsd.playgenmodel.tests.PlayMorphiaModelInjectorProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(PlayMorphiaModelInjectorProvider.class)
@SuppressWarnings("all")
public class PlayMorphiaModelParsingTest {
  @Inject
  private /* ParseHelper<DomainModel> */Object parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final DomainModel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
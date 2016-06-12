package de.htwg.mdsd.playgenmodel;

import com.google.common.collect.Sets;
import java.util.Set;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;

@SuppressWarnings("all")
public class CustomOutputProvider implements IOutputConfigurationProvider {
  public final static String PLAY_OUTPUT = "PLAY_OUTPUT";
  
  /**
   * @return a set of {@link OutputConfiguration} available for the generator
   */
  @Override
  public Set<OutputConfiguration> getOutputConfigurations() {
    OutputConfiguration defaultOutput = new OutputConfiguration(IFileSystemAccess2.DEFAULT_OUTPUT);
    defaultOutput.setDescription("Output Folder");
    defaultOutput.setOutputDirectory("./src-gen");
    defaultOutput.setOverrideExistingResources(true);
    defaultOutput.setCreateOutputDirectory(true);
    defaultOutput.setCleanUpDerivedResources(true);
    defaultOutput.setSetDerivedProperty(true);
    OutputConfiguration onceOutput = new OutputConfiguration(CustomOutputProvider.PLAY_OUTPUT);
    onceOutput.setDescription("Output Folder (once)");
    onceOutput.setOutputDirectory("./app/genapi");
    onceOutput.setOverrideExistingResources(false);
    onceOutput.setCreateOutputDirectory(true);
    onceOutput.setCleanUpDerivedResources(false);
    onceOutput.setSetDerivedProperty(true);
    return Sets.<OutputConfiguration>newHashSet(defaultOutput, onceOutput);
  }
}

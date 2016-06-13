package de.htwg.mdsd.playgenmodel;

import com.google.common.collect.Sets;
import java.util.Set;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;

@SuppressWarnings("all")
public class CustomOutputProvider implements IOutputConfigurationProvider {
  public final static String PLAY_OUTPUT_APP_GENAPI = "PLAY_OUTPUT_APP_GENAPI";
  
  public final static String PLAY_OUTPUT_CONF_ROUTES = "PLAY_OUTPUT_CONF_ROUTES";
  
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
    OutputConfiguration genapiOut = new OutputConfiguration(CustomOutputProvider.PLAY_OUTPUT_APP_GENAPI);
    genapiOut.setDescription("app/genapi");
    genapiOut.setOutputDirectory("./app/genapi");
    genapiOut.setOverrideExistingResources(true);
    genapiOut.setCreateOutputDirectory(true);
    genapiOut.setCleanUpDerivedResources(false);
    genapiOut.setSetDerivedProperty(true);
    OutputConfiguration routesOut = new OutputConfiguration(CustomOutputProvider.PLAY_OUTPUT_CONF_ROUTES);
    routesOut.setDescription("conf");
    routesOut.setOutputDirectory("./conf");
    routesOut.setOverrideExistingResources(true);
    routesOut.setCreateOutputDirectory(true);
    routesOut.setCleanUpDerivedResources(false);
    routesOut.setSetDerivedProperty(true);
    return Sets.<OutputConfiguration>newHashSet(defaultOutput, genapiOut, routesOut);
  }
}

package runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.ConfigurationParameters;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import io.cucumber.core.options.Constants;

@Suite 
@IncludeEngines("cucumber")
@SelectPackages("features")
@ConfigurationParameters({
   @ConfigurationParameter(key=Constants.GLUE_PROPERTY_NAME, value="steps, shared"),
   @ConfigurationParameter (key="cucumber.snippet-type", value ="camelcase")
 })
public class RunCucumberTest {

}

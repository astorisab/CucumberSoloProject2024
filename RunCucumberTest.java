package otherproj;

// ENGINE BASED RUNNER EXECUTION IMPORTS
//import org.junit.platform.suite.api.ConfigurationParameter;
//import org.junit.platform.suite.api.IncludeEngines;
//import org.junit.platform.suite.api.SelectClasspathResource;
//import org.junit.platform.suite.api.Suite;
//import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

//JUNIT BASED STANDARD CUCUMBER EXECUTION IMPORTS
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// ENGINE BASED RUNNER EXECUTION ANNOTATIONS
//@Suite
//@IncludeEngines("cucumber")
//@SelectClasspathResource("otherproj")
//@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")

//JUNIT BASED STANDARD CUCUMBER EXECUTION ANNOTATIONS
@RunWith(Cucumber.class)
@CucumberOptions(
        features="classpath:otherproj",
        glue="",
        monochrome=true,
        dryRun=false,
        plugin= {
                "pretty",
                "html:target/cucumber",
                "json:target/cucumber.json"

        }
)

public class RunCucumberTest {
}

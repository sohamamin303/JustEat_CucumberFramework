package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "C:\\Selenium_Workspace\\automation\\src\\test\\java\\features\\SearchRestaurent.feature",
		glue="stepDefination"
		)
public class TestRunner {

}

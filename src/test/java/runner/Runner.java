package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/test_case_stori.feature",
		glue = "stepsdefinition"
		,tags= {"@complete"})
public class Runner {

}

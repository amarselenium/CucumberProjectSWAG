package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features = { "C:\\Users\\Amaresh\\eclipse-workspace\\CucumberSwag\\src\\test\\Resources\\Featurefiles\\SwLogin.feature"}, 
        glue = {	"stepdefination","helper"},
		plugin = {"html:target/cucumber-html-report","pretty", "json:target/cucumber-reports/Cucumber.json"},monochrome=true)

public class SwLoginRunner extends AbstractTestNGCucumberTests {

}

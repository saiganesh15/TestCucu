package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Training_H2a.06.17\\Desktop\\Selenium\\TestCucu\\Features\\Test.feature",
glue= {"StepDeifinition"},
plugin = {"pretty","json:target/CucuJenkins.json"}
	
)
public class TestRunner 
{

}

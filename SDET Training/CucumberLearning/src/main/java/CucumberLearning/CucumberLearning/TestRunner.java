package CucumberLearning.CucumberLearning;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "Feature/LoginScenario.feature")

public class TestRunner extends AbstractTestNGCucumberTests {

}

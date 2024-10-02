package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//        features = {"src/test/featureFiles"},
        features = {"src/test/featureFiles/signupPage.feature"},
        glue = {"stepDefinitions"},
        monochrome = true,
        plugin = {"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/"}
//        tags = "not @butterflyEffect"
)
public class TestRunner extends AbstractTestNGCucumberTests {

}

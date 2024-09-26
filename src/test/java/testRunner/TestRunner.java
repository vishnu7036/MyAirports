package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        features = {"src/test/featureFiles"},
        features = {"src/test/featureFiles/homePageCarouselCards.feature"},
        glue = {"stepDefinitions"},
        monochrome = true,
        plugin = {"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/"
        },
        tags = "not @butterflyEffect"
)
public class TestRunner {

}

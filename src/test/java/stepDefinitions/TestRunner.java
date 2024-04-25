package stepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        String path = ;
        features = "src/test/resources/Features",
        glue = {"stepDefinitions"},
        monochrome = true,
        plugin = {"pretty", "html:C:/Users/Mind-Graph/IdeaProjects/MyAirports/target/HtmlReports"}
)
public class TestRunner {

}

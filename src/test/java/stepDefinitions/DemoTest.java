package stepDefinitions;

import io.cucumber.java.en.*;

public class DemoTest {

    @Given("say given")
    public void say_given() {
        System.out.println("Hiii");
    }

    @When("say when")
    public void say_when() {
        System.out.println("Hiii");

    }

    @And("say and")
    public void say_and() {
        System.out.println("Hiii");

    }

    @Then("say then")
    public void say_then() {
        System.out.println("Hiii");

    }
}

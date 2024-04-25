package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.*;

public class DemoTest {
    @BeforeAll
    public void say_beforeAll() {
        System.out.println("Before All");
    }

    @Before
    public void say_Before() {
        System.out.println("Before");
    }

    @Given("say given")
    public void say_given() {
        System.out.println("given");
    }

    @When("say when")
    public void say_when() {
        System.out.println("when");
    }

    @And("say and")
    public void say_and() {
        System.out.println("and");
    }

    @Then("say then")
    public void say_then() {
        System.out.println("then");
    }

    @After
    public void say_after() {
        System.out.println("After");
    }

    @AfterAll
    public void say_afterAll() {
        System.out.println("Before All");
    }
}

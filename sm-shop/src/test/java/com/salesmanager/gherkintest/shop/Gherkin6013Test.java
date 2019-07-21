package com.salesmanager.gherkintest.shop;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.java8.En;

@RunWith(Cucumber.class)
@CucumberOptions(plugin="com.hpe.alm.octane.OctaneGherkinFormatter:gherkin-results\\ManualRunnerTest_OctaneGherkinResults.xml",
        features="src/test/resources/feature/Open live chat from FierFox-6013.feature")

public class Gherkin6013Test implements En{
    public Gherkin6013Test() {

        Given("payment security system is up", () -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("Works!");
        });

        Given("a customer named (.+)", (String customer) -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("Works!");
        });

        Given("I have at least one item in cart", () -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("Works!");
        });

        Given("I am logged in as (.+)", (String customer) -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("Works!");
        });

        When("I try to buy items in my cart", () -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("Works!");
        });

        Then("^I confirm my payment method (.+) and proceed to checkout\\.$", (String payment) ->
            System.out.println("Works!")
        );
    }
}

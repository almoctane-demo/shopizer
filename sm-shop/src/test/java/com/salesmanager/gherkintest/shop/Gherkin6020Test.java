package com.salesmanager.gherkintest.shop;

import cucumber.api.CucumberOptions;
import cucumber.api.java8.En;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin="com.hpe.alm.octane.OctaneGherkinFormatter:gherkin-results/Gherkin6020Test_OctaneGherkinResults.xml",
        features="src/test/resources/feature")

public class Gherkin6020Test implements En{
    public Gherkin6020Test() {

        Given("payment security system is up", () -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("Payment Security System Is Up!");
        });

        Given("a customer named (.+)", (String customer) -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("A customer named " + customer);
        });

        Given("I have at least one item in cart and I live in Singapore", () -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("I have at least one item in cart");
        });

        Given("I am logged in as (.+)", (String customer) -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("I am logged in as "+ customer);
        });

        When("I try to buy items in my cart", () -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("I try to buy items in my cart");
        });

        Then("^I confirm my payment method (.+) and proceed to checkout\\.$", (String payment) ->
                System.out.println("Works for " + payment)
        );
    }
}

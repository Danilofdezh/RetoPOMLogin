package com.phptravels.tests.stepdefinitions;

import com.phptravels.automation.steps.PhpTravelsPageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class retoPhpTravelsStepDefinitions {
    @Steps
    PhpTravelsPageSteps phpTravelsPageSteps;

    @Given("^that a user wants to enter the phptravels page$")
    public void thatAUserWantsToEnterThePhptravelsPage() {
        phpTravelsPageSteps.openBrowser();
    }

    @When("^fill in all the requested fields in the form$")
    public void fillInAllTheRequestedFieldsInTheForm() {
        phpTravelsPageSteps.fillFieldsInPhpTravelsPage();
    }

    @Then("^successful entry$")
    public void SuccessfulEntry() {

    }
}

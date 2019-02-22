package com.cath.kidston.bbd.StepDefinitions;

import com.cath.kidston.bbd.LogIn.LogIn;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;

public class LogInStepdefs {

    private LogIn login = new LogIn ();
    private String entereduserId;

    @Given("^i am on the login page$")
    public void iAmOnTheLoginPage ( ) {
        login.goToLoginPage ();
    }

    @When("^I enter my email id \"([^\"]*)\"$")
    public void i_enter_my_email_id (String username) {
        entereduserId = username;
        login.userID (username);
    }

    @When("^I enter my password \"([^\"]*)\"$")
    public void i_enter_my_password (String password) {

        login.password (password);
    }

    @Then("^I should be able navigate to registered user page$")
    public void i_should_be_able_navigate_to_registered_user_page ( ) {
        String getemailID = login.getLoginInfo ();
        assertThat ("not logged in registered user ", getemailID.equalsIgnoreCase (entereduserId));
    }


}

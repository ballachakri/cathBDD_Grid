package com.cath.kidston.bbd.StepDefinitions;

import com.cath.kidston.bbd.Register.Register;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class RegisterStepdefs {

    private Register register=new Register();

    @Given("^I am on the registration page$")
    public void i_am_on_the_registration_page ( ) {
    register.gotoRegisterPage ();
    }

    @When("^i enter all the required fields$")
    public void i_enter_all_the_required_fields (DataTable userdata) {
        List <List <String>> data=userdata.raw ();
        register.userEnterDetails ( data.get (1).get(0),data.get(1).get (1),data.get (1).get (2),data.get(1).get (3),data.get (1).get (4),data.get(1).get (5),data.get (1).get (6));
    }

    @Then("^i should be able to register and login$")
    public void i_should_be_able_to_register_and_login ( ) {
        System.out.println ("All the user data on the entered to submit");
    }
}
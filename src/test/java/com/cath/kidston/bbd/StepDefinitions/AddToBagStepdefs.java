package com.cath.kidston.bbd.StepDefinitions;

import com.cath.kidston.bbd.AddToBag.AddToBag;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class AddToBagStepdefs {

AddToBag addtobag=new AddToBag ();
    @And("^i will select a product randomly$")
    public void iWillSelectAProductRandomly ( ) {
     //addtobag.getProduct ();
     addtobag.getPrice ();
    }

    @Then("^the product should be added to shopping bag$")
    public void theProductShouldBeAddedToShoppingBag ( ) {
    }
}

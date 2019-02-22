package com.cath.kidston.bbd.StepDefinitions;

import com.cath.kidston.bbd.HeaderPage.SearchPage;
import com.cath.kidston.bbd.ResultsPage.ResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;

public class SearchStepDefs {

    private SearchPage spage = new SearchPage ();

    private ResultsPage rpage = new ResultsPage ();

    private String product;

    @Given("^i am on the home page$")
    public void i_am_on_the_home_page ( ) {
        String cURL = rpage.getPageURL ();
        assertThat (" not on home page", cURL.contains ("cathkidston.com"));

    }

    @When("^i search for  a product \"([^\"]*)\"$")
    public void iSearchForAProduct (String item) {
        spage.productSearch (item);
        product = item;
    }


    @Then("^i should see all the relevant products$")
    public void i_should_see_all_the_relevant_products ( ) {

        String getItem = rpage.getSearchedProduct ();

        assertThat ("searched wrong item", getItem.equalsIgnoreCase (product));


    }


}

package com.cath.kidston.bbd.StepDefinitions;

import com.cath.kidston.bbd.HeaderPage.SearchPage;
import com.cath.kidston.bbd.ResultsPage.ResultsPage;
import com.cath.kidston.bbd.SortByPricePage.SortByPrice;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;

public class SortByPriceStepdefs {

    SearchPage spage = new SearchPage ();

    ResultsPage rpage = new ResultsPage ();

    SortByPrice sprice = new SortByPrice ();

    String product;

    @Given("^I am on the home page$")
    public void iAmOnTheHomePage ( ) {
        String cURL = rpage.getPageURL ();
        assertThat (" not on home page", cURL.contains ("cathkidston.com"));
    }

    @When("^I search for the product \"([^\"]*)\"$")
    public void iSearchForTheProduct (String item) {
        spage.productSearch (item);
        product = item;

    }


    @Then("^I should view all the relevant products$")
    public void iShouldViewAllTheRelevantProducts ( ) {
        String getItem = rpage.getSearchedProduct ();
        assertThat ("searched wrong item", getItem.equalsIgnoreCase (product));

    }

    @When("^I select the price range \"([^\"]*)\"$")
    public void iSelectThePriceRange (String priceRange) {

        System.out.println ("price range selected for the test       " + priceRange);
        sprice.choosePriceRange ();


    }

    @Then("^I should see all the products within the selected price range$")
    public void iShouldSeeAllTheProductsWithinTheSelectedPriceRange ( ) {
    }

}

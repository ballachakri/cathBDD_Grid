package com.cath.kidston.bbd.ResultsPage;

import com.cath.kidston.bbd.DriverManager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultsPage extends DriverManager {


    @FindBy(xpath = "//*[@id=\"search_summary\"]/p/span")
    WebElement searchTxt;

    public String getPageURL ( ) {
        String curl = wDriver.getCurrentUrl ();
        return curl;
    }

    public String getSearchedProduct ( ) {
        return searchTxt.getText ();
    }


    public void getSortedByPrice ( ) {

    }

}

package com.cath.kidston.bbd.HeaderPage;

import com.cath.kidston.bbd.DriverManager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends DriverManager {


    @FindBy(xpath = "//input[@id='top_search']")
    WebElement stxt;

    @FindBy(xpath = "//*[@id=\"search\"]/fieldset/div/button")
    WebElement magnify;


    public void productSearch(String product)
    {
        stxt.sendKeys (product);
        magnify.click ();
    }
}

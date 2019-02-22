package com.cath.kidston.bbd.LogIn;

import com.cath.kidston.bbd.DriverManager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn extends DriverManager {

    @FindBy(xpath = "//*[@id='header_links']/li[4]/a")
    WebElement loginTxt;

    public void goToLoginPage ( ) {
        loginTxt.click ();
    }

    @FindBy(xpath = "//input[@name='j_username']")
    WebElement uid;

    @FindBy(xpath = "//*[@id='login_form']/fieldset/div[2]/div[1]/label")
    WebElement registerRadioButton;

    @FindBy(xpath = "//input[@id='j_password']")
    WebElement pwd;

    @FindBy(xpath = "//button[@class='submit button btn btn_primary btn_large btn_block']")
    WebElement loginSubmit;


    public void userID (String userid) {
        uid.sendKeys (userid);
        registerRadioButton.click ();
    }

    public void password (String password) {
        pwd.sendKeys (password);
        loginSubmit.click ();
    }

    @FindBy(xpath = "//div[@id='account']")
    WebElement accountInfo;

    public String getLoginInfo ( ) {
        // temporary assert
        String email = wDriver.findElement (By.xpath ("//*[@id='account']/div[2]/div[1]/dl/dd")).getText ();
        return email;

        // Assert --  need to work on whole user data -- getting all the info need to add to ArrayList and compare in different combinations
        //   System.out.println (accountInfo.getText ());

    }
}




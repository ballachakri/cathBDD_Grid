package com.cath.kidston.bbd.Register;

import com.cath.kidston.bbd.DriverManager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class RegisterDataFromExcel extends DriverManager {
    @FindBy(xpath = "//*[@id='header_links']/li[4]/a")
    WebElement register;

    @FindBy(xpath = "//*[@id='login_form']/fieldset/div[2]/div[2]/label")
    WebElement registerRadio;

    @FindBy(xpath = "//input[@id='j_username']")
    WebElement email;

    @FindBy(xpath = "//select[@id='title']")
    WebElement title;

    @FindBy(xpath = "//input[@id='first_name']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='last_name']")
    WebElement lastName;

    @FindBy(xpath = "//input[@id='telephone_number']")
    WebElement telNumber;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='confirm_password']")
    WebElement cpassword;

    public void gotoRegisterPage ( ) {
//        register.click ();

    }
    public void userEnterDetails (String e_mail,String mtitle, String fname,String lname, String tnum,String pwd, String cpwd ) {
        email.sendKeys (e_mail);
        registerRadio.click ();
        Select drop = new Select (title);
        drop.selectByVisibleText (mtitle);
        firstName.sendKeys (fname);
        lastName.sendKeys (lname);
        telNumber.sendKeys (tnum);
        password.sendKeys (pwd);
        cpassword.sendKeys (cpwd);

        wDriver.manage ().timeouts ().implicitlyWait (5000, TimeUnit.MILLISECONDS);
    }
}

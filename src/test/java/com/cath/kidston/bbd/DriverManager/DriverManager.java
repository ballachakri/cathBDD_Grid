package com.cath.kidston.bbd.DriverManager;

import cucumber.api.java.gl.E;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class DriverManager {

    public static WebDriver wDriver;

    private String browser = "chrome";

    // to initialize page factory

    public DriverManager()
    {
        PageFactory.initElements (wDriver,this);

    }

    // To choose the browser
    public void chooseBrowser ( ) {
        switch (browser) {
            case "chrome": {
                System.setProperty ("webdriver.chrome.driver", "C:\\Users\\sball\\Downloads\\chromedriver_win32\\chromedriver.exe");
                wDriver = new ChromeDriver ();
                break;
            }
            case "ie": {
                System.setProperty ("webdriver.ie.driver", "C:\\Users\\sball\\Downloads\\microsoftwebdriver.exe");
                wDriver = new InternetExplorerDriver ();
                break;
            }
            case "safari": {
                wDriver = new SafariDriver ();
                break;
            }
            default: {
                System.setProperty ("webdriver.gecko.driver", "C:\\Users\\sball\\Downloads\\geckodriver-v0.22.0-win64\\geckodriver.exe");
                wDriver = new FirefoxDriver ();
                break;
            }
        }
    }


    // to  open the website
    public void openHomePage (String homepageURL)
    {
        wDriver.get (homepageURL);
    }

    // to maximize browser
    public void maxBrowser ( ) {
        wDriver.manage ().window ().maximize ();

    }

   public void killCookies() {
       WebElement ele=wDriver.findElement (By.xpath ("//div[@class='cookie_policy_x']"));
       ele.click ();
   }


    public void waitForCookie() {
             wDriver.manage ().timeouts ().implicitlyWait (5000,TimeUnit.MILLISECONDS);
    }

    public void takeScrShot() throws IOException {
        TakesScreenshot ts=(TakesScreenshot)wDriver;
        File scrShotFile=ts.getScreenshotAs (OutputType.FILE);
        FileHandler.copy (scrShotFile, new File ("C:\\Users\\sball\\IdeaProjects\\cathbdd\\src\\test\\java\\com\\cath\\kidston\\bbd\\ScreenShot\\screenShot.png"));

    }

    // to close the browser
    public void closeBrowser ( ) {

        wDriver.quit ();
    }

}



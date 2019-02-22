package com.cath.kidston.bbd.Hooks;


import com.cath.kidston.bbd.DriverManager.DriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;
import java.net.MalformedURLException;

public class Hooks {

    private DriverManager dManager = new DriverManager ();

    // to set up the browser with website name
    @Before
    public void setUpTheBrowser ( ) throws MalformedURLException {
        dManager.chooseBrowser ();
        dManager.maxBrowser ();
        dManager.openHomePage ("https://www.cathkidston.com/");
        dManager.waitForCookie ();
        dManager.killCookies ();
    }

    // to close the browser
    @After
    public void tearDownBrowser(Scenario scene) throws IOException {
    if(scene.isFailed ()) {
    dManager.takeScrShot ();
    }
    dManager.closeBrowser ();
    }

}

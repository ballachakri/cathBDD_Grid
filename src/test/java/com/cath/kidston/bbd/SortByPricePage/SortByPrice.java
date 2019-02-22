package com.cath.kidston.bbd.SortByPricePage;

import com.cath.kidston.bbd.DriverManager.DriverManager;
import gherkin.lexer.Ar;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SortByPrice extends DriverManager {


    // scroll down the web page
    @FindBy(xpath = "//div[@id='slider-spb']")
    WebElement slideBar;


    public static void scroll ( ) {
        JavascriptExecutor js = (JavascriptExecutor) wDriver;
        js.executeScript ("window.scrollBy(0,1250)");
        }

    // working with slide bar using dragAndDropBy of Actions class
    public void choosePriceRange ( ) {

        WebElement barLength = wDriver.findElement (By.xpath ("//div[@id='slider-spb']"));
        int priceRange=barLength.getSize ().getWidth ();

        System.out.println ("total sise of the bar  : " +priceRange);


        List<WebElement> rangeList=wDriver.findElements (By.xpath ("//div[@class='sli-range-slider-tick' ]"));
        int maxPrice=rangeList.size ()+6;
        System.out.println ("price range  : " + maxPrice);





        WebElement slideBar = wDriver.findElement (By.xpath ("//*[@id='slider-spb']/div[1]/a[1]"));
        Actions moveSlider = new Actions (wDriver);
        moveSlider.dragAndDropBy (slideBar, 262, 0).build ().perform ();
    }

    // working with slide bar using clickAndHold and Release of Actions class
    public void method2 ( ) {

        WebElement slider = wDriver.findElement (By.xpath ("//*[@id='slider-spb']/div[1]/a[1]"));
        Actions action = new Actions (wDriver);
        action.clickAndHold (slider).moveByOffset (150, 0).release ().perform ();


    }
}

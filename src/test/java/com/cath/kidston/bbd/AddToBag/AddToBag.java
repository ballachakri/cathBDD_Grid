package com.cath.kidston.bbd.AddToBag;

import com.cath.kidston.bbd.DriverManager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AddToBag extends DriverManager {

    public void selectRandomProduct ( ) {


    }

    public void getProduct ( ) {

        List <WebElement> productList = wDriver.findElements (By.xpath ("//img[@class='product_image']"));
        ArrayList <String> getDiplayedProduct = new ArrayList <> ();
        for (WebElement ele : productList) {
            String prdtitle = ele.getAttribute ("title");    //.getText ();
            getDiplayedProduct.add (prdtitle);
        }
        for (int i = 0; 1 < getDiplayedProduct.size (); i++) {
            System.out.println (getDiplayedProduct.get (i));
        }


    }


    public void getPrice() {
        {
        List<WebElement> priceList =wDriver.findElements (By.xpath ("//p[@class='product_price']"));
        ArrayList<Double> getDisplayedPrice=new ArrayList <> ();
        for(WebElement ele: priceList)
        {
            String sprice=ele.getText ();
            System.out.println (sprice);
        }
         //   double price= Double.P
        }




    }
}


package com.herokupp.login.pages;

import com.herokupp.login.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By LOGINbutton = By.xpath("//i[@class=\"fa fa-2x fa-sign-in\"]");

        public void clickOnLoginLink(){
        clickOnElement(LOGINbutton);
    }

     }







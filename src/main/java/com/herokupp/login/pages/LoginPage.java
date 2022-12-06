package com.herokupp.login.pages;

import com.herokupp.login.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {


    By UsernameField =  By.name("username");

    By passwordField = By.name("password");

    By signinButton = By.xpath("//input[@type='submit']");

    By LOGINbutton = By.xpath("//i[@class=\"fa fa-2x fa-sign-in\"]");

    By secureMessage = By.xpath("//*[@id=\"content\"]/div/h2");

    By errorMessage= By.xpath("//div[contains(text(),'Your username is invalid!')]");

    By errorMessagepassword=By.xpath("//div[contains(text(),'Your password is invalid!')]");




    public void enterEmailId(String Username){
        sendTextToElement(UsernameField,Username);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }

    public void clickOnlogin(){
        clickOnElement(LOGINbutton);


    }
    public String verifyMessage(){
        return getTextFromElement(secureMessage);
    }

    public String verifyErrorMessage(){
        return getTextFromElement(errorMessage);
    }

    public String verifyErrorMessage1(){
        return getTextFromElement(errorMessagepassword);
    }

}






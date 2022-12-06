package com.herokupp.login.testsuite;

import com.herokupp.login.pages.HomePage;
import com.herokupp.login.pages.LoginPage;
import com.herokupp.login.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    HomePage homepage = new HomePage();

    LoginPage loginpage = new LoginPage();

    @Test

    public void UserSholdLoginSuccessfullyWithValidCredentials(){

        homepage.clickOnLoginLink();
        loginpage.enterEmailId("tomsmith");
        loginpage.enterPassword("SuperSecretPassword!");
        loginpage.clickOnlogin();
        String expectedText="Secure Area";
        String actualText=loginpage.verifyMessage();
        Assert.assertEquals(actualText,expectedText,"Secure Area");


    }
@Test
    public void UserSholdLoginSuccessfullyWithInValidCredentials() {

        homepage.clickOnLoginLink();
        loginpage.enterEmailId("tomsmith1");
        loginpage.enterPassword("SuperSecretPassword!");
        loginpage.clickOnlogin();
      String expectedText ="Your username is invalid!";
       String actualText = loginpage.verifyErrorMessage();
     Assert.assertEquals(loginpage.verifyErrorMessage(),"Your username is invalid!\n" +
            "×","not verify");

    }

    @Test

    public void UserSholdLoginSuccessfullyWithInValidCredentialsp() {

        homepage.clickOnLoginLink();
        loginpage.enterEmailId("tomsmith");
        loginpage.enterPassword("SuperSecretPassword");
        loginpage.clickOnlogin();
        String expectedText ="Your password is invalid!";
        String actualText = loginpage.verifyErrorMessage1();
        Assert.assertEquals(loginpage.verifyErrorMessage1(),"Your password is invalid!\n" +
                "×","not verify");



    }


    }

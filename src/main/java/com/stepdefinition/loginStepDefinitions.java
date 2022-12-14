package com.stepdefinition;
import com.base.TestBase;
import com.webpages.*;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import static com.base.TestBase.driver;


public class loginStepDefinitions {







   // LoginPage loginPage=new LoginPage();


    @Given("^I launch URL$")
    public static void initializeBrowser()
    {
        TestBase base=new TestBase();
        base.initializeBrowser();

    }

    @And("^I register new User$")
    public static void register()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.register();

    }

    @Then("^I log off from application")
    public static void logoffApp()
    {
        TestBase base=new TestBase();
        base.logOff();

    }

    @And("^I login with \"([^\"]*)\" \"([^\"]*)\"$")
    public static void loginUser(String user,String password)
    {
        UserPage userPage=new UserPage(driver);
        userPage.loginUser(user, password);

    }

    @And("^I Sign off$")
    public static void signOffFunct()
    {
        UserPage userPage=new UserPage(driver);
        userPage.signOff();

    }

    @Before
    public void beforeLaunch()
    {

        System.out.println("Before hooks");
    }
    @After
    public void afterQuit()
    {
        driver.quit();
        System.out.println("After hooks");
    }

}

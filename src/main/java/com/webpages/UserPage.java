package com.webpages;

import com.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage extends TestBase {
    WebDriver driver;
    public UserPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='SIGN-OFF']")
    public WebElement signoff;

    @FindBy(xpath = "//input[@name='userName']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submit;

    public void loginUser(String user, String pswd)
    {
        waitseconds();
        username.sendKeys(user);


        password.sendKeys(pswd);


        submit.click();
    }

    public void signOff()
    {

        signoff.click();
    }

}

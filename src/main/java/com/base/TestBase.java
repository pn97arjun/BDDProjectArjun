package com.base;



import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;


import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;

    public static void initializeBrowser()
    {
        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/newtours/index.php");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static void logOff()
    {
        System.out.println("Quiting");
        driver.quit();
    }


    public void waitforElement(WebElement e)
    {
        WebDriverWait wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(e.toString())));

    }

    public void waitseconds()
    {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.wait(5000);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    /*public void switchWindow()
    {
        for(String windowHandle:driver.getWindowHandles())
        {
            driver.switchTo().window(windowHandle);
            driver.switchTo().defaultContent();
        }
    }
    public void switchFrame(String frameId)
    {
        driver.switchTo().defaultContent();
        driver.switchTo().frame(frameId);
    }
*/

   /* public static void browserInitialize()
    {
        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/newtours/index.php");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }*/


}

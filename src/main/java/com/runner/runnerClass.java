package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/cucumber-reports","json:target/cucumber-json/cucumber.json","junit:target/cucumber.xml"},
        glue={"src.main.java.com.stepdefinition"},
        features = {"src/main/resources/Features"},
        tags="@Test1",
publish = true)
public class runnerClass {


}

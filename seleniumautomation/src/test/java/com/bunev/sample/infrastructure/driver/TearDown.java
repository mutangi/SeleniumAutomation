package com.bunev.sample.infrastructure.driver;

import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class TearDown {

    private WebDriver driver;

    public TearDown() {
        this.driver = Setup.driver;
    }

    @AfterClass
    public void quitDriver(Scenario scenario) {
        System.out.println("===== Driver quit =====");
        this.driver.quit();
    }

    //TODO add takeScreenshot() method
}

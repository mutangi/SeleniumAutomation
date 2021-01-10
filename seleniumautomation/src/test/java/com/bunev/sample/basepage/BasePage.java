package com.bunev.sample.basepage;

import com.bunev.sample.infrastructure.driver.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {
        this.driver = Setup.driver;
        this.wait = Setup.wait;
    }
}

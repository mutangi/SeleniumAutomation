package com.bunev.sample.infrastructure.driver;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Setup {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public static WebDriver getInstance() {
        return Setup.driver;
    }

    @Before
    public void setWebDriver() {

        String browser = System.getProperty("browser");
        if (browser == null) {
            browser = "chrome";
        }
        if (driver != null) {
            return;
        }
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("start-maximized");
                driver = new ChromeDriver(chromeOptions);
                wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
                System.out.println("===== Driver created =====");
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                driver.manage().window().maximize();
                break;
            default:
                throw new IllegalArgumentException("Browser \"" + browser + "\" isn't supported.");
        }
    }
}

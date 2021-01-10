package com.bunev.sample.page;

import com.bunev.sample.basepage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class XFashionLoginPage extends BasePage {

    private static final String LOGIN_PAGE_URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

    public XFashionLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    WebElement usernameField;
    @FindBy(id = "passwd")
    WebElement passwordField;
    @FindBy(id = "SubmitLogin")
    public WebElement submitLoginBtn;


    public void goToLoginPage() {
        driver.get(LOGIN_PAGE_URL);
    }

    public void loginWithCredentials(String username, String password) {
        wait.until(ExpectedConditions.visibilityOfAllElements(usernameField, passwordField));
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

}

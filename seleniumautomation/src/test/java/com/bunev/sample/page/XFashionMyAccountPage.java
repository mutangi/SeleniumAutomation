package com.bunev.sample.page;

import com.bunev.sample.basepage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class XFashionMyAccountPage extends BasePage {

    @FindBy(css = ".account")
    public WebElement accountLabel;

    public XFashionMyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public void verifyLogin() {
        wait.until(ExpectedConditions.visibilityOf(accountLabel));
        Assert.assertEquals(accountLabel.getText(), "Test Netomedia");
    }
}

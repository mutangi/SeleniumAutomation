package com.bunev.sample.page;

import com.bunev.sample.basepage.BasePage;
import com.bunev.sample.step_definitions.CommonSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class XFashionHomePage extends BasePage {

    CommonSteps commonSteps;

    private static final String HOME_PAGE_URL = "http://automationpractice.com/index.php";

    @FindBy(css = ".login")
    public WebElement signInBtn;

//  @FindBy(xpath = "//img[contains(@title,'Printed Summer Dress')]")
//  public WebElement printedSummerDressSection;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[5]/div/div[2]/h5/a")
    public WebElement printedSummerDressSection;

    public XFashionHomePage() {
        PageFactory.initElements(driver, this);
    }

    public void goToHomePage() {
        driver.get(HOME_PAGE_URL);
    }

    public void navigateToPrintedSummerDressSection() {
        wait.until(ExpectedConditions.elementToBeClickable(printedSummerDressSection));
        printedSummerDressSection.click();
    }

}

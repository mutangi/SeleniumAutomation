package com.bunev.sample.step_definitions;

import com.bunev.sample.basepage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CommonSteps extends BasePage {

    public void clickElement(WebElement clickLocator) {
        wait.until(ExpectedConditions.elementToBeClickable(clickLocator));
        clickLocator.click();
    }
}

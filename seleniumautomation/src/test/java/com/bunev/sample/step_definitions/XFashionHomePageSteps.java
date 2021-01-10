package com.bunev.sample.step_definitions;

import com.bunev.sample.page.XFashionHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class XFashionHomePageSteps {

    private XFashionHomePage xFashionHomePage;
    private CommonSteps commonSteps;

    public XFashionHomePageSteps() {
        this.xFashionHomePage = new XFashionHomePage();
        this.commonSteps = new CommonSteps();
    }

    @Given("^I click sign button on home page")
    public void clickOn() {
        commonSteps.clickElement(xFashionHomePage.signInBtn);
    }

    @And("^I navigate to XFashion homepage")
    public void goToHomePage() {
        xFashionHomePage.goToHomePage();
    }


    @And("^I navigate to printed summer dresses section")
    public void navigateToPrintedSummerDressSection() {
        xFashionHomePage.navigateToPrintedSummerDressSection();
    }
}

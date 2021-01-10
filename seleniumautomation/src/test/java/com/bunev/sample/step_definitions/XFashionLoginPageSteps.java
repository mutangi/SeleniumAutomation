package com.bunev.sample.step_definitions;

import com.bunev.sample.page.XFashionLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class XFashionLoginPageSteps {

    private XFashionLoginPage xFashionLoginPage;
    private CommonSteps commonSteps;

    public XFashionLoginPageSteps() {
        this.xFashionLoginPage = new XFashionLoginPage();
        this.commonSteps = new CommonSteps();
    }

    @Then("^I login with username (.*) and password (.*)")
    public void loginWithCredentials(String username, String password) {
        xFashionLoginPage.loginWithCredentials(username, password);
    }

    @And("^I navigate to login page")
    public void goToLoginPage() {
        xFashionLoginPage.goToLoginPage();
    }

    @And("^I click on submit button")
    public void clickOnSubmitBtn() {
        commonSteps.clickElement(xFashionLoginPage.submitLoginBtn);
    }

}

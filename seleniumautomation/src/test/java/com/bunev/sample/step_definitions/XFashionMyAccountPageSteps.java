package com.bunev.sample.step_definitions;

import com.bunev.sample.page.XFashionMyAccountPage;
import io.cucumber.java.en.And;

public class XFashionMyAccountPageSteps {

    private XFashionMyAccountPage xFashionMyAccountPage;
    private CommonSteps commonSteps;

    public XFashionMyAccountPageSteps() {
        this.xFashionMyAccountPage = new XFashionMyAccountPage();
        this.commonSteps = new CommonSteps();
    }

    @And("^I verify successful login")
    public void verifyLogin() {
        xFashionMyAccountPage.verifyLogin();
    }
}

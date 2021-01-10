package com.bunev.sample.step_definitions;

import com.bunev.sample.page.XFashionProductPage;
import io.cucumber.java.en.And;

public class XFashionProductPageSteps {

    private XFashionProductPage xFashionProductPage;
    private CommonSteps commonSteps;

    public XFashionProductPageSteps() {
        this.xFashionProductPage = new XFashionProductPage();
        this.commonSteps = new CommonSteps();
    }

    @And("^I verify that discount is calculated correctly")
    public void checkDiscountCalculation() {
        xFashionProductPage.checkDiscountCalculation();
    }

    @And("^I add printed summer dress to cart")
    public void addPrintedSummerDressToCart() {
        commonSteps.clickElement(xFashionProductPage.addToCartBtn);
        commonSteps.clickElement(xFashionProductPage.proceedToCheckoutBtn);
    }
}

package com.bunev.sample.page;

import com.bunev.sample.basepage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class XFashionProductPage extends BasePage {

    @FindBy(css = ".special-price")
    private WebElement printedSummerDressPrice;

    @FindBy(css = ".price-percent-reduction")
    private WebElement printedSummerDressProductDiscount;

    @FindBy(css = ".old-price")
    private WebElement printedSummerDressOldPrice;

    @FindBy(id = "add_to_cart")
    public WebElement addToCartBtn;

    @FindBy(xpath = "//span[contains(text(),\"Proceed to checkout\")]")
    public WebElement proceedToCheckoutBtn;

    public XFashionProductPage() {
        PageFactory.initElements(driver, this);
    }


    public void checkDiscountCalculation() {

        wait.until(ExpectedConditions.visibilityOfAllElements(printedSummerDressPrice, printedSummerDressOldPrice, printedSummerDressProductDiscount));

        String priceString = printedSummerDressPrice.getText().substring(1);
        String oldPriceString = printedSummerDressOldPrice.getText().substring(1);
        String discountString = printedSummerDressProductDiscount.getText().replaceAll("[^0-9]", "");

        double price = Double.parseDouble(priceString);
        double oldPrice = Double.parseDouble(oldPriceString);
        int discount = Integer.parseInt(discountString);

        Assert.assertTrue(verifyDiscountCalculatedCorrectly(price, discount, oldPrice));
    }

    /**
     * Helper method for calculating the discount percentage by this formula: ((b - a) * 100) / a
     */
    private boolean verifyDiscountCalculatedCorrectly(double price, int discount, double oldPrice) {

        double percentageDiscount = (oldPrice - price) * 100 / price;

        return Math.round(percentageDiscount) == discount;
    }
}

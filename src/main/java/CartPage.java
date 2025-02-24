package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends pages.BasePage {

    @FindBy(xpath = "//button[text()='Place Order']")
    private WebElement placeOrderButton;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void proceedToCheckout() {
        clickButton(placeOrderButton);
    }
}

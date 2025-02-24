package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends pages.BasePage {

    @FindBy(id = "name")
    private WebElement nameField;

    @FindBy(id = "country")
    private WebElement countryField;

    @FindBy(id = "city")
    private WebElement cityField;

    @FindBy(id = "card")
    private WebElement cardField;

    @FindBy(id = "month")
    private WebElement monthField;

    @FindBy(id = "year")
    private WebElement yearField;

    @FindBy(xpath = "//button[text()='Purchase']")
    private WebElement purchaseButton;

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void completePurchase(String name, String country, String city, String card, String month, String year) {
        enterText(nameField, name);
        enterText(countryField, country);
        enterText(cityField, city);
        enterText(cardField, card);
        enterText(monthField, month);
        enterText(yearField, year);
        clickButton(purchaseButton);
    }
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends pages.BasePage {

    @FindBy(xpath = "//a[text()='Samsung galaxy s6']")
    private WebElement productLink;

    @FindBy(xpath = "//a[text()='Add to cart']")
    private WebElement addToCartButton;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void selectProduct() {
        clickButton(productLink);
    }

    public void addToCart() {
        clickButton(addToCartButton);
    }
}

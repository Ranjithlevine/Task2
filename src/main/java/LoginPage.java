package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends pages.BasePage {

    @FindBy(id = "loginusername")
    private WebElement usernameField;

    @FindBy(id = "loginpassword")
    private WebElement passwordField;

    @FindBy(xpath = "//button[text()='Log in']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        enterText(usernameField, username);
        enterText(passwordField, password);
        clickButton(loginButton);
    }
}

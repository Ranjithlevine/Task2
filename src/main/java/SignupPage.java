package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends pages.BasePage {

    @FindBy(id = "sign-username")
    private WebElement usernameField;

    @FindBy(id = "sign-password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[text()='Sign up']")
    private WebElement signupButton;

    public SignupPage(WebDriver driver) {
        super(driver);
    }

    public void signUp(String username, String password) {
        enterText(usernameField, username);
        enterText(passwordField, password);
        clickButton(signupButton);
    }
}

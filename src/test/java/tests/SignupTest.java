package tests;

import org.testng.annotations.Test;
import pages.SignupPage;

public class SignupTest extends BaseTest {

    @Test
    public void testSignup() {
        SignupPage signupPage = new SignupPage(driver);
        signupPage.signUp("testUser123", "Test@123");
    }
}

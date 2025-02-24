package tests;

import org.testng.annotations.Test;
import pages.CheckoutPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void testCheckout() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.completePurchase("John Doe", "USA", "New York", "1234-5678-9876-5432", "12", "2026");
    }
}

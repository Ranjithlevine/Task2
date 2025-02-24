package tests;

import org.testng.annotations.Test;
import pages.CartPage;

public class CartTest extends BaseTest {

    @Test
    public void testProceedToCheckout() {
        CartPage cartPage = new CartPage(driver);
        cartPage.proceedToCheckout();
    }
}

package tests;

import org.testng.annotations.Test;
import pages.ProductPage;

public class ProductTest extends BaseTest {

    @Test
    public void testProductSelection() {
        ProductPage productPage = new ProductPage(driver);
        productPage.selectProduct();
        productPage.addToCart();
    }
}

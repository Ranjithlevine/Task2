package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class LogoutTest extends BaseTest {

    @Test
    public void testLogout() {
        driver.findElement(By.id("logout2")).click();
    }
}

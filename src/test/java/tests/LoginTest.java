package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ExcelUtils;

public class LoginTest extends BaseTest {

    @DataProvider(name = "LoginData")
    public Object[][] getLoginData() {
        return new Object[][]{
                {ExcelUtils.getCellData("LoginData", 1, 0), ExcelUtils.getCellData("LoginData", 1, 1)},
                {ExcelUtils.getCellData("LoginData", 2, 0), ExcelUtils.getCellData("LoginData", 2, 1)}
        };
    }

    @Test(dataProvider = "LoginData")
    public void testLogin(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);
    }
}

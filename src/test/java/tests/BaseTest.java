package tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.BrowserFactory;
import utils.ReportsManager;
import utils.ScreenshotUtil;
import com.aventstack.extentreports.Status;

public class BaseTest {
    protected WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void setUp(String browser) {
        ReportsManager.startTest(this.getClass().getSimpleName());
        driver = BrowserFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            String screenshotPath = ScreenshotUtil.captureScreenshot(driver, result.getName());
            ReportsManager.getTest().log(Status.FAIL, "Test Failed. Screenshot: " + screenshotPath);
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            ReportsManager.getTest().log(Status.PASS, "Test Passed");
        }
        if (driver != null) {
            driver.quit();
        }
        ReportsManager.flushReports();
    }
}

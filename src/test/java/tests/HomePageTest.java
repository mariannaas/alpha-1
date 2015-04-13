package tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.MethodRule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import utils.ScreenshotOnFailureRule;
import utils.WebDriverFactory;

/**
 * Created by sergey on 23.03.15.
 */
public class HomePageTest extends BaseTest {

    HomePage homePage;
    MethodRule takeScreenshotRule = new ScreenshotOnFailureRule();

    @Test
    public void checkHeaderIsDisplayed()  {
        homePage = new HomePage(super.driver);
        Assert.assertTrue(homePage.getHeaderScreen().isDisplayed());
    }
    @Test
    public void clickSearchButton(){

    }

}

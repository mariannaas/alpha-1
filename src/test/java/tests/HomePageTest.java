package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import utils.WebDriverFactory;

/**
 * Created by sergey on 23.03.15.
 */
public class HomePageTest extends BaseTest {

    HomePage homePage;

    @Test
    public void checkHeaderIsDisplayed()  {
        homePage = new HomePage(super.driver);
        Assert.assertTrue(homePage.getHeaderScreen().isDisplayed());

    }

}

package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import utils.WebDriverFactory;

/**
 * Created by sergey on 23.03.15.
 */
public class HomePageTest extends BaseTest {

    HomePage homePage = new HomePage(super.driver);

    @Test
    public void clickSearchButtonTest()  {
       // driver.wait(); //The search button is not found by
        homePage.clickSearchButton();

    }

}

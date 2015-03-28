package tests;

import org.junit.Test;
import pages.HomePage;
import utils.WebDriverFactory;

/**
 * Created by sergey on 23.03.15.
 */
public class HomePageTest extends BaseTest {

    HomePage homePage = new HomePage(super.driver);

    @Test
    public void clickSearchButtonTest()  {
        homePage.clickSearchButton();

    }

}

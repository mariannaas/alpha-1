package tests;

import org.junit.Test;
import pages.HomePage;

/**
 * Created by sergey on 23.03.15.
 */
public class HomePageTest extends BaseJunitTest {

    HomePage homePage;

    @Test
    public void goToHomePageTest(){
        homePage.init();

    }

}

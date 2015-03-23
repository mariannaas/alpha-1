package tests;

import org.junit.After;
import org.junit.Before;
import utils.WebDriverFactory;

/**
 * Created by sergey on 23.03.15.
 */
public class BaseJunitTest {
    @Before
    public void startBrowser(){
        WebDriverFactory.startBrowser();
    }

    @After
    public void tearDown(){
        WebDriverFactory.finishBrowser();
    }

}

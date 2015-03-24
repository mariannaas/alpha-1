package tests;

import org.junit.After;
import org.junit.Before;
import utils.PropertiesLoader;
import utils.WebDriverFactory;

/**
 * Created by sergey on 23.03.15.
 */
public class BaseJunitTest {
    @Before
    public void startBrowser(){
        WebDriverFactory.startBrowser();

        String base_url = PropertiesLoader.loadProperties("application.properties").getProperty("base.url");
        WebDriverFactory.getDriver().get(base_url);
        //??how we should navigate to main page
    }

    @After
    public void tearDown(){
        WebDriverFactory.finishBrowser();
    }

}

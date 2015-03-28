package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import utils.Browser;
import utils.PropertiesLoader;
import utils.WebDriverFactory;

/**
 * Created by sergey on 23.03.15.
 */
public class BaseTest {
     protected WebDriver driver ;

    @Before
    public void startBrowser(){
        WebDriverFactory.startBrowser(Browser.CHROME);
        String base_url = PropertiesLoader.loadProperties("application.properties").getProperty("base.url");
        WebDriverFactory.getDriver().get(base_url);
        driver = WebDriverFactory.getDriver();
    }

    @After
    public void tearDown(){
        WebDriverFactory.finishBrowser();
    }

}

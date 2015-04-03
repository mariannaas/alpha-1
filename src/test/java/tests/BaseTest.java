package tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import utils.Browser;
import utils.PropertiesLoader;
import utils.WebDriverFactory;

/**
 * Created by sergey on 23.03.15.
 */
public class BaseTest {
    public  WebDriver driver ;

    @Before
    public void startBrowser() {
        WebDriverFactory.startBrowser(Browser.FIREFOX);
        driver = WebDriverFactory.getDriver();
        driver.manage().window().maximize();
        String base_url = PropertiesLoader.loadProperties("application.properties").getProperty("base.url");
        driver.get(base_url);
    }

    @After
    public void tearDown(){
        WebDriverFactory.finishBrowser();
    }



}

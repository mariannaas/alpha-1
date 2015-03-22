package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

/**
 * Created by mariannas on 22.03.15.
 */
public class FirstTestCase {

    @Test
    public void testWebPage(){
        FirefoxProfile firefoxProfile = new FirefoxProfile();

        WebDriver driver = new FirefoxDriver(firefoxProfile);

        driver.get("http://myshka91.wix.com/testframe2");
//http://myshka91.wix.com/testframe2
        Assert.assertTrue(driver.getCurrentUrl().contains("testframe2"));

        driver.quit();



    }
}

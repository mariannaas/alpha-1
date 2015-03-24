package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by sergey on 23.03.15.
 */
public class WebDriverFactory {

    private static WebDriver driver;
    private static final long IMPLICIT_WAIT_TIMEOUT = 10;

    public static WebDriver getDriver(){
        if(driver != null){
            driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT_TIMEOUT, TimeUnit.SECONDS);
            return driver;
        }
        else {
            throw new IllegalStateException("Driver has not been initialized. " +
                    "Please call WebDriverFactory.startBrowser() before use this method");
        }
    }


    public static void startBrowser(){
        if (driver==null){
            driver = new FirefoxDriver();
        }
        else {
            throw new IllegalStateException("Driver has already been initialized. Quit it before using this method");
        }
    }


    public static void finishBrowser() {
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
}

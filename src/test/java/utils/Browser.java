package utils;

import org.junit.Assert;

/**
 * Created by sergey on 23.03.15.
 */
public enum Browser {

    FIREFOX("firefox"),
    CHROME("chrome");

    private String browserName;

    Browser(String browserName) {
         this.browserName = browserName;
    }

    public String getBrowserName(){
        return browserName;
    }

    public static Browser getByName (String name){
        for (Browser browser : values()){
            if(browser.getBrowserName().equalsIgnoreCase(name)){
                return browser;
            }
        }
        Assert.fail("Browser " + name + " doesn't support by test framework");
        return null;
    }
}

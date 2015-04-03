package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sivashchenko on 3/22/2015.
 */
public abstract class BasePage {
    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id ="mainPageinlineContent")
    private WebElement mainPageContent;


    public abstract void init();
    public WebDriver getDriver(){
        return driver;
    }
}

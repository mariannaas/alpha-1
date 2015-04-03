package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverFactory;

/**
 * Created by mariannas on 23.03.15.
 */
public class HomePage{
    private WebDriver driver;

    public HomePage(WebDriver driver) {
       this.driver = driver;
       PageFactory.initElements(driver, this);
    }
    @FindBy(id = "check-in")
    private WebElement checkInDate;

    @FindBy(id = "check-out")
    private WebElement checkOutDate;

    @FindBy(xpath = "//div[@bi='SET_ADULTS']/a[@class='up']")
    private WebElement adultsNumberUpButton;

    @FindBy(xpath = "//div[@bi='SET_ADULTS']/a[@class='down']")
    private WebElement adultsNumberDownButton;

    @FindBy(xpath = "//div[@bi='SET_KIDS']/a[@class='up']")
    private WebElement kidsNumberUpButton;

    @FindBy(xpath = "//div[@bi='SET_KIDS']/a[@class='down']")
    private WebElement kidsNumberDownButton;

    @FindBy(xpath= "//button[@class='s-button']")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id='search-widget']")
    private WebElement searchWidget;

    @FindBy(id = "SITE_HEADERscreenWidthBackground")
    private WebElement headerScreen;

    public WebElement searchButton(){return searchButton;}

    public void setAdultsNumberDownButton(WebElement adultsNumberDownButton) {
        this.adultsNumberDownButton = adultsNumberDownButton;
    }

    public RoomsRatesPage clickSearchButton(){
        searchButton().click();
        return new RoomsRatesPage(driver);
    }

    public  HomePage waitUntilSearchButtonEnabled()  {
        if (!searchButton().isDisplayed()) {
            try {
                driver.wait(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return this;
    }

    public WebElement getHeaderScreen(){
        return headerScreen;
    }



}

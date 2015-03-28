package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(className = "//div[@bi='SET_ADULTS']/a[@class='up']")
    private WebElement adultsNumberUpButton;

    @FindBy(className = "//div[@bi='SET_ADULTS']/a[@class='down']")
    private WebElement adultsNumberDownButton;

    @FindBy(className = "//div[@bi='SET_KIDS']/a[@class='up']")
    private WebElement kidsNumberUpButton;

    @FindBy(className = "//div[@bi='SET_KIDS']/a[@class='down']")
    private WebElement kidsNumberDownButton;

    @FindBy(className = "s-button")
    private WebElement searchButton;

    public void setAdultsNumberDownButton(WebElement adultsNumberDownButton) {
        this.adultsNumberDownButton = adultsNumberDownButton;
    }

    public RoomsRatesPage clickSearchButton(){
        searchButton.click();
        return new RoomsRatesPage(driver);
    }

}

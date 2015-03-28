package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mariannas on 23.03.15.
 */
public class RoomsRatesPage  {

    private WebDriver driver;

    public RoomsRatesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}

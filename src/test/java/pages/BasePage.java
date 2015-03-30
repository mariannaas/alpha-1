package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sivashchenko on 3/22/2015.
 */
public abstract class BasePage {
   // ADD MENU PANEL
   // id="DrpDwnMn20bg"
    @FindBy(id ="mainPageinlineContent")
    private WebElement mainPageContent;

    protected BasePage(String currentPage){

    }
    public abstract void init();
    public void WaitUntilEnabled(){

    }
}

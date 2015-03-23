package pages;

/**
 * Created by sivashchenko on 3/22/2015.
 */
public abstract class BasePage {
    private String currentPage;
    protected BasePage(String currentPage){
        this.currentPage = currentPage;
        init();
    }
    public abstract void init();
}

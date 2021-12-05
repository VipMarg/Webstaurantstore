import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;


public class MainPage extends BaseActions {
    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public List<WebElement> collectAllNameOfItems() {
        List<WebElement> linksOfItems = driver.findElements(Locators.NAME_OF_ITEMS);
        return linksOfItems;

    }
    public void SearchOfItems(){
        Reports.log("Type text in Search field");
        driver.findElement(Locators.SEARCH_FIELD).sendKeys(Data.SearchText);
        Reports.log("Click Search Button");
        driver.findElement(Locators.SEARCH_BUTTON).click();

    }



}
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



    public class ItemPages extends BaseActions {
        public ItemPages(WebDriver driver, WebDriverWait wait) {
            super(driver, wait);
        }

        public void ClickBuyButton() {
            driver.findElement(Locators.BUTTON_BUY).click();

        }
    }

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


    public class BaseActions {
        protected WebDriver driver;
        protected WebDriverWait wait;

        public BaseActions(WebDriver driver, WebDriverWait wait) {
            this.driver = driver;
            this.wait = wait;
        }

        public String getAnyName() {
            String title = driver.findElement(Locators.NAME_OF_ITEMS).getText();
            return title;
        }

        public void ajaxClick(WebElement element) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", new Object[]{element});
            wait.until(ExpectedConditions.elementToBeClickable(element));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", new Object[]{element});
        }

        public void ajaxClick(By by) {
            wait.until(ExpectedConditions.elementToBeClickable(by));
            ajaxClick(driver.findElement(by));
        }

        public void ajaxClick(By by, int index) {
            wait.until(ExpectedConditions.elementToBeClickable(by));
            ajaxClick((WebElement) driver.findElements(by).get(index));
        }
    }

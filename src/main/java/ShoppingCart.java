import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ShoppingCart extends BaseActions {
    public ShoppingCart(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void RemoveItem(){
        Reports.log("Click Icon Remove Item");
        driver.findElement(Locators.ICON_REMOVE_ITEM).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Reports.log("Wait until message Empty Cart");
        wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(Locators.USER_MESSAGE_EMPTY_CART)));
    }



}


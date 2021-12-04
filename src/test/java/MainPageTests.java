import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;


public class MainPageTests extends BaseUI {
    String nameOfItems;


    @Test
    public void testSearchOfItems() {
        mainPage.SearchOfItems();
        List<WebElement> linksOfArticles = mainPage.collectAllNameOfItems();
        System.out.println(linksOfArticles.size());

        for(int i = 0; i < linksOfArticles.size(); ++i) {
            WebElement link = (WebElement)linksOfArticles.get(i);
            nameOfItems = link.getText().toLowerCase();
            System.out.println(nameOfItems);
            Assert.assertTrue(nameOfItems.contains("table"));
            if (i == linksOfArticles.size() - 1) {
                System.out.println(i);
                link.click();
                itemPages.ClickBuyButton();
                mainPage.ajaxClick(Locators.ICON_CART);
                shoppingCart.RemoveItem();
                Assert.assertTrue(driver.findElement(Locators.USER_MESSAGE_EMPTY_CART).isDisplayed());
            }
        }

    }
}









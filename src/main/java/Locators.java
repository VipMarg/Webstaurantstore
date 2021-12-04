import org.openqa.selenium.By;

public class Locators {
    public static final By SEARCH_FIELD = By.cssSelector("#searchval");
    public static final By SEARCH_BUTTON = By.xpath("//button[text()='Search']");
    public static final By NAME_OF_ITEMS = By.xpath("//a[@data-testid='itemDescription']");
    public static final By BUTTON_BUY = By.xpath("//input[@id='buyButton']");
    public static final By ICON_CART = By.xpath("//span[text()='Cart']");
    public static final By ICON_REMOVE_ITEM = By.xpath("//div[@class='cartItem ag-item gtm-product-auto']//a[@aria-labelledby='remove-item']");
    public static final By USER_MESSAGE_EMPTY_CART = By.xpath("//p[text()='Your cart is empty.']");


}

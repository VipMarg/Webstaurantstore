import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.time.Duration;

public class BaseUI {
    String mainUrl = "https://www.webstaurantstore.com/";
    WebDriver driver;
    WebDriverWait wait;
    MainPage mainPage;
    ItemPages itemPages;
    ShoppingCart shoppingCart;

    public BaseUI() {
    }

    @BeforeMethod
    public void setUp(Method method) {
        Reports.start(method.getDeclaringClass().getName()+":" + method.getName());
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(this.mainUrl);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        mainPage = new MainPage(driver, wait);
        itemPages = new ItemPages(driver, wait);
        shoppingCart = new ShoppingCart(driver, wait);
    }

    @AfterMethod
    public void afterActions (ITestResult testResult) {
        if (testResult.getStatus()==ITestResult.FAILURE){
            Reports.fail(driver,testResult.getName());
        }
        Reports.stop();
        driver.quit();
    }
}
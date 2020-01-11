import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class YandexSearchTest {

    WebDriver driver;
    @BeforeSuite
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\IdeaProjects\\decWebdriverTestNG\\src\\test\\resources\\geckodriver.exe");
    }
    @Test
    public void test001() {
        openBrowser();
        navigateToMainPage();
        typeQuery();
        submitSearch();
        waitForResultsPage();
        assertResultsPage();
    }

    private void waitForResultsPage() {
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("serp-adv__found")));
    }

    private void assertResultsPage() {
        boolean isResultStatsDisplayed = driver.findElement(By.className("serp-adv__found")).isDisplayed();
        Assert.assertTrue(isResultStatsDisplayed);
        //It is done by classname, because there was no id.
    }

    private void submitSearch() {
        String selector = "#text";
        WebElement element = driver.findElement(By.cssSelector(selector));
        element.submit();
    }

    private void typeQuery() {
        String selector = "#text";

        WebElement element = driver.findElement(By.cssSelector(selector));
        element.sendKeys("Portnov Computer School");
    }
    private void navigateToMainPage() {
        driver.get("https://yandex.kz");
    }
    private void openBrowser() {
        driver = new FirefoxDriver();
    }
}

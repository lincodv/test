import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleSearchTest {

    WebDriver driver;

    @BeforeSuite
    public void setup (){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\IdeaProjects\\decWebdriverTestNG\\src\\test\\resources\\geckodriver.exe");
    }
    @AfterTest
    public void afterTest () {
        driver.quit();
    }

    @Parameters({"queryTextParameter"})
    @Test
    public void test001(String parameter1) {
        String queryText = parameter1;

        openBrowser();
      navigateToMainPage();
        typeQuery(queryText);
        submitSearch();
        waitForResultsPage();
        assertResultsPage();
    }

    private void waitForResultsPage() {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resultStats")));
    }

    private void assertResultsPage() {
        boolean isResultStatsDisplayed = driver.findElement(By.id("resultStats")).isDisplayed();
        Assert.assertTrue(isResultStatsDisplayed);
    }

    private void submitSearch() {
        String selector = "#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input";
        WebElement element = driver.findElement(By.cssSelector(selector));
        element.submit();
        }

    private void typeQuery(String textToType) {

        String selector = "#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input";
        WebElement element = driver.findElement(By.cssSelector(selector));
    element.sendKeys(textToType);
    }

    private void navigateToMainPage() {
        driver.get("https://google.com");
    }

    private void openBrowser() {
        driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
}

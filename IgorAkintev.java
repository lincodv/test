import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IgorAkintev {

    WebDriver driver;

    @BeforeSuite
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\IdeaProjects\\decWebdriverTestNG\\src\\test\\resources\\geckodriver.exe");
    }

    @Test
    public void test001() {
        openBrowser();
        navigateToMainPage();
        typeLogin();
        typePassword();
        submitEnter();
        assertResultsPagePanel();
        submitAdd();
        assertResultsAddEntry();
        typeTitle();
        typeSlug();
        typeTextMarkdown();
        typeText();
        submitSave();
        navigateToBlogPage();
        assertResultsDisplayedEntry();
        navigateToAdminPanel();
        submitEditEntries();
        selectItem();
        submitDelete();
        submitYesSureDelete();
    }

    private void submitYesSureDelete() {
        String selector12 = "//*[@id=\"content\"]/form/div/input[2]";
        WebElement element = driver.findElement(By.xpath(selector12));
        element.click();


    }

    private void submitDelete() {
        String selector11 = "//*[@id=\"entry_form\"]/div/div/p/a";
        WebElement element = driver.findElement(By.xpath(selector11));
        element.click();

    }

    private void selectItem() {
        String selector10 = "//*[@id=\"result_list\"]/tbody/tr[1]/th/a[text()='Title12345678901']";
        WebElement element = driver.findElement(By.xpath(selector10));
        element.click();

    }

    private void submitEditEntries() {
        String selector9 = "//*[@id=\"module_2\"]/div/ul[1]/li[1]/ul/li[2]/a/span";
        WebElement element = driver.findElement(By.xpath(selector9));
        element.click();

    }

    private void navigateToAdminPanel() {
        driver.get("https://igorakintev.ru/admin/");
    }

    private void assertResultsDisplayedEntry() {
        boolean isNewRecordDisplayed = driver.findElement(By.xpath("//*[@id=\"entries\"]/h2[1]/a[text()='Title12345678901']")).isDisplayed();
        Assert.assertTrue(isNewRecordDisplayed);

    }

    private void navigateToBlogPage() {
        driver.get("https://igorakintev.ru/blog/");


    }

    private void submitSave() {
        String selector8 = "//*[@id=\"entry_form\"]/div/div/input[1]";
        WebElement element = driver.findElement(By.xpath(selector8));
        element.click();

    }

    private void typeText() {
        String selector7 = "//*[@id=\"id_text\"]";
        WebElement element = driver.findElement(By.xpath(selector7));
        element.sendKeys("Slug12345678901");


    }

    private void typeTextMarkdown() {
        String selector6 = "//*[@id=\"id_text_markdown\"]";
        WebElement element = driver.findElement(By.xpath(selector6));
        element.sendKeys("Slug12345678901");

    }

    private void typeSlug() {
        String selector5 = "//*[@id=\"id_slug\"]";
        WebElement element = driver.findElement(By.xpath(selector5));
        element.sendKeys("Slug12345678901");

    }

    private void typeTitle() {
        String selector4 = "//*[@id=\"id_title\"]";
        WebElement element = driver.findElement(By.xpath(selector4));
        element.sendKeys("Title12345678901");
        driver.findElement(By.id("id_slug")).clear();
    }

    private void assertResultsAddEntry() {
        boolean isAddEntryDisplayed = driver.findElement(By.xpath("//*[@id=\"content\"]/h1[text()='Добавить entry']")).isDisplayed();
        Assert.assertTrue(isAddEntryDisplayed);
    }

    private void submitAdd() {
        String selector3 = "//*[@id=\"module_2\"]/div/ul[1]/li[1]/ul/li[1]/a/span";
        WebElement element = driver.findElement(By.xpath(selector3));
        element.click();
    }

    private void assertResultsPagePanel() {
        boolean isControlPanelDisplayed = driver.findElement(By.xpath("//*[@id=\"content\"]/h1[text()='Панель управления']")).isDisplayed();
        Assert.assertTrue(isControlPanelDisplayed);
    }

    private void submitEnter() {
        String selector2 = "//*[@id=\"id_password\"]";
        WebElement element = driver.findElement(By.xpath(selector2));
        element.submit();
    }

    private void typePassword() {
        String selector2 = "//*[@id=\"id_password\"]";
        WebElement element = driver.findElement(By.xpath(selector2));
        element.sendKeys("super_password");
    }

    private void typeLogin() {
        String selector1 = "//*[@id=\"id_username\"]";
        WebElement element = driver.findElement(By.xpath(selector1));
        element.sendKeys("selenium");
    }

    private void navigateToMainPage() {
        driver.get("https://igorakintev.ru/admin/");
    }

    private void openBrowser() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

public class CheckboxesTest {

    WebDriver driver;

    @BeforeSuite
    public void setup (){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\IdeaProjects\\decWebdriverTestNG\\src\\test\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();

    }
    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test001() {
        openMainPage();

        List<WebElement> listOfInputs = driver.findElements(By.tagName("input"));

        Assert.assertTrue(listOfInputs.size() == 2, "List of Checkboxes is not equal to " + listOfInputs.size());

        WebElement checkBox1 = listOfInputs.get(0);

        String isBox1Checked = checkBox1.getAttribute("checked");

        Assert.assertNull(isBox1Checked);

        checkBox1.click();

        Assert.assertEquals(checkBox1.getAttribute("checked"), "true");

        WebElement checkBox2 = listOfInputs.get(1);

        Assert.assertEquals(checkBox2.getAttribute("checked"), "true");
    }

    private void openMainPage() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }
}

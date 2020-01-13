import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandlesTests {

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
        clickLink();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<String> windowHandles = driver.getWindowHandles();
        int size = windowHandles.size();
         int expectedNumberOfWindows = 2;
        Assert.assertEquals(size, expectedNumberOfWindows, "Amount of windows is not " + expectedNumberOfWindows);

        Object [] arrayOfHandles = windowHandles.toArray();

        String handle1 = (String) arrayOfHandles[0];
        String handle2 = (String) arrayOfHandles[1];

        driver.switchTo().window(handle2);

        String windowTitle2 = driver.getTitle();
        String expectedWindowTitle2 = "New Window";

        Assert.assertEquals(driver.getTitle(), expectedWindowTitle2);

        driver.switchTo().window(handle1);
        String expectedWindowTitle1 = "The Internet";
        Assert.assertEquals(driver.getTitle(), expectedWindowTitle1);

    }

    private void clickLink() {
        driver.findElement(By.partialLinkText("Click Here")).click();
    }

    private void openMainPage() {
        driver.get("https://the-internet.herokuapp.com/windows");
    }
}

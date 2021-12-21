import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PageSomeTest {
    private WebDriver driver;

    @Before
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    @After
    public void after() {
        if (driver != null) {
            driver.close();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}


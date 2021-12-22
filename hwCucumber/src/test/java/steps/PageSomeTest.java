package steps;

import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Пусть;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PageSomeTest {
    private WebDriver driver;
    private PageAvito page;

    @Пусть("открыт ресурс авито")
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        page = new PageAvito(driver);
    }

    @И("в выпадающем списке категорий выбрана {string}")
    public void inDropDownListCategoryChoose(String str) {
        page.selectCategory(str);
    }
}

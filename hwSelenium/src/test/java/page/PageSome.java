package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class PageSome {
    protected WebDriver driver;
    protected WebDriverWait wait;
    private Select select;

    protected abstract void open();

    private static final int TIMEOUT = 15;

    public PageSome(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, TIMEOUT);
    }

    protected Select select(WebElement element) {
        select = new Select(element);
        return select;
    }
}



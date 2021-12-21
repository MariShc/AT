import org.junit.Test;
import page.PageAvito;

public class PageAvitoTest extends PageSomeTest {

    @Test
    public void testPage() {
        PageAvito avito = new PageAvito(getDriver());
        avito.selectCategory("99");
        avito.inputTextArea("Принтер");
        avito.searchForCity("Владивосток");
        avito.checkbox();
        avito.filter("2");
        avito.nameAndPrice();
    }
}

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/java/features",
        glue = "steps",
        tags = "@1",
        snippets = SnippetType.UNDERSCORE
)

public class RunnerTest extends AbstractTestNGCucumberTests {
}

package Runner;

import Base.TestBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps"
)
public class TestRunner extends TestBase {
}

package runner.PageTest;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/SingleGUI/GetRatesPage.feature",
        glue = "StepDefinitions"
)

public class GetRatesPageTest {
}

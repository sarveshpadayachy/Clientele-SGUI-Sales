package runner.ClienteleGSDTest;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/SingleGUI/ClienteleGSD/ClienteleWealthPlanGSD.feature",
        glue = "StepDefinitions"
)



public class ClienteleWealthPlanGSDTest {
}

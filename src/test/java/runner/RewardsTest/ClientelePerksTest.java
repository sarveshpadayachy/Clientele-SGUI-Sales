package runner.RewardsTest;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/SingleGUI/Rewards/ClientelePerks.feature",
        glue = "StepDefinitions"
)
public class ClientelePerksTest {
}

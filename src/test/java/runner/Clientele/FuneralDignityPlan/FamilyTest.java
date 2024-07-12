package runner.Clientele.FuneralDignityPlan;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/SingleGUI/Clientele.FuneralDignityPlan/Family.feature",
        glue = "StepDefinitions"
)

public class FamilyTest {
}

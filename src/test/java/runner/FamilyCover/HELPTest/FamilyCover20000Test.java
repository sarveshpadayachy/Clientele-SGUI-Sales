package runner.FamilyCover.HELPTest;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/SingleGUI/FamilyCover.HELP/FamilyCover20000.feature",
        glue = "StepDefinitions"
)

public class FamilyCover20000Test {
}
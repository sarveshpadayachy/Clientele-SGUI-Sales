package runner.IndividualCover.HELPTest;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/SingleGUI/IndividualCover.HELP",
        glue = "StepDefinitions"

)

public class LumpSumCover25000Test {
}

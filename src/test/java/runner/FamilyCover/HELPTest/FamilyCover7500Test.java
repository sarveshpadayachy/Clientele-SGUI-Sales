package runner.FamilyCover.HELPTest;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/SingleGUI/FamilyCover.HELP/FamilyCover7500.feature",
        glue = "StepDefinitions"
//        tags = " @Tag1 or  @Tag2 "
)

public class FamilyCover7500Test {
}

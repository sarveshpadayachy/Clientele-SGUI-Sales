package runner.Legal;




import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/SingleGUI/Legal/EnhancedExtendedLegalIndividual.feature",
        glue = "StepDefinitions"
)
public class EnhancedExtendedIndividualTest {

}



package StepDefinitions.PageStep;

import PageObjects.LeadSourcePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class LeadSourcePageStep extends PageObject {

    @Steps
    LeadSourcePage leadSourcePage;


    @When("User login using valid credentials")
    public void user_login_using_valid_credentials() throws InterruptedException {
        leadSourcePage.OpenWebsite();
        leadSourcePage.loginIn("WRambau@clientele.co.za", "clientele003");

    }
    @Then("User clicks on clientele logo")
    public void user_clicks_on_clientele_logo()throws InterruptedException {
        leadSourcePage.ClienteleLogo();

    }
    @When("User clicks on capture sale")
    public void user_clicks_on_capture_sale()throws InterruptedException {
        leadSourcePage.CaptureSale();

    }
    @Then("User clicks on lead basket")
    public void user_clicks_on_lead_basket()throws InterruptedException {
        leadSourcePage.LeadBasket();

    }

    @When("user select lead on checkbox")
    public void user_select_lead_on_checkbox()throws InterruptedException {
        leadSourcePage.LeadCheckBox();

    }
    @Then("user clicks on action sale button")
    public void user_clicks_on_action_sale_button()throws InterruptedException {
       leadSourcePage.ActionSaleButton();

    }


}

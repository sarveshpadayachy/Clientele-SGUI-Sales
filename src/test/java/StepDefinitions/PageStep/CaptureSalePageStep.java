package StepDefinitions.PageStep;

import PageObjects.CaptureSalePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class CaptureSalePageStep extends PageObject {

    @Steps
    CaptureSalePage captureSalePage;


    @Given("user opens the Website")
    public void user_opens_the_website()throws InterruptedException {
        captureSalePage.OpenWebsite();
    }
    @When("user login using valid credentials")
    public void user_login_using_valid_credentials() {
        captureSalePage.loginIn("spadayachy@clientele.co.za", "Ironman_2024");
    }
    @When("user clicks on clientele icon")
    public void user_clicks_on_clientele_icon() throws InterruptedException {
       captureSalePage.ClienteleLogo();
    }
    @When("user clicks on capture sale icon")
    public void user_clicks_on_capture_sale_icon()throws InterruptedException{
        captureSalePage.CaptureSale();
    }
    @Then("user clicks on lead basket")
    public void user_clicks_on_lead_basket()throws InterruptedException {
       captureSalePage.LeadBasket();
    }
}

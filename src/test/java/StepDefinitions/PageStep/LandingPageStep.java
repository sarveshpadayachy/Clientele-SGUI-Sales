package StepDefinitions.PageStep;

import PageObjects.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class LandingPageStep extends PageObject {

    @Steps
    LandingPage landingPage;
    @Given("Open landingPage url")
    public void open_landing_page_url()throws InterruptedException {
        landingPage.OpenWebsite();
    }
    @When("Login in using valid Credentials")
    public void login_in_using_valid_credentials() {
       landingPage.loginIn("WRambau@clientele.co.za", "clientele003");
    }


    @When("Clicks on ClienteleLogo")
    public void clicks_on_clientele_logo()throws InterruptedException {
        landingPage.ClienteleLogo();

    }
    @Then("Clicks on CaptureSale")
    public void clicks_on_capture_sale()throws InterruptedException {
        landingPage.CaptureSale();

    }

}

package StepDefinitions.PageStep;

import PageObjects.ProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class ProductPageStep extends PageObject {

    @Steps
    ProductPage productPage;

    @Given("user opens Shamba website")
    public void user_opens_shamba_website()throws InterruptedException {
        productPage.OpenWebsite();
        productPage.loginIn("WRambau@clientele.co.za", "clientele003");
        productPage.ClienteleLogo();
        productPage.CaptureSale();
        productPage.LeadBasket();
        productPage.LeadCheckBox();
        productPage.ActionSaleButton();
    }
    @When("user clicks on Help icon")
    public void user_clicks_on_help_icon()throws InterruptedException{
        productPage.HelpIconButton();
        productPage.SelectPlanTextDropdown("YG");

    }
    @Then("user Click on Ok Button to proceed")
    public void user_click_on_ok_button_to_proceed()throws InterruptedException{
        productPage.SelectPlanOkBtn();

    }

}

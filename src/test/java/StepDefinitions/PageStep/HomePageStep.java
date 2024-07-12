package StepDefinitions.PageStep;

import PageObjects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class HomePageStep extends PageObject {
    @Steps
    HomePage homePage;


    @Given("user opens the URL")
    public void user_opens_the_url() throws InterruptedException {
        homePage.OpenWebsite();
    }
    @When("user clicks on Arrow Navigation  button")
    public void userClicksOnArrowNavigationButton() {
        homePage.clickArrowButton();
    }
    @When("user enters {string}")
    public void user_enters(String username){
        homePage.Username(username);

    }

    @Then("User enters {string}")
    public void user_Enters(String password) {
        homePage.PasswordText(password);
    }
    @And("user clicks on Log-in button")
    public void userClicksOnLogInButton() throws InterruptedException {
        homePage.LoginButton();
        homePage.ClienteleLogo();
    }

}

package StepDefinitions.RewardsStep;

import PageObjects.Rewards.ClientelePerks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class ClientelePerksStep extends PageObject {

    @Steps
    ClientelePerks clientelePerks;


    @Given("user Log In SGUI   website.")
    public void user_log_in_sgui_website() throws InterruptedException {
       clientelePerks.OpenWebsite();

    }
    @When("User Log in with Valid Credentials by Entering")
    public void user_log_in_with_valid_credentials_by_entering() throws InterruptedException {
        clientelePerks.clickArrowButton();
        clientelePerks.PopUpLogin("WRambau", "TonWins@2024" );
        clientelePerks.LoginButton();
        clientelePerks.ClienteleLogo();
        clientelePerks.CaptureSale();
        clientelePerks.LeadBasket();
        clientelePerks.selectNew();
        clientelePerks.LeadCheckBox();
        clientelePerks.ActionSaleButton();

    }
    @Then("user select Plan Cover On dropdown text list, {string}")
    public void user_select_plan_cover_on_dropdown_text_list(String string) throws InterruptedException {
        clientelePerks.RewardsTab();
        clientelePerks.SelectPlanTextDropdown(string);
        clientelePerks.SelectPlanOkBtn();
        clientelePerks.GetRatesBtn();
        clientelePerks.StartSalePopUp();

    }
    @When("User Add Member details by Capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_member_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) throws InterruptedException {
        clientelePerks.selectTittleDropdown(string);
        clientelePerks.EnterName(string2);
        clientelePerks.EnterSurname(string3);
        clientelePerks.selectSACitizen(string4);
        clientelePerks.clickTextBox();
        clientelePerks.enterID(string5);
        clientelePerks.confirmID(string6);
        clientelePerks.clickOKButton();
        clientelePerks.selectMonthlyIncome(string7);
        clientelePerks.selectOccupation(string8);
        clientelePerks.selectEduction(string9);
        clientelePerks.enterCellNum(string10);
        clientelePerks.enterPostalAddress(string11);
        clientelePerks.enterPostalCode(string12);
        clientelePerks.clickCopyPhysical();
        clientelePerks.clickValidateBtn();
        clientelePerks.clickSaveMMBtn();

    }
    @Then("User Add Payer details by Capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_payer_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15) throws InterruptedException {
        clientelePerks.navigatePayer();
        clientelePerks.selectTittle(string);
        clientelePerks.enterName(string2);
        clientelePerks.enterSurname(string3);
        clientelePerks.fieldTextID();
        clientelePerks.mainIDPopUp(string4);
        clientelePerks.confirmationID(string5);
        clientelePerks.clickOK();
        clientelePerks.PayerRelation(string6);
        clientelePerks.selectDebit(string7);
        clientelePerks.selectDebiDate(string8);
        clientelePerks.selectBank(string9);
        clientelePerks.selectBranch(string10);
        clientelePerks.selectAccType(string11);
        clientelePerks.enterAccNum();
        clientelePerks.enterMainAcc(string12);
        clientelePerks.confirmAccount(string13);
        clientelePerks.OKButton();
        clientelePerks.enterMobiNum(string14);
        clientelePerks.isEmployee(string15);
        clientelePerks.confCheckBoxes();
        clientelePerks.clickSaveBtn();

    }
    @Then("User Proceed with the Cover and Conclude Sale.")
    public void user_proceed_with_the_cover_and_conclude_sale() throws InterruptedException {
        clientelePerks.navigatePremium();
        clientelePerks.navigateSummary();
        clientelePerks.debiCheck();
        clientelePerks.SecondSaleIiII();
        clientelePerks.summaryTable();
    }

}

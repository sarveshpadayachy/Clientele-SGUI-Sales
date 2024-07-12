package StepDefinitions.ClienteleGSDStep;

import PageObjects.ClienteleGSD.ClienteleWealthPlanGSD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class ClienteleWealthPlanGSDStep extends PageObject {

   @Steps
   ClienteleWealthPlanGSD clienteleWealthPlanGSD;

    @Given("user Log in SGUI  Website.")
    public void user_log_in_sgui_website() throws InterruptedException {
        clienteleWealthPlanGSD.OpenWebsite();

    }

    @When("User Log in with Valid Credentials by entering")
    public void user_log_in_with_valid_credentials_by_entering() throws InterruptedException {
        clienteleWealthPlanGSD.clickArrowButton();
        clienteleWealthPlanGSD.PopUpLogin("kmolale", "Kebaabetswem@14");
        clienteleWealthPlanGSD.LoginButton();
        clienteleWealthPlanGSD.ClienteleLogo();
        clienteleWealthPlanGSD.CaptureSale();
        clienteleWealthPlanGSD.LeadBasket();
        clienteleWealthPlanGSD.selectNew();
        clienteleWealthPlanGSD.LeadCheckBox();
        clienteleWealthPlanGSD.ActionSaleButton();

    }
    @Then("User Select Plan Cover on dropdown text list, {string}")
    public void user_select_plan_cover_on_dropdown_text_list(String string) throws InterruptedException {
        clienteleWealthPlanGSD.InvestmentTab();
        clienteleWealthPlanGSD.SelectPlanTextDropdown(string);
        clienteleWealthPlanGSD.SelectPlanOkBtn();
        clienteleWealthPlanGSD.GetRatesBtn();
        clienteleWealthPlanGSD.StartSalePopUp();
        clienteleWealthPlanGSD.handleModelPopUp();

    }
    @When("User Add member details By Capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_member_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) throws InterruptedException {
        clienteleWealthPlanGSD.selectTittleDropdown(string);
        clienteleWealthPlanGSD.EnterName(string2);
        clienteleWealthPlanGSD.EnterSurname(string3);
        clienteleWealthPlanGSD.selectSACitizen(string4);
        clienteleWealthPlanGSD.clickTextBox();
        clienteleWealthPlanGSD.enterID(string5);
        clienteleWealthPlanGSD.confirmID(string6);
        clienteleWealthPlanGSD.clickOKButton();
        clienteleWealthPlanGSD.selectMonthlyIncome(string7);
        clienteleWealthPlanGSD.selectOccupation(string8);
        clienteleWealthPlanGSD.selectEduction(string9);
        clienteleWealthPlanGSD.enterCellNum(string10);
        clienteleWealthPlanGSD.enterPostalAddress(string11);
        clienteleWealthPlanGSD.enterPostalCode(string12);
        clienteleWealthPlanGSD.clickCopyPhysical();
        clienteleWealthPlanGSD.clickValidateBtn();
        clienteleWealthPlanGSD.clickSaveMMBtn();

    }
    @Then("user confirms Beneficiary details {string},")
    public void userConfirmsBeneficiaryDetails(String string) throws InterruptedException {
        clienteleWealthPlanGSD.navigateBeneficiary();
        clienteleWealthPlanGSD.addBeneficiary();
        clienteleWealthPlanGSD.selectRelation(string);
        clienteleWealthPlanGSD.saveBeneficiary();


    }
    @When("User Add payer details By Capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_payer_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13) throws InterruptedException {
        clienteleWealthPlanGSD.navigatePayer();
        clienteleWealthPlanGSD.selectTittle(string);
        clienteleWealthPlanGSD.enterName(string2);
        clienteleWealthPlanGSD.enterSurname(string3);
        clienteleWealthPlanGSD.fieldTextID();
        clienteleWealthPlanGSD.mainIDPopUp(string4);
        clienteleWealthPlanGSD.confirmationID(string5);
        clienteleWealthPlanGSD.clickOK();
        clienteleWealthPlanGSD.PayerRelation(string6);
        clienteleWealthPlanGSD.selectBank(string7);
        clienteleWealthPlanGSD.selectBranch(string8);
        clienteleWealthPlanGSD.selectAccType(string9);
        clienteleWealthPlanGSD.enterAccNum();
        clienteleWealthPlanGSD.enterMainAcc(string10);
        clienteleWealthPlanGSD.confirmAccount(string11);
        clienteleWealthPlanGSD.OKButton();
        clienteleWealthPlanGSD.enterMobiNum(string12);
        clienteleWealthPlanGSD.isEmployee(string13);


    }
    @Then("user add Government details if selected yes, {string}, {string}, {string}, {string}, {string}")
    public void user_add_government_details_if_selected_yes(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
        clienteleWealthPlanGSD.addGSD(string, string2, string3);
        clienteleWealthPlanGSD.selectDebit(string4);
        clienteleWealthPlanGSD.selectDebiDate(string5);
        clienteleWealthPlanGSD.confCheckBoxes();
        clienteleWealthPlanGSD.clickSaveBtn();

    }
    @When("User confirms FICA and Premium rates by capturing necessary details   {string}, {string}, {string}")
    public void userConfirmsFICAAndPremiumRatesByCapturingNecessaryDetails(String string2, String string3, String string4) throws InterruptedException {
        clienteleWealthPlanGSD.navigateFICA(string2, string3);
        clienteleWealthPlanGSD.navigatePremium(string4);
    }


    @Then("user proceed with the Cover and Conclude Sale.")
    public void user_proceed_with_the_cover_and_conclude_sale() throws InterruptedException {
       // clienteleWealthPlanGSD.navigateRewards();
        clienteleWealthPlanGSD.navigateSummary();
        clienteleWealthPlanGSD.PopUPCheckboxes();
        clienteleWealthPlanGSD.SecondSaleIiII();
        clienteleWealthPlanGSD.summaryTable();


    }


}

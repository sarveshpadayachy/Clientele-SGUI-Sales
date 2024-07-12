package StepDefinitions.IndividualCover.HELPStep;

import PageObjects.IndividualCover.HELP.LumpSumCover15000;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class LumpSumCover15000Step extends PageObject {

    @Steps
    LumpSumCover15000 lumpSumCover15000;

    @Given("user log in SGUI Website")
    public void user_log_in_sgui_website() throws InterruptedException {
        lumpSumCover15000.OpenWebsite();

    }

    @When("user log in with valid Credentials by entering")
    public void user_log_in_with_valid_credentials_by_entering() throws InterruptedException {
        lumpSumCover15000.clickArrowButton();
        lumpSumCover15000.PopUpLogin("WRambau", "TonWins@2024");
        lumpSumCover15000.LoginButton();
        lumpSumCover15000.ClienteleLogo();
        lumpSumCover15000.CaptureSale();
        lumpSumCover15000.LeadBasket();
        lumpSumCover15000.selectNew();
        lumpSumCover15000.LeadCheckBox();
        lumpSumCover15000.ActionSaleButton();

    }
    @Then("user select Plan cover on dropdown text list, {string}")
    public void user_select_plan_cover_on_dropdown_text_list(String string) throws InterruptedException {
        lumpSumCover15000.HelpIconButton();
        lumpSumCover15000.SelectPlanTextDropdown(string);
        lumpSumCover15000.SelectPlanOkBtn();
    }
    @When("user Select the Plan option:Member and family by selecting, {string}")
    public void user_select_the_plan_option_member_and_family_by_selecting(String string) throws InterruptedException {
        lumpSumCover15000.GetRatesBtn();
        lumpSumCover15000.SelectPlanOption(string);

    }
    @Then("User select the Date of birth of the main life assured, {string}")
    public void user_select_the_date_of_birth_of_the_main_life_assured(String string) throws InterruptedException {
        lumpSumCover15000.SelectDoB(string);
    }
    @When("User on the Slider select the cover amounts that are applicable to the plan chosen")
    public void user_on_the_slider_select_the_cover_amounts_that_are_applicable_to_the_plan_chosen() throws InterruptedException {

        lumpSumCover15000.ViewRates();
        lumpSumCover15000.StartSale();
        lumpSumCover15000.handleModelPopUp();

    }
    @Then("user Add member details by capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_member_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) throws InterruptedException {
        lumpSumCover15000.selectTittleDropdown(string);
        lumpSumCover15000.EnterName(string2);
        lumpSumCover15000.EnterSurname(string3);
        lumpSumCover15000.selectSACitizen(string4);
        lumpSumCover15000.clickTextBox();
        lumpSumCover15000.enterID(string5);
        lumpSumCover15000.confirmID(string6);
        lumpSumCover15000.clickOKButton();
        //lumpSumCover20000.EnterDoB("1992-06-03");
        lumpSumCover15000.selectMonthlyIncome(string7);
        lumpSumCover15000.selectOccupation(string8);
        lumpSumCover15000.selectEduction(string9);
        lumpSumCover15000.enterCellNum(string10);
        lumpSumCover15000.enterPostalAddress(string11);
        lumpSumCover15000.enterPostalCode(string12);
        lumpSumCover15000.clickCopyPhysical();
        lumpSumCover15000.clickValidateBtn();
        lumpSumCover15000.clickSaveMMBtn();

    }
    @When("user add payer details by Capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_payer_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15) throws InterruptedException {
        lumpSumCover15000.navigatePayer();
        lumpSumCover15000.selectTittle(string);
        lumpSumCover15000.enterName(string2);
        lumpSumCover15000.enterSurname(string3);
        lumpSumCover15000.fieldTextID();
        lumpSumCover15000.mainIDPopUp(string4);
        lumpSumCover15000.confirmationID(string5);
        lumpSumCover15000.clickOK();
        lumpSumCover15000.PayerRelation(string6);
        lumpSumCover15000.selectDebit(string7);
        lumpSumCover15000.selectDebiDate(string8);
        lumpSumCover15000.selectBank(string9);
        lumpSumCover15000.selectBranch(string10);
        lumpSumCover15000.selectAccType(string11);
        lumpSumCover15000.enterAccNum();
        lumpSumCover15000.enterMainAcc(string12);
        lumpSumCover15000.confirmAccount(string13);
        lumpSumCover15000.OKButton();
        lumpSumCover15000.enterMobiNum(string14);
        lumpSumCover15000.isEmployee(string15);
        lumpSumCover15000.confCheckBoxes();
        lumpSumCover15000.clickSaveBtn();
    }
    @When("user confirms Beneficiary, FICA and Premium Rates by capturing necessary details, {string}, {string}, {string}")
    public void user_confirms_beneficiary_fica_and_premium_rates_by_capturing_necessary_details(String string, String string2, String string3) throws InterruptedException {
        lumpSumCover15000.navigateBeneficiary();
        lumpSumCover15000.addBeneficiary();
        lumpSumCover15000.selectRelation(string);
        lumpSumCover15000.saveBeneficiary();
        lumpSumCover15000.navigateFICA(string2, string3);
        lumpSumCover15000.navigatePremium();
    }
    @Then("User proceed with the Cover and conclude sale.")
    public void user_proceed_with_the_cover_and_conclude_sale() throws InterruptedException {
        lumpSumCover15000.navigateRewards();
        lumpSumCover15000.navigateSummary();
        lumpSumCover15000.debiCheck();
        lumpSumCover15000.summaryTable();

    }




}

package StepDefinitions.IndividualCover.HELPStep;

import PageObjects.IndividualCover.HELP.LumpSumCover20000;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class LumpSumCover20000Step extends PageObject {

    @Steps
    LumpSumCover20000 lumpSumCover20000;

    @Given("user log in SGUI Or Shamba Website")
    public void user_log_in_sgui_or_shamba_website() throws InterruptedException {
        lumpSumCover20000.OpenWebsite();

    }

    @When("User log in With valid Credentials by entering")
    public void user_log_in_with_valid_credentials_by_entering() throws InterruptedException {
        lumpSumCover20000.clickArrowButton();
        lumpSumCover20000.PopUpLogin("WRambau", "Clientele#2024");
        lumpSumCover20000.LoginButton();
        lumpSumCover20000.ClienteleLogo();
        lumpSumCover20000.CaptureSale();
        lumpSumCover20000.LeadBasket();
        lumpSumCover20000.selectNew();
        lumpSumCover20000.LeadCheckBox();
        lumpSumCover20000.ActionSaleButton();

    }
    @Then("user select Plan cover On dropdown text list, {string}")
    public void user_select_plan_cover_on_dropdown_text_list(String string) throws InterruptedException {
        lumpSumCover20000.HelpIconButton();
        lumpSumCover20000.SelectPlanTextDropdown(string);
        lumpSumCover20000.SelectPlanOkBtn();

    }
    @When("user Select the Plan option:Member and family By selecting, {string}")
    public void user_select_the_plan_option_member_and_family_by_selecting(String string) throws InterruptedException {
        lumpSumCover20000.GetRatesBtn();
        lumpSumCover20000.SelectPlanOption(string);

    }
    @Then("User select the Date Of birth of the main life assured, {string}")
    public void user_select_the_date_of_birth_of_the_main_life_assured(String string) throws InterruptedException {
        lumpSumCover20000.SelectDoB(string);

    }
    @When("User on the Slider select the cover amounts that are applicable to the Plan Chosen")
    public void user_on_the_slider_select_the_cover_amounts_that_are_applicable_to_the_plan_chosen() throws InterruptedException {
        lumpSumCover20000.selectCoverAmount();
        lumpSumCover20000.ViewRates();
        lumpSumCover20000.StartSale();
        lumpSumCover20000.handleModelPopUp();

    }
    @Then("user Add member details By capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_member_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) throws InterruptedException {
        lumpSumCover20000.selectTittleDropdown(string);
        lumpSumCover20000.EnterName(string2);
        lumpSumCover20000.EnterSurname(string3);
        lumpSumCover20000.selectSACitizen(string4);
        lumpSumCover20000.clickTextBox();
        lumpSumCover20000.enterID(string5);
        lumpSumCover20000.confirmID(string6);
        lumpSumCover20000.clickOKButton();
        //lumpSumCover20000.EnterDoB("1992-06-03");
        lumpSumCover20000.selectMonthlyIncome(string7);
        lumpSumCover20000.selectOccupation(string8);
        lumpSumCover20000.selectEduction(string9);
        lumpSumCover20000.enterCellNum(string10);
        lumpSumCover20000.enterPostalAddress(string11);
        lumpSumCover20000.enterPostalCode(string12);
        lumpSumCover20000.clickCopyPhysical();
        lumpSumCover20000.clickValidateBtn();
        lumpSumCover20000.clickSaveMMBtn();

    }

    @When("user confirms Beneficiary details, {string},")
    public void userConfirmsBeneficiaryDetails(String string ) throws InterruptedException {
        lumpSumCover20000.navigateBeneficiary();
        lumpSumCover20000.addBeneficiary();
        lumpSumCover20000.selectRelation(string);
        lumpSumCover20000.saveBeneficiary();

    }
    @Then("user add payer Details by Capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_payer_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15) throws InterruptedException {
        lumpSumCover20000.navigatePayer();
        lumpSumCover20000.selectTittle(string);
        lumpSumCover20000.enterName(string2);
        lumpSumCover20000.enterSurname(string3);
        lumpSumCover20000.fieldTextID();
        lumpSumCover20000.mainIDPopUp(string4);
        lumpSumCover20000.confirmationID(string5);
        lumpSumCover20000.clickOK();
        lumpSumCover20000.PayerRelation(string6);
        lumpSumCover20000.selectDebit(string7);
        lumpSumCover20000.selectDebiDate(string8);
        lumpSumCover20000.selectBank(string9);
        lumpSumCover20000.selectBranch(string10);
        lumpSumCover20000.selectAccType(string11);
        lumpSumCover20000.enterAccNum();
        lumpSumCover20000.enterMainAcc(string12);
        lumpSumCover20000.confirmAccount(string13);
        lumpSumCover20000.OKButton();
        lumpSumCover20000.enterMobiNum(string14);
        lumpSumCover20000.isEmployee(string15);
        lumpSumCover20000.confCheckBoxes();
        lumpSumCover20000.clickSaveBtn();

    }
    @When("User proceed with the Cover , FICA and Premium Rates By capturing necessary details and Conclude sale.  {string}, {string}")
    public void userProceedWithTheCoverFICAAndPremiumRatesByCapturingNecessaryDetailsAndConcludeSale(String string2, String string3) throws InterruptedException {
        lumpSumCover20000.navigateFICA(string2, string3);
        lumpSumCover20000.navigatePremium();
       // lumpSumCover20000.navigateRewards();
        lumpSumCover20000.navigateSummary();
        lumpSumCover20000.debiCheck();
        lumpSumCover20000.SecondSaleIiII();
        lumpSumCover20000.summaryTable();

    }



}

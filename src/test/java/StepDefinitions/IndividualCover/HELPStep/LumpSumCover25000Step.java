package StepDefinitions.IndividualCover.HELPStep;

import PageObjects.IndividualCover.HELP.LumpSumCover25000;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class LumpSumCover25000Step extends PageObject {

    @Steps
    LumpSumCover25000 lumpSumCover25000;

    @Given("user log in SGUI or Shamba Website")
    public void user_log_in_sgui_or_shamba_website() throws InterruptedException {
        lumpSumCover25000.OpenWebsite();

    }


    @When("user log in With valid Credentials by entering")
    public void user_log_in_with_valid_credentials_by_entering() throws InterruptedException {
        lumpSumCover25000.clickArrowButton();
        lumpSumCover25000.PopUpLogin("WRambau", "Clientele#2024");
        lumpSumCover25000.LoginButton();
        lumpSumCover25000.ClienteleLogo();
        lumpSumCover25000.CaptureSale();
        lumpSumCover25000.LeadBasket();
        lumpSumCover25000.selectNew();
        lumpSumCover25000.LeadCheckBox();
        lumpSumCover25000.ActionSaleButton();

    }
    @Then("User select Plan cover On dropdown text list, {string}")
    public void user_select_plan_cover_on_dropdown_text_list(String string) throws InterruptedException {
        lumpSumCover25000.HelpIconButton();
        lumpSumCover25000.SelectPlanTextDropdown(string);
        lumpSumCover25000.SelectPlanOkBtn();

    }
    @When("User select the Plan option:Member and family By selecting, {string}")
    public void user_select_the_plan_option_member_and_family_by_selecting(String string) throws InterruptedException {
        lumpSumCover25000.GetRatesBtn();
        lumpSumCover25000.SelectPlanOption(string);

    }
    @Then("User Select the Date Of birth of the main life assured, {string}")
    public void user_select_the_date_of_birth_of_the_main_life_assured(String string) throws InterruptedException {
        lumpSumCover25000.SelectDoB(string);

    }
    @When("user on the Slider select the cover amounts that are applicable to the Plan Chosen")
    public void user_on_the_slider_select_the_cover_amounts_that_are_applicable_to_the_plan_chosen() throws InterruptedException {
        lumpSumCover25000.selectCoverAmountI();
        lumpSumCover25000.ViewRates();
        lumpSumCover25000.StartSale();
        lumpSumCover25000.handleModelPopUp();

    }
    @Then("User Add member details By capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_member_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) throws InterruptedException {
        lumpSumCover25000.selectTittleDropdown(string);
        lumpSumCover25000.EnterName(string2);
        lumpSumCover25000.EnterSurname(string3);
        lumpSumCover25000.selectSACitizen(string4);
        lumpSumCover25000.clickTextBox();
        lumpSumCover25000.enterID(string5);
        lumpSumCover25000.confirmID(string6);
        lumpSumCover25000.clickOKButton();
        //lumpSumCover20000.EnterDoB("1992-06-03");
        lumpSumCover25000.selectMonthlyIncome(string7);
        lumpSumCover25000.selectOccupation(string8);
        lumpSumCover25000.selectEduction(string9);
        lumpSumCover25000.enterCellNum(string10);
        lumpSumCover25000.enterPostalAddress(string11);
        lumpSumCover25000.enterPostalCode(string12);
        lumpSumCover25000.clickCopyPhysical();
        lumpSumCover25000.clickValidateBtn();
        lumpSumCover25000.clickSaveMMBtn();

    }

    @When("User confirms Beneficiary details, {string}")
    public void userConfirmsBeneficiaryDetails(String string) throws InterruptedException {
        lumpSumCover25000.navigateBeneficiary();
        lumpSumCover25000.addBeneficiary();
        lumpSumCover25000.selectRelation(string);
        lumpSumCover25000.saveBeneficiary();


    }
    @When("User add payer Details by Capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_payer_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15) throws InterruptedException {
        lumpSumCover25000.navigatePayer();
        lumpSumCover25000.selectTittle(string);
        lumpSumCover25000.enterName(string2);
        lumpSumCover25000.enterSurname(string3);
        lumpSumCover25000.fieldTextID();
        lumpSumCover25000.mainIDPopUp(string4);
        lumpSumCover25000.confirmationID(string5);
        lumpSumCover25000.clickOK();
        lumpSumCover25000.PayerRelation(string6);
        lumpSumCover25000.selectDebit(string7);
        lumpSumCover25000.selectDebiDate(string8);
        lumpSumCover25000.selectBank(string9);
        lumpSumCover25000.selectBranch(string10);
        lumpSumCover25000.selectAccType(string11);
        lumpSumCover25000.enterAccNum();
        lumpSumCover25000.enterMainAcc(string12);
        lumpSumCover25000.confirmAccount(string13);
        lumpSumCover25000.OKButton();
        lumpSumCover25000.enterMobiNum(string14);
        lumpSumCover25000.isEmployee(string15);
        lumpSumCover25000.confCheckBoxes();
        lumpSumCover25000.clickSaveBtn();

    }
    @When("user Proceed with the Cover, FICA and Premium Rates By capturing necessary details  and Conclude Sale. {string}, {string}")
    public void userProceedWithTheCoverFICAAndPremiumRatesByCapturingNecessaryDetailsAndConcludeSale( String string2, String string3) throws InterruptedException {
        lumpSumCover25000.navigateFICA(string2, string3);
        lumpSumCover25000.navigatePremium();
      //  lumpSumCover25000.navigateRewards();
         lumpSumCover25000.navigateSummary();
         lumpSumCover25000.debiCheck();
         lumpSumCover25000.SecondSaleIiII();
         lumpSumCover25000.summaryTable();

    }


}

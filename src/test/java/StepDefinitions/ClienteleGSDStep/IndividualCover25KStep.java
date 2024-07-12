package StepDefinitions.ClienteleGSDStep;

import PageObjects.ClienteleGSD.IndividualCover25K;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class IndividualCover25KStep extends PageObject {

   @Steps
    IndividualCover25K individualCover25K;

    @Given("User log in SGUI Website")
    public void user_log_in_sgui_website() throws InterruptedException {
        individualCover25K.OpenWebsite();

    }


    @When("User log in with Valid Credentials by Entering")
    public void user_log_in_with_valid_credentials_by_entering() throws InterruptedException {
        individualCover25K.clickArrowButton();
        individualCover25K.PopUpLogin("WRambau", "clientele#2023");
        individualCover25K.LoginButton();
        individualCover25K.ClienteleLogo();
        individualCover25K.CaptureSale();
        individualCover25K.LeadBasket();
        individualCover25K.selectNew();
        individualCover25K.LeadCheckBox();
        individualCover25K.ActionSaleButton();

    }
    @Then("User select Plan Cover on Dropdown Text List, {string}")
    public void user_select_plan_cover_on_dropdown_text_list(String string) throws InterruptedException {
        individualCover25K.HelpIconButton();
        individualCover25K.SelectPlanTextDropdown(string);
        individualCover25K.SelectPlanOkBtn();

    }
    @When("user Select the Plan Option:Member and Family by Selecting, {string}")
    public void user_select_the_plan_option_member_and_family_by_selecting(String string) throws InterruptedException {
        individualCover25K.GetRatesBtn();
        individualCover25K.SelectPlanOption(string);

    }
    @Then("User select the Date of Birth of the Main life Assured, {string}")
    public void user_select_the_date_of_birth_of_the_main_life_assured(String string) throws InterruptedException {
        individualCover25K.SelectDoB(string);

    }
    @When("User on the Slider Select the Cover Amounts that are applicable to the plan chosen")
    public void user_on_the_slider_select_the_cover_amounts_that_are_applicable_to_the_plan_chosen() throws InterruptedException {
        individualCover25K.selectCoverAmount();
        individualCover25K.ViewRates();
        individualCover25K.StartSale();
        individualCover25K.handleModelPopUp();

    }
    @Then("user Add Member Details by Capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_member_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) throws InterruptedException {
        individualCover25K.selectTittleDropdown(string);
        individualCover25K.EnterName(string2);
        individualCover25K.EnterSurname(string3);
        individualCover25K.selectSACitizen(string4);
        individualCover25K.clickTextBox();
        individualCover25K.enterID(string5);
        individualCover25K.confirmID(string6);
        individualCover25K.clickOKButton();
        //lumpSumCover20000.EnterDoB("1992-06-03");
        individualCover25K.selectMonthlyIncome(string7);
        individualCover25K.selectOccupation(string8);
        individualCover25K.selectEduction(string9);
        individualCover25K.enterCellNum(string10);
        individualCover25K.enterPostalAddress(string11);
        individualCover25K.enterPostalCode(string12);
        individualCover25K.clickCopyPhysical();
        individualCover25K.clickValidateBtn();
        individualCover25K.clickSaveMMBtn();

    }
    @When("User Confirms Beneficiary, {string}")
    public void userConfirmsBeneficiary(String string) throws InterruptedException {
        individualCover25K.navigateBeneficiary();
        individualCover25K.addBeneficiary();
        individualCover25K.selectRelation(string);
        individualCover25K.saveBeneficiary();


    }
    @When("user Add Payer Details by capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_payer_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13) throws InterruptedException {
        individualCover25K.navigatePayer();
        individualCover25K.selectTittle(string);
        individualCover25K.enterName(string2);
        individualCover25K.enterSurname(string3);
        individualCover25K.fieldTextID();
        individualCover25K.mainIDPopUp(string4);
        individualCover25K.confirmationID(string5);
        individualCover25K.clickOK();
        individualCover25K.PayerRelation(string6);
        individualCover25K.selectBank(string7);
        individualCover25K.selectBranch(string8);
        individualCover25K.selectAccType(string9);
        individualCover25K.enterAccNum();
        individualCover25K.enterMainAcc(string10);
        individualCover25K.confirmAccount(string11);
        individualCover25K.OKButton();
        individualCover25K.enterMobiNum(string12);
        individualCover25K.isEmployee(string13);


    }
    @Then("User add Government Details if selected Yes, FICA and Premium Rates by capturing necessary Details, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void userAddGovernmentDetailsIfSelectedYesFICAAndPremiumRatesByCapturingNecessaryDetails(String string, String string2, String string3, String string4, String string5, String string6, String string7) throws InterruptedException {
        individualCover25K.addGSD(string, string2, string3);
        individualCover25K.confCheckBoxes();
        individualCover25K.selectDebit(string4);
        individualCover25K.selectDebiDate(string5);
        individualCover25K.clickSaveBtn();
        individualCover25K.navigateFICA(string6, string7);
        individualCover25K.navigatePremium();

    }

    @Then("user Proceed with the Cover and Conclude sale.")
    public void user_proceed_with_the_cover_and_conclude_sale() throws InterruptedException {
       // individualCover25K.navigateRewards();
        individualCover25K.navigateSummary();
        individualCover25K.PopUPCheckboxes();
        individualCover25K.SecondSaleIiII();
        individualCover25K.summaryTable();


    }


}

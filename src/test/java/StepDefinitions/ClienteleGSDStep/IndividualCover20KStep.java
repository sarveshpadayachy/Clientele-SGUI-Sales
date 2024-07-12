package StepDefinitions.ClienteleGSDStep;

import PageObjects.ClienteleGSD.IndividualCover20K;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class IndividualCover20KStep extends PageObject {

    @Steps
    IndividualCover20K individualCover20K;

    @Given("User Log in SGUI Website")
    public void user_log_in_sgui_website() throws InterruptedException {
        individualCover20K.OpenWebsite();

    }


    @When("user log in with Valid Credentials by Entering")
    public void user_log_in_with_valid_credentials_by_entering() throws InterruptedException {
        individualCover20K.clickArrowButton();
        individualCover20K.PopUpLogin("kmolale", "Kebaabetswem@14");
        individualCover20K.LoginButton();
        individualCover20K.ClienteleLogo();
        individualCover20K.CaptureSale();
        individualCover20K.LeadBasket();
        individualCover20K.selectNew();
        individualCover20K.LeadCheckBox();
        individualCover20K.ActionSaleButton();

    }
    @Then("User select Plan Cover on Dropdown text List, {string}")
    public void user_select_plan_cover_on_dropdown_text_list(String string) throws InterruptedException {
        individualCover20K.HelpIconButton();
        individualCover20K.SelectPlanTextDropdown(string);
        individualCover20K.SelectPlanOkBtn();

    }
    @When("user Select the Plan Option:Member and Family by selecting, {string}")
    public void user_select_the_plan_option_member_and_family_by_selecting(String string) throws InterruptedException {
        individualCover20K.GetRatesBtn();
        individualCover20K.SelectPlanOption(string);

    }
    @Then("User select the Date of Birth of the Main life assured, {string}")
    public void user_select_the_date_of_birth_of_the_main_life_assured(String string) throws InterruptedException {
        individualCover20K.SelectDoB(string);

    }
    @When("User on the Slider Select the Cover amounts that are applicable to the plan chosen")
    public void user_on_the_slider_select_the_cover_amounts_that_are_applicable_to_the_plan_chosen() throws InterruptedException {
        individualCover20K.selectCoverAmount();
        individualCover20K.ViewRates();
        individualCover20K.StartSale();
        individualCover20K.handleModelPopUp();

    }
    @Then("user Add Member Details by capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_member_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) throws InterruptedException {
        individualCover20K.selectTittleDropdown(string);
        individualCover20K.EnterName(string2);
        individualCover20K.EnterSurname(string3);
        individualCover20K.selectSACitizen(string4);
        individualCover20K.clickTextBox();
        individualCover20K.enterID(string5);
        individualCover20K.confirmID(string6);
        individualCover20K.clickOKButton();
        //lumpSumCover20000.EnterDoB("1992-06-03");
        individualCover20K.selectMonthlyIncome(string7);
        individualCover20K.selectOccupation(string8);
        individualCover20K.selectEduction(string9);
        individualCover20K.enterCellNum(string10);
        individualCover20K.enterPostalAddress(string11);
        individualCover20K.enterPostalCode(string12);
        individualCover20K.clickCopyPhysical();
        individualCover20K.clickValidateBtn();
        individualCover20K.clickSaveMMBtn();

    }
    @When("user Confirms Beneficiary {string}")
    public void userConfirmsBeneficiary(String string) throws InterruptedException {
        individualCover20K.navigateBeneficiary();
        individualCover20K.addBeneficiary();
        individualCover20K.selectRelation(string);
        individualCover20K.saveBeneficiary();


    }
    @When("user Add payer Details by capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_payer_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13) throws InterruptedException {
        individualCover20K.navigatePayer();
        individualCover20K.selectTittle(string);
        individualCover20K.enterName(string2);
        individualCover20K.enterSurname(string3);
        individualCover20K.fieldTextID();
        individualCover20K.mainIDPopUp(string4);
        individualCover20K.confirmationID(string5);
        individualCover20K.clickOK();
        individualCover20K.PayerRelation(string6);
        individualCover20K.selectBank(string7);
        individualCover20K.selectBranch(string8);
        individualCover20K.selectAccType(string9);
        individualCover20K.enterAccNum();
        individualCover20K.enterMainAcc(string10);
        individualCover20K.confirmAccount(string11);
        individualCover20K.OKButton();
        individualCover20K.enterMobiNum(string12);
        individualCover20K.isEmployee(string13);



    }
    @Then("User add Government Details if selected yes , FICA and Premium Rates by capturing necessary Details,  {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void userAddGovernmentDetailsIfSelectedYesFICAAndPremiumRatesByCapturingNecessaryDetails(String string, String string2, String string3, String string4, String string5 , String string6, String string7) throws InterruptedException {
        individualCover20K.addGSD(string, string2, string3);
        individualCover20K.confCheckBoxes();
        individualCover20K.selectDebit(string4);
        individualCover20K.selectDebiDate(string5);
        individualCover20K.clickSaveBtn();
        individualCover20K.navigateFICA(string6, string7);
        individualCover20K.navigatePremium();

    }

    @Then("User Proceed with the Cover and Conclude sale.")
    public void user_proceed_with_the_cover_and_conclude_sale() throws InterruptedException {
       // individualCover20K.navigateRewards();
        individualCover20K.navigateSummary();
        individualCover20K.PopUPCheckboxes();
        individualCover20K.SecondSaleIiII();
        individualCover20K.summaryTable();

    }

  
}

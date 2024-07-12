package StepDefinitions.ClienteleGSDStep;

import PageObjects.ClienteleGSD.IndividualCover15K;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class IndividualCover15KStep extends PageObject {

    @Steps
    IndividualCover15K individualCover15K;

    @Given("user Log in SGUI Website")
    public void user_log_in_sgui_website() throws InterruptedException {
        individualCover15K.OpenWebsite();

    }


    @When("user log in with Valid Credentials by entering")
    public void user_log_in_with_valid_credentials_by_entering() throws InterruptedException {
        individualCover15K.clickArrowButton();
        individualCover15K.PopUpLogin("kmolale", "Kebaabetswem@14");
        individualCover15K.LoginButton();
        individualCover15K.ClienteleLogo();
        individualCover15K.CaptureSale();
        individualCover15K.LeadBasket();
        individualCover15K.selectNew();
        individualCover15K.LeadCheckBox();
        individualCover15K.ActionSaleButton();

    }
    @Then("User select Plan Cover on dropdown text List, {string}")
    public void user_select_plan_cover_on_dropdown_text_list(String string) throws InterruptedException {
        individualCover15K.HelpIconButton();
        individualCover15K.SelectPlanTextDropdown(string);
        individualCover15K.SelectPlanOkBtn();

    }
    @When("user Select the Plan Option:Member and family by selecting, {string}")
    public void user_select_the_plan_option_member_and_family_by_selecting(String string) throws InterruptedException {
        individualCover15K.GetRatesBtn();
        individualCover15K.SelectPlanOption(string);

    }
    @Then("User select the Date of Birth of the main life assured, {string}")
    public void user_select_the_date_of_birth_of_the_main_life_assured(String string) throws InterruptedException {
        individualCover15K.SelectDoB(string);

    }
    @When("User on the Slider Select the cover amounts that are applicable to the plan chosen")
    public void user_on_the_slider_select_the_cover_amounts_that_are_applicable_to_the_plan_chosen() throws InterruptedException {
       // individualCover15K.selectCoverAmount();
        individualCover15K.ViewRates();
        individualCover15K.StartSale();
        individualCover15K.handleModelPopUp();

    }
    @Then("user Add Member details by capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_member_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) throws InterruptedException {
        individualCover15K.selectTittleDropdown(string);
        individualCover15K.EnterName(string2);
        individualCover15K.EnterSurname(string3);
        individualCover15K.selectSACitizen(string4);
        individualCover15K.clickTextBox();
        individualCover15K.enterID(string5);
        individualCover15K.confirmID(string6);
        individualCover15K.clickOKButton();
        //lumpSumCover20000.EnterDoB("1992-06-03");
        individualCover15K.selectMonthlyIncome(string7);
        individualCover15K.selectOccupation(string8);
        individualCover15K.selectEduction(string9);
        individualCover15K.enterCellNum(string10);
        individualCover15K.enterPostalAddress(string11);
        individualCover15K.enterPostalCode(string12);
        individualCover15K.clickCopyPhysical();
        individualCover15K.clickValidateBtn();
        individualCover15K.clickSaveMMBtn();

    }
    @When("user Confirms Beneficiary details, {string}")
    public void userConfirmsBeneficiaryDetails(String string) throws InterruptedException {
        individualCover15K.navigateBeneficiary();
        individualCover15K.addBeneficiary();
        individualCover15K.selectRelation(string);
        individualCover15K.saveBeneficiary();


    }
    @Then("user add payer Details by capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_payer_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13) throws InterruptedException {
        individualCover15K.navigatePayer();
        individualCover15K.selectTittle(string);
        individualCover15K.enterName(string2);
        individualCover15K.enterSurname(string3);
        individualCover15K.fieldTextID();
        individualCover15K.mainIDPopUp(string4);
        individualCover15K.confirmationID(string5);
        individualCover15K.clickOK();
        individualCover15K.PayerRelation(string6);
        individualCover15K.selectBank(string7);
        individualCover15K.selectBranch(string8);
        individualCover15K.selectAccType(string9);
        individualCover15K.enterAccNum();
        individualCover15K.enterMainAcc(string10);
        individualCover15K.confirmAccount(string11);
        individualCover15K.OKButton();
        individualCover15K.enterMobiNum(string12);
        individualCover15K.isEmployee(string13);


    }


    @When("User add Government details if selected yes and add FICA and Premium Rates by capturing necessary details {string}, {string}, {string}, {string}, {string} , {string}, {string}")
    public void userAddGovernmentDetailsIfSelectedYesAndAddFICAAndPremiumRatesByCapturingNecessaryDetails(String string, String string2, String string3, String string4, String string5, String string6, String string7) throws InterruptedException {
        individualCover15K.addGSD(string, string2, string3);
        individualCover15K.selectDebit(string4);
        individualCover15K.selectDebiDate(string5);
        individualCover15K.confCheckBoxes();
        individualCover15K.clickSaveBtn();
        individualCover15K.navigateFICA(string6, string7);
        individualCover15K.navigatePremium();

    }

    @Then("User Proceed with the Cover and conclude sale.")
    public void user_proceed_with_the_cover_and_conclude_sale() throws InterruptedException {
       // individualCover15K.navigateRewards();
        individualCover15K.navigateSummary();
        individualCover15K.PopUPCheckboxes();
        individualCover15K.SecondSale();
        individualCover15K.summaryTable();


    }

}

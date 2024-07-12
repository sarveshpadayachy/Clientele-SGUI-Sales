package StepDefinitions.FamilyCover.HELPStep;

import PageObjects.FamilyCover.HELP.FamilyCover10000;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class FamilyCover10000Step extends PageObject {

    @Steps
    FamilyCover10000 familyCover10000;

    @Given("user Log in SGUI  website")
    public void user_log_in_sgui_website() throws InterruptedException {
        familyCover10000.OpenWebsite();

    }


    @When("User log in with valid credentials by entering")
    public void user_log_in_with_valid_credentials_by_entering() throws InterruptedException {
        familyCover10000.clickArrowButton();
        familyCover10000.PopUpLogin("kmolale", "Kebaabetswem@14");
        familyCover10000.LoginButton();
        familyCover10000.ClienteleLogo();
        familyCover10000.CaptureSale();
        familyCover10000.LeadBasket();
        familyCover10000.selectNew();
        familyCover10000.LeadCheckBox();
        familyCover10000.ActionSaleButton();

    }
    @Then("User select plan cover on dropdown text list, {string}")
    public void user_select_plan_cover_on_dropdown_text_list(String string) throws InterruptedException {
        familyCover10000.HelpIconButton();
        familyCover10000.SelectPlanTextDropdown(string);
        familyCover10000.SelectPlanOkBtn();

    }
    @When("User Select the plan option:Member and family by selecting, {string}")
    public void user_select_the_plan_option_member_and_family_by_selecting(String string) throws InterruptedException {

        familyCover10000.GetRatesBtn();
        familyCover10000.SelectPlanOption(string);

    }
    @Then("user Select the Date of birth of the main life assured, {string}")
    public void user_select_the_date_of_birth_of_the_main_life_assured(String string) throws InterruptedException {
        familyCover10000.SelectDoB(string);

    }
    @When("User on the slider select the cover amounts that are applicable to the plan chosen.")
    public void user_on_the_slider_select_the_cover_amounts_that_are_applicable_to_the_plan_chosen() throws InterruptedException {
        familyCover10000.selectCoverAmount();
        familyCover10000.ViewRates();
        familyCover10000.StartSale();
        familyCover10000.handleModelPopUp();

    }
    @Then("User add member details by capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_member_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) throws InterruptedException {
        familyCover10000.selectTittleDropdown(string);
        familyCover10000.EnterName(string2);
        familyCover10000.EnterSurname(string3);
        familyCover10000.selectSACitizen(string4);
        familyCover10000.clickTextBox();
        familyCover10000.enterID(string5);
        familyCover10000.confirmID(string6);
        familyCover10000.clickOKButton();
        //lumpSumCover20000.EnterDoB("1992-06-03");
        familyCover10000.selectMonthlyIncome(string7);
        familyCover10000.selectOccupation(string8);
        familyCover10000.selectEduction(string9);
        familyCover10000.enterCellNum(string10);
        familyCover10000.enterPostalAddress(string11);
        familyCover10000.enterPostalCode(string12);
        familyCover10000.clickCopyPhysical();
        familyCover10000.clickValidateBtn();
        familyCover10000.clickSaveMMBtn();
    }

    @When("User add spouse details by capturing, {string}, {string}, {string}, {string}, {string}")
    public void user_add_spouse_details_by_capturing(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
        familyCover10000.navigateSpouse();
        familyCover10000.spouseTitle(string);
        familyCover10000.spouseName(string2);
        familyCover10000.spouseSurName(string3);
        familyCover10000.spouseGender(string4);
        familyCover10000.spouseID(string5);

    }
    @Then("User add child details by capturing, {string}, {string}, {string}, {string}, {string}")
    public void user_add_child_details_by_capturing(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
        familyCover10000.navigateChild();
        familyCover10000.clickTab();
        familyCover10000.enterChildName(string);
        familyCover10000.enterChildSurname(string2);
        familyCover10000.selectGender(string3);
        familyCover10000.enterChildID(string4);
        familyCover10000.ChildIsStudent(string5);

    }
    @When("user captures beneficiary details .")
    public void userCapturesBeneficiaryDetails() throws InterruptedException {
        familyCover10000.navigateBeneficiary();
        familyCover10000.addBeneficiary();
        familyCover10000.selectRelation("Member Estate");
        familyCover10000.saveBeneficiary();


    }
    @Then("User add payer details by capturing and conclude sale, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void userAddPayerDetailsByCapturingAndConcludeSale(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15) throws InterruptedException {
        familyCover10000.navigatePayer();
        familyCover10000.selectTittle(string);
        familyCover10000.enterName(string2);
        familyCover10000.enterSurname(string3);
        familyCover10000.fieldTextID();
        familyCover10000.mainIDPopUp(string4);
        familyCover10000.confirmationID(string5);
        familyCover10000.clickOK();
        familyCover10000.PayerRelation(string6);
        familyCover10000.selectDebit(string7);
        familyCover10000.selectDebiDate(string8);
        familyCover10000.selectBank(string9);
        familyCover10000.selectBranch(string10);
        familyCover10000.selectAccType(string11);
        familyCover10000.enterAccNum();
        familyCover10000.enterMainAcc(string12);
        familyCover10000.confirmAccount(string13);
        familyCover10000.OKButton();
        familyCover10000.enterMobiNum(string14);
        familyCover10000.isEmployee(string15);
        familyCover10000.confCheckBoxes();
        familyCover10000.clickSaveBtn();
        familyCover10000.navigateFICA();
        familyCover10000.navigatePremium();
       // familyCover10000.navigateRewards();
        familyCover10000.navigateSummary();
        familyCover10000.debiCheck();
        familyCover10000.SecondSaleIiII();
        familyCover10000.summaryTable();

    }

}

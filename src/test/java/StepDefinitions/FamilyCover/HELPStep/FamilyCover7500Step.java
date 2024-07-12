package StepDefinitions.FamilyCover.HELPStep;

import PageObjects.FamilyCover.HELP.FamilyCover7500;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class FamilyCover7500Step extends PageObject {

    @Steps
    FamilyCover7500 familyCover7500;


    @Given("user log in SGUI  Website")
    public void user_log_in_sgui_website() throws InterruptedException {
        familyCover7500.OpenWebsite();


    }



    @When("user log in with valid credentials by entering")
    public void user_log_in_with_valid_credentials_by_entering() throws InterruptedException {
        familyCover7500.clickArrowButton();
        familyCover7500.PopUpLogin("WRambau", "TonWins@2024");
        familyCover7500.LoginButton();
        familyCover7500.ClienteleLogo();
        familyCover7500.CaptureSale();
        familyCover7500.LeadBasket();
        familyCover7500.selectNew();
        familyCover7500.LeadCheckBox();
        familyCover7500.ActionSaleButton();
    }

    @Then("user select plan cover on dropdown text list, {string}")
    public void user_select_plan_cover_on_dropdown_text_list(String string) throws InterruptedException {
        familyCover7500.HelpIconButton();
        familyCover7500.SelectPlanTextDropdown(string);
        familyCover7500.SelectPlanOkBtn();

    }


    @When("user Select the plan option:Member and family by selecting, {string}")
    public void user_select_the_plan_option_member_and_family_by_selecting(String string) throws InterruptedException {
        familyCover7500.GetRatesBtn();
        familyCover7500.SelectPlanOption(string);

    }

    @Then("User Select the Date of birth of the main life assured, {string}")
    public void user_select_the_date_of_birth_of_the_main_life_assured(String string) throws InterruptedException {
        familyCover7500.SelectDoB(string);
    }

    @When("User on the slider select the cover amounts that are applicable to the plan chosen")
    public void user_on_the_slider_select_the_cover_amounts_that_are_applicable_to_the_plan_chosen() throws InterruptedException {
        familyCover7500.ViewRates();
        familyCover7500.StartSale();
        familyCover7500.handleModelPopUp();

    }

    @Then("user add member details by capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_member_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) throws InterruptedException {
        familyCover7500.selectTittleDropdown(string);
        familyCover7500.EnterName(string2);
        familyCover7500.EnterSurname(string3);
        familyCover7500.selectSACitizen(string4);
        familyCover7500.clickTextBox();
        familyCover7500.enterID(string5);
        familyCover7500.confirmID(string6);
        familyCover7500.clickOKButton();
        familyCover7500.selectMonthlyIncome(string7);
        familyCover7500.selectOccupation(string8);
        familyCover7500.selectEduction(string9);
        familyCover7500.enterCellNum(string10);
        familyCover7500.enterPostalAddress(string11);
        familyCover7500.enterPostalCode(string12);
        familyCover7500.clickCopyPhysical();
        familyCover7500.clickValidateBtn();
        familyCover7500.clickSaveMMBtn();
    }


    @When("user add payer details by capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_payer_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15) throws InterruptedException {
        familyCover7500.navigatePayer();
        familyCover7500.selectTittle(string);
        familyCover7500.enterName(string2);
        familyCover7500.enterSurname(string3);
        familyCover7500.fieldTextID();
        familyCover7500.mainIDPopUp(string4);
        familyCover7500.confirmationID(string5);
        familyCover7500.clickOK();
        familyCover7500.PayerRelation(string6);
        familyCover7500.selectDebit(string7);
        familyCover7500.selectDebiDate(string8);
        familyCover7500.selectBank(string9);
        familyCover7500.selectBranch(string10);
        familyCover7500.selectAccType(string11);
        familyCover7500.enterAccNum();
        familyCover7500.enterMainAcc(string12);
        familyCover7500.confirmAccount(string13);
        familyCover7500.OKButton();
        familyCover7500.enterMobiNum(string14);
        familyCover7500.isEmployee(string15);
        familyCover7500.confCheckBoxes();
        familyCover7500.clickSaveBtn();

    }

    @Then("user add spouse details by capturing, {string}, {string}, {string}, {string}, {string}")
    public void user_add_spouse_details_by_capturing(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
        familyCover7500.navigateSpouse();
        familyCover7500.spouseTitle(string);
        familyCover7500.spouseName(string2);
        familyCover7500.spouseSurName(string3);
        familyCover7500.spouseGender(string4);
        familyCover7500.spouseID(string5);


    }

    @When("user add child details by capturing, {string}, {string}, {string}, {string}, {string}")
    public void user_add_child_details_by_capturing(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
        familyCover7500.navigateChild();
        familyCover7500.clickTab();
        familyCover7500.enterChildName(string);
        familyCover7500.enterChildSurname(string2);
        familyCover7500.selectGender(string3);
        familyCover7500.enterChildID(string4);
        familyCover7500.ChildIsStudent(string5);
    }
    @Then("User proceed with the Cover and conclude sale")
    public void user_proceed_with_the_cover_and_conclude_sale() throws InterruptedException {
        familyCover7500.navigateBeneficiary();
        familyCover7500.addBeneficiary();
        familyCover7500.selectRelation("Member Estate");
        familyCover7500.saveBeneficiary();
        familyCover7500.navigateFICA();
        familyCover7500.navigatePremium();
        familyCover7500.navigateRewards();
        familyCover7500.navigateSummary();
        familyCover7500.debiCheck();
        familyCover7500.summaryTable();

    }


}

package StepDefinitions.FamilyCover.HELPStep;

import PageObjects.FamilyCover.HELP.FamilyCover15000;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class FamilyCover15000Step extends PageObject {

    @Steps
    FamilyCover15000 familyCover15000;


    @Given("user Log in SGUI  website.")
    public void user_log_in_sgui_website() throws InterruptedException {
        familyCover15000.OpenWebsite();

    }

    @When("User log in with valid Credentials by entering")
    public void user_log_in_with_valid_credentials_by_entering() throws InterruptedException {
        familyCover15000.clickArrowButton();
        familyCover15000.PopUpLogin("WRambau", "Clientele#2024");
        familyCover15000.LoginButton();
        familyCover15000.ClienteleLogo();
        familyCover15000.CaptureSale();
        familyCover15000.LeadBasket();
        familyCover15000.selectNew();
        familyCover15000.LeadCheckBox();
        familyCover15000.ActionSaleButton();

    }
    @Then("User select Plan cover on dropdown text list, {string}")
    public void user_select_plan_cover_on_dropdown_text_list(String string) throws InterruptedException {
        familyCover15000.HelpIconButton();
        familyCover15000.SelectPlanTextDropdown(string);
        familyCover15000.SelectPlanOkBtn();

    }
    @When("User Select the Plan option:Member and family by selecting, {string}")
    public void user_select_the_plan_option_member_and_family_by_selecting(String string) throws InterruptedException {

        familyCover15000.GetRatesBtn();
        familyCover15000.SelectPlanOption(string);

    }
    @Then("User Select the Date of birth of the main Life assured, {string}")
    public void user_select_the_date_of_birth_of_the_main_life_assured(String string) throws InterruptedException {
        familyCover15000.SelectDoB(string);

    }
    @When("User on the slider select the cover amounts that are applicable to the plan chosen..")
    public void user_on_the_slider_select_the_cover_amounts_that_are_applicable_to_the_plan_chosen() throws InterruptedException {
        familyCover15000.selectCoverAmount();
        familyCover15000.ViewRates();
        familyCover15000.StartSale();
        familyCover15000.handleModelPopUp();

    }
    @Then("User add member details by Capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_member_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) throws InterruptedException {
        familyCover15000.selectTittleDropdown(string);
        familyCover15000.EnterName(string2);
        familyCover15000.EnterSurname(string3);
        familyCover15000.selectSACitizen(string4);
        familyCover15000.clickTextBox();
        familyCover15000.enterID(string5);
        familyCover15000.confirmID(string6);
        familyCover15000.clickOKButton();
        //lumpSumCover20000.EnterDoB("1992-06-03");
        familyCover15000.selectMonthlyIncome(string7);
        familyCover15000.selectOccupation(string8);
        familyCover15000.selectEduction(string9);
        familyCover15000.enterCellNum(string10);
        familyCover15000.enterPostalAddress(string11);
        familyCover15000.enterPostalCode(string12);
        familyCover15000.clickCopyPhysical();
        familyCover15000.clickValidateBtn();
        familyCover15000.clickSaveMMBtn();

    }

    @Then("User add spouse details by Capturing, {string}, {string}, {string}, {string}, {string}")
    public void user_add_spouse_details_by_capturing(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
        familyCover15000.navigateSpouse();
        familyCover15000.spouseTitle(string);
        familyCover15000.spouseName(string2);
        familyCover15000.spouseSurName(string3);
        familyCover15000.spouseGender(string4);
        familyCover15000.spouseID(string5);

    }
    @When("User add child details by Capturing, {string}, {string}, {string}, {string}, {string}")
    public void user_add_child_details_by_capturing(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
        familyCover15000.navigateChild();
        familyCover15000.clickTab();
        familyCover15000.enterChildName(string);
        familyCover15000.enterChildSurname(string2);
        familyCover15000.selectGender(string3);
        familyCover15000.enterChildID(string4);
        familyCover15000.ChildIsStudent(string5);

    }
    @Then("user proceed with capturing beneficiary details..")
    public void userProceedWithCapturingBeneficiaryDetails() throws InterruptedException {
        familyCover15000.navigateBeneficiary();
        familyCover15000.addBeneficiary();
        familyCover15000.selectRelation("Member Estate");
        familyCover15000.saveBeneficiary();


    }
    @When("User add payer details by Capturing and conclude sales,,,, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void userAddPayerDetailsByCapturingAndConcludeSales(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15) throws InterruptedException {
        familyCover15000.navigatePayer();
        familyCover15000.selectTittle(string);
        familyCover15000.enterName(string2);
        familyCover15000.enterSurname(string3);
        familyCover15000.fieldTextID();
        familyCover15000.mainIDPopUp(string4);
        familyCover15000.confirmationID(string5);
        familyCover15000.clickOK();
        familyCover15000.PayerRelation(string6);
        familyCover15000.selectDebit(string7);
        familyCover15000.selectDebiDate(string8);
        familyCover15000.selectBank(string9);
        familyCover15000.selectBranch(string10);
        familyCover15000.selectAccType(string11);
        familyCover15000.enterAccNum();
        familyCover15000.enterMainAcc(string12);
        familyCover15000.confirmAccount(string13);
        familyCover15000.OKButton();
        familyCover15000.enterMobiNum(string14);
        familyCover15000.isEmployee(string15);
        familyCover15000.confCheckBoxes();
        familyCover15000.clickSaveBtn();
        familyCover15000.navigateFICA();
        familyCover15000.navigatePremium();
     //   familyCover15000.navigateRewards();
        familyCover15000.navigateSummary();
        familyCover15000.debiCheck();
        familyCover15000.SecondSaleIiII();
        familyCover15000.summaryTable();


    }


}

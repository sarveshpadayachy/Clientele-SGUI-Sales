package StepDefinitions.FamilyCover.HELPStep;

import PageObjects.FamilyCover.HELP.FamilyCover20000;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class FamilyCover20000Step extends PageObject {

    @Steps
    FamilyCover20000 familyCover20000;


    @Given("User Log in SGUI  website.")
    public void user_log_in_sgui_website() throws InterruptedException {
        familyCover20000.OpenWebsite();

    }

    @When("User log in with valid credentials By entering")
    public void user_log_in_with_valid_credentials_by_entering() throws InterruptedException {
        familyCover20000.clickArrowButton();
        familyCover20000.PopUpLogin("WRambau", "Clientele#2024");
        familyCover20000.LoginButton();
        familyCover20000.ClienteleLogo();
        familyCover20000.CaptureSale();
        familyCover20000.LeadBasket();
        familyCover20000.selectNew();
        familyCover20000.LeadCheckBox();
        familyCover20000.ActionSaleButton();

    }
    @Then("User select Plan Cover on dropdown text list, {string}")
    public void user_select_plan_cover_on_dropdown_text_list(String string) throws InterruptedException {
        familyCover20000.HelpIconButton();
        familyCover20000.SelectPlanTextDropdown(string);
        familyCover20000.SelectPlanOkBtn();

    }
    @When("User Select the Plan option:Member and family By selecting, {string}")
    public void user_select_the_plan_option_member_and_family_by_selecting(String string) throws InterruptedException {

        familyCover20000.GetRatesBtn();
        familyCover20000.SelectPlanOption(string);

    }
    @Then("User Select the Date of Birth of the main Life assured, {string}")
    public void user_select_the_date_of_birth_of_the_main_life_assured(String string) throws InterruptedException {
        familyCover20000.SelectDoB(string);
    }

    @When("User on the slider select the cover amounts that are applicable to the Plan chosen..")
    public void userOnTheSliderSelectTheCoverAmountsThatAreApplicableToThePlanChosen() throws InterruptedException {
        familyCover20000.selectCoverAmount();
        familyCover20000.ViewRates();
        familyCover20000.StartSale();
        familyCover20000.handleModelPopUp();

    }
    @Then("User add member details By Capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_member_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) throws InterruptedException {
        familyCover20000.selectTittleDropdown(string);
        familyCover20000.EnterName(string2);
        familyCover20000.EnterSurname(string3);
        familyCover20000.selectSACitizen(string4);
        familyCover20000.clickTextBox();
        familyCover20000.enterID(string5);
        familyCover20000.confirmID(string6);
        familyCover20000.clickOKButton();
        //lumpSumCover20000.EnterDoB("1992-06-03");
        familyCover20000.selectMonthlyIncome(string7);
        familyCover20000.selectOccupation(string8);
        familyCover20000.selectEduction(string9);
        familyCover20000.enterCellNum(string10);
        familyCover20000.enterPostalAddress(string11);
        familyCover20000.enterPostalCode(string12);
        familyCover20000.clickCopyPhysical();
        familyCover20000.clickValidateBtn();
        familyCover20000.clickSaveMMBtn();

    }

    @When("User add spouse details By Capturing, {string}, {string}, {string}, {string}, {string}")
    public void user_add_spouse_details_by_capturing(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
        familyCover20000.navigateSpouse();
        familyCover20000.spouseTitle(string);
        familyCover20000.spouseName(string2);
        familyCover20000.spouseSurName(string3);
        familyCover20000.spouseGender(string4);
        familyCover20000.spouseID(string5);

    }
    @Then("User add child details By Capturing, {string}, {string}, {string}, {string}, {string}")
    public void user_add_child_details_by_capturing(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
        familyCover20000.navigateChild();
        familyCover20000.clickTab();
        familyCover20000.enterChildName(string);
        familyCover20000.enterChildSurname(string2);
        familyCover20000.selectGender(string3);
        familyCover20000.enterChildID(string4);
        familyCover20000.ChildIsStudent(string5);
    }
    @When("user Proceed with capturing beneficiary details.")
    public void userProceedWithCapturingBeneficiaryDetails() throws InterruptedException {
        familyCover20000.navigateBeneficiary();
        familyCover20000.addBeneficiary();
        familyCover20000.selectRelation("Member Estate");
        familyCover20000.saveBeneficiary();

    }
    @Then("User add payer details By Capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_payer_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15) throws InterruptedException {
        familyCover20000.navigatePayer();
        familyCover20000.selectTittle(string);
        familyCover20000.enterName(string2);
        familyCover20000.enterSurname(string3);
        familyCover20000.fieldTextID();
        familyCover20000.mainIDPopUp(string4);
        familyCover20000.confirmationID(string5);
        familyCover20000.clickOK();
        familyCover20000.PayerRelation(string6);
        familyCover20000.selectDebit(string7);
        familyCover20000.selectDebiDate(string8);
        familyCover20000.selectBank(string9);
        familyCover20000.selectBranch(string10);
        familyCover20000.selectAccType(string11);
        familyCover20000.enterAccNum();
        familyCover20000.enterMainAcc(string12);
        familyCover20000.confirmAccount(string13);
        familyCover20000.OKButton();
        familyCover20000.enterMobiNum(string14);
        familyCover20000.isEmployee(string15);
        familyCover20000.confCheckBoxes();
        familyCover20000.clickSaveBtn();
        familyCover20000.navigateFICA();
        familyCover20000.navigatePremium();
       // familyCover20000.navigateRewards();
        familyCover20000.navigateSummary();
        familyCover20000.debiCheck();
        familyCover20000.SecondSaleIiII();
        familyCover20000.summaryTable();





    }


}

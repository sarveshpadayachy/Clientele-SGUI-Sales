package StepDefinitions.Clientele.UltimateDignityPlan;

import PageObjects.Clientele.UltimateDignityPlan.Family;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class FamilyStep extends PageObject {

    @Steps
    Family family;


    @Given("user log in SGUI Website.")
    public void userLogInSGUIWebsite() throws InterruptedException {
       family.OpenWebsite();

    }
    @When("user log in with valid Credentials by entering.")
    public void userLogInWithValidCredentialsByEntering() throws InterruptedException {
        family.clickArrowButton();
        family.PopUpLogin("WRambau", "WRambau@2024");
        family.LoginButton();
        family.ClienteleLogo();
        family.CaptureSale();
        family.LeadBasket();
        family.selectNew();
        family.LeadCheckBox();
        family.ActionSaleButton();

    }
    @Then("user select Plan cover on dropdown text list. {string}")
    public void userSelectPlanCoverOnDropdownTextList(String string) throws InterruptedException {
        family.FuneralIconButton();
        family.SelectPlanTextDropdown(string);
        family.SelectPlanOkBtn();
    }
    @When("user Select the Plan option:Member and family by selecting. {string}")
    public void userSelectThePlanOptionMemberAndFamilyBySelecting(String string) throws InterruptedException {
        family.GetRatesBtn();
        family.SelectPlanOption(string);

    }
    @Then("User select the Date of birth of the main life assured. {string}")
    public void userSelectTheDateOfBirthOfTheMainLifeAssured(String string) throws InterruptedException {
        family.SelectDoB(string);

    }


    @When("User on the slider select the cover amounts that are applicable to the plan chosen, {int}")
    public void userOnTheSliderSelectTheCoverAmountsThatAreApplicableToThePlanChosen(Integer int1) throws InterruptedException {
        family.selectCover(int1);
        family.ViewRates();
        family.StartSale();
        family.handleModelPopUp();

    }
    @Then("user add member details by capturing. {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void userAddMemberDetailsByCapturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) throws InterruptedException {
        family.selectTittleDropdown(string);
        family.EnterName(string2);
        family.EnterSurname(string3);
        family.selectSACitizen(string4);
        family.clickTextBox();
        family.enterID(string5);
        family.confirmID(string6);
        family.clickOKButton();
        //lumpSumCover20000.EnterDoB("1992-06-03");
        family.selectMonthlyIncome(string7);
        family.selectOccupation(string8);
        family.selectEduction(string9);
        family.enterCellNum(string10);
        family.enterPostalAddress(string11);
        family.enterPostalCode(string12);
        family.clickCopyPhysical();
        family.clickValidateBtn();
        family.clickSaveMMBtn();

    }


    @Then("user add spouse details by capturing. {string}, {string}, {string}, {string}, {string}")
    public void userAddSpouseDetailsByCapturing(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
        family.navigateSpouse();
        family.spouseTitle(string);
        family.spouseName(string2);
        family.spouseSurName(string3);
        family.spouseGender(string4);
        family.spouseID(string5);

    }

    @When("user add child details by capturing. {string}, {string}, {string}, {string}, {string}")
    public void userAddChildDetailsByCapturing(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
        family.navigateChild();
        family.clickTab();
        family.enterChildName(string);
        family.enterChildSurname(string2);
        family.selectGender(string3);
        family.enterChildID(string4);
        family.ChildIsStudent(string5);


    }

    @When("user add extended member by capturing. {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void userAddExtendedMemberByCapturing(String string, String string2, String string3, String string4, String string5, String string6, String string7) throws InterruptedException {
        family.navigateExtend();
        family.Tittle(string);
        family.Name(string2);
        family.Surname(string3);
        family.Relation(string4);
        family.Gender(string5);
        family.extendID(string6);
        family.PremiumPayBack(string7);


    }

    @When("user add cover amount on the slider of extended family, {int}")
    public void userAddCoverAmountOnTheSliderOfExtendedFamily(Integer int1) throws InterruptedException {
        family.extendedCover(int1);
    }
    @When("user add payer details by capturing. {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void userAddPayerDetailsByCapturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15) throws InterruptedException {
        family.navigateBeneficiary();
        family.addBeneficiary();
        family.selectRelation("Member Estate");
        family.saveBeneficiary();
        family.navigatePayer();
        family.selectTittle(string);
        family.enterName(string2);
        family.enterSurname(string3);
        family.fieldTextID();
        family.mainIDPopUp(string4);
        family.confirmationID(string5);
        family.clickOK();
        family.PayerRelation(string6);
        family.selectDebit(string7);
        family.selectDebiDate(string8);
        family.selectBank(string9);
        family.selectBranch(string10);
        family.selectAccType(string11);
        family.enterAccNum();
        family.enterMainAcc(string12);
        family.confirmAccount(string13);
        family.OKButton();
        family.enterMobiNum(string14);
        family.isEmployee(string15);
        family.confCheckBoxes();
        family.clickSaveBtn();

    }

    @Then("User proceed with the Cover and conclude sale...")
    public void userProceedWithTheCoverAndConcludeSale() throws InterruptedException {
        family.navigateFICA();
        family.navigatePremium();
        //family.navigateRewards();
        family.navigateSummary();
        family.debiCheck();
        family.SecondSaleIiII();
        family.summaryTable();


    }

}

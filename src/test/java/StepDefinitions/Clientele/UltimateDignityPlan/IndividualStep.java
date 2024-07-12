package StepDefinitions.Clientele.UltimateDignityPlan;

import PageObjects.Clientele.UltimateDignityPlan.Individual;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class IndividualStep extends PageObject {

    @Steps
    Individual individual;

    @Given("user log in SGUI Website....")
    public void userLogInSGUIWebsite() throws InterruptedException {
        individual.OpenWebsite();

    }
    @When("user log in with valid Credentials by entering,")
    public void userLogInWithValidCredentialsByEntering() throws InterruptedException {
        individual.clickArrowButton();
        individual.PopUpLogin("WRambau", "TonWins@2024");
        individual.LoginButton();
        individual.ClienteleLogo();
        individual.CaptureSale();
        individual.LeadBasket();
        individual.selectNew();
        individual.LeadCheckBox();
        individual.ActionSaleButton();

    }
    @Then("user select Plan cover on dropdown text list {string}")
    public void userSelectPlanCoverOnDropdownTextList(String string) throws InterruptedException {
        individual.FuneralIconButton();
        individual.SelectPlanTextDropdown(string);
        individual.SelectPlanOkBtn();

    }
    @When("user Select the Plan option: {string}")
    public void userSelectThePlanOption(String string) throws InterruptedException {
        individual.GetRatesBtn();
        individual.SelectPlanOption(string);

    }
    @Then("User select the Date of birth of the main life assured {string}")
    public void userSelectTheDateOfBirthOfTheMainLifeAssured(String string) throws InterruptedException {
        individual.SelectDoB(string);

    }
    @When("User on the slider select the cover amounts that are applicable to the plan chosen {int}")
    public void userOnTheSliderSelectTheCoverAmountsThatAreApplicableToThePlanChosen(Integer int1) throws InterruptedException {
        individual.selectCover(int1);
        individual.ViewRates();
        individual.StartSale();
        individual.handleModelPopUp();

    }
    @Then("user add member details by capturing {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void userAddMemberDetailsByCapturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) throws InterruptedException {
        individual.selectTittleDropdown(string);
        individual.EnterName(string2);
        individual.EnterSurname(string3);
        individual.selectSACitizen(string4);
        individual.clickTextBox();
        individual.enterID(string5);
        individual.confirmID(string6);
        individual.clickOKButton();
        //lumpSumCover20000.EnterDoB("1992-06-03");
        individual.selectMonthlyIncome(string7);
        individual.selectOccupation(string8);
        individual.selectEduction(string9);
        individual.enterCellNum(string10);
        individual.enterPostalAddress(string11);
        individual.enterPostalCode(string12);
        individual.clickCopyPhysical();
        individual.clickValidateBtn();
        individual.clickSaveMMBtn();

    }
    @Then("user add extended member by capturing {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void userAddExtendedMemberByCapturing(String string, String string2, String string3, String string4, String string5, String string6, String string7) throws InterruptedException {
        individual.navigateExtend();
        individual.Tittle(string);
        individual.Name(string2);
        individual.Surname(string3);
        individual.Relation(string4);
        individual.Gender(string5);
        individual.extendID(string6);
        individual.PremiumPayBack(string7);

    }
    @When("user add cover amount on the slider of extended family {int}")
    public void userAddCoverAmountOnTheSliderOfExtendedFamily(Integer int1) throws InterruptedException {
        individual.extendedCover(int1);

    }
    @When("user add payer details by capturing {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void userAddPayerDetailsByCapturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15) throws InterruptedException {
        individual.navigateBeneficiary();
        individual.addBeneficiary();
        individual.selectRelation("Member Estate");
        individual.saveBeneficiary();
        individual.navigatePayer();
        individual.selectTittle(string);
        individual.enterName(string2);
        individual.enterSurname(string3);
        individual.fieldTextID();
        individual.mainIDPopUp(string4);
        individual.confirmationID(string5);
        individual.clickOK();
        individual.PayerRelation(string6);
        individual.selectDebit(string7);
        individual.selectDebiDate(string8);
        individual.selectBank(string9);
        individual.selectBranch(string10);
        individual.selectAccType(string11);
        individual.enterAccNum();
        individual.enterMainAcc(string12);
        individual.confirmAccount(string13);
        individual.OKButton();
        individual.enterMobiNum(string14);
        individual.isEmployee(string15);
        individual.confCheckBoxes();
        individual.clickSaveBtn();

    }

    @Then("User proceed with the Cover and conclude sale....")
    public void userProceedWithTheCoverAndConcludeSale() throws InterruptedException {
        individual.navigateFICA();
        individual.navigatePremium();
      //  individual.navigateRewards();
        individual.navigateSummary();
        individual.debiCheck();
        individual.SecondSaleIiII();
        individual.summaryTable();


    }

}

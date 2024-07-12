package StepDefinitions.Legal;

import PageObjects.Legal.StandardLegalIndividual;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import runner.Legal.StandardLegal;

public class StandardLegalStep {


    @Steps
    StandardLegalIndividual  StandardLegalIndividual;


    @Given("user log in SGUI or shamba  website")
    public void userLogInSGUIOrShambaWebsite() throws InterruptedException {

        StandardLegalIndividual.OpenWebsite();
        // StandardLegalIndividual.clickOnArrowButton();
        StandardLegalIndividual.loginIn("kmolale", "Kebaabetswem@25");
        StandardLegalIndividual.ClienteleLogo();
        StandardLegalIndividual.CaptureSale();
        StandardLegalIndividual.LeadBasket();
        StandardLegalIndividual.selectNew();
        StandardLegalIndividual.RefreshIII();
        StandardLegalIndividual.LeadCheckBox();
        StandardLegalIndividual.ActionSaleButton();

    }

    @When("user Select the plan option {string}")
    public void user_select_the_plan_option(String SelectPlan) throws InterruptedException {
        StandardLegalIndividual.legalIconButton();
        StandardLegalIndividual.SelectPlanTextDropdown(SelectPlan);
        StandardLegalIndividual.SelectPlanOkBtn();

    }

    @Then("user Selects the date of birth of the main life assured, {string}")
    public void userSelectsTheDateOfBirthOfTheMainLifeAssuredMainLifeDOB(String mainLifeDOB) throws InterruptedException {
        StandardLegalIndividual.GetRatesBtn();
        StandardLegalIndividual.SelectPlanOptionII();
        StandardLegalIndividual.SelectDoB(mainLifeDOB);
        // StandardLegalIndividual.selectCoverAmount();

    }

    @When("user Select the plan option and then a consultant enters all the necessary required member details, {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},")
    public void userSelectThePlanOptionAndThenAConsultantEntersAllTheNecessaryRequiredMemberDetailsTittleNameSurnameSouthAfricanCitizenIDNumberIDNumberDateOfBirthMonthlyIncomeOccupationEducationCellNumberPostalAddressPostalCode(String Tittle, String Name, String Surname, String SouthAfricanCitizen, String IDNumber1, String IDNumber2, String DateOfBirth, String MonthlyIncome, String Occupation, String Education, String CellNumber, String PostalAddress, String PostalCode) throws InterruptedException {
        //StandardLegalIndividual.selectCoverAmount();
        StandardLegalIndividual.ViewRates();
        StandardLegalIndividual.StartSale();
        StandardLegalIndividual.handleModelPopUp();
        //Main Member details
        StandardLegalIndividual.selectTittleDropdown(Tittle);
        StandardLegalIndividual.EnterName(Name);
        StandardLegalIndividual.EnterSurname(Surname);
        StandardLegalIndividual.selectSACitizen(SouthAfricanCitizen);
        StandardLegalIndividual.clickTextBox();
        StandardLegalIndividual.enterID(IDNumber1);
        StandardLegalIndividual.confirmID(IDNumber2);
        StandardLegalIndividual.clickOKButton();
        StandardLegalIndividual.EnterDoB(DateOfBirth);
        StandardLegalIndividual.selectMonthlyIncome(MonthlyIncome);
        StandardLegalIndividual.selectOccupation(Occupation);
        StandardLegalIndividual.selectEduction(Education);
        StandardLegalIndividual.enterCellNum(CellNumber);
        StandardLegalIndividual.enterPostalAddress(PostalAddress);
        StandardLegalIndividual.enterPostalCode(PostalCode);
        StandardLegalIndividual.clickCopyPhysical();
        StandardLegalIndividual.clickValidateBtn();
        StandardLegalIndividual.clickSaveMMBtn();
    }

    @Then("a consultant enters required  extended member details  {string},{string},{string},{string},{string},{string}")
    public void aConsultantEntersRequiredExtendedMemberDetailsExtMemberTitleBExtMmemberNameBExtMmemberSurnameBExtMmemberRelationshipBExtMmemberGenderBExtMmemberIDNumberB( String ExtMemberTitle,String ExtMmemberName,String ExtMmemberSurname,String ExtMmemberRelationship, String ExtMmemberGender, String ExtMmemberIDNumber ) throws InterruptedException {



        StandardLegalIndividual.NavExtMemberPageB();
        StandardLegalIndividual.addExtFamilyB();
        StandardLegalIndividual.ExtendedTitleB(ExtMemberTitle);
        StandardLegalIndividual.ExtMemNameB(ExtMmemberName);
        StandardLegalIndividual.ExtMemSurnameB(ExtMmemberSurname);
        StandardLegalIndividual.SelectExtendedmemberRelationshipB(ExtMmemberRelationship);
        StandardLegalIndividual.SelectExtendedmemberGenderB(ExtMmemberGender);
        StandardLegalIndividual.ExtMmemberIDNumberB(ExtMmemberIDNumber);
        StandardLegalIndividual.SaveMemberB();


    }

    @When("user adds beneficiary as well as payer details and  proceeds with the cover and conclude sales, {string}, {string}, {string},{string},{string},{string},{string},{string},{string},{string},{string}, {string}, {string}, {string},{string},{string},{string},")
    public void userAddsBeneficiaryAsWellAsPayerDetailsAndProceedsWithTheCoverAndConcludeSalesBeneficiaryRelationshipConvertPayerTitlePayerNamePayerSurnamePayerIDPayerIDRelationshipDebitDayFirstDebitDayBankNameBranchCodeAccountTypeAccountNumberAccountNumberMobileNumberIsEmployee(String BeneficiaryRelationship, String Convert,String PayerTitle, String PayerName, String PayerSurname, String PayerID1, String PayerID2, String Relationship, String DebitDay, String FirstDebitDay, String BankName, String BranchCode, String AccountType, String AccountNumber1, String AccountNumber2, String MobileNumber, String IsEmployee) throws InterruptedException {
        StandardLegalIndividual.navigateBeneficiary();
        StandardLegalIndividual.addBeneficiary();
        StandardLegalIndividual.selectRelation(BeneficiaryRelationship);
        StandardLegalIndividual.saveBeneficiary();
        StandardLegalIndividual.navigatePayer();
        StandardLegalIndividual.selectTittle(PayerTitle);
        StandardLegalIndividual.enterName(PayerName);
        StandardLegalIndividual.enterSurname(PayerSurname);
        StandardLegalIndividual.fieldTextID();
        StandardLegalIndividual.mainIDPopUp(PayerID1);
        StandardLegalIndividual.confirmationID(PayerID2);
        StandardLegalIndividual.clickOK();
        StandardLegalIndividual.PayerRelation(Relationship);
        StandardLegalIndividual.selectDebit(DebitDay);
        StandardLegalIndividual.selectDebiDate(FirstDebitDay);
        StandardLegalIndividual.selectBank(BankName);
        StandardLegalIndividual.selectBranch(BranchCode);
        StandardLegalIndividual.selectAccType(AccountType);
        StandardLegalIndividual.enterAccNum();
        StandardLegalIndividual.enterMainAcc(AccountNumber1);
        StandardLegalIndividual.confirmAccount(AccountNumber2);
        StandardLegalIndividual.OKButton();
        StandardLegalIndividual.enterMobiNum(MobileNumber);
        StandardLegalIndividual.isEmployee(IsEmployee);
        StandardLegalIndividual.confCheckBoxes();
        StandardLegalIndividual.clickSaveBtn();
        StandardLegalIndividual.navigateFICA();
        StandardLegalIndividual.navigatePremium();
        StandardLegalIndividual.ConvertDropdown(Convert);
        StandardLegalIndividual.permissionObtained();
        StandardLegalIndividual.SavePremium();
        StandardLegalIndividual.navigateRewards();
        StandardLegalIndividual.navigateSummary();
        StandardLegalIndividual.debiCheck();
        StandardLegalIndividual.SecondSaleIiII();
        StandardLegalIndividual.summaryTable();

    }

}

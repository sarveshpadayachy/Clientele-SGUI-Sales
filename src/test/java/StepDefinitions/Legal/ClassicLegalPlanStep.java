package StepDefinitions.Legal;

import PageObjects.Legal.ClassicLegalPlan;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class ClassicLegalPlanStep {

    @Steps
    ClassicLegalPlan ClassicLegalPlan ;


    @Given("User log in SGUI or shamba  website,")
    public void userLogInSGUIOrShambaWebsite()throws InterruptedException {

        ClassicLegalPlan.OpenWebsite();
        // ClassicLegalPlan.clickOnArrowButton();
        ClassicLegalPlan.loginIn("kmolale", "Kebaabetswem@14");
        ClassicLegalPlan.ClienteleLogo();
        ClassicLegalPlan.CaptureSale();
        ClassicLegalPlan.LeadBasket();
        ClassicLegalPlan.selectNew();
        ClassicLegalPlan.RefreshII();
        ClassicLegalPlan.LeadCheckBox();
        ClassicLegalPlan.ActionSaleButton();

    }
    @When("User Select the plan option {string}")
    public void userSelectThePlanOptionSelectPlan(String SelectPlan)  throws InterruptedException {
        ClassicLegalPlan.legalIconButton();
        ClassicLegalPlan.SelectPlanTextDropdown(SelectPlan);
        ClassicLegalPlan.SelectPlanOkBtn();

    }
    @Then("User Selects the date of birth of the main life assured, {string}, {string}")
    public void userSelectsTheDateOfBirthOfTheMainLifeAssuredPlanOPMainLifeDOB(String PlanOP1, String mainLifeDOB)  throws InterruptedException {
        ClassicLegalPlan.GetRatesBtn();
        ClassicLegalPlan.SelectPlanOptionII(PlanOP1);
        ClassicLegalPlan.SelectDoB(mainLifeDOB);
        // ClassicLegalPlan.selectCoverAmount();

    }
    @When("User Select the plan option and then a consultant enters all the necessary required member details, {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},")
    public void userSelectThePlanOptionAndThenAConsultantEntersAllTheNecessaryRequiredMemberDetailsTittleNameSurnameSouthAfricanCitizenIDNumberIDNumberDateOfBirthMonthlyIncomeOccupationEducationCellNumberPostalAddressPostalCode(String Tittle, String Name,String Surname, String SouthAfricanCitizen,String IDNumber1, String IDNumber2, String DateOfBirth, String MonthlyIncome,String Occupation, String Education, String CellNumber,String PostalAddress, String PostalCode ) throws InterruptedException {
        //ClassicLegalPlan.selectCoverAmount();
        ClassicLegalPlan.ViewRates();
        ClassicLegalPlan.StartSale();
        ClassicLegalPlan.handleModelPopUp();
        //Main Member details
        ClassicLegalPlan.selectTittleDropdown(Tittle);
        ClassicLegalPlan.EnterName(Name);
        ClassicLegalPlan.EnterSurname(Surname);
        ClassicLegalPlan.selectSACitizen(SouthAfricanCitizen);
        ClassicLegalPlan.clickTextBox();
        ClassicLegalPlan.enterID(IDNumber1);
        ClassicLegalPlan.confirmID(IDNumber2);
        ClassicLegalPlan.clickOKButton();
        ClassicLegalPlan.EnterDoB(DateOfBirth);
        ClassicLegalPlan.selectMonthlyIncome(MonthlyIncome);
        ClassicLegalPlan.selectOccupation(Occupation);
        ClassicLegalPlan.selectEduction(Education);
        ClassicLegalPlan.enterCellNum(CellNumber);
        ClassicLegalPlan.enterPostalAddress(PostalAddress);
        ClassicLegalPlan.enterPostalCode(PostalCode);
        ClassicLegalPlan.clickCopyPhysical();
        ClassicLegalPlan.clickValidateBtn();
        ClassicLegalPlan.clickSaveMMBtn();
    }



    @When("a user enters required spouse and child details  {string}, {string},{string} , {string}, {string}, {string}, {string}, {string}, {string}, {string},")
    public void aUserEntersRequiredSpouseAndChildDetailsSpouseTitleSpouseNameSpouseSurnameSpouseGenderSpouseIDNumberChildNameChildSurnameChildGenChildIDNumberChildIsStudent(String SpouseTitle, String SpouseName, String spouseSurname, String SpouseGender,String SpouseIDNumber,String ChildName,String childSurname,String childGen,String  ChildIDNumber,String ChildIsStudent) throws InterruptedException {

        ClassicLegalPlan.navigateSpouse();
        ClassicLegalPlan.SpouseTitle(SpouseTitle);
        ClassicLegalPlan.SpouseName(SpouseName);
        ClassicLegalPlan.spouseSurname(spouseSurname);
        ClassicLegalPlan.SelectSpouseGender(SpouseGender);
        ClassicLegalPlan.SpouseIDNumber(SpouseIDNumber);
        ClassicLegalPlan.SaveSpouse();
        ClassicLegalPlan.NavigateChild();
        ClassicLegalPlan.addChild();
        ClassicLegalPlan.EnterChildName(ChildName);
        ClassicLegalPlan.childSurname(childSurname);
        ClassicLegalPlan.childGen(childGen);
        ClassicLegalPlan.ChildIDNumber(ChildIDNumber);
        ClassicLegalPlan.ChildIsStudent(ChildIsStudent);
        ClassicLegalPlan.SAVEChild();
//        ClassicLegalPlan.NavExtMemberPage();
//        ClassicLegalPlan.addExtFamily();
//        ClassicLegalPlan.ExtendedTitle(ExtMemberTitle);
//        ClassicLegalPlan.ExtMemName(ExtMmemberName);
//        ClassicLegalPlan.ExtMemSurname(ExtMmemberSurname);
//        ClassicLegalPlan.SelectExtendedmemberRelationship(ExtMmemberRelationship);
//        ClassicLegalPlan.SelectExtendedmemberGender(ExtMmemberGender);
//        ClassicLegalPlan.ExtMmemberIDNumber(ExtMmemberIDNumber);
//        ClassicLegalPlan.SaveMember();
// , String ExtMemberTitle,String ExtMmemberName,String ExtMmemberSurname,String ExtMmemberRelationship,String ExtMmemberGender, String ExtMmemberIDNumber

    }
    @Then("a user then enters extended member details  {string},{string},{string},{string},{string},{string}")
    public void aUserThenEntersExtendedMemberDetailsExtMemberTitleExtMmemberNameExtMmemberSurnameExtMmemberRelationshipExtMmemberGenderExtMmemberIDNumber(String ExtMemberTitle,String ExtMmemberName,String ExtMmemberSurname,String ExtMmemberRelationship, String ExtMmemberGender, String ExtMmemberIDNumber ) throws InterruptedException {
        ClassicLegalPlan.NavExtMemberPage();
        ClassicLegalPlan.addExtFamily();
        ClassicLegalPlan.ExtendedTitle(ExtMemberTitle);
        ClassicLegalPlan.ExtMemName(ExtMmemberName);
        ClassicLegalPlan.ExtMemSurname(ExtMmemberSurname);
        ClassicLegalPlan.SelectExtendedmemberRelationship(ExtMmemberRelationship);
        ClassicLegalPlan.SelectExtendedmemberGender(ExtMmemberGender);
        ClassicLegalPlan.ExtMmemberIDNumber(ExtMmemberIDNumber);
        ClassicLegalPlan.SaveMember();
    }

    @When("User adds beneficiary and  proceeds with the cover and conclude sales, {string}")
    public void userAddsBeneficiaryAndProceedsWithTheCoverAndConcludeSalesBeneficiaryRelationship(String BeneficiaryRelationship)   throws InterruptedException {
        ClassicLegalPlan.navigateBeneficiary();
        ClassicLegalPlan.addBeneficiary();
        ClassicLegalPlan.selectRelation(BeneficiaryRelationship);
        ClassicLegalPlan.saveBeneficiary();

    }
    @Then("A consultant enters required payer details,  {string},{string},{string},{string},{string},{string},{string},{string},{string}, {string}, {string}, {string},{string},{string},{string}, {string}")
    public void aConsultantEntersRequiredPayerDetailsPayerTitlePayerNamePayerSurnamePayerIDPayerIDRelationshipDebitDayFirstDebitDayBankNameBranchCodeAccountTypeAccountNumberAccountNumberMobileNumberIsEmployeeConvert(String PayerTitle, String PayerName,String PayerSurname, String PayerID1, String PayerID2, String Relationship, String DebitDay, String FirstDebitDay,String BankName, String BranchCode, String AccountType, String AccountNumber1, String AccountNumber2, String MobileNumber, String IsEmployee, String Convert) throws InterruptedException {

        //Payer Details
        ClassicLegalPlan.navigatePayer();
        ClassicLegalPlan.selectTittle(PayerTitle);
        ClassicLegalPlan.enterName(PayerName);
        ClassicLegalPlan.enterSurname(PayerSurname);
        ClassicLegalPlan.fieldTextID();
        ClassicLegalPlan.mainIDPopUp(PayerID1);
        ClassicLegalPlan.confirmationID(PayerID2);
        ClassicLegalPlan.clickOK();
        ClassicLegalPlan.PayerRelation(Relationship);
        ClassicLegalPlan.selectDebit(DebitDay);
        ClassicLegalPlan.selectDebiDate(FirstDebitDay);
        ClassicLegalPlan.selectBank(BankName);
        ClassicLegalPlan.selectBranch(BranchCode);
        ClassicLegalPlan.selectAccType(AccountType);
        ClassicLegalPlan.enterAccNum();
        ClassicLegalPlan.enterMainAcc(AccountNumber1);
        ClassicLegalPlan.confirmAccount(AccountNumber2);
        ClassicLegalPlan.OKButton();
        ClassicLegalPlan.enterMobiNum(MobileNumber);
        ClassicLegalPlan.isEmployee(IsEmployee);
//        ClassicLegalPlan.EmployeeNmb(EmployeeNmber);
//        ClassicLegalPlan.Department(Department);
//        ClassicLegalPlan.SelectDeductionAuth(Deduction);
        ClassicLegalPlan.confCheckBoxes();
        ClassicLegalPlan.clickSaveBtn();

        //, String EmployeeNmber, String Department,String Deduction
        ClassicLegalPlan.navigateFICA();
        ClassicLegalPlan.navigatePremium();
        ClassicLegalPlan.ConvertDropdown(Convert);
//        ClassicLegalPlan.permissionObtained();
        ClassicLegalPlan.SavePremium();
      //  ClassicLegalPlan.navigateRewards();
        ClassicLegalPlan.navigateSummary();
//        ClassicLegalPlan.navigateGovQ();
        ClassicLegalPlan.debiCheck();
        ClassicLegalPlan.SecondSaleIiII();
        ClassicLegalPlan.summaryTable();


    }



}

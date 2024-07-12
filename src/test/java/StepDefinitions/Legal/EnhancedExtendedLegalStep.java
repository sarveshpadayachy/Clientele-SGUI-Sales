package StepDefinitions.Legal;

import PageObjects.Legal.EnhancedExtendedLegalFamily;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class EnhancedExtendedLegalStep {
    @Steps
    EnhancedExtendedLegalFamily  EnhancedExtendedLegalFamily;


    @Given("User log in SGUI OR shamba  website")
    public void userLogInSGUIORShambaWebsite() throws InterruptedException {

        EnhancedExtendedLegalFamily.OpenWebsite();
        //  EnhancedExtendedLegalFamily.clickOnArrowButton();
        EnhancedExtendedLegalFamily.loginIn("kmolale", "Kebaabetswem@25");
        EnhancedExtendedLegalFamily.ClienteleLogo();
        EnhancedExtendedLegalFamily.CaptureSale();
        EnhancedExtendedLegalFamily.LeadBasket();
        EnhancedExtendedLegalFamily.selectNew();
        EnhancedExtendedLegalFamily.Refresh();
        EnhancedExtendedLegalFamily.LeadCheckBox();
        EnhancedExtendedLegalFamily.ActionSaleButton();

    }
    @When("User Selects the desired plan option ,{string}")
    public void userSelectsTheDesiredPlanOptionSelectPlan(String SelectPlan)  throws InterruptedException {
        EnhancedExtendedLegalFamily.legalIconButton();
        EnhancedExtendedLegalFamily.SelectPlanTextDropdown(SelectPlan);
        EnhancedExtendedLegalFamily.SelectPlanOkBtn();

    }
    @Then("User then Selects the date of birth of the main life assured and the desired plan option {string},{string}")
    public void userThenSelectsTheDateOfBirthOfTheMainLifeAssuredAndTheDesiredPlanOptionMainLifeDOB(String PlanOPss, String mainLifeDOB)  throws InterruptedException {
        EnhancedExtendedLegalFamily.GetRatesBtn();
        EnhancedExtendedLegalFamily.SelectPlanOptionII(PlanOPss);
        EnhancedExtendedLegalFamily.SelectDoB(mainLifeDOB);
        //  EnhancedExtendedLegalFamily.selectCoverAmount();

    }
    @When("User Selects the plan option and then a consultant enters all the necessary required  details of the main member. {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},")
    public void userSelectsThePlanOptionAndThenAConsultantEntersAllTheNecessaryRequiredDetailsOfTheMainMemberTittleNameSurnameSouthAfricanCitizenIDNumberIDNumberDateOfBirthMonthlyIncomeOccupationEducationCellNumberPostalAddressPostalCode(String Tittle, String Name,String Surname, String SouthAfricanCitizen,String IDNumber1, String IDNumber2, String DateOfBirth, String MonthlyIncome,String Occupation, String Education, String CellNumber,String PostalAddress, String PostalCode ) throws InterruptedException {
        EnhancedExtendedLegalFamily.selectCoverAmount();
        EnhancedExtendedLegalFamily.ViewRates();
        EnhancedExtendedLegalFamily.StartSale();
        EnhancedExtendedLegalFamily.handleModelPopUp();
        //Main Member details
        EnhancedExtendedLegalFamily.selectTittleDropdown(Tittle);
        EnhancedExtendedLegalFamily.EnterName(Name);
        EnhancedExtendedLegalFamily.EnterSurname(Surname);
        EnhancedExtendedLegalFamily.selectSACitizen(SouthAfricanCitizen);
        EnhancedExtendedLegalFamily.clickTextBox();
        EnhancedExtendedLegalFamily.enterID(IDNumber1);
        EnhancedExtendedLegalFamily.confirmID(IDNumber2);
        EnhancedExtendedLegalFamily.clickOKButton();
        EnhancedExtendedLegalFamily.EnterDoB(DateOfBirth);
        EnhancedExtendedLegalFamily.selectMonthlyIncome(MonthlyIncome);
        EnhancedExtendedLegalFamily.selectOccupation(Occupation);
        EnhancedExtendedLegalFamily.selectEduction(Education);
        EnhancedExtendedLegalFamily.enterCellNum(CellNumber);
        EnhancedExtendedLegalFamily.enterPostalAddress(PostalAddress);
        EnhancedExtendedLegalFamily.enterPostalCode(PostalCode);
        EnhancedExtendedLegalFamily.clickCopyPhysical();
        EnhancedExtendedLegalFamily.clickValidateBtn();
        EnhancedExtendedLegalFamily.clickSaveMMBtn();
    }





    @Then("A consultant enters required Spouse, child and  extended member details {string}, {string},{string} , {string}, {string}, {string}, {string}, {string}, {string}, {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void aConsultantEntersRequiredSpouseChildAndExtendedMemberDetailsSpouseTitleSpouseNameSpouseSurnameSpouseGenderSpouseIDNumberChildNameChildSurnameChildGenChildIDNumberChildIsStudentExtMemberTitleExtMmemberNameExtMmemberSurnameExtMmemberRelationshipPreFeeExtMmemberGenderExtMmemberIDNumberExtMemberTitleIIExtMmemberNameIIExtMmemberSurnameIIExtMmemberRelationshipIIPreFeeIIExtMmemberGenderIIExtMmemberIDNumberIIExtMemberTitleIIIExtMmemberNameIIIExtMmemberSurnameIIIExtMmemberRelationshipIIIPreFeeIIIExtMmemberGenderIIIExtMmemberIDNumberIIIExtMemberTitleExtMmemberNameExtMmemberSurnameExtMmemberRelationshipPreFeeExtMmemberGenderExtMmemberIDNumber(String SpouseTitle, String SpouseName, String spouseSurname, String SpouseGender,String SpouseIDNumber,String ChildName,String childSurname,String childGen,String  ChildIDNumber,String ChildIsStudent,String ExtMemberTitle,String ExtMmemberName,String ExtMmemberSurname,String ExtMmemberRelationship,String PreFee, String ExtMmemberGender, String ExtMmemberIDNumber ,String ExtMemberTitleII,String ExtMmemberNameII,String ExtMmemberSurnameII,String ExtMmemberRelationshipII,String PreFeeII, String ExtMmemberGenderII, String ExtMmemberIDNumberII ,String ExtMemberTitleIII,String ExtMmemberNameIII,String ExtMmemberSurnameIII,String ExtMmemberRelationshipIII,String PreFeeIII, String ExtMmemberGenderIII, String ExtMmemberIDNumberIII ,String ExtMemberTitle4,String ExtMmemberName4,String ExtMmemberSurname4,String ExtMmemberRelationship4,String PreFee4, String ExtMmemberGender4, String ExtMmemberIDNumber4) throws InterruptedException {


        EnhancedExtendedLegalFamily.navigateSpouse();
        EnhancedExtendedLegalFamily.SpouseTitle(SpouseTitle);
        EnhancedExtendedLegalFamily.SpouseName(SpouseName);
        EnhancedExtendedLegalFamily.spouseSurname(spouseSurname);
        EnhancedExtendedLegalFamily.SelectSpouseGender(SpouseGender);
        EnhancedExtendedLegalFamily.SpouseIDNumber(SpouseIDNumber);
        EnhancedExtendedLegalFamily.SaveSpouse();
        EnhancedExtendedLegalFamily.NavigateChild();
        EnhancedExtendedLegalFamily.addChild();
        EnhancedExtendedLegalFamily.EnterChildName(ChildName);
        EnhancedExtendedLegalFamily.childSurname(childSurname);
        EnhancedExtendedLegalFamily.childGen(childGen);
        EnhancedExtendedLegalFamily.ChildIDNumber(ChildIDNumber);
        EnhancedExtendedLegalFamily.ChildIsStudent(ChildIsStudent);
        EnhancedExtendedLegalFamily.SAVEChild();
        EnhancedExtendedLegalFamily.NavExtMemberPage();
        EnhancedExtendedLegalFamily.addExtFamily();
        EnhancedExtendedLegalFamily.ExtendedTitle(ExtMemberTitle);
        EnhancedExtendedLegalFamily.ExtMemName(ExtMmemberName);
        EnhancedExtendedLegalFamily.ExtMemSurname(ExtMmemberSurname);
        EnhancedExtendedLegalFamily.SelectExtendedmemberRelationship(ExtMmemberRelationship);
        EnhancedExtendedLegalFamily.PremiumFee(PreFee);
        EnhancedExtendedLegalFamily.SelectExtendedmemberGender(ExtMmemberGender);
        EnhancedExtendedLegalFamily.ExtMmemberIDNumber(ExtMmemberIDNumber);
        EnhancedExtendedLegalFamily.SaveMember();
        EnhancedExtendedLegalFamily.addExtFamilyII();
        EnhancedExtendedLegalFamily.ExtendedTitleII(ExtMemberTitleII);
        EnhancedExtendedLegalFamily.ExtMemNameII(ExtMmemberNameII);
        EnhancedExtendedLegalFamily.ExtMemSurnameII(ExtMmemberSurnameII);
        EnhancedExtendedLegalFamily.SelectExtendedmemberRelationshipII(ExtMmemberRelationshipII);
        EnhancedExtendedLegalFamily.PremiumFeeII(PreFeeII);
        EnhancedExtendedLegalFamily.SelectExtendedmemberGenderII(ExtMmemberGenderII);
        EnhancedExtendedLegalFamily.ExtMmemberIDNumberII(ExtMmemberIDNumberII);
        EnhancedExtendedLegalFamily.SaveMemberII();
        EnhancedExtendedLegalFamily.addExtFamilyIII();
        EnhancedExtendedLegalFamily.ExtendedTitleIII(ExtMemberTitleIII);
        EnhancedExtendedLegalFamily.ExtMemNameIII(ExtMmemberNameIII);
        EnhancedExtendedLegalFamily.ExtMemSurnameIII(ExtMmemberSurnameIII);
        EnhancedExtendedLegalFamily.SelectExtendedmemberRelationshipIII(ExtMmemberRelationshipIII);
        EnhancedExtendedLegalFamily.PremiumFeeIII(PreFeeIII);
        EnhancedExtendedLegalFamily.SelectExtendedmemberGenderIII(ExtMmemberGenderIII);
        EnhancedExtendedLegalFamily.ExtMmemberIDNumberIII(ExtMmemberIDNumberIII);
        EnhancedExtendedLegalFamily.SaveMemberIII();
        EnhancedExtendedLegalFamily.addExtFamily4();
        EnhancedExtendedLegalFamily.ExtendedTitle4(ExtMemberTitle4);
        EnhancedExtendedLegalFamily.ExtMemName4(ExtMmemberName4);
        EnhancedExtendedLegalFamily.ExtMemSurname4(ExtMmemberSurname4);
        EnhancedExtendedLegalFamily.SelectExtendedmemberRelationship4(ExtMmemberRelationship4);
        EnhancedExtendedLegalFamily.PremiumFee4(PreFee4);
        EnhancedExtendedLegalFamily.SelectExtendedmemberGender4(ExtMmemberGender4);
        EnhancedExtendedLegalFamily.ExtMmemberIDNumber4(ExtMmemberIDNumber4);
        EnhancedExtendedLegalFamily.SaveMember4();





    }


    @When("User adds beneficiary details as well as payer details and  proceeds with the cover and concludes the sale, {string}, {string},{string},{string},{string},{string},{string},{string},{string},{string}, {string}, {string}, {string},{string},{string},{string}, {string},")
    public void userAddsBeneficiaryDetailsAsWellAsPayerDetailsAndProceedsWithTheCoverAndConcludesTheSaleBeneficiaryRelationshipPayerTitlePayerNamePayerSurnamePayerIDPayerIDRelationshipDebitDayFirstDebitDayBankNameBranchCodeAccountTypeAccountNumberAccountNumberMobileNumberIsEmployeeConvert(String BeneficiaryRelationship,String PayerTitle, String PayerName,String PayerSurname, String PayerID1, String PayerID2, String Relationship, String DebitDay, String FirstDebitDay,String BankName, String BranchCode, String AccountType, String AccountNumber1, String AccountNumber2, String MobileNumber, String IsEmployee , String Convert)   throws InterruptedException {
        EnhancedExtendedLegalFamily.navigateBeneficiary();
        EnhancedExtendedLegalFamily.addBeneficiary();
        EnhancedExtendedLegalFamily.selectRelation(BeneficiaryRelationship);
        EnhancedExtendedLegalFamily.saveBeneficiary();
        EnhancedExtendedLegalFamily.navigatePayer();
        EnhancedExtendedLegalFamily.selectTittle(PayerTitle);
        EnhancedExtendedLegalFamily.enterName(PayerName);
        EnhancedExtendedLegalFamily.enterSurname(PayerSurname);
        EnhancedExtendedLegalFamily.fieldTextID();
        EnhancedExtendedLegalFamily.mainIDPopUp(PayerID1);
        EnhancedExtendedLegalFamily.confirmationID(PayerID2);
        EnhancedExtendedLegalFamily.clickOK();
        EnhancedExtendedLegalFamily.PayerRelation(Relationship);
        EnhancedExtendedLegalFamily.selectDebit(DebitDay);
        EnhancedExtendedLegalFamily.selectDebiDate(FirstDebitDay);
        EnhancedExtendedLegalFamily.selectBank(BankName);
        EnhancedExtendedLegalFamily.selectBranch(BranchCode);
        EnhancedExtendedLegalFamily.selectAccType(AccountType);
        EnhancedExtendedLegalFamily.enterAccNum();
        EnhancedExtendedLegalFamily.enterMainAcc(AccountNumber1);
        EnhancedExtendedLegalFamily.confirmAccount(AccountNumber2);
        EnhancedExtendedLegalFamily.OKButton();
        EnhancedExtendedLegalFamily.enterMobiNum(MobileNumber);
        EnhancedExtendedLegalFamily.isEmployee(IsEmployee);
//        EnhancedExtendedLegalFamily.EmployeeNmb(EmployeeNmber);
//        EnhancedExtendedLegalFamily.Department(Department);
//        EnhancedExtendedLegalFamily.SelectDeductionAuth(Deduction);
        EnhancedExtendedLegalFamily.confCheckBoxes();
        EnhancedExtendedLegalFamily.clickSaveBtn();
        EnhancedExtendedLegalFamily.navigateFICA();
        EnhancedExtendedLegalFamily.navigatePremium();
        EnhancedExtendedLegalFamily.ConvertDropdown(Convert);
//        EnhancedExtendedLegalFamily.permissionObtained();
        EnhancedExtendedLegalFamily.SavePremium();
        EnhancedExtendedLegalFamily.navigateRewards();
        EnhancedExtendedLegalFamily.navigateSummary();
        EnhancedExtendedLegalFamily.debiCheck();
        EnhancedExtendedLegalFamily.SecondSaleIiII();
        EnhancedExtendedLegalFamily.summaryTable();

    }


}

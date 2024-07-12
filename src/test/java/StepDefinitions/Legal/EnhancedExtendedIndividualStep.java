package StepDefinitions.Legal;

import PageObjects.Legal.EnhancedExtendedLegalIndividual;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EnhancedExtendedIndividualStep {
  EnhancedExtendedLegalIndividual  EnhancedExtendedLegalIndividual ;


    @Given("User logs in SGUI or shamba  website")
    public void userLogsInSGUIOrShambaWebsite() throws InterruptedException {

        EnhancedExtendedLegalIndividual.OpenWebsite();
        // EnhancedExtendedLegalIndividual.clickOnArrowButton();
        EnhancedExtendedLegalIndividual.loginIn("kmolale", "Kebaabetswem@14");
        EnhancedExtendedLegalIndividual.ClienteleLogo();
        EnhancedExtendedLegalIndividual.CaptureSale();
        EnhancedExtendedLegalIndividual.LeadBasket();
        EnhancedExtendedLegalIndividual.selectNew();
        EnhancedExtendedLegalIndividual.RefreshII();
        EnhancedExtendedLegalIndividual.LeadCheckBox();
        EnhancedExtendedLegalIndividual.ActionSaleButton();

    }
    @When("User Select the plan option ,{string}")
    public void userSelectThePlanOptionSelectPlan(String SelectPlan)  throws InterruptedException {
        EnhancedExtendedLegalIndividual.legalIconButton();
        EnhancedExtendedLegalIndividual.SelectPlanTextDropdown(SelectPlan);
        EnhancedExtendedLegalIndividual.SelectPlanOkBtn();

    }
    @Then("User Selects the plan option and  date of birth of the main life assured {string},{string}")
    public void userSelectsThePlanOptionAndDateOfBirthOfTheMainLifeAssuredPlanOPMainLifeDOB(String PlanOP,String mainLifeDOB)  throws InterruptedException {
        EnhancedExtendedLegalIndividual.GetRatesBtn();
        EnhancedExtendedLegalIndividual.SelectPlanOptionIII(PlanOP);
        EnhancedExtendedLegalIndividual.SelectDoB(mainLifeDOB);
        EnhancedExtendedLegalIndividual.selectCoverAmountI();

    }
    @When("User Select the plan option and then a consultant enters all the necessary required member details. {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},")
    public void userSelectThePlanOptionAndThenAConsultantEntersAllTheNecessaryRequiredMemberDetailsTittleNameSurnameSouthAfricanCitizenIDNumberIDNumberDateOfBirthMonthlyIncomeOccupationEducationCellNumberPostalAddressPostalCode(String Tittle, String Name,String Surname, String SouthAfricanCitizen,String IDNumber1, String IDNumber2, String DateOfBirth, String MonthlyIncome,String Occupation, String Education, String CellNumber,String PostalAddress, String PostalCode ) throws InterruptedException {
        //EnhancedExtendedLegalIndividual.selectCoverAmount();
        EnhancedExtendedLegalIndividual.ViewRates();
        EnhancedExtendedLegalIndividual.StartSale();
        EnhancedExtendedLegalIndividual.handleModelPopUp();
        //Main Member details
        EnhancedExtendedLegalIndividual.selectTittleDropdown(Tittle);
        EnhancedExtendedLegalIndividual.EnterName(Name);
        EnhancedExtendedLegalIndividual.EnterSurname(Surname);
        EnhancedExtendedLegalIndividual.selectSACitizen(SouthAfricanCitizen);
        EnhancedExtendedLegalIndividual.clickTextBox();
        EnhancedExtendedLegalIndividual.enterID(IDNumber1);
        EnhancedExtendedLegalIndividual.confirmID(IDNumber2);
        EnhancedExtendedLegalIndividual.clickOKButton();
        EnhancedExtendedLegalIndividual.EnterDoB(DateOfBirth);
        EnhancedExtendedLegalIndividual.selectMonthlyIncome(MonthlyIncome);
        EnhancedExtendedLegalIndividual.selectOccupation(Occupation);
        EnhancedExtendedLegalIndividual.selectEduction(Education);
        EnhancedExtendedLegalIndividual.enterCellNum(CellNumber);
        EnhancedExtendedLegalIndividual.enterPostalAddress(PostalAddress);
        EnhancedExtendedLegalIndividual.enterPostalCode(PostalCode);
        EnhancedExtendedLegalIndividual.clickCopyPhysical();
        EnhancedExtendedLegalIndividual.clickValidateBtn();
        EnhancedExtendedLegalIndividual.clickSaveMMBtn();
    }



    @When("A consultant enters required extended member details {string},{string},{string},{string},{string},{string},{string}, {string},{string},{string},{string},{string},{string},{string}")
    public void aConsultantEntersRequiredExtendedMemberDetailsExtMemberTitleExtMmemberNameExtMmemberSurnameExtMmemberRelationshipPreFeeExtMmemberGenderExtMmemberIDNumberExtMemberTitleAExtMmemberNameAExtMmemberSurnameAExtMmemberRelationshipAPreFeeAExtMmemberGenderAExtMmemberIDNumberA(String ExtMemberTitle,String ExtMmemberName,String ExtMmemberSurname,String ExtMmemberRelationship,String PreFee,String ExtMmemberGender, String ExtMmemberIDNumber, String ExtMemberTitleA,String ExtMmemberNameA,String ExtMmemberSurnameA,String ExtMmemberRelationshipA,String PreFeeA,String ExtMmemberGenderA, String ExtMmemberIDNumberA) throws InterruptedException {


        EnhancedExtendedLegalIndividual.NavExtMemberPage();
        EnhancedExtendedLegalIndividual.addExtFamily();
        EnhancedExtendedLegalIndividual.ExtendedTitle(ExtMemberTitle);
        EnhancedExtendedLegalIndividual.ExtMemName(ExtMmemberName);
        EnhancedExtendedLegalIndividual.ExtMemSurname(ExtMmemberSurname);
        EnhancedExtendedLegalIndividual.SelectExtendedmemberRelationship(ExtMmemberRelationship);
        EnhancedExtendedLegalIndividual.PremiumFee(PreFee);
        EnhancedExtendedLegalIndividual.SelectExtendedmemberGender(ExtMmemberGender);
        EnhancedExtendedLegalIndividual.ExtMmemberIDNumber(ExtMmemberIDNumber);
        EnhancedExtendedLegalIndividual.SaveMember();
        EnhancedExtendedLegalIndividual.addExtFamilyA();
        EnhancedExtendedLegalIndividual.ExtendedTitleA(ExtMemberTitleA);
        EnhancedExtendedLegalIndividual.ExtMemNameA(ExtMmemberNameA);
        EnhancedExtendedLegalIndividual.ExtMemSurnameA(ExtMmemberSurnameA);
        EnhancedExtendedLegalIndividual.SelectExtendedmemberRelationshipA(ExtMmemberRelationshipA);
        EnhancedExtendedLegalIndividual.PremiumFeeA(PreFeeA);
        EnhancedExtendedLegalIndividual.SelectExtendedmemberGenderA(ExtMmemberGenderA);
        EnhancedExtendedLegalIndividual.ExtMmemberIDNumberA(ExtMmemberIDNumberA);
        EnhancedExtendedLegalIndividual.SaveMemberA();


    }


    @When("User adds beneficiary and  proceeds with the cover and concludes the sale, {string}")
    public void userAddsBeneficiaryAndProceedsWithTheCoverAndConcludesTheSaleBeneficiaryRelationship(String BeneficiaryRelationship)   throws InterruptedException {
        EnhancedExtendedLegalIndividual.navigateBeneficiary();
        EnhancedExtendedLegalIndividual.addBeneficiary();
        EnhancedExtendedLegalIndividual.selectRelation(BeneficiaryRelationship);
        EnhancedExtendedLegalIndividual.saveBeneficiary();

    }

    @Then("A consultant enters required necessary payer details,  {string},{string},{string},{string},{string},{string},{string},{string},{string}, {string}, {string}, {string},{string},{string},{string}, {string}")
    public void aConsultantEntersRequiredNecessaryPayerDetailsPayerTitlePayerNamePayerSurnamePayerIDPayerIDRelationshipDebitDayFirstDebitDayBankNameBranchCodeAccountTypeAccountNumberAccountNumberMobileNumberIsEmployeeConvert(String PayerTitle, String PayerName,String PayerSurname, String PayerID1, String PayerID2, String Relationship, String DebitDay, String FirstDebitDay,String BankName, String BranchCode, String AccountType, String AccountNumber1, String AccountNumber2, String MobileNumber, String IsEmployee, String Convert) throws InterruptedException {

        //Payer Details
        EnhancedExtendedLegalIndividual.navigatePayer();
        EnhancedExtendedLegalIndividual.selectTittle(PayerTitle);
        EnhancedExtendedLegalIndividual.enterName(PayerName);
        EnhancedExtendedLegalIndividual.enterSurname(PayerSurname);
        EnhancedExtendedLegalIndividual.fieldTextID();
        EnhancedExtendedLegalIndividual.mainIDPopUp(PayerID1);
        EnhancedExtendedLegalIndividual.confirmationID(PayerID2);
        EnhancedExtendedLegalIndividual.clickOK();
        EnhancedExtendedLegalIndividual.PayerRelation(Relationship);
        EnhancedExtendedLegalIndividual.selectDebit(DebitDay);
        EnhancedExtendedLegalIndividual.selectDebiDate(FirstDebitDay);
        EnhancedExtendedLegalIndividual.selectBank(BankName);
        EnhancedExtendedLegalIndividual.selectBranch(BranchCode);
        EnhancedExtendedLegalIndividual.selectAccType(AccountType);
        EnhancedExtendedLegalIndividual.enterAccNum();
        EnhancedExtendedLegalIndividual.enterMainAcc(AccountNumber1);
        EnhancedExtendedLegalIndividual.confirmAccount(AccountNumber2);
        EnhancedExtendedLegalIndividual.OKButton();
        EnhancedExtendedLegalIndividual.enterMobiNum(MobileNumber);
        EnhancedExtendedLegalIndividual.isEmployee(IsEmployee);
//        EnhancedExtendedLegalIndividual.EmployeeNmb(EmployeeNmber);
//        EnhancedExtendedLegalIndividual.Department(Department);
//        EnhancedExtendedLegalIndividual.SelectDeductionAuth(Deduction);
        EnhancedExtendedLegalIndividual.confCheckBoxes();
        EnhancedExtendedLegalIndividual.clickSaveBtn();


        EnhancedExtendedLegalIndividual.navigateFICA();
        EnhancedExtendedLegalIndividual.navigatePremium();
        EnhancedExtendedLegalIndividual.ConvertDropdown(Convert);
//        CLPFamily.permissionObtained();
        EnhancedExtendedLegalIndividual.SavePremium();
        EnhancedExtendedLegalIndividual.navigateRewards();
        EnhancedExtendedLegalIndividual.navigateSummary();
        EnhancedExtendedLegalIndividual.debiCheck();
        EnhancedExtendedLegalIndividual.SecondSaleIiII();
        EnhancedExtendedLegalIndividual.summaryTable();

    }

}




//src/test/resources/features/SingleGUI/Legal/EnhancedExtendedLegalIndividual.feature
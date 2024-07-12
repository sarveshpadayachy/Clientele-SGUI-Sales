package StepDefinitions.PageStep;

import PageObjects.GetRatesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class GetRatesPageStep extends PageObject {

    @Steps
    GetRatesPage getRatesPage;

    @Given("user opens Shamba application website")
    public void user_opens_shamba_application_website()throws InterruptedException {
       getRatesPage.OpenWebsite();
       getRatesPage.loginIn("WRambau@clientele.co.za", "clientele003");
       getRatesPage.ClienteleLogo();
       getRatesPage.CaptureSale();
       getRatesPage.LeadBasket();
       getRatesPage.LeadCheckBox();
       getRatesPage.ActionSaleButton();
       getRatesPage.HelpIconButton();
       getRatesPage.SelectPlanTextDropdown("YG");
       getRatesPage.SelectPlanOkBtn();

    }
    @When("user clicks on GetRates button")
    public void user_clicks_on_get_rates_button()throws InterruptedException {
        getRatesPage.GetRatesBtn();

    }
    @Then("user Click on Plan Option and select Cover")
    public void user_click_on_plan_option_and_select_cover() {
       getRatesPage.SelectPlanOption();

    }
    @When("user Click on Main life DoB text field and select dates")
    public void user_click_on_main_life_do_b_text_field_and_select_dates()throws InterruptedException{
        getRatesPage.SelectDoB("1994-06-03");

    }
    @Then("user Click on view button to proceed with quotes")
    public void user_click_on_view_button_to_proceed_with_quotes()throws InterruptedException{
        getRatesPage.ViewRates();

    }
    @When("User Click on Start Sale Button")
    public void user_click_on_start_sale_button()throws InterruptedException {
        getRatesPage.StartSale();
    }
    @Then("user Click continue or cancel button on FAIS Disclosure PopUp Link")
    public void user_click_continue_or_cancel_button_on_fais_disclosure_pop_up_link()throws InterruptedException{
       getRatesPage.handleModelPopUp();
       //Member Details steps
       getRatesPage.selectTittleDropdown("Mr");
       getRatesPage.EnterName("Joe");
       getRatesPage.EnterSurname("Smith");
       getRatesPage.selectSACitizen("Yes");
       getRatesPage.clickTextBox();
       getRatesPage.enterID("9406035600188");
       getRatesPage.confirmID("9406035600188");
       getRatesPage.clickOKButton();
       getRatesPage.EnterDoB("1994-06-03");
       getRatesPage.selectMonthlyIncome("Up to 3,000");
       getRatesPage.selectOccupation("Sales and services");
       getRatesPage.selectEduction("Matric");
       getRatesPage.enterCellNum("0601234231");
       getRatesPage.enterPostalAddress("Plot 30 ward 55 ");
       getRatesPage.enterPostalCode("1234");
       getRatesPage.clickCopyPhysical();
       getRatesPage.clickValidateBtn();
       getRatesPage.clickSaveMMBtn();
       //Payer Details
       getRatesPage.navigatePayer();
       getRatesPage.selectTittle("Miss");
       getRatesPage.enterName("Joy");
       getRatesPage.enterSurname("McGregor");
       getRatesPage.fieldTextID();
       getRatesPage.mainIDPopUp("9606035120182");
       getRatesPage.confirmationID("9606035120182");
       getRatesPage.clickOK();
       getRatesPage.PayerRelation("Sister");
       getRatesPage.selectDebit("30");
       getRatesPage.selectDebiDate("30 Nov 2023");
       getRatesPage.selectBank("CAPITEC BANK LTD");
       getRatesPage.selectBranch("470010");
       getRatesPage.selectAccType("Savings Account");
       getRatesPage.enterAccNum();
       getRatesPage.enterMainAcc("1234");
       getRatesPage.confirmAccount("1234");
       getRatesPage.OKButton();
       getRatesPage.enterMobiNum("0601234230");
       getRatesPage.isEmployee("No");
       getRatesPage.confCheckBoxes();
       getRatesPage.clickSaveBtn();
       //getRatesPage.navigateSpouse();
       //getRatesPage.navigateChild();
       getRatesPage.navigateBeneficiary();
       getRatesPage.addBeneficiary();
       getRatesPage.selectRelation("Member Estate");
       getRatesPage.saveBeneficiary();
       getRatesPage.navigateFICA();
       getRatesPage.navigatePremium();
       getRatesPage.navigateRewards();
       getRatesPage.navigateSummary();
       getRatesPage.debiCheck();
       getRatesPage.summaryTable();



    }

}

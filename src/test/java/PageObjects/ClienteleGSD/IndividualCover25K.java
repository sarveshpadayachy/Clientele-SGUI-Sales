package PageObjects.ClienteleGSD;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IndividualCover25K extends PageObject {

    String Url = "http://shambawebtest.clientele.local/shambaweb/";

    String ArrowButtonXpath = "//i[@class='bi bi-box-arrow-right profile-icon profile-icon-default']";

    String UserName = "//input[@placeholder='Username']";

    String PassWord = "//input[@placeholder='Password']";

    String LoginXpath = "//button[@type='submit']";

    String ClienteleLogoXpath = "//img[@class=\"logo-menu\"]";

    String CaptureSaleXpath = "//*[@id=\"navbarSupportedContent\"]/div/ul/li/div[2]/div[1]/div/a/span";

    String LeadBasketXpath = "/html/body/shamba-root/shamba-layout/div/div[1]/sale-ribbon/div/div/div/div/div/nav/div[1]/a/div/i";

    String LeadBasketFilterXpath = "(//input[@id='LeasdsBasketFilter'])[2]";

    String leadCheckBox = "(//input[@id='undefined'])[1]";

    String ActionSaleBtn = "(//i[@class='bi bi-cash-coin'])[1]";

    String HELPProductXpath = "//img[@src='assets/Help.png']";

    String PlanTypeDropdown = "//select[@formcontrolname=\"plan\" ]";

    String SelectPlanOkBtn = "//button[@class=\"btn btn-success\"]";

    String GetRatesBtn = "//button[@class='mat-focus-indicator mat-flat-button mat-button-base mat-primary']";

    String PlanOptionXpath = "//select[@formcontrolname=\"planOption\"]";
    String MainLifeDoB = "//input[@type='text']";

    String SliderBarXpath = "//span[@class='ngx-slider-span ngx-slider-bar-wrapper ngx-slider-full-bar']";

    String ViewRates = "//span[@class='title']";

    String StartSale = "//*[@id=\"bootstrap-table\"]/tbody/tr/td[9]/button[1]/span/i";

    String FAISXpath = "//button[normalize-space()='Continue']";

    String TittleXpath = "//select[@id='Title']";

    String NameXpath = "//input[@id='FirstNames']";

    String SurnameXpath = "//input[@id='Surname']";

    String SACitizenXpath = "//select[@id='IsSouthAfricanCitizen']";

    String IDNumberXpath = "//input[@id='IdentityNumber']";

    String MainInputID ="//input[@id='mainInput']";

    String ConfirmID = "//input[@id='confirmationInput']";

    String OKButton = "//span[normalize-space()='Ok']";

    String DoBXpath = "//input[@id='DateOfBirth']";

    String MonthlyIncomeXpath = "//select[@id='MonthlyIncomeRange']";

    String OccupationXpath = "//select[@id='Occupation']";

    String EducationXpath = "//select[@id='EducationLevel']";

    String CellNumberXpath = "//input[@id='MobileTelephoneNumber']";

    String PostalAddressXpath = "//*[@id=\"PostalAddressLine1\"]";

    String PostalCodeXpath = "//input[@id='PostalAddressCode']";

    String CopyPhysicalXpath = "//*[@id=\"ngb-nav-0-panel\"]/div[1]/div/div/button";

    String ValidateBtnXpath = "//*[@id=\"pills-tabContent\"]/member/div/div[1]/div/form/div/div[2]/div[5]/div/shamba-address/div/div[2]/div[3]/div/button/span";

    String SaveMainMemberXpath = "//*[@id=\"pills-tabContent\"]/member/div/div[2]/div/div[2]/button";

    String PayerXpath ="/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[5]/div[2]";

    String PayerTittleXpath = "//select[@id='Title']";

    String PayerNameXpath = "//input[@id='FirstNames']";

    String PayerSurnameXpath = "//input[@id='Surname']";

    String PayerIDXpath = "//input[@id='IdentityNumber']";

    String MainIDXpath = "//input[@id='mainInput']";

    String ConfirmIDXpath = "//input[@id='confirmationInput']";

    String OKPopUpXpath = "//div[@class='cdk-global-overlay-wrapper']//div[2]//button[1]";

    String PayerRelationXpath = "//select[@id='RelationToMember']";

    String PayerDebitXpath = "//select[@id='DebitDay']";

    String FirstDebitXpath = "//select[@id='FirstDebitDate']";

    String BankNameXpath = "//select[@id='BankName']";

    String BranchCodeXpath = "//select[@id='BankBranchCode']";

    String AcctTypeXpath = "//select[@id='BankAccountType']";

    String BankAccNumXpath = "//input[@id='BankAccountNumber']";

    String AccountXpath = "//input[@id='mainInput']";

    String ConfAccXpath = "//input[@id='confirmationInput']";

    String OKButtonXpath = "//div[@class='cdk-global-overlay-wrapper']//div[2]//button[1]";

    String MobileNumXpath = "//input[@id='MobileTelephoneNumber']";

    String EmpStatusXpath = "//select[@id='IsEmployee']";

    String ConfirmCheckBoxXpath = "(//input[@type='checkbox'])[1]";

    String CheckBox1Xpath = "(//input[@type='checkbox'])[2]";

    String SavePayerXpath = "//button[@class='btn btn-success']";

    String SpouseXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[3]/div[2]";

    String ChildXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[4]/div[2]";

    String BeneficiaryXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[4]/div[2]";

    String AddBenXpath = "//button[@class='mat-focus-indicator mat-flat-button mat-button-base mat-primary']";

    String RelationXpath = "//select[@id='Relation']";

    String SaveBenXpath = "//span[normalize-space()='Save Beneficiary']";

    String FICAXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[6]/div[2]";

    String PremiumXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[7]/div[2]";

    String RewardsXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[8]/div[2]";

    String SummaryXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[8]/div[2]";

    String ConfirmDebiCheckXpath = "//input[@type='checkbox'][1]";

    String SummaryTableXpath = "//table[@id='bootstrap-table']";






    @Step("Open shamba website")
    public void OpenWebsite() throws InterruptedException {
        getDriver().get(Url);
        getDriver().manage().window().maximize();
        Thread.sleep(3000);

    }


    @Step("Clicks on Arrow-Button to log in")
    public void clickArrowButton(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5) );
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ArrowButtonXpath)));

        element.click();


    }

    @Step("Login in using valid Credentials")
    public void PopUpLogin(String Username, String Password) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UserName))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UserName))).sendKeys(Username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PassWord))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PassWord))).sendKeys(Password);




    }

    @Step("Clicks on Login")
    public void LoginButton() throws  InterruptedException{
        $(By.xpath(LoginXpath)).click();

    }

    @Step("Clicks on ClienteleLogo")
    public void ClienteleLogo() throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(ClienteleLogoXpath)).click();


    }

    @Step("Clicks on CaptureSale")
    public void CaptureSale() throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(CaptureSaleXpath)).click();

    }


    @Step("Clicks on LeadBasket")
    public void LeadBasket() throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(LeadBasketXpath)).click();

    }

    @Step("Select New on lead basket filter ")
    public void selectNew()throws InterruptedException{
        Thread.sleep(2000);

        $(By.xpath(LeadBasketFilterXpath)).click();
    }

    @Step("Select a lead to action a sale")
    public void LeadCheckBox() throws InterruptedException {
        Thread.sleep(5000);

        WebElement checkbox = $(By.xpath(leadCheckBox));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }


    }

    @Step("Click on Action sale Button")
    public void ActionSaleButton() throws InterruptedException {
        Thread.sleep(5000);

        WebElement startSale = $(By.xpath(ActionSaleBtn));

        if (!startSale.isSelected()) {
            startSale.click();
        }

    }

    @Step("Click on Help Icon Button")
    public void HelpIconButton() throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(HELPProductXpath)).click();
    }

    @Step("Click on Select Plan Text Dropdown and select Life Plan")
    public void SelectPlanTextDropdown(String SelectPlan) throws InterruptedException {
        Thread.sleep(5000);

        WebElement dropdown = $(By.xpath(PlanTypeDropdown));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(SelectPlan);

    }

    @Step("Click on Ok Button to proceed")
    public void SelectPlanOkBtn() throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(SelectPlanOkBtn)).click();

    }

    @Step("Click on Get Rates Button")
    public void GetRatesBtn() throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(GetRatesBtn)).click();
    }


    @Step("Click on Plan Option and select Cover")
    public void SelectPlanOption(String selectPlan) {

        WebElement dropdown = $(By.xpath(PlanOptionXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByVisibleText(selectPlan);


    }

    @Step("Click on Main life DoB text field and select dates")
    public void SelectDoB(String DOB)throws InterruptedException{
        Thread.sleep(2000);

        WebElement DoB =  $(By.xpath(MainLifeDoB) );

        DoB.click();

        DoB.sendKeys(DOB + Keys.ENTER);


    }

    @Step("Select cover amount of R25000 on the slider bar")
    public void selectCoverAmount()throws InterruptedException{
        Thread.sleep(5000);

        $(By.xpath(SliderBarXpath)).click();

        WebElement sliderPointer = $(By.xpath("(//div[@class='ngx-slider-inner-tooltip ng-star-inserted'])[4]"));
        sliderPointer.click();

    }

    @Step("Click on view button to proceed with quotes")
    public void ViewRates()throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(ViewRates)).click();
    }

    @Step("Click on Start Sale Button")
    public void StartSale()throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(StartSale)).click();

    }

    @Step("Click continue or cancel button on FAIS Disclosure PopUp Link")
    public void handleModelPopUp(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FAISXpath)));

        element.click();


    }

    @Step("Select Tittle type from dropdown")
    public void selectTittleDropdown(String Tittle)throws InterruptedException{
        Thread.sleep(3000);

        WebElement dropdown = $(By.xpath(TittleXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(Tittle);
    }

    @Step("Enter Name(s) on input field text")
    public void EnterName(String Name){

        WebElement fieldText = $(By.xpath(NameXpath));
        fieldText.click();
        fieldText.sendKeys(Name);

    }

    @Step("Enter Surname on input field text")
    public void EnterSurname(String Surname){
        WebElement fieldText = $(By.xpath(SurnameXpath));
        fieldText.click();
        fieldText.sendKeys(Surname);
    }

    @Step("Select South African Citizen dropdown field")
    public void selectSACitizen(String SouthAfricanCitizen){
        WebElement dropdown = $(By.xpath(SACitizenXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(SouthAfricanCitizen);
    }

    @Step("Click on ID text box")
    public void clickTextBox(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement fieldText = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(IDNumberXpath)));
        fieldText.click();



    }

    @Step("Click on ID Number MainInput PopUp ")
    public void enterID(String IDNumber){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement  mainIDPopUP = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(MainInputID)));
        mainIDPopUP.click();
        mainIDPopUP.sendKeys(IDNumber);

    }

    @Step("Click on confirm ID Number PopUp")
    public void confirmID(String IDNumber){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement confirmInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConfirmID)));
        confirmInput.click();
        confirmInput.sendKeys(IDNumber);

    }

    @Step("Click on OKButton")
    public void clickOKButton(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement OKBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OKButton)));
        OKBtn.click();

    }

    // @Step("Enter Date of Birth on input field text")
    //public void EnterDoB(String DateOfBirth){
    // WebElement fieldText = $(By.xpath(DoBXpath));
    // fieldText.click();
    //fieldText.sendKeys(DateOfBirth);

    //  }

    @Step("Select monthly income from dropdown")
    public void selectMonthlyIncome(String MonthlyIncome){
        WebElement dropdown = $(By.xpath(MonthlyIncomeXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(MonthlyIncome);

    }

    @Step("Select Occupation from dropdown")
    public void selectOccupation(String Occupation){
        WebElement dropdown = $(By.xpath(OccupationXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(Occupation);

    }



    @Step("Select Education from dropdown")
    public void selectEduction(String Education){
        WebElement dropdown = $(By.xpath(EducationXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(Education);
    }

    @Step("Enter Cell Number on field text ")
    public void enterCellNum(String CellNumber){

        WebElement MobileNum = $(By.xpath(CellNumberXpath));

        MobileNum.click();
        MobileNum.sendKeys(CellNumber);


    }

    @Step("Enter Postal Address on field text")
    public void enterPostalAddress(String PostalAddress){

        WebElement element = $(By.xpath(PostalAddressXpath));

        element.click();
        element.sendKeys(PostalAddress);
    }

    @Step("Enter Postal Code on field text")
    public void enterPostalCode( String PostalCode){

        WebElement element = $(By.xpath(PostalCodeXpath));

        element.click();
        element.sendKeys(PostalCode);

    }

    @Step("Click on Copy to Physical")
    public void clickCopyPhysical(){

        WebElement element = $(By.xpath(CopyPhysicalXpath));

        element.click();
    }

    @Step("Click on Validate button")
    public void clickValidateBtn()throws InterruptedException{
        Thread.sleep(3000);

        WebElement element = $(By.xpath(ValidateBtnXpath));

        element.click();

    }

    @Step("Click on Save Main Member button")
    public void clickSaveMMBtn(){

        WebElement button = $(By.xpath(SaveMainMemberXpath));

        button.click();
    }

    @Step("Navigate Payer page")
    public void navigatePayer()throws InterruptedException{
        Thread.sleep(5000);

        $(By.xpath(PayerXpath)).click();
    }

    @Step("Select Tittle from dropdown")
    public void selectTittle(String PayerTittle){
        WebElement tittleDropdown = $(By.xpath(PayerTittleXpath));
        Select selectObject = new Select(tittleDropdown);

        selectObject.selectByValue(PayerTittle);

    }

    @Step("Enter Name on field text")
    public void enterName(String PayerName){
        WebElement fieldText = $(By.xpath(PayerNameXpath));
        fieldText.click();
        fieldText.sendKeys(PayerName);

    }

    @Step("Enter Surname on field text")
    public void enterSurname(String PayerSurname){
        WebElement fieldText = $(By.xpath(PayerSurnameXpath));
        fieldText.click();
        fieldText.sendKeys(PayerSurname);

    }

    @Step("Click on Payer ID text field")
    public void fieldTextID(){
        WebElement fieldText = $(By.xpath(PayerIDXpath));
        fieldText.click();
    }

    @Step("Enter ID on MainInput PopUp")
    public void mainIDPopUp(String PayerID){
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));

        WebElement mainID = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(MainIDXpath)));
        mainID.click();
        mainID.sendKeys(PayerID);

    }

    @Step("Enter Confirmation of ID on PopUp field text")
    public void confirmationID(String PayerID){
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));

        WebElement confirmID = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ConfirmIDXpath)));
        confirmID.click();
        confirmID.sendKeys(PayerID);
    }

    @Step("Click  OK button to capture ID")
    public void clickOK()throws InterruptedException{
        Thread.sleep(5000);

        $(By.xpath(OKPopUpXpath)).click();
    }

    @Step("Select the Relationship from dropdown list")
    public void PayerRelation(String Relationship){
        WebElement dropdown = $(By.xpath(PayerRelationXpath));
        Select selectObject = new  Select(dropdown);

        selectObject.selectByValue(Relationship);
    }


    @Step("Select Bank Name from dropdown list")
    public void selectBank(String BankName){
        WebElement dropdown = $(By.xpath(BankNameXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(BankName);
    }

    @Step("Select Branch Code from dropdown ")
    public void selectBranch(String BranchCode){
        WebElement dropdown = $(By.xpath(BranchCodeXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(BranchCode);

    }

    @Step("Select Account Type from dropdown")
    public void selectAccType(String AccountType){
        WebElement dropdown = $(By.xpath(AcctTypeXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(AccountType);

    }

    @Step("Click Account Number on the text field")
    public void enterAccNum(){
        WebElement element = $(By.xpath(BankAccNumXpath));
        element.click();


    }

    @Step("Enter Account Number on Main text field")
    public void enterMainAcc(String AccountNumber){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement mainAcc = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(AccountXpath)));
        mainAcc.click();
        mainAcc.sendKeys(AccountNumber);

    }

    @Step("Enter Confirmation of Account number on the text field")
    public void confirmAccount(String AccountNumber){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement mainAcc = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ConfAccXpath)));
        mainAcc.click();
        mainAcc.sendKeys(AccountNumber);

    }

    @Step("Click OK button for Account number to be captured on the text field")
    public void OKButton(){
        $(By.xpath(OKButtonXpath)).click();
    }

    @Step("Enter Mobile Number on the text field")
    public void enterMobiNum(String MobileNumber){
        WebElement element = $(By.xpath(MobileNumXpath));
        element.click();
        element.sendKeys(MobileNumber);

    }

    @Step("Select if Payer is employee from dropdown")
    public  void isEmployee(String PayerIsEmployee){
        WebElement dropdown = $(By.xpath(EmpStatusXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(PayerIsEmployee);

    }

    @Step("Add GSD details ")
    public void addGSD(String input, String select, String select1)throws InterruptedException{
        Thread.sleep(2000);
        WebElement dropdown1 = $(By.xpath("//input[@id='EmployeeNumber']"));
        dropdown1.click();
        dropdown1.sendKeys(input);


        WebElement dropdown2 = $(By.xpath("//select[@id='Department']"));
        Select selectObject2 = new Select(dropdown2);

        selectObject2.selectByVisibleText(select);

        WebElement dropdown3 = $(By.xpath("//select[@id='Authorised']"));
        Select selectObject3 = new Select(dropdown3);

        selectObject3.selectByVisibleText(select1);
    }

    @Step("Select Debit day from dropdown list")
    public void selectDebit(String DebitDay){
        WebElement dropdown = $(By.xpath(PayerDebitXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(DebitDay);
    }

    @Step("Select Debit date from dropdown list")
    public void selectDebiDate(String DebitDate){
        WebElement dropdown = $(By.xpath(FirstDebitXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(DebitDate);
    }

    @Step("Select All checkboxes for confirmations of a Payer ")
    public void confCheckBoxes(){
        WebElement checkbox = $(By.xpath(ConfirmCheckBoxXpath));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }

        WebElement checkbox1 = $(By.xpath(CheckBox1Xpath));

        if (!checkbox1.isSelected()) {
            checkbox1.click();
        }

    }

    @Step("Click on Save Payer Button")
    public void clickSaveBtn()throws InterruptedException{
        WebElement button = $(By.xpath(SavePayerXpath));
        button.click();

    }


    @Step("Navigate to Beneficiary Page")
    public void navigateBeneficiary()throws InterruptedException{
        Thread.sleep(5000);

        $(By.xpath(BeneficiaryXpath)).click();

    }

    @Step("Click on Add Beneficiary button")
    public void addBeneficiary(){

        $(By.xpath(AddBenXpath)).click();

    }

    @Step("Select Member Estate from Relationship dropdown")
    public void selectRelation(String Relationship){
        WebElement dropdown = $(By.xpath(RelationXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(Relationship);
    }

    @Step("Click Save Beneficiary Button")
    public void saveBeneficiary()throws InterruptedException {

        $(By.xpath(SaveBenXpath)).click();
        Thread.sleep(5000);

        WebElement PopUp = $(By.xpath("//button[@type='button']"));
        PopUp.click();

    }

    @Step("Navigate to FICA Page")
    public void navigateFICA(String dropdown1, String dropdown2)throws  InterruptedException{
        Thread.sleep(5000);

        $(By.xpath(FICAXpath)).click();

        WebElement isProminentPublicOfficial = $(By.xpath("//select[@id='IsProminentPublicOfficial']"));
        Select selectObject = new Select(isProminentPublicOfficial);
        selectObject.selectByValue(dropdown1);

        WebElement isProminentInternationalPublicOfficial = $(By.xpath("//select[@id='IsProminentInternationalPublicOfficial']"));
        Select selectObject1 = new Select(isProminentInternationalPublicOfficial);
        selectObject1.selectByValue(dropdown2);

        $(By.xpath("//span[@class='title']")).click();

    }

    @Step("Navigate to Premium Page")
    public void navigatePremium()throws InterruptedException{
        Thread.sleep(5000);

        $(By.xpath(PremiumXpath)).click();
        WebElement dropdown = $(By.xpath("//select[@id='productConversion']"));
        Select selectObject = new Select(dropdown);
        selectObject.getAllSelectedOptions();

        String targetPointXpath = "//span[@aria-label='ngx-slider']";
        WebElement targetPoint = $(By.xpath(targetPointXpath));
        targetPoint.click();

        WebElement savePremium = $(By.xpath("//span[@class='title']"));
        savePremium.click();

    }

    @Step("Navigate to Rewards Page")
    public void navigateRewards()throws InterruptedException{
        Thread.sleep(5000);

        $(By.xpath(RewardsXpath)).click();

        WebElement checkbox = $(By.xpath("(//input[@type='checkbox'])[1]"));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }

        WebElement savePremium = $(By.xpath("//span[@class='title']"));
        savePremium.click();

    }

    @Step("Navigate to Summary Page")
    public void navigateSummary()throws InterruptedException{
        Thread.sleep(4000);


        $(By.xpath(SummaryXpath)).click();

        $(By.xpath("//*[@id=\"pills-tabContent\"]/accept-sale/div/div[3]/div/div/div/button")).click();

        $(By.xpath("//input[@type='checkbox']")).click();

        $(By.xpath("//button[contains(text(),'Conclude Sale')]")).click();

        Thread.sleep(5000);


        if (isPopupPresent()) {
            $(By.xpath("//button[normalize-space()='Yes']")).click();
        } else {
            System.out.println("No popup detected. proceeding without clicking");
        }

    }

    private boolean isPopupPresent() throws InterruptedException {
        try {
            return $(By.xpath("//button[normalize-space()='Yes']")).isVisible();

        } catch (Exception e) {
            return false;
        }


    }


    @Step("Select Government Questions Pop-UP Checkboxes")
    public void PopUPCheckboxes(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement GovernmentQ1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"bootstrap-table\"]/tbody/tr[1]/td[3]/input"))) ;
        GovernmentQ1.click();



        WebElement GovernmentQ2 = $(By.xpath("(//input[@type='checkbox'])[2]"));

        if(!GovernmentQ2.isSelected()){
            GovernmentQ2.click();
        }

        WebElement GovernmentQ3 = $(By.xpath("(//input[@type='checkbox'])[3]"));

        if(!GovernmentQ3.isSelected()){
            GovernmentQ3.click();
        }

        WebElement GovernmentQ4 = $(By.xpath("(//input[@type='checkbox'])[4]"));

        if(!GovernmentQ4.isSelected()){
            GovernmentQ4.click();
        }

        WebElement GovernmentQ5 = $(By.xpath("(//input[@type='checkbox'])[5]"));

        if(!GovernmentQ5.isSelected()){
            GovernmentQ5.click();
        }

        WebElement GovernmentQ6 = $(By.xpath("//*[@id=\"bootstrap-table\"]/tbody/tr[6]/td[3]/input"));

        if(!GovernmentQ6.isSelected()){
            GovernmentQ6.click();
        }

        WebElement GovernmentQ7 = $(By.xpath("//*[@id=\"bootstrap-table\"]/tbody/tr[7]/td[3]/input"));

        if(!GovernmentQ7.isSelected()){
            GovernmentQ7.click();
        }

        WebElement saveButton = $(By.xpath("//button[normalize-space()='Save']"));
        saveButton.click();
    }

    @Step("Second sale")
    public void SecondSaleIiII(){
        $(By.xpath("//button[normalize-space()='Yes']")).click();
    }


    @Step("View summary table page")
    public void summaryTable()throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));

        WebElement bootstrap = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SummaryTableXpath)));
        bootstrap.click();



    }
}

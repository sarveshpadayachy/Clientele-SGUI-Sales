package PageObjects;

import com.ibm.icu.util.GregorianCalendar;
import io.appium.java_client.ios.IOSDriver;
import kotlin.random.URandomKt;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.MethodOrderer;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Year;
import java.util.List;
import java.util.Random;

public class ProductPage extends PageObject {

    String Url = "http://shambawebtest.clientele.local/shambaweb/";

    String LoginBtn = "//*[@id=\"navbarSupportedContent\"]/div/div/button/span";
    String UserName = "//*[@id=\"i0116\"]";

    String NextBtn = "//*[@id=\"idSIButton9\"]";

    String Password = "//*[@id=\"i0118\"]";

    String SignIn = "//*[@id=\"idSIButton9\"]";

    String ClienteleLogoXpath = "//img[@class=\"logo-menu\"]";

    String CaptureSaleXpath = "//*[@id=\"navbarSupportedContent\"]/div/ul/li/div[2]/div[1]/div/a/span";

    String LeadBasketXpath = "/html/body/shamba-root/shamba-layout/div/div[1]/sale-ribbon/div/div/div/div/div/nav/div[1]/a/div/i";

    String leadCheckBox = "(//input[@id='undefined'])[1]";

    String ActionSaleBtn = "(//i[@class='bi bi-cash-coin'])[1]";

    String HELPProductXpath = "//img[@src='assets/Help.png']";

    String PlanTypeDropdown = "//select[@formcontrolname=\"plan\" ]";

    String SelectPlanOkBtn = "//button[@class=\"btn btn-success\"]";




    @Step("Open shamba website")
    public void OpenWebsite() throws InterruptedException {
        getDriver().get(Url);
        getDriver().manage().window().maximize();
        Thread.sleep(3000);

    }

    @Step("Login in using valid Credentials")
    public void loginIn(String Username, String password) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoginBtn))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UserName))).sendKeys(Username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NextBtn))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Password))).sendKeys(password);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SignIn))).click();


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

}
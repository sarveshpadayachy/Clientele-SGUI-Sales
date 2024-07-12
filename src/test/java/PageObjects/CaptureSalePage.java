package PageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CaptureSalePage extends PageObject {

    String Url = "http://shambawebtest.clientele.local/shambaweb/";

    String LoginBtn = "//*[@id=\"navbarSupportedContent\"]/div/div/button/span";
    String UserName = "//*[@id=\"i0116\"]";

    String NextBtn = "//*[@id=\"idSIButton9\"]";

    String Password = "//*[@id=\"i0118\"]";

    String SignIn = "//*[@id=\"idSIButton9\"]";

    String ClienteleLogoXpath = "//img[@class=\"logo-menu\"]";

    String CaptureSaleXpath = "//*[@id=\"navbarSupportedContent\"]/div/ul/li/div[2]/div[1]/div/a/span";

    String LeadBasketXpath = "/html/body/shamba-root/shamba-layout/div/div[1]/sale-ribbon/div/div/div/div/div/nav/div[1]/a/div/i";

    @Step("Open shamba website")
    public void OpenWebsite() throws InterruptedException {
        getDriver().get(Url);
        getDriver().manage().window().maximize();
        Thread.sleep(3000);

    }

    @Step("Login in using valid Credentials")
    public void loginIn(String Username, String password) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

       WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginBtn)));

       element.click();

       WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(UserName)));

       element1.sendKeys(Username);

       WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(NextBtn)));

       element2.click();

      WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Password)));

      element3.sendKeys(password);

        WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SignIn)));

        element4.click();


    }

    @Step("Clicks on ClienteleLogo")
    public void ClienteleLogo() throws InterruptedException {
        Thread.sleep(5000);

       $(By.xpath(ClienteleLogoXpath)).click();

    }

    @Step("Clicks on CaptureSale")
    public void CaptureSale()throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(CaptureSaleXpath)).click();

    }



    @Step("Clicks on LeadBasket")
    public void LeadBasket()throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(LeadBasketXpath)).click();

    }

}

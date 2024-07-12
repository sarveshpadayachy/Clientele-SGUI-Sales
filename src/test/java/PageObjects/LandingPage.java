package PageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LandingPage extends PageObject {

    String Url = "http://shambawebtest.clientele.local/shambaweb/";

    String LoginBtn = "//*[@id=\"navbarSupportedContent\"]/div/div/button/span";
    String UserName = "//*[@id=\"i0116\"]";

    String NextBtn = "//*[@id=\"idSIButton9\"]";

    String Password = "//*[@id=\"i0118\"]";

    String SignIn = "//*[@id=\"idSIButton9\"]";

    String ClienteleLogoXpath = "//img[@class=\"logo-menu\"]";

    String CaptureSaleXpath = "//*[@id=\"navbarSupportedContent\"]/div/ul/li/div[2]/div[1]/div/a/span";

    @Step("Open landingPage url")
    public void OpenWebsite() throws InterruptedException {
       getDriver().get(Url);
       getDriver().manage().window().maximize();
        Thread.sleep(3000);
    }
    @Step("Login in using valid Credentials")
    public void loginIn(String Username, String password) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginBtn))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(UserName))).sendKeys(Username);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(NextBtn))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Password))).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SignIn))).click();

    }

    @Step("Clicks on ClienteleLogo")
    public void ClienteleLogo()throws InterruptedException {
      Thread.sleep(5000);

      $(By.xpath(ClienteleLogoXpath)).click();

    }

    @Step("Clicks on CaptureSale")
    public void CaptureSale() throws InterruptedException {
       Thread.sleep(1000);

       $(By.xpath(CaptureSaleXpath)).click();

    }


}


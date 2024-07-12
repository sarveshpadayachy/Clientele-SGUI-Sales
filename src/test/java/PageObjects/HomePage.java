package PageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends PageObject {

    String Url = "http://shambawebtest.clientele.local/shambaweb/";

    String ArrowButtonXpath = "//i[@class='bi bi-box-arrow-right profile-icon profile-icon-default']";

    String UserName = "//input[@placeholder='Username']";

    String PasswordXpath = "//input[@placeholder='Password']";

    String LoginXpath = "//button[@type='submit']";


    String ClienteleLogoXpath = "//img[@class=\"logo-menu\"]";




    @Step("Open shamba website")
    public void OpenWebsite() throws InterruptedException {
        getDriver().get(Url);
        getDriver().manage().window().maximize();
        Thread.sleep(3000);
    }

    @Step("Clicks on Arrow-Button to log in")
    public void clickArrowButton(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10) );
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ArrowButtonXpath)));

        element.click();

    }

    @Step("Enter Username ")
    public void Username(String username){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10) );

       WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(UserName)));

       element.click();

       WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(UserName)));

       element1.sendKeys(username);


    }

    @Step("Enter Password")
    public void PasswordText(String password){


        $(By.xpath(PasswordXpath)).click();



       $(By.xpath(PasswordXpath)).sendKeys(password);


    }

    @Step("Clicks on Login")
    public void LoginButton() throws  InterruptedException{
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10) );

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginXpath)));

        element.click();

    }

    @Step("Clicks on ClienteleLogo")
    public void ClienteleLogo() throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(ClienteleLogoXpath)).click();


    }



}

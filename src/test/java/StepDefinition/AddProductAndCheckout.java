package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProductAndCheckout {
    WebDriver driver;



    @Given("User clicks on the Login Page")
    public void userIsOnTheHomePage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationteststore.com/index.php?rt=account/login");

    }
    @And("user fills LoginName")
    public void userFillsLoginName() {
        driver.findElement(By.cssSelector("#loginFrm_loginname")).sendKeys("EmnaFerchichi");
    }

    @And("user fills Password")
    public void userFillsPassword() {
        driver.findElement(By.cssSelector("#loginFrm_password")).sendKeys("Emna1234");
    }
    @And("user  clicks on login button")
    public void userClicksOnLoginButton() {
        driver.findElement(By.cssSelector("#loginFrm > fieldset > button")).click();
    }
    @And("user  is on Home page")
    public void userIsOnHomePage() {
        driver.findElement(By.cssSelector("#categorymenu > nav > ul > li:nth-child(1) > a")).click();
    }
    @When("user selects Skinsheen Bronzer Stick Product")
    public void userSelectsSkinsheenBronzerStickProduct() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#block_frame_featured_1769 > div > div:nth-child(1) > div.thumbnail > div.pricetag.jumbotron > a")).click();
        Thread.sleep(1000);

    }

    @And("user selects  Benefit Bella Bamba Product")
    public void userSelectsBenefitBellaBambaProduct() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#block_frame_featured_1769 > div > div:nth-child(3) > div.thumbnail > div.pricetag.jumbotron > a")).click();
    }

    @And("user clicks on Ckeckout Button")
    public void userClicksOnCkeckoutButton() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#main_menu_top > li:nth-child(4) > a > span")).click();
        Thread.sleep(1000);

    }

    @Given("User is on the Login Page")
    public void userIsOnTheLoginPage() {
    }



    @Then("User will be redirected to Checkout Page")
    public void userWillBeRedirectedToCheckoutPage() {
    }

    @Given("user clicks on Confirm Order Button")
    public void userClicksOnConfirmOrderButton() {
        driver.findElement(By.cssSelector("#checkout_btn")).click();

    }

    @Then("user will be redirected to a page with a checkout confirmation notification")
    public void userWillBeRedirectedToAPageWithACheckoutConfirmationNotification() {
    }



}

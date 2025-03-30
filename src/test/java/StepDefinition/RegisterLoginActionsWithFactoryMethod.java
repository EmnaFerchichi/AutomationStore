package StepDefinition;

import Factory.HomePage;
import Factory.LoginPage;
import Factory.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterLoginActionsWithFactoryMethod {
    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @Given("User is on the Home Page")
    public void userIsOnTheHomePage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationteststore.com/");
    }

    @When("User clicks on Login or Register button")
    public void userClicksOnLoginOrRegisterButton() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickLoginRegister();
    }

    @And("User clicks on continue button")
    public void userClicksOnContinueButton() throws InterruptedException {
        loginPage = new LoginPage(driver);
        Thread.sleep(2000);
        loginPage.clickContinueRegisterButton();

    }

    @And("User fills the first name section")
    public void userFillsTheFirstNameSection() throws InterruptedException {
        registerPage = new RegisterPage(driver);
        Thread.sleep(2000);
        registerPage.fillFirstNameField("Asma");

    }

    @And("User fills the last name section")
    public void userFillsTheLastNameSection() throws InterruptedException {
        registerPage = new RegisterPage(driver);
        Thread.sleep(2000);
        registerPage.fillLastNameField("Abidi");
    }

    @And("User fills the E-Mail section")
    public void userFillsTheEMailSection() throws InterruptedException {
        registerPage = new RegisterPage(driver);
        Thread.sleep(2000);
        registerPage.filleMailField("asma@gmail.com");
    }

    @And("User fills the telephone section")
    public void userFillsTheTelephoneSection() throws InterruptedException {
        registerPage = new RegisterPage(driver);
        Thread.sleep(2000);
        registerPage.fillTelephoneField("12345678");
    }

    @And("User fills the company section")
    public void userFillsTheCompanySection() throws InterruptedException {
        registerPage = new RegisterPage(driver);
        Thread.sleep(2000);
        registerPage.fillCompanyField("Gust");
    }

    @And("User fills the AddressOne section")
    public void userFillsTheAddressOneSection() throws InterruptedException {
        registerPage = new RegisterPage(driver);
        Thread.sleep(2000);
        registerPage.fillAddressOneField("Annaba");
    }

    @And("User fills the City section")
    public void userFillsTheCitySection() throws InterruptedException {
        registerPage = new RegisterPage(driver);
        Thread.sleep(2000);
        registerPage.fillCityField("Annaba");
    }
    @And("User fills the Zip Code section")
    public void userFillsTheZipCodeSection() throws InterruptedException {
        registerPage = new RegisterPage(driver);
        Thread.sleep(2000);
        registerPage.fillZipCodeField("4000");
    }

    @And("User fills the Country section")
    public void userFillsTheCountrySection() throws InterruptedException {
        registerPage = new RegisterPage(driver);
        Thread.sleep(2000);
        registerPage.fillCountryField(3);
        Thread.sleep(2000);

    }
    @And("User fills the Region section")
    public void userFillsTheRegionSection() throws InterruptedException {
        registerPage = new RegisterPage(driver);
        Thread.sleep(2000);
        registerPage.fillRegionField(2);
        Thread.sleep(2000);

    }


    @And("User fills the Login Name section")
    public void userFillsTheLoginNameSection() throws InterruptedException {
        registerPage = new RegisterPage(driver);
        Thread.sleep(2000);
        registerPage.fillLoginNameField("AsmaAbidi");
    }

    @And("User fills the Password section")
    public void userFillsThePasswordSection() throws InterruptedException {
        registerPage = new RegisterPage(driver);
        Thread.sleep(2000);
        registerPage.fillPasswordField("Asma1234");
    }

    @And("User fills the Password Confirm section")
    public void userFillsThePasswordConfirmSection() throws InterruptedException {
        registerPage = new RegisterPage(driver);
        Thread.sleep(2000);
        registerPage.fillPasswordConfirmField("Asma1234");
    }

    @And("User selects the Subscribe radio button")
    public void userSelectsTheSubscribeRadioButton() throws InterruptedException {
        registerPage = new RegisterPage(driver);
        Thread.sleep(2000);
        registerPage.selectYesSubscribeRadioButton();
    }

    @And("User selects the read and agree to the Privacy Policy section")
    public void userSelectsTheReadAndAgreeToThePrivacyPolicySection() throws InterruptedException {
        registerPage = new RegisterPage(driver);
        Thread.sleep(2000);
        registerPage.selectPrivacyPolicyButton();
    }

    @And("User clicks on the Continue button")
    public void userClicksOnTheContinueButton() throws InterruptedException {
        registerPage = new RegisterPage(driver);
        Thread.sleep(2000);
        registerPage.clickRegisterContinueForm();
    }

    @Then("User will be redirected to a page that indicates the account is created with success")
    public void userWillBeRedirectedToAPageThatIndicatesTheAccountIsCreatedWithSuccess() {
    }

    @Given("User is on  the Login Page")
    public void userIsOnTheLoginPage() {
    }

    @And("User fills Login Name section")
    public void userFillsLoginNameSection() throws InterruptedException {
        loginPage = new LoginPage(driver);
        Thread.sleep(2000);
        loginPage.fillLoginNameField("AsmaAbidi");
    }

    @And("User fills Password section")
    public void userFillsPasswordSection() throws InterruptedException {
        loginPage = new LoginPage(driver);
        Thread.sleep(2000);
        loginPage.fillPasswordField("Asma1234");
    }

    @And("User clicks on Login button")
    public void userClicksOnLoginButton() throws InterruptedException {
        loginPage = new LoginPage(driver);
        Thread.sleep(2000);
        loginPage.clickLoginButton();
    }
}

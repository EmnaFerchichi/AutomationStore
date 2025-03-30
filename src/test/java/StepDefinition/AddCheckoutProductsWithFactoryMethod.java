package StepDefinition;

import Factory.CartPage;
import Factory.HomePage;
import Factory.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCheckoutProductsWithFactoryMethod {
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    CartPage cartPage;
    @Given("user clicks on the Login Page")
    public void userIsOnTheHomePage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationteststore.com/index.php?rt=account/login");
    }

    @And("User fills LoginName")
    public void userFillsLoginName() {
        loginPage = new LoginPage(driver);
        loginPage.fillLoginNameField("AsmaAbidi");
    }

    @And("User fills Password")
    public void userFillsPassword() {
        loginPage.fillPasswordField("Asma1234");
    }

    @And("User  clicks on login button")
    public void userClicksOnLoginButton() {
        loginPage.clickLoginButton();
    }

    @And("User  clicks  on Home page")
    public void userClicksOnHomePage() {
        loginPage.clickHomeButton();

    }

    @And("User selects Skinsheen Bronzer Stick Product")
    public void userSelectsSkinsheenBronzerStickProduct() {
        homePage= new HomePage(driver);
        homePage.addskinSheenProductToCart();
    }

    @And("User selects  Benefit Bella Bamba Product")
    public void userSelectsBenefitBellaBambaProduct() {
        homePage.addBenefitProductToCart();
    }

    @Given("User clicks on Ckeckout Button")
    public void userClicksOnCkeckoutButton() {
        homePage.clickCheckoutButton();
    }

    @Then("User is be redirected to Checkout Page")
    public void userIsBeRedirectedToCheckoutPage() {

    }

    @And("User clicks on confirm checkout Button")
    public void userClicksOnCheckoutButton() {
        cartPage=new CartPage(driver);
        cartPage.clickConfirmOrder();

    }
}

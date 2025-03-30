package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterAndLogin {
    WebDriver driver;


    @Given("user is on the Home Page")
    public void userIsOnTheHomePage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationteststore.com/");
    }

    @When("user clicks on Login or Register button")
    public void userClicksOnLoginOrRegisterButton() throws InterruptedException {
        driver.findElement(By.cssSelector("#customer_menu_top > li > a")).click();
        Thread.sleep(2000);


    }

    @And("user clicks on continue button")
    public void userClicksOnContinueButton() throws InterruptedException {
        driver.findElement(By.cssSelector("#accountFrm > fieldset > button")).click();
        Thread.sleep(2000);

    }

    @And("user fills the first name section")
    public void userFillsTheFirstNameSection() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"AccountFrm_firstname\"]")).sendKeys("Emna");
        Thread.sleep(2000);

    }

    @And("user fills the last name section")
    public void userFillsTheLastNameSection() {
        driver.findElement(By.cssSelector("#AccountFrm_lastname")).sendKeys("Ferchichi");

    }

    @And("user fills the E-Mail section")
    public void userFillsTheEMailSection() {
        driver.findElement(By.cssSelector("#AccountFrm_email")).sendKeys("emna.ferchichi@gmail.com");
    }

    @And("user fills the telephone section")
    public void userFillsTheTelephoneSection() {
        driver.findElement(By.cssSelector("#AccountFrm_telephone")).sendKeys("+21651170554");

    }

    @And("user fills the company section")
    public void userFillsTheCompanySection() {
        driver.findElement(By.cssSelector("#AccountFrm_company")).sendKeys("Gust Training");

    }

    @And("user fills the AddressOne section")
    public void userFillsTheAddressOneSection() {
        driver.findElement(By.cssSelector("#AccountFrm_address_1")).sendKeys("Tunis");

    }

    @And("user fills the AddressTwo section")
    public void userFillsTheAddressTwoSection() {
        driver.findElement(By.cssSelector("#AccountFrm_address_2")).sendKeys("Tunis");

    }

    @And("user fills the City section")
    public void userFillsTheCitySection() {
        driver.findElement(By.cssSelector("#AccountFrm_city")).sendKeys("Tunis");

    }

    @And("user fills the Region section")
    public void userFillsTheRegionSection() throws InterruptedException {
        Thread.sleep(2000);
        WebElement dropdown = driver.findElement(By.cssSelector("#AccountFrm_zone_id"));
        Select select = new Select(dropdown);
        select.selectByIndex(3);
        Thread.sleep(2000);


    }

    @And("user fills the Zip Code section")
    public void userFillsTheZipCodeSection() {
        driver.findElement(By.cssSelector("#AccountFrm_postcode")).sendKeys("2045");
    }

    @And("user fills the Country section")
    public void userFillsTheCountrySection() throws InterruptedException {


    }

    @And("user fills the Login Name section")
    public void userFillsTheLoginNameSection() {
        driver.findElement(By.cssSelector("#AccountFrm_loginname")).sendKeys("EmnaFerchichi");
    }

    @And("user fills the Password section")
    public void userFillsThePasswordSection() {
        driver.findElement(By.cssSelector("#AccountFrm_password")).sendKeys("Emna1234");
    }

    @And("user fills the Password Confirm section")
    public void userFillsThePasswordConfirmSection() {
        driver.findElement(By.cssSelector("#AccountFrm_confirm")).sendKeys("Emna1234");
    }

    @And("user selects the Subscribe radio button")
    public void userSelectsTheSubscribeRadioButton() {
        driver.findElement(By.cssSelector("#AccountFrm > div:nth-child(11) > fieldset > div > div > label:nth-child(2)")).click();
    }

    @And("user selects the read and agree to the Privacy Policy section")
    public void userSelectsTheReadAndAgreeToThePrivacyPolicySection() {
        driver.findElement(By.cssSelector("#AccountFrm_agree")).click();
    }

    @And("user clicks on the Continue button")
    public void userClicksOnTheContinueButton() {
        driver.findElement(By.cssSelector("#AccountFrm > div.form-group > div > div > button")).click();

    }

    @Then("user will be redirected to a page that indicates the account is created with success")
    public void userWillBeRedirectedToAPageThatIndicatesTheAccountIsCreatedWithSuccess() {
        if(!driver.getPageSource().contains("Created"))
        {System.out.println("User has created an account successfully!"); ;}
       else if(!driver.getPageSource().contains("E-Mail Address is already registered"))
       {System.out.println("The account is already registered!");}
        else {System.out.println("User has failed to create an account!"); ;}
    }

    @Given("user is on the Login Page")
    public void userIsOnTheLoginPage() {
        driver.findElement(By.cssSelector("#AccountFrm > p > a")).click();
    }

    @And("user fills Login Name section")
    public void userFillsLoginNameSection() {
        driver.findElement(By.cssSelector("#loginFrm_loginname")).sendKeys("EmnaFerchichi");
    }

    @And("user fills Password section")
    public void userFillsPasswordConfirmSection() {
        driver.findElement(By.cssSelector("#loginFrm_password")).sendKeys("Emna1234");
    }

    @And("user clicks on Login button")
    public void userClicksOnLoginButton() {
        driver.findElement(By.cssSelector("#loginFrm > fieldset > button")).click();

    }
}

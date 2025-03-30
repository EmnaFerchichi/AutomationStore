package Factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
WebDriver driver;
    //Identifier les elements de la page Register
    @FindBy(xpath = "//*[@id=\"AccountFrm_firstname\"]")
    WebElement firstName;
    @FindBy(xpath = "//*[@id=\"AccountFrm_lastname\"]")
    WebElement lastName;
    @FindBy(xpath = "//*[@id=\"AccountFrm_email\"]")
    WebElement eMail;
    @FindBy(xpath = "//*[@id=\"AccountFrm_telephone\"]")
    WebElement telephone;
    @FindBy(xpath = "//*[@id=\"AccountFrm_fax\"]")
    WebElement fax;
    @FindBy(xpath = "//*[@id=\"AccountFrm_company\"]")
    WebElement company;
    @FindBy(xpath = "//*[@id=\"AccountFrm_address_1\"]")
    WebElement addressOne;
    @FindBy(xpath = "//*[@id=\"AccountFrm_city\"]")
    WebElement city;
    @FindBy(xpath = "//*[@id=\"AccountFrm_zone_id\"]")
    WebElement region;
    @FindBy(xpath = "//*[@id=\"AccountFrm_postcode\"]")
    WebElement zipCode;
    @FindBy(xpath = "//*[@id=\"AccountFrm_country_id\"]")
    WebElement country;
    @FindBy(xpath = "//*[@id=\"AccountFrm_loginname\"]")
    WebElement loginName;
    @FindBy(xpath = "//*[@id=\"AccountFrm_password\"]")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"AccountFrm_confirm\"]")
    WebElement passwordConfirm;
    @FindBy(xpath = "//*[@id=\"AccountFrm\"]/div[4]/fieldset/div/div/label[1]")
    WebElement subscribeYes;
    @FindBy(xpath = "//*[@id=\"AccountFrm\"]/div[4]/fieldset/div/div/label[2]")
    WebElement subscribeNo;
    @FindBy(xpath = "//*[@id=\"AccountFrm_agree\"]")
    WebElement privaryPolicy;
    @FindBy(xpath = "//*[@id=\"AccountFrm\"]/div[5]/div/div/button")
    WebElement continueButton;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this); //pour acceder à tous les elements declarés, sans avoir les localiser à chaque fois
    }
//pour appliquer les actions sur les elements :
    public void fillFirstNameField(String FirstName){
        firstName.sendKeys(FirstName);
    }
    public void fillLastNameField(String LastName){
        lastName.sendKeys(LastName);
    }
    public void filleMailField(String Email){
        eMail.sendKeys(Email);
    }
    public void fillTelephoneField(String Telephone){
        telephone.sendKeys(Telephone);
    }
    public void fillFaxField(String Fax){
        fax.sendKeys(Fax);
    }
    public void fillCompanyField(String Company){
        company.sendKeys(Company);
    }
    public void fillAddressOneField(String AddressOne){
        addressOne.sendKeys(AddressOne);
    }
    public void fillCityField(String City){
        city.sendKeys(City);
    }
    public void fillRegionField(int indexRegion){
        WebElement dropdown = region;
        Select select = new Select(dropdown);
        select.selectByIndex(indexRegion);
    }
    public void fillZipCodeField(String ZipCode){
        zipCode.sendKeys(ZipCode);
    }
    public void fillCountryField(int indexCountry){
        WebElement dropdown = country;
        Select select = new Select(dropdown);
        select.selectByIndex(indexCountry);
    }
    public void fillLoginNameField(String LoginName){
        loginName.sendKeys(LoginName);
    }
    public void fillPasswordField(String Password){
        password.sendKeys(Password);
    }

    public void fillPasswordConfirmField(String PasswordConfirm){
        passwordConfirm.sendKeys(PasswordConfirm);
    }

    public void selectYesSubscribeRadioButton() {
        subscribeYes.click();
    }
    public void selectNoSubscribeRadioButton() {
        subscribeNo.click();
    }
    public void selectPrivacyPolicyButton() {
        privaryPolicy.click();
    }

    public void clickRegisterContinueForm(){
        continueButton.click();
    }


}

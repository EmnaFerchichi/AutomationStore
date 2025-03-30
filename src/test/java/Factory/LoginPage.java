package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    //Identifier les elements de la page Login
    @FindBy(xpath = "//*[@id=\"accountFrm\"]/fieldset/button")
    WebElement continueRegisterButton;
    @FindBy(xpath = "//*[@id=\"loginFrm_loginname\"]")
    WebElement loginName;
    @FindBy(xpath = "//*[@id=\"loginFrm_password\"]")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"loginFrm\"]/fieldset/button")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"categorymenu\"]/nav/ul/li[1]/a")
    WebElement homeButton;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this); //pour acceder à tous les elements declarés, sans avoir les localiser à chaque fois
    }
    //pour appliquer les actions sur les elements :
    public void clickContinueRegisterButton(){
        continueRegisterButton.click();
    }
    public void fillLoginNameField(String LoginName){
        loginName.sendKeys(LoginName);
    }
    public void fillPasswordField(String Password){
        password.sendKeys(Password);
    }
    public void clickLoginButton(){
        loginButton.click();
    }
    public void clickHomeButton(){
        homeButton.click();
    }


}

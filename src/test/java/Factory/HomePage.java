package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;


//Identifier les elements de la page Home
    @FindBy(xpath = "//*[@id=\"customer_menu_top\"]/li/a")
     WebElement loginRegister;

    @FindBy(xpath = "//*[@id=\"main_menu_top\"]/li[4]/a/span")
     WebElement checkoutButton;

    @FindBy(xpath = "//*[@id=\"block_frame_featured_1769\"]/div/div[1]/div[2]/div[3]/a")
     WebElement skinSheenProduct;

    @FindBy(xpath = "//*[@id=\"block_frame_featured_1769\"]/div/div[3]/div[2]/div[3]/a")
     WebElement BenefitProduct;

//pour appliquer les actions sur les elements :
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this); //pour acceder à tous les elements declarés, sans avoir les localiser à chaque fois
    }


    public  void clickLoginRegister(){
        loginRegister.click();
    }
    public  void addskinSheenProductToCart(){
        skinSheenProduct.click();
    }
    public  void addBenefitProductToCart(){
        BenefitProduct.click();
    }
    public  void clickCheckoutButton(){
        checkoutButton.click();
    }
}

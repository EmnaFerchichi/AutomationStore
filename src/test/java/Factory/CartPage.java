package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    WebDriver driver;
    //Identifier les elements de la page Checkout
    @FindBy(xpath = "//*[@id=\"checkout_btn\"]")
    WebElement confirmOrder;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this); //pour acceder à tous les elements declarés, sans avoir les localiser à chaque fois
    }
    //pour appliquer les actions sur les elements :
    public void clickConfirmOrder(){
        confirmOrder.click();
    }
}

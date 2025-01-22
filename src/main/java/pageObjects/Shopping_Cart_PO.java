package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shopping_Cart_PO extends Base_PO {

    private @FindBy(xpath = "//a[.='Log in']")
    WebElement login_button;

    private @FindBy(id = "Email")
    WebElement email_TextField;
    private @FindBy(id = "Password")
    WebElement password_TextField;
    private @FindBy(id = "RememberMe")
    WebElement rememberme_CheckBox;
    private @FindBy(xpath = "(//input[@value='Log in'])[1]")
    WebElement login;
    private @FindBy(xpath = "(//div[@class='top-menu-triangle'])[2]")
    WebElement computers;

    public void navigateTo_ShoppingSite() {
        navigateTo_Url("https://demowebshop.tricentis.com/");
    }

    public void clickHomePageLogin(){
        waitForWebElementAndClick(login_button);
    }

    public void setEmail(String email) {
        sendKeys(email_TextField, email);
    }
    public void setPassword(String password){
        sendKeys(password_TextField, password);
    }
    public void login(){
      waitForWebElementAndClick(login);
    }

    public void clickComputers(){
        waitForWebElementAndClick(computers);
    }
}

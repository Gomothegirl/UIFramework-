package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Global_Vars;


public class Login_PO extends Base_PO {
    private @FindBy(id = "text")
    WebElement username_TextField;

    private @FindBy(id = "password")
    WebElement password_TextField;
    private @FindBy(id = "login-button")
    WebElement login_Button;
    public Login_PO() {
        super();
    }

    public void navigateTo_WebdriverUniversity_LoginPage() {
        navigateTo_Url(Global_Vars.WEBDRIVER_UNIVERSITY_URL + "/Login-Portal/index.html?");
    }

    public void setUsername(String username) {
        sendKeys(username_TextField, username);
    }

    public void setPassdword(String password) {
        sendKeys(password_TextField, password);
    }

    public void clickLogInButton() {
        waitForWebElementAndClick(login_Button);
    }
public void validate_SuccessfulLogin_Message(){
    waitForAlert_And_ValidateText("validation succeeded");
}

    public void validate_FailedLogin_Message(){
        waitForAlert_And_ValidateText("validation failed");
    }
}


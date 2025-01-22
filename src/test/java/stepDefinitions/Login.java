package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.Base_PO;
import pageObjects.Login_PO;

public class Login extends Base_PO {

    private WebDriver driver = getDriver();

    private Login_PO login_po;


    public Login(Login_PO login_po) {
        this.login_po = login_po;
    }

    @Given("I can access WebDriver university website")
    public void iCanAccessWebDriverUniversityWebsite() {
        login_po.navigateTo_WebdriverUniversity_LoginPage();
    }

    @When("I enter a username {}")
    public void iEnterAUsername(String username) {
        login_po.setUsername(username);
    }

    @And("I enter a password {}")
    public void iEnterAPassword(String password) {
        login_po.setPassdword(password);
    }

    @And("I click on login")
    public void iClickOnLogin() {
        login_po.clickLogInButton();
    }
    @Then("I should be presented with the successful login message")
    public void i_should_be_presented_with_the_successful_login_message() {
        login_po.validate_SuccessfulLogin_Message();
    }

    @Then("I should be presented with the unsuccessful login message")
    public void i_should_be_presented_with_the_unsuccessful_login_message() {
        login_po.validate_FailedLogin_Message();
    }


    @Then("I should be presented with the following login message {}")
    public void iShouldBePresentedWithTheFollowingLoginMessage(String expectedMessage) {
       login_po.waitForAlert_And_ValidateText(expectedMessage);
    }
}


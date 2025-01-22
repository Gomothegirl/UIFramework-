package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.Global_Vars;

public class Contact_Us_PO extends Base_PO {
    private @FindBy(xpath = "//input[@name='first_name']")
    WebElement firstname_TextField;
    private @FindBy(xpath = "//input[@name='last_name']")
    WebElement lastname_TextField;
    private @FindBy(xpath = "//input[@name='email']555")
    WebElement emailaddress_TextField;
    private @FindBy(xpath = "//textarea[@name='message']")
    WebElement comments_TextField;
    private @FindBy(xpath = "//input[@type='submit']")
    WebElement submitButton;
    private @FindBy(xpath = "//input[@type='reset']")
    WebElement resetButton;
    private @FindBy(xpath = "//div[@id='contact_reply']/h1")
    WebElement successfulSubmission_Message_Text;


    public void navigateTo_WebdriverUniversity_Contact_Us_Page() {
        navigateTo_Url(Global_Vars.WEBDRIVER_UNIVERSITY_URL + "/Contact-Us/contactus.html");
    }

    public void setFirstname(String firstName) {
        sendKeys(firstname_TextField, firstName);
    }

    public void setLastname(String lastName) {
        sendKeys(lastname_TextField, lastName);
    }

    public void setEmailAddress(String email) {
        sendKeys(emailaddress_TextField, email);
    }

    public void setComment(String comment) {
        sendKeys(comments_TextField, comment);
    }

    public void setUniqueFirstname() {
        sendKeys(firstname_TextField, "AutoFirstName" + generateRandomNumber(5));
    }

    public void setUniqueLastname() {
        sendKeys(lastname_TextField, "AutoLastName" + generateRandomNumber(5));
    }

    public void setUniqueEmailAddress() {
        sendKeys(emailaddress_TextField, "AutoEmail" + generateRandomNumber(5) + "@mail.com");
    }

    public void setUniqueComment() {
        sendKeys(comments_TextField, "AutoComment" + generateRandomString(20));
    }

    public void clickSubmitButton() {
        waitForWebElementAndClick(submitButton);
    }

    public void clickResetButton() {
        waitForWebElementAndClick(resetButton);
    }

    public void validate_Susscessful_Submission_Message() {
        waitFor(successfulSubmission_Message_Text);
        Assert.assertEquals(successfulSubmission_Message_Text.getText(), "Thank You for your Message!");
    }


}

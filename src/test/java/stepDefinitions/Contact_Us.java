package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.Contact_Us_PO;


public class Contact_Us extends Base_PO {

    private Contact_Us_PO contact_us_po;


    public Contact_Us(Contact_Us_PO contact_us_po) {
        this.contact_us_po = contact_us_po;
    }

    @Given("I access the web-driver university contact us page")
    public void iAccessTheWebDriverUniversityContactUsPage() {
        contact_us_po.navigateTo_WebdriverUniversity_Contact_Us_Page();
    }

    @When("I enter a unique first name")
    public void iEnterAUniqueFirstname() {
        contact_us_po.setUniqueFirstname();
    }

    @And("I enter a unique last name")
    public void iEnterAUniqueLastName() {
        contact_us_po.setUniqueLastname();
    }

    @And("I enter a unique Email Address")
    public void iEnterAUniqueEmailAddressEmail() {
        contact_us_po.setUniqueEmailAddress();
    }

    @And("I enter a unique comment")
    public void iEnterAUniqueComment() {
        contact_us_po.setUniqueComment();
    }

    @And("I click on the submit button")
    public void iClickOnTheSubmitButton() {
        contact_us_po.clickSubmitButton();
    }

    @When("I enter a specific first name{}")
    public void iEnterASpecificFirstname(String firstName) {
        contact_us_po.setFirstname(firstName);
    }

    @And("I enter a specific last name{}")
    public void iEnterASpecificLastName(String lastName) {
        contact_us_po.setLastname(lastName);
    }

    @And("I enter a specific email {}")
    public void iEnterASpecificEmailJoe_blogsMailCom(String email) {
        contact_us_po.setEmailAddress(email);

    }

    @And("I enter a specific comment{}")
    public void iEnterASpecificComment(String comment) {
        contact_us_po.setComment(comment);

    }

    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
        contact_us_po.validate_Susscessful_Submission_Message();
    }


}

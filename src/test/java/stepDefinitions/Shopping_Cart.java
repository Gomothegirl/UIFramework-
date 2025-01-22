package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.Base_PO;
import pageObjects.Shopping_Cart_PO;

public class Shopping_Cart extends Base_PO {

    private WebDriver driver = getDriver();
    private Shopping_Cart_PO shopping_cart_po;

    public Shopping_Cart(Shopping_Cart_PO shopping_cart_po){
        this.shopping_cart_po = shopping_cart_po;
    }


    @Given("User is on Demo Web Shop homepage")
    public void user_is_on_demo_web_shop_homepage() {
        shopping_cart_po.navigateTo_ShoppingSite();
    }

    @When("User logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {
        shopping_cart_po.clickHomePageLogin();
        shopping_cart_po.setEmail("gomo@mail.com");
        shopping_cart_po.setPassword("!8cWP@swFthf3");
        shopping_cart_po.login();

    }

    @And("User navigates to Computers -> Desktops")
    public void user_navigates_to_computers_desktops() {
shopping_cart_po.clickComputers();
    }

    @And("User selects {string}")
    public void user_selects(String string) {
        System.out.println("test 3");
    }

    @And("User adds the computer to cart")
    public void user_adds_the_computer_to_cart() {
        System.out.println("test 4");
    }

    @And("User accepts Terms and Conditions")
    public void user_accepts_terms_and_conditions() {
        System.out.println("test 5");
    }

    @And("User proceeds to checkout")
    public void user_proceeds_to_checkout() {
        System.out.println("test 6");
    }

    @And("User completes Billing and Shipping details")
    public void user_completes_billing_and_shipping_details() {
        System.out.println("test 7");
    }

    @And("User selects Cash on Delivery as payment method")
    public void user_selects_cash_on_delivery_as_payment_method() {
        System.out.println("test 8");
    }

    @And("User confirms the order")
    public void user_confirms_the_order() {
        System.out.println("test 9");
    }

    @Then("User captures the order number")
    public void user_captures_the_order_number() {
        System.out.println("test 10");
    }


}

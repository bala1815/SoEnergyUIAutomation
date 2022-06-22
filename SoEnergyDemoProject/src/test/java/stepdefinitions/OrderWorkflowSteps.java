package stepdefinitions;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.text.SimpleDateFormat;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.pages.OrderWorkflowPage;
import com.qa.factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderWorkflowSteps {
//	private WebDriver driver;
	private static String actualTitle;
	private OrderWorkflowPage createAccountPage=new OrderWorkflowPage(DriverFactory.getDriver());

	
	@Given("user is on your logo website home page")
	public void user_is_on_your_logo_website_home_page() {

        DriverFactory.getDriver().get("http://automationpractice.com/index.php");
	}

	@When("user mousehover on Dresses menu and then select summer dresses")
	public void user_mousehover_on_dresses_menu_and_then_select_summer_dresses() throws InterruptedException {
		createAccountPage.mousehoveronDressesMenuandClickSummerDress();
		
	}
	@When("user changed the products view of the products to list view")
	public void user_changed_the_products_view_of_the_products_to_list_view() {
		createAccountPage.changetoListView();
	}
	@When("user adds the product to the cart")
	public void user_adds_the_product_to_the_cart() {
		createAccountPage.clickonAddToCart();
	  
	}
	@When("user proceed to checkout")
	public void user_proceed_to_checkout() {
		createAccountPage.proceedtoCheckout();
	}
	@When("user increased the quantity to two dresses")
	public void user_increased_the_quantity_to_two_dresses() {
		createAccountPage.increaseDressesQuantity();
	    
	}
	@When("user login into the user account")
	public void user_login_into_the_user_account() {
		createAccountPage.loginIntoTheApp();
	   
	}
	@When("user confirms the address and shipping address")
	public void user_confirms_the_address_and_shipping_address() {
		createAccountPage.NavigateUntilPaymentPage();
	}
	@Then("the name of the product and price is printed in the console")
	public void the_name_of_the_product_and_price_is_printed_in_the_console() {
	
	}




	
}

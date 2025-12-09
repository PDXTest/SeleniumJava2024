package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginclass{
	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("Hello_1");

	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Hello_12");
	}

	@When("Clciks on login button")
	public void clciks_on_login_button() {
		System.out.println("Hello_123");
	}

	@Then("User navigate to home page")
	public void user_navigate_to_home_page() {
		System.out.println("Hello_1234");
	}

	@When("User enters user1 and password1")
	public void user_enters_user1_and_password1() {
		System.out.println("Hello_1234567");
	}

}
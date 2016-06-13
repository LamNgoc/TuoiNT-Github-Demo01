package org.tuoi01.steps;

import org.junit.Assert;
import org.tuoi01.steps.serenity.LoginSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginUserSteps {

	@Steps
	LoginSteps loginSteps;

	@Given("^Go to the login page successfully$")
	public void go_to_the_login_page_successfully() throws Throwable {
		loginSteps.open_page_login();
	}

	@When("^Input an email \"([^\"]*)\"$")
	public void input_an_invalid_email(String email) throws Throwable {
		loginSteps.input_invalid_email(email);
	}

	@When("^Click Login button$")
	public void click_Login_button() throws Throwable {
		loginSteps.click_login_button();
	}

	@Then("^Show an error message \"([^\"]*)\"$")
	public void show_an_error_message(String message) throws Throwable {
		Assert.assertEquals(loginSteps.getErrMsg(),message);
	}
	
	@When("^Input an password \"([^\"]*)\"$")
	public void input_an_password(String pass) throws Throwable {
	    loginSteps.input_invalid_pass(pass);
	}

}

package org.tuoi01.steps.serenity;

import org.tuoi01.pages.LoginPage;

import net.thucydides.core.annotations.Step;

public class LoginSteps {

	LoginPage onLoginPage;

	@Step
	public void open_page_login() {
		onLoginPage.open();
	}

	public void input_invalid_email(String email) {
		onLoginPage.typeInto(onLoginPage.emailID, email);

	}

	public void click_login_button() {
		// onLoginPage.clickOn(onLoginPage.SubmitBtn);
		onLoginPage.clickSubmit();
	}

	public String getErrMsg() {
		String errMsg = onLoginPage.getErrMsg();
		return errMsg;
	}

	public void input_invalid_pass(String pass) {
		onLoginPage.typeInto(onLoginPage.passID, pass);
	}

}

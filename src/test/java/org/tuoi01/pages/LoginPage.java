package org.tuoi01.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://sso.teachable.com/secure/793/users/sign_in")
public class LoginPage extends PageObject{

	@FindBy(id="user_email")
	public WebElementFacade emailID;
	
	@FindBy(name="commit")
	public WebElementFacade SubmitBtn;
	
	public void clickSubmit(){
		SubmitBtn.click();
	}

	@FindBy(css="div.alert.alert-danger")
	public WebElementFacade ErrMsg;

	@FindBy(id="user_password")
	public WebElementFacade passID;
	
	
	public String getErrMsg() {
		ErrMsg.waitUntilPresent();
		return ErrMsg.getText();
	}

}

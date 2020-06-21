package com.cucumber.Definations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.cucumber.Base.SetUpMethod;
import com.cucumber.Pages.LoginPage;
import com.cucumber.Util.GetUtil;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class LoginDef {
	WebDriver driver;
	GetUtil getdtls=new GetUtil();
	LoginPage loginpage=new LoginPage(driver);
	@Given("^User is already on Login Page$")
	public void user_is_already_on_Login_Page()  {
		try {
			loginpage.open_url(getdtls.getProperties("url"));
		}
		catch(Exception e) {
			Assert.assertTrue(false, "Exception"+e.getMessage());
		}
	}

	@Then("^Enter Login Id in the Login Field$")
	public void enter_Login_Id_in_the_Login_Field()  {
		try {
			loginpage.enterUser(getdtls.getProperties("userid"));
		}
		catch(Exception e) {
			Assert.assertTrue(false, "Exception"+e.getMessage());
		}
	}

	@Then("^Enter Password in the Password$")
	public void enter_Password_in_the_Password()  {
		try {
			loginpage.enterPassword(getdtls.getProperties("password"));
		}
		catch(Exception e) {
			Assert.assertTrue(false, "Exception"+e.getMessage());
		}
	}

	@Then("^Click on Login Button$")
	public void click_on_Login_Button()  {
		try {
			loginpage.clickButton();
		}
		catch(Exception e) {
			Assert.assertTrue(false, "Exception"+e.getMessage());
		}
	}

	@Then("^Verify user login successfully$")
	public void verify_user_login_successfully() {
		try {
			loginpage.login_success();
		}
		catch(Exception e) {
			Assert.assertTrue(false, "Exception"+e.getMessage());
		}
	}

	@Then("^Logout from the application$")
	public void logout_from_the_application() {
		try {
			loginpage.log_out();
		}
		catch(Exception e) {
			Assert.assertTrue(false, "Exception"+e.getMessage());
		}
	}
	
	
}

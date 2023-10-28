package com.CRM.QA.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.QA.Base.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() throws Exception {
		super();
	   PageFactory.initElements(driver, this);
	}

	//page factory 
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(css=".ui.fluid.large.blue.submit.button")
	WebElement loginBtn;


  public HomePage doLogin(String uname,String pwd) throws Exception
  {
	  String pwd1 = pwd.substring(0, 1).toUpperCase();
	  String pwd2 = pwd.substring(1);
	  String correctpwd = pwd1+pwd2;
	  email.sendKeys(uname);
	  password.sendKeys(correctpwd);
	  loginBtn.click();
	  return new HomePage();
	  
  }

}

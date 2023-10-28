package com.CRM.QA.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.QA.Base.BaseClass;
import com.CRM.QA.Pages.HomePage;
import com.CRM.QA.Pages.LoginPage;

public class LoginPageTest extends BaseClass {
	LoginPage loginpage;
	HomePage homepage;

	public LoginPageTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setUP() throws Exception {

		initialization();

		loginpage = new LoginPage();
	}

	@Test
	public void Login() throws Exception {

		homepage = loginpage.doLogin(prop.getProperty("userName"), prop.getProperty("password"));
	}
}

package com.CRM.QA.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.CRM.QA.Base.BaseClass;

public class HomePage extends BaseClass {

	public HomePage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath="//span[@class='user-display']")
	WebElement usernamelabel;
	
	@FindBy(css=".users.icon")
	WebElement hoverUserContactIcon;
    
	@FindBy(xpath="//span[text()='Contacts']")
	WebElement contacts1;
    
	@FindBy(css=".users.icon")
	WebElement hoverDealsIcon;
	
	@FindBy(xpath="//span[text()='Contacts']")
	WebElement contacts;
}

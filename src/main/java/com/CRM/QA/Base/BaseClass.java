package com.CRM.QA.Base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.CRM.QA.Utilities.TestUtils;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass() throws Exception {
		try {
			
		    prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\CRM\\QA\\Config\\config.properties");
			
			prop.load(ip);
			
		} catch (Exception e) {
			throw e;
		}
	}

	public static void initialization() throws Exception
	{
		try {
			String browserName = prop.getProperty("browser");
			if(browserName.equalsIgnoreCase("chrome"))
			{
				
				driver = new ChromeDriver();
			}
			
			else if(browserName.equalsIgnoreCase("firefox"))
			{
				//firefox
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtils.Page_Load_Timout));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtils.Implicit_Wait));
			driver.get(prop.getProperty("url"));
			
		} catch (Exception e) {
			throw e;
		}
	}
	
}

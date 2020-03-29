package com.bridgelabz.bookwagon.test;

import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bridgelabz.bookswagon.base.BaseTest;
import com.bridgelabz.bookswagon.page.LoginPage;

public class LoginTest extends BaseTest{

	
	@BeforeMethod
	public void set() {
		initialize();
	}
	@Test
	public static void LoginCustomer() throws AWTException, InterruptedException {
		LoginPage customer=new LoginPage(driver);
		customer.custom();
		customer.mail("sonamsingh1528@gmail.com");
		Thread.sleep(1000);
		customer.password("9431603863");
		customer.login();
		
		
	}
	
}

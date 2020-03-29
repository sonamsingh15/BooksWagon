package com.bridgelabz.bookwagon.test;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bridgelabz.bookswagon.base.BaseTest;
import com.bridgelabz.bookswagon.page.SearchBar;

public class SearchBarTest extends BaseTest {
	
	@BeforeClass
	public void setup() {
	initialize();
	}

 
@Test
public static void searchBook() throws AWTException, InterruptedException{
	
LoginTest loginCustomer=new LoginTest();
loginCustomer.LoginCustomer();	

SearchBar search= new SearchBar(driver);
search.SearchBar("Ravinder Singh");
search.onClick();
}
}

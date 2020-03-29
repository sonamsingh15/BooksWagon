package com.bridgelabz.bookwagon.test;

import java.awt.AWTException;
import java.sql.DriverAction;

import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bridgelabz.bookswagon.base.BaseTest;
import com.bridgelabz.bookswagon.page.Homepage;
import com.bridgelabz.bookswagon.page.LoginPage;

public class BooksWagonTest extends BaseTest {

@BeforeClass
	public void setup() {
	initialize();
	}

 
@Test
public static void WhenTypeAuthorAndBookName_ShouldReturnBooklist()throws AWTException, InterruptedException {
	 

LoginPage login=new LoginPage(driver);
Homepage addBook= new Homepage(driver);

//
//login.custom();
//login.mail("sonamsingh1528@gmail.com");
//Thread.sleep(100);
//
//login.password("9431603863");
//login.login();
//Thread.sleep(1000);
//
// addBook.searchBar("Ravinder Singh");
// login.password("9431603863");

 addBook.searchBar("Ravinder Singh");
 addBook.onClick();

 
	addBook.findBook();
	addBook.onClick();
	
	addBook.buyNow();
	Thread.sleep(5000);
	addBook.onClick();
	
	
	addBook.PlaceOrder();
	addBook.onClick();
	login.custom();
	login.mail("sonamsingh1528@gmail.com");
	Thread.sleep(100);

	login.password("9431603863");
	login.login();
	Thread.sleep(1000);

	
	addBook.ContinueShopping();
	addBook.onClick();

	
	

	
}

@AfterClass
public void close()  {
	driver.close();
}


	
}




package com.bridgelabz.bookwagon.test;

import java.awt.AWTException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bridgelabz.bookswagon.base.BaseTest;
import com.bridgelabz.bookswagon.page.BuyBook;
import com.bridgelabz.bookswagon.page.SearchBar;

public class BuyBookTest extends BaseTest {
	@BeforeClass
	public void setup() {
	initialize();
	}

 
@Test
public static void buyNow() throws AWTException, InterruptedException{
	 SearchBarTest search= new SearchBarTest();
	 search.searchBook();
	 
	 BuyBook buyBook=new BuyBook(driver);
	 buyBook.BookName();
	 buyBook.onClick();
	 buyBook.buyNow();
	 buyBook.onClick();

	 
	 
} 

}

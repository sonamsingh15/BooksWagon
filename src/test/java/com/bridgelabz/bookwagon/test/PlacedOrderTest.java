package com.bridgelabz.bookwagon.test;

import java.awt.AWTException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bridgelabz.bookswagon.base.BaseTest;
import com.bridgelabz.bookswagon.page.PlacedOrder;

public class PlacedOrderTest extends BaseTest {
	
	
	@BeforeClass
	public void setup() {
	initialize();
	}

 
@Test
public static void BookPlaceOrder() throws AWTException,InterruptedException{
	BuyBookTest buynow=new BuyBookTest();
	buynow.buyNow();
	
	PlacedOrder orderplaced=new PlacedOrder();
	orderplaced.PlaceOrder();
	orderplaced.onClick();
	
	
	}
	 }

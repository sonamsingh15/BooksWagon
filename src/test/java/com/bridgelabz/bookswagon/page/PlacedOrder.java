package com.bridgelabz.bookswagon.page;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlacedOrder {
	public static WebDriver driver;
	
	public PlacedOrder() {
		this.driver=driver;
        PageFactory.initElements(driver,this);
	}
        @FindBy(xpath ="//input[@name='BookCart$lvCart$imgPayment']")
        WebElement PlaceOrder;
       
        @FindBy(id="ctl00_TopSearch1_Button1")
        WebElement clicked;

       

        public void PlaceOrder() throws AWTException{
        driver.get("https://www.bookswagon.com/shoppingcart.aspx?&pid=23160394&vid=26&ptype=1");
    	driver.findElement(By.xpath("//input[@value=\"Place Order\"]")).click();
       }
        
        public void onClick() {
        	clicked.click();
        	}

}

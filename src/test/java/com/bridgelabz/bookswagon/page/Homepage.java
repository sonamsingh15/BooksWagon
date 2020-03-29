package com.bridgelabz.bookswagon.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.google.inject.Key;
import com.mongodb.client.model.geojson.Point;


public class Homepage {

	public static WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver=driver;
        PageFactory.initElements(driver,this);

	
	}
 @FindBy(id="ctl00_TopSearch1_txtSearch") 
  WebElement searchBar;
 
 @FindBy(id="ctl00_TopSearch1_Button1")
 WebElement clicked;
 
 @FindBy(xpath ="//a[contains(text(),'Will You Still Love Me?')]")
 WebElement findBook;
 
 @FindBy(xpath ="//input[@value='Buy Now']")
 WebElement buyNow;
 
 
 @FindBy(xpath ="//input[@value='Add to Wishlist']")
 WebElement addToWishlist;
 
 @FindBy(xpath = "//[@id\"ctl00_cpBody_plnNewLogin\"]")
 WebElement customerdetail;



@FindBy(xpath ="//input[@id='ctl00_phBody_SignIn_txtEmail']")
WebElement Email;

@FindBy(xpath = "//input[@id='ctl00_phBody_SignIn_txtPassword']")
WebElement pwsd;

@FindBy(xpath = "//input[@value='Login']")
WebElement login;

@FindBy(xpath ="//input[@name='BookCart$lvCart$imgPayment']")
WebElement PlaceOrder;

@FindBy(xpath ="//a[@class='my-cart active']")
WebElement addbag;

@FindBy(xpath ="//a[@class='btn-red']")
WebElement shoppingContinue;

public void CustomerDetail() {
	customerdetail.click();
}

public void addbag() {
	addbag.click();
}

public void searchBar(String element) {
 searchBar.sendKeys(element);	
}

public void onClick() {
clicked.submit();

}

public void findBook() {
findBook.click();
	
}
public void buyNow(){
buyNow.click();
}

public void addToWishList() {
addToWishlist.click();
}

public void Email(String element) {
Email.sendKeys(element);
}

public void password(String element) {
pwsd.sendKeys(element);
}

public void removeItem() {
	//driver.get("https://www.bookswagon.com/shoppingcart.aspx?&pid=23160394&vid=26&ptype=1");
	driver.findElement(By.xpath("//a[@id='BookCart_lvCart_ctrl0_imgDelete']")).click();

	
}
public void PlaceOrder() throws AWTException{
//PlaceOrder.submit();
//driver.switchTo().frame("aspnetForm");	
//driver.findElement(By.id("BookCart_lvCart_imgPayment")).sendKeys("Switch By Using Index");
//driver.switchTo().defaultContent();
//
//Robot robot = new Robot();
//robot.mouseMove(787, 404);
//robot.mousePress();
////Actions action = new Actions(driver);
	
	driver.get("https://www.bookswagon.com/shoppingcart.aspx?&pid=23160394&vid=26&ptype=1");
	driver.findElement(By.xpath("//input[@value=\"Place Order\"]")).click();
	//driver.findElement(By.xpath("//a[@id='BookCart_lvCart_ctrl0_imgDelete']")).click();

	//driver.findElement(ByName("viewport"))
	//driver.switchTo().defaultContent();
}
public void loginPage() {
	
}
public void ContinueShopping() {
	shoppingContinue.click();
	
}













//Handle popup
//click on QTY and use backspace and then enter value
public void quantity() throws AWTException {
   driver.switchTo().frame(0);	
   //driver.switchTo().frame("a077aa5e");
  // driver.switchTo().frame("a077aa5e");
   driver.findElement(By.xpath("//input[@value='Buy Now']")).click();
 //  driver.switchTo().frame(By.id="ctl00_TopSearch1_ScriptManager1_HiddenField");
    //Set<String> winHandleAfter = driver.getWindowHandles();
	//	JavascriptExecutor js= (JavascriptExecutor) driver;
	//jst.executeScript("document.getElementById.value =quantity; ", 55, driver.findElement(By.id("id")));
    //  js.executeScript("window.location = 'https://www.softwaretestingmaterial.com");
    // js.executeScript("document[0].click();",element);
  //   js.executeScript("document.getElementById('BookCart_lvCart_ctrl0_txtQty').value='2';");
    //jst.executeScript("document.getElementById('BookCart_lvCart_ctrl0_txtQty').checked=false;");
	  //	driver.switchTo().window(winHandleAfter);
     //	quantity.clear();
    //System.out.println(winHandleAfter.size());
	

}
//public void addcart() {
//	addCart.click();
//  }
}

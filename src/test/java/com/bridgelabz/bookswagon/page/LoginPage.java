package com.bridgelabz.bookswagon.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public static WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
        PageFactory.initElements(driver,this);
	}
	

	@FindBy(xpath ="//input[@id='ctl00_phBody_SignIn_txtEmail']")
        WebElement emailId;

        @FindBy(xpath = "//input[@id='ctl00_phBody_SignIn_txtPassword']")
        WebElement pwsdNumber;

        
     
        @FindBy(xpath ="//div[@id='ctl00_divLogin']")
        WebElement optionTologin;
	
     
       public void custom() {
    	optionTologin.click();
		
	}    
	
	public void mail(String name) {
		emailId.sendKeys(name);
	}
	
	public void password(String psw) {
		pwsdNumber.sendKeys(psw);
	
	}
	public void login() throws AWTException,InterruptedException {
		//driver.get("https://connect.facebook.net/signals/config/963219683834125?v=2.9.15&r=stable");
		//driver.get("https://bid.g.doubleclick.net/xbbe/pixel?d=KAE");
		//driver.findElement(By.xpath("//input[@value='Login']))
		
		//WebElement My_frame=driver.findElement(By.xpath("//iframe[@id='fHcrjQV-1585490864284']"));
		//driver.switchTo().frame(My_frame);
		
		driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignUp_btnSubmit']")).click();
		Robot robot = new Robot();
		robot.mouseMove(193, 414);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		
		
		//login.submit();
	
}
}

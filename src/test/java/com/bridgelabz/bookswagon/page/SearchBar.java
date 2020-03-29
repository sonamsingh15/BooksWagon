package com.bridgelabz.bookswagon.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bridgelabz.bookswagon.base.BaseTest;

public class SearchBar extends BaseTest{
public static WebDriver driver;
	
	public SearchBar(WebDriver driver) {
		this.driver=driver;
        PageFactory.initElements(driver,this);

	
	}
 @FindBy(id="ctl00_TopSearch1_txtSearch") 
  WebElement searchBar;
 
 @FindBy(id="ctl00_TopSearch1_Button1")
 WebElement clicked;

 
 public void SearchBar(String element) {
 searchBar.sendKeys(element);	
 }

public void onClick() {
clicked.click();
}

}

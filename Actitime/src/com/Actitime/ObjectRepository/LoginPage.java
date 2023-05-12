package com.Actitime.ObjectRepository;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {
 
	   //declaration
	@FindBy(id="username")
	private WebElement unbt;
	
	@FindBy(name="pwd")
	private WebElement pwdbt;
	
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbtn;
	
	//Initialization
	public  LoginPage( WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
		//utilization
		public WebElement getUntbx() {
			return unbt;
		}
		
			public WebElement getPwtbx() {
				return pwdbt;
			}
		
		public WebElement getlgbtn() {
			return lgbtn;
	}
		
		
	
}

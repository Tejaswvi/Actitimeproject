package com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actitime.GenericLibrary.FileLibrary;

public class Taskpage {

	// decelaration
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newcust;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custname;
	
	@FindBy( xpath="//div[.='Create Customer']")
	private WebElement createcust;

	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelbtn;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement desc;
	
	
	
	// Initialization
	public Taskpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



	//utilizhation
	public WebElement getAddnewbtn() {
		return addnewbtn;
	}



	public WebElement getNewcust() {
		return newcust;
	}



	public WebElement getCustname() {
		return custname;
	}



	public WebElement getCreatecust() {
		return createcust;
	}



	public WebElement getCancelbtn() {
		return cancelbtn;
	}



	public WebElement getDesc() {
		return desc;
	}

}

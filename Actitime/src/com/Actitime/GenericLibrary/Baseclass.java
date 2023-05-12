package com.Actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.Actitime.ObjectRepository.Homepage;
import com.Actitime.ObjectRepository.LoginPage;

public class Baseclass {
    public static WebDriver driver;
   FileLibrary f=new FileLibrary();
   
	@BeforeSuite
     public void databaseconnection() {
	  Reporter.log("database connected",true);
}
     @BeforeClass
     public void  launchBrowser() throws IOException {
      driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    // driver.get("https://demo.actitime.com");
     String URL = f.readDataFromPropertyFile("url");
     driver.get(URL);
     Reporter.log("browser launched",true);	 
    
}

   @BeforeMethod
   public void login() throws IOException {
	   LoginPage lp=new LoginPage(driver);
	   lp.getUntbx().sendKeys("admin");
	   lp.getPwtbx().sendKeys("manager");
	   lp.getlgbtn().click();
	   Reporter.log("logged in successfully",true);
	   
	 
   }
   @AfterMethod
   public void logout() {
	 Homepage hp= new Homepage(driver);
	 hp.getLogoutlnk().click();
	   Reporter.log("logout successfully",true);	 
   }
   @AfterClass
   public void closebrowser() {
	   driver.close();
	   Reporter.log("browser closed",true);
   }
   @AfterSuite
   public void databasedisconnected() {
	   Reporter.log("database disconnected",true);
   }
   
}

package com.Actitime.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Actitime.GenericLibrary.Baseclass;
import com.Actitime.GenericLibrary.FileLibrary;
import com.Actitime.ObjectRepository.Homepage;
import com.Actitime.ObjectRepository.Taskpage;

public class Task extends Baseclass {
@Test
public void CreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
	Homepage hp=new Homepage(driver);
	Thread.sleep(3000);
	hp.getTasktab().click();
	
Taskpage tp=new Taskpage(driver);
tp.getAddnewbtn().click();
tp.getNewcust().click();
	FileLibrary f=new FileLibrary();
	String createcustomer = f.readDataFromExcelSheet("Sheet1", 3, 1);
	tp.getCustname().sendKeys(createcustomer);
	String desc = f.readDataFromExcelSheet("Sheet1", 3,2 );
	tp.getDesc().sendKeys(desc);
	tp.getCreatecust().click();
	String expectedresult = createcustomer;
  String Actualresult = driver.findElement(By.xpath("(//div[.='"+createcustomer+"'])")).getText();
	SoftAssert s=new SoftAssert();
	s.assertEquals(Actualresult,expectedresult);
	s.assertAll();
	
}
}

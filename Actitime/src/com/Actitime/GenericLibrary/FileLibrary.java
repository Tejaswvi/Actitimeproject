package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is a generic Library class which contains all the generic methods 
 * @author Teju
 *
 */
public class FileLibrary {
	/**
	 * This is a generic method which is use to read the data from property file.
	 * @param key
	 * @return
	 * @throws IOException
	 */
public String readDataFromPropertyFile(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./Testdata/commondata.property");
	Properties p=new Properties();
	p.load(fis);
	String value = p.getProperty(key);
	return value;
}

 public String readDataFromExcelSheet(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
	 /**
	  * This method is a generic method used to read data from Excel Sheet
	  */
	 FileInputStream fis1=new FileInputStream("./Testdata/TESTDATA.xlsx");
	 Workbook wb = WorkbookFactory.create(fis1);
	 String value = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	 return value;
 }
}

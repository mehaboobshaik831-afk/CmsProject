package com.crm.ClientManagementSystem.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtils {

	public String readdataFromPropertyFile( String key) throws IOException {
		FileInputStream fis=new FileInputStream(IpathConstants.propertypath);
		Properties p=new Properties();
		p.load(fis);
	    String data = p.getProperty(key);
		return data;
	}
	public String readDataFromExcel(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(IpathConstants.excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		String data=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	public double readDataFromExcelNumeric(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(IpathConstants.excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		 double data=wb.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
		 return data;
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileUtils f = new FileUtils();
	String data = f.readDataFromExcel("TestingData", 1, 1);
	System.out.println(data);
	}

}

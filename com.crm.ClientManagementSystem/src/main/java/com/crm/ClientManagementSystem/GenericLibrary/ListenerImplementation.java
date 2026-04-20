package com.crm.ClientManagementSystem.GenericLibrary;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;


public class ListenerImplementation extends Baseclass implements ITestListener {
	ExtentReports report;
	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name=result.getName();
		report.createTest(name);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name= result.getTestName();
		JavaUtility j = new JavaUtility();
	    String DateAndTime = j.getDateAndTime("dd-MM-yyyy  hh-mm-ss");
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/"+name+DateAndTime+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
		
		
        
		
		
		

		

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		ExtentSparkReporter reporter=new ExtentSparkReporter("./ExtentReport/report.html");
		reporter.config().setDocumentTitle("CMS EXECUTION REPORT");
		reporter.config().setReportName("Execution details");
		reporter.config().setTheme(Theme.DARK);
	    report=new ExtentReports();
	    report.setSystemInfo("url","http://localhost:8888");
	    report.setSystemInfo("os", "Windows");
	    report.setSystemInfo("browser", "chrome");
	    report.setSystemInfo("Test engineer", "Mehaboob"); 
		 
		
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}
	
	
	

}

package Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.mail.DataSourceResolver;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.ImageHtmlEmail;
import org.apache.commons.mail.resolver.DataSourceUrlResolver;
import org.testng.ITestContext;
import org.testng.ITestListener;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.BaseClass;


public class ExtentReportManager implements ITestListener  {
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	String repName;
	public ExtentTest test;


	public void onStart(ITestContext testContext) {

		// Generate Current date format (Simple way)

		/*SimpleDateFormat df=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
Date dt=new Date();
String Currentdatetimestamps=df.format(dt); */

		// Generate Current date format (Alternate way)

		String CurrentTimestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		System.out.println(CurrentTimestamp);


		// Generating Reports
		// Initilize one variable for repName and add the timestamp to concatinate the report format like below.

		repName="Test-Report" + CurrentTimestamp + ".html";
		System.out.println(repName);

		// Specify the Report location where we need to generate reports.

		sparkReporter=new ExtentSparkReporter(".\\reports\\" + repName);
		System.out.println(sparkReporter);

		sparkReporter.config().setDocumentTitle("SREM Automation Report");
		sparkReporter.config().setReportName("SREM Functional Testing");
		sparkReporter.config().setTheme(Theme.DARK);

		// Create extent report class
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Application", "SREM");
		extent.setSystemInfo("Module", "Admin");
		extent.setSystemInfo("SubModule", "Customers");
		extent.setSystemInfo("User name", System.getProperty("user.name"));
		extent.setSystemInfo("Environment", "QA");

		// Initilizing browser and os

		String os=testContext.getCurrentXmlTest().getParameter("os");
		extent.setSystemInfo("Operating System", os);

		String browser=testContext.getCurrentXmlTest().getParameter("browser");
		extent.setSystemInfo("Browser", browser);

		// Getting groups of browsers from XML file
		List<String> includedGroups=testContext.getCurrentXmlTest().getIncludedGroups();

		// is not empty meeans some values are there thats why we are validating the information.
		if(!includedGroups.isEmpty()) {
			extent.setSystemInfo("Groups",includedGroups.toString());
		}
	}

	public void onTestSuccess(ITestResult result) {
		// Without class we are entring the class name
		test =extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups()); // To display groups in the report
		test.log(Status.PASS, result.getName()+"got successfully excuted");

		try {
			String imgPath=new BaseClass().captureScreenshot(result.getName());
			test.addScreenCaptureFromPath(imgPath);
		}catch(Exception e1) {
			e1.printStackTrace();
		}

	}

	public void onTestFailure(ITestResult result) {
		test =extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups());

		test.log(Status.FAIL, result.getName()+"got failed");
		test.log(Status.INFO, result.getThrowable().getMessage());

		// taking screenshot for failure
		// we need to create the capturescreen class in base class and we need to get the screencapture method from base class
		try {
			String imgPath=new BaseClass().captureScreenshot(result.getName());
			test.addScreenCaptureFromPath(imgPath);
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult result) {
		test =extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups());

		test.log(Status.SKIP, result.getName()+"got skipped");
		test.log(Status.INFO, result.getThrowable().getMessage());
	}

	public void onFinish(ITestContext testContext) {

		extent.flush();

		String pathOfExtentReport=System.getProperty("user.dir")+"\\reports\\"+repName;
		File extentReport =new File(pathOfExtentReport);
		System.out.println(pathOfExtentReport);
		System.out.println(extentReport);
		try {
			Desktop.getDesktop().browse(extentReport.toURI());
		}catch(Exception e) {
			e.printStackTrace();
		}


	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub

	}




	// When even we need to send the report through email for our team then we can use the this code to send an email.

	/*try {

		URL url= new URL("file:///"+System.getProperty("user.id")+ "\\reports\\"+repName);

		// Create the email message
		ImageHtmlEmail email=new ImageHtmlEmail();
		email.setDataSourceResolver(new DataSourceUrlResolver(url));
		email.setHostName("smtp.googlemail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("sainirmala.032@gmail.com", "Nirmala@123"));
		email.setSSLOnConnect(true);
		email.setFrom("sainirmala.032@gmail.com"); // Sender
		email.setSubject("Test Result");
		email.setMsg("Please find attached Report");
		email.addTo("nirmala.s@ctpl.io");
		email.attach(url, "extent report" , "please check the report");
		email.send();

	}catch(Exception e) {
		e.printStackTrace();
	}*/


}


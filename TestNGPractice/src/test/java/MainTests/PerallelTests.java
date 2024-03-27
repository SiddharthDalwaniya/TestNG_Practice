package MainTests;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.Test;

public class PerallelTests{

	WebDriver driver;
	
	static ExtentSparkReporter reporter = new ExtentSparkReporter("SparkReport.html");
	static ExtentReports extent = new ExtentReports();
	static ExtentTest test;
	static Map<Integer, ExtentTest> testMap= new HashMap();
	
	@BeforeTest
	public void Before_test() {
		System.out.println("This is before tests");
		extent.attachReporter(reporter);
	}
	
	@BeforeClass
	public void Before_class() {
		System.out.println("This is before class class");
	}
	
	@BeforeGroups
	public void Before_group() {
		System.out.println("This is before groups");
	}
	
	protected static ThreadLocal<WebDriver> ThreadDriver=new ThreadLocal<WebDriver>();
	
	@BeforeMethod
	public void Before_method(Method m) {
		
		System.out.println("This is before method");
		
		//-------Setup the reports-----//
		test=extent.createTest(m.getName());
		testMap.put((int) Thread.currentThread().getId(), test);
		
		//-------Setup the browser-----//
		System.setProperty("webdriver.chromedriver.driver","Resources/chromedriver");
		ThreadDriver.set(new ChromeDriver());
		
	}
	
	@AfterMethod
	public void After_method(ITestResult result) {
		
		System.out.println("This is after method");
		ExtentTest test1 = ( ExtentTest ) testMap.get((int)Thread.currentThread().getId());
		
		//-----------log a final statue (for retries as well)-------//
		if(result.getStatus() == ITestResult.FAILURE) {
			System.out.println("Failed");
			test1.log(Status.FAIL, "Test failed");
		}
		else if(result.getStatus() == ITestResult.SKIP) {
			test1.log(Status.SKIP, "Test skipped");
		}
		else if(result.getStatus( ) == ITestResult.SUCCESS) {
			test1.log(Status.PASS, "Test passed");
		}
		
		//---------close all the webdriver instances of the current thread---------//
		ThreadDriver.get().quit();
	}
	
	@AfterGroups
	public void After_group() {
		System.out.println("This is after group");
	}
	
	@AfterClass
	public void After_class() {
		System.out.println("This is after class");
	}
	
	
	@AfterTest
	public void After_test() {
		System.out.println("This is after test");
		
		//-----------Flush the report to write all the tests----------//
		extent.flush();
	}
	
}

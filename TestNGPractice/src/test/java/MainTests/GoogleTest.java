package MainTests;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.beust.jcommander.Parameter;

public class GoogleTest extends PerallelTests{

	@Parameters({"browser"})
	@Test
	public void sampleTestGoogle(String browser) throws InterruptedException {
		driver=ThreadDriver.get();
		System.out.println(browser);
		System.out.println("Opening Google");
		driver.get("https:www.google.com");
		Thread.sleep(5000);
		Assert.fail();
	}
	
	@Test
	public void sampleTestAmazon() throws InterruptedException {
		driver=ThreadDriver.get();
		System.out.println("Opening Amazon");
		driver.get("https:www.amazon.com");
		Thread.sleep(5000);
	}
	
}

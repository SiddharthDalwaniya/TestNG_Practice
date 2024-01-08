package OpenApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class OpenCalculator {

	public static AppiumDriver driver;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OpenCalculator();
	}
	
	public static void OpenCalculator() throws Exception {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "realme XT");
		
//		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "your_device_name");
	//	cap.setCapability("automationName", "UiAutomator2");


		cap.setCapability("appPackage", "com.android.calculator2.CalculatorApplication");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");

		driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		System.out.println("Done");
	}

}

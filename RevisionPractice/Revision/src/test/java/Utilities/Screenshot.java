package Utilities;

import java.lang.annotation.Annotation;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.util.*;
import java.io.*;

public class Screenshot {

	static WebDriver driver;
	
	
	public static void TakeScreenshot(WebDriver driver) {

		
		TakesScreenshot screen= (TakesScreenshot) driver;
		Date date= new Date();

		String FileName= date.toString().replace(" ", "-").replace(":", "-")+".png";
		System.out.println("Screeshot has been taken with the name : "+FileName);

		File Screenshot= screen.getScreenshotAs(OutputType.FILE);

		try {

			FileUtils.copyFile(Screenshot, new File("/Revision/target/Screenshot"+FileName));

		}
		catch(Exception E){
			E.printStackTrace();		
		}

	}

}

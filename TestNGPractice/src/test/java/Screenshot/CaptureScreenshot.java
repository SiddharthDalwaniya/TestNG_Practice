package Screenshot;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import MainTests.PerallelTests;

public class CaptureScreenshot extends PerallelTests {

	
	
	public static void Screenshot(WebDriver driver) throws IOException {
		TakesScreenshot screen=(TakesScreenshot) ThreadDriver.get();;
		File screenshot=screen.getScreenshotAs(OutputType.FILE);
		String FileName=(new Date()).toString().replace("-","_").replace(".","_");
		FileUtils.copyFile(screenshot, new File("target/ScreenShots/"+FileName+".png"));
	}
	
	public static void WholeViewScreenshot() throws AWTException, IOException {
		Robot robot=new Robot();
		Toolkit toolKit=Toolkit.getDefaultToolkit();
		
		Rectangle rect = new Rectangle(toolKit.getScreenSize());
		
		BufferedImage ScreenshotImage = robot.createScreenCapture(rect);
		
		String FileName=(new Date()).toString().replace("-","_").replace(".","_");
		File file=new File(".//TestNGPractice/target/ScreenShots/siddharth.png");
//		FileUtils.copyFile(ScreenshotImage, file);
		ImageIO.write(ScreenshotImage, "png", file);
		
	}
	
}

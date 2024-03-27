package Listners;

import java.awt.AWTException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import MainTests.GoogleTest;
import MainTests.PerallelTests;
import Screenshot.CaptureScreenshot;

public class SimpleListners extends PerallelTests implements ITestListener, IAnnotationTransformer{
	
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	}
	
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}
	
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		try {
			CaptureScreenshot.Screenshot(ThreadDriver.get());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ThreadDriver.get().quit();
		}
	}
	
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	}
	
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	}
	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		annotation.setRetryAnalyzer(Retry.class);
	}
	
	
}

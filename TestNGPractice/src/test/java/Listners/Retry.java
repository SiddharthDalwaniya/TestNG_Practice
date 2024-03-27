package Listners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{

	private int count=0;
	private final static int max=3;
	
	
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(count<max) {
			count++;
			return true;
		}
		
		return false;
	}

}

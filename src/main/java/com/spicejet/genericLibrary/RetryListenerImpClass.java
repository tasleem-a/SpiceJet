package com.spicejet.genericLibrary;

import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class RetryListenerImpClass implements IRetryAnalyzer,ITestListener
{
	int counter=0;
	int retryLimit=3;

	public boolean retry(ITestResult result) {
		if(counter<retryLimit)
		{
			System.out.println("reexecuting");
			counter++;
			return true;
		}
		return false;
	}

}

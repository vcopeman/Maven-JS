package com.tests.twitter.MavenJavaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DealwithJavascript
   
{
	@Test(enabled=false)
	public void testJavascript() throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.javascriptkit.com/javatutors/event2.shtml");
		driver.manage().window().maximize();
	
		((JavascriptExecutor)driver).executeScript("inform();");
	
		//driver.findElementByXPath(".//*[@id='contentcolumn']/div[1]/table/tbody/tr/td[2]/form/input").click();
		Thread.sleep(5000);
		driver.quit();
		
	  
	}
	
	@Test(enabled=false)
	public void testJobServe() throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.jobserve.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath(".//*[@id='btnSearch']").click();	
		driver.findElementByXPath(".//*[@id='searchtogglelink']").click();		
		driver.findElementByXPath(".//*[@id='Salary']/div[2]/div[12]/label/a[2]").click();
		
		//((JavascriptExecutor)driver).executeScript("jsband();"); ??s
		
		Thread.sleep(5000);
		driver.quit();
	}			
}


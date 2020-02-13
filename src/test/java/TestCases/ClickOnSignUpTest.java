package TestCases;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestBases.TestCasesBase;
import TestPages.BankHomePage;
import Utills.ExtentTestManager;

public class ClickOnSignUpTest extends TestCasesBase 
{
   
	BankHomePage signupObj;
	

	@BeforeMethod
    public void methodLevelSetup() {
       signupObj = new BankHomePage(driver);
    }
	
	
	
	@BeforeTest
	public void testOpenApplication() throws Exception 
	{
		ClickOnSignUpTest.openBrowser();
		ClickOnSignUpTest.openApplication();
	}
	
	
	@Test(priority = 0, description = "Testing clicked on Link or not.")
	public void testClinkOnLink(Method method) throws InterruptedException {
		
		ExtentTestManager.startTest(method.getName(), "Testing clicked on Link or not.");
		
		signupObj.clickOnLink();
		
		Thread.sleep(10000);
		
		
	}
	
	@Test(priority = 1, description = "Test filed test cases ")
	public void testFailedScenarios(Method method) 
	{
		ExtentTestManager.startTest(method.getName(),"Test Failed screnarios");
		
		assertTrue(false);
		
	}
	
	
	@Test(priority = 2 , description = "Test actual expected")
	public void testAcualExpected(Method method) 
	{
	 ExtentTestManager.startTest(method.getName(),"Test actual expected");
	 assertEquals("This", "That");
	}
	
	@AfterTest
	public void closeDriver() {
		driver.close();
	}
}

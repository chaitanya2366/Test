package TestPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ObjectRepoReader.ObjectMap;
import TestBases.TestCasesBase;
import Utills.CommonAction;

public class BankHomePage 
{
	public WebDriver driver;
	WebElement signInLink;
	
	
	public BankHomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	public  String getTittle(WebDriver driver) {
		
		return driver.getTitle();
	}
    
	public void clickOnLink() {
		
		signInLink = TestCasesBase.getWebElement("signIn");
    	signInLink.click();
						
	}
	
}

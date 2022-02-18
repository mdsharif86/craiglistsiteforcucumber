package TestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;



public class Test_Verify_Farm_And_Garden_Page extends Base{
	@Test
	public void given_I_am__in_Craiglist(){
		SetUpUrl("https://oklahomacity.craigslist.org/");
		
		boolean logoIsDisplayed=isDisplayed(By.cssSelector("#logo"));
		System.out.println(logoIsDisplayed);
		Assert.assertEquals(logoIsDisplayed, true);
	}
	
}

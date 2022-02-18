package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
		
		public static WebDriver driver;
		@BeforeSuite
		public  void SetupDriveManager() {
			ChromeOptions COption = new ChromeOptions();
			COption.setHeadless(false);
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(COption);
		}
		public void SetUpUrl(String url) {
			driver.get(url);
		}
		public void Click(String xpath) {
			driver.findElement(By.xpath(xpath)).click();
		}
		public  void sendKeys(String xpath, String value) {
			driver.findElement(By.xpath(xpath)).sendKeys(value);
		}
		public boolean isDisplayed(By locator) {
			return driver.findElement(locator).isDisplayed();
		}
		@AfterSuite
		public  void close() {
			driver.close();
		}
		
		
		
		
		
	}



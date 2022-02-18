package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	
	public  void SetupDriveManager() {
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
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
	
	public  void close() {
		driver.close();
	}
	
	
	
}

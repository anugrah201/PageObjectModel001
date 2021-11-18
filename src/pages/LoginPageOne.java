package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPageOne 

{
	WebDriver driver;
	public void openBrowser()
	{
		String browser = "firefox";
		  
		  
		  if(browser.equals("firefox"))
		  {
		  System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  }
		  else if(browser.equals("chrome"))
		  {
		  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		  driver = new ChromeDriver();  
		  }
		  
	}
	
	public void openLoginPage()
	{
		  driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=SLHcLnDdDQc&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiU0xIY0xuRGREUWMiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTYzNjkwOTkxMywiaWF0IjoxNjM2OTA4NzEzLCJqdGkiOiI2MzI4OThkOC0xOGNjLTQ1MzEtOGFjYi1lZDViMDI2OWM0NjEiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.esPdC_6MoZt4Rf3wdJ5oL5Z32KuyLpEjHMI-DlMSYcZTsi_QXCWido6vdzyt1j4xVunA7O7nhgfPFw3RWGfr0yKds-wtu7kxMlN-onWc4jYYcRP1n0hvAoWCoQmE4KXFGfpZ1LfqdWgzH3D1SE7P5gFhr8VeXJEc_Rq9pB3tjYjyI3nBHntfq3KVM-y1U4oJ9iCbgx1rMYtaXNtpgApxTOYrSExUS-Ekf422oHnruDsQ2PIk_OxIMnowB9i-lYlkxStW8VgthVjLaeXBoxezBUF6tsJN4RCTjZackZahzmGWnAHYN6xYABLcXWPDDVjyzpqwsWw-6rNT9jb429CB5w&preferred_environment=");
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
	
	public void login(String a, String b)
	{
		  driver.findElement(By.name("usernameInput-input")).sendKeys(a);
		  driver.findElement(By.id("password-input")).sendKeys(b);
		  driver.findElement(By.id("signIn")).click();
	}
	public String globalError()
	{
		String glError = driver.findElement(By.id("globalError")).getText();
		return glError;
	}
	
	public String localError()
	{
		String lError = driver.findElement(By.id(null)).getText();
		return lError;
	}

}

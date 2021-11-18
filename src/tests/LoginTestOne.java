package tests;

import org.testng.annotations.Test;

import data.DataFileOne;
import pages.LoginPageOne;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTestOne {
	
	LoginPageOne lp = new LoginPageOne();
	DataFileOne df = new DataFileOne();
	
  //open webbrowser
  @BeforeMethod
  public void beforeMethod() 
  {
	  lp.openBrowser();
	  lp.openLoginPage();
  }

  @AfterMethod
  public void afterMethod() 
  {
	  lp.closeBrowser();
  }
  
  @Test(priority = 1)
  public void testone_loginwithwrongemailpassword() 
  {
	lp.login(df.wrongEmail, df.wrongPassword);
	Assert.assertEquals(lp.globalError(), df.globalErr);
  }
  
  @Test(priority = 2)
  public void testtwo_loginwithemptyemail()
  {
	  lp.login("", df.wrongPassword);
	  Assert.assertEquals(lp.localError(), df.emptyEmailErr);
  }
  
  @Test(priority = 3)
  public void testthree_loginwithemptypassword()
  {
	  lp.login(df.invalidEmail, "");
	  Assert.assertEquals(lp.localError(), df.emptyPasswordErr);
  }
  
  @Test(priority = 4)
  public void testfour_loginwithinvalidemail()
  {
	  lp.login(df.invalidEmail, df.wrongPassword);
	  Assert.assertEquals(lp.localError(), df.emailWithSpeCharErr);
  }

}

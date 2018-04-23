package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class testGIT {
	
	 public WebDriver driver;
	 
	 @BeforeClass
	  public void beforeClass() {
	   
	   System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		 
	   //driver = new FirefoxDriver();
		 driver = new ChromeDriver();
		 //Test Pushed New New NEw
	   
	  }
	  @Test
	  public void openMyBlog() {
	 driver.get("https://www.softwaretestingmaterial.com/");
	  }
	  
	  
	 
	  @AfterClass
	  public void afterClass() {
	   driver.quit();
	  }

}

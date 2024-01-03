package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Testng_8_Groups {
	WebDriver driver;
 
  
  @BeforeTest(groups="social")
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	   }
  @Test(groups="social")
  public void google() {
	  driver.get("https://www.google.com");
  }
  @Test(groups="social")
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  @Test(groups="social")
  public void twitter() {
	  driver.get("https://www.twitter.com");
  }
  @Test(groups="Tech")
  public void selenium() {
	  driver.get("https://www.selenium.dev");
  }
  
  @Test(groups="Food")
  public void zomato() {
	  driver.get("https://www.selenium.dev");
  }
  
  @Test(groups="Food")
  public void swiggy() {
	  driver.get("https://www.selenium.dev");
  }
  @Test(groups="Communication")
  public void gmail() {
	  driver.get("https://www.gmail.com");
  }
  @Test(groups="Tech")
  public void redmine() {
	  driver.get("https://www.redmine.org");
  }
  
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}

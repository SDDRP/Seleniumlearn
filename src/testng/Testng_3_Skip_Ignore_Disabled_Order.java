package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Testng_3_Skip_Ignore_Disabled_Order {
	WebDriver driver;
 
  
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	   }
  @Test(priority=2,enabled=false)
  public void google() {
	  driver.get("https://www.google.com");
  }
  @Test(priority=4)
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  @Test(priority=3,enabled=false)
  public void twitter() {
	  driver.get("https://www.twitter.com");
  }
  @Test(priority=0,enabled=false)
  public void selenium() {
	  driver.get("https://www.selenium.dev");
  }
  @Test(priority=1,enabled=true)
  public void gmail() {
	  driver.get("https://www.gmail.com");
  }
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}

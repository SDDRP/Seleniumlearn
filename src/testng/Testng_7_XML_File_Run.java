package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Testng_7_XML_File_Run {
	WebDriver driver;
 
  
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	   }
  @Test
  public void google() {
	  driver.get("https://www.google.com");
  }
  @Test
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  @Test
  public void twitter() {
	  driver.get("https://www.twitter.com");
  }
  @Test
  public void selenium() {
	  driver.get("https://www.selenium.dev");
  }
  @Test
  public void gmail() {
	  driver.get("https://www.gmail.com");
  }
  @Test
  public void redmine() {
	  driver.get("https://www.redmine.org");
  }
  
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}

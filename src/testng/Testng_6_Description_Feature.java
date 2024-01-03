package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Testng_6_Description_Feature {
	WebDriver driver;
	
  @Test(description="top menu module")
  public void RM2() {
	  driver.findElement(By.xpath("//a[@class='projects']")).click();
	  	  
  }
  
  @Test(description="login module")
  public void RM5() {
	  driver.findElement(By.xpath("//div[@id='top-menu']")).click();
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Ayan");
	 
  } 
  
  @Test(description="register module")
  public void RM4() {
	  driver.findElement(By.xpath("//a[@class='register']")).click();
	  driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("Ayan");
		 
  }
  
  @Test(description="search module")
  public void RM6() {
	  driver.findElement(By.xpath("//input[@id='q']")).sendKeys("Java");
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.redmine.org");
  }

  @AfterTest
  public void afterTest() {
  }

}

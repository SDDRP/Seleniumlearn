package verifytabtitleurlapptext;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class VerifyTabTitleURLWebText {
	WebDriver driver;
	
  @Test
  public void verifytabtitle() {
	  driver.get("https://www.google.com/");
	  
	  String exptabtext ="Google";
	  System.out.println("Exp Tab Title is="+exptabtext);
	  
	  String acttabtext = driver.getTitle(); 
	  System.out.println("Exp Tab Title is="+acttabtext);
	  
	  Assert.assertEquals(acttabtext,exptabtext );
	  
	  }
  
  @Test
  public void verifyurl() {
	  driver.get("https://www.google.com");
	  
	  String expurl = "https://www.google.com/";
	  
	  String acturl = driver.getCurrentUrl();
	  
	  Assert.assertEquals(acturl, expurl);
	  
	  }
  
  @Test
  public void verifytext() {
	  driver.get("https://www.google.com");
	  
	  String expgtext = "Gmail";
	  
	  String actgtext = driver.findElement(By.xpath("//a[@aria-label='Gmail (opens a new tab)']")).getText();
	  
	  Assert.assertEquals(actgtext, expgtext);
	  
	  }
  
  
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}

package isdisplayedisenabledisselected;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class VerifyImagesTextTextBoxesCheckBoxes {
	WebDriver driver;
	
	
  @Test
  public void verifyimagestext() throws InterruptedException {
	 driver.get("https://redmine.org/");
	 Thread.sleep(3000);
	 
	 Boolean sign=driver.findElement(By.xpath("//a[@class='login']")).isDisplayed();
	 
	 if(sign==true)
	 {
		 System.out.println("Sign in link is availablein redmine application");
		driver.findElement(By.xpath("//a[@class='login']")).click();
	 }
	 else
	 {
		 System.out.println("Sign in link is availablein redmine application");
	 }
		  
  }
  
  @Test
  public void verifytextfieldboxes() throws InterruptedException {
	 driver.get("https://redmine.org/");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//a[@class='login']")).click();
	 
	 Boolean log=driver.findElement(By.xpath("//input[@id='username']")).isEnabled();
	 
	 if(log==true)
	 {
		 System.out.println("Login text box is enabled to enter username");
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("AyubKhan");
	 }
	 else
	 {
		 System.out.println("Login text box is not enabled to enter username"); 
	 }
	 		  
  }
  
  @Test
  public void verifycheckboxes() throws InterruptedException {
	 driver.get("https://redmine.org/");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//a[@class='login']")).click();
	 driver.findElement(By.xpath("//input[@id='autologin']")).click();
	 
	 Boolean checkbox=driver.findElement(By.xpath("//input[@id='autologin']")).isSelected();
	 if(checkbox==true)
	 {
		 System.out.println("Stay logged check box is selected");
	 }
	 else
	 {
		 System.out.println("Stay logged check box is  not selected");
	 }	
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}

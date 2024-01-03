package locators;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LocatorsConepts8 {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
     @Disabled
	@Test
	void test() throws InterruptedException {
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(3000);
		driver.findElement(By.id("edit-name")).sendKeys("shaheena");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("shahee@1823");
		Thread.sleep(3000);
		//driver.findElement(By.className("form-submit")).click();
		//driver.findElement(By.cssSelector("input.form-submit")).click();
		driver.findElement(By.cssSelector(".form-submit")).click();
			
	}
     @Disabled
     @Test
 	void testcase2() throws InterruptedException {
 		driver.get("http://hyderabadreport.com");
 		Thread.sleep(3000);
 		driver.findElement(By.linkText("photos")).click();
 		Thread.sleep(3000);
 		driver.findElement(By.linkText("Telangana")).click();
 		Thread.sleep(3000);
 		driver.findElement(By.partialLinkText("Greater News")).click();
 		
 		
 	}
     @Disabled
     @Test
  	void totalnumoflinks() throws InterruptedException {
  		driver.get("http://www.ndtv.com");
  		Thread.sleep(3000);
  		
  		List<WebElement>tnlinks=driver.findElements(By.tagName("a"));
  		System.out.println(tnlinks.size());
  		
  	}
     @Disabled
     @Test
  	void xpath() throws InterruptedException {
    	 Thread.sleep(3000);
    	 driver.findElement(By.xpath("/html/body/div/div[1]/span[3]/ul/li[1]/a")).click();
    	 Thread.sleep(3000);
    	 driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("tirupati");
    	 Thread.sleep(3000);
    	 driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[3]/div[2]/div[1]/form/input[4]")).sendKeys("hello@123");
    	 Thread.sleep(3000);
    	 driver.findElement(By.xpath("//*[@id=\"autologin\"]")).click();	 
  		
  	
  		
  		
  	}
     
     @Test
   	void xpathrelative() throws InterruptedException {
     	 Thread.sleep(3000);
     	
   	
   		
   		
   	}
    
   }


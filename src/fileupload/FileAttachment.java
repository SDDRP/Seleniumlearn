package fileupload;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FileAttachment {
	WebDriver driver;
	
	
  @Test
  public void fileupload() throws Exception {
	  driver.get("http://baalabharathi.com/upload-story/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"field-SUtF8PwfCXGXx46\"]")).sendKeys("SharoonBee");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"field-8lqEle2zeOhMu0a\"]")).sendKeys("D:\\Lib\\selenium-java-4.15.0\\selenium-api-4.15.0.jar");
	  
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}

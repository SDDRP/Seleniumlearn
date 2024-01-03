package alertpopuphandles;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AlertWindowHandles {
	WebDriver driver;
	
	
  @Test
  public void alertokbutton () throws Exception {
	  driver.get("http://seleniumlearn.com/confirmation-dialog-box");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept();
	  
  }
  
  @Test
  public void alertwindowsendokorcancelbutton () throws Exception {
	  driver.get("http://seleniumlearn.com/prompt-dialog-box");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(3000);
	  Alert alt=driver.switchTo().alert();
	  alt.sendKeys("Ayan");
	  alt.accept();
	 
	  
	  
	  
	 /* driver.switchTo().alert().sendKeys("shaheena");
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept();*/
	  
	  
  }
  
  
  @Test
  public void alertcancelbutton () throws Exception {
	  driver.get("http://seleniumlearn.com/confirmation-dialog-box");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(3000);
	  driver.switchTo().alert().dismiss();
	  
	  
  }
  
  
  
  
  
  
  
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}

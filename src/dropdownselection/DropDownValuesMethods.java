package dropdownselection;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class DropDownValuesMethods {
	WebDriver driver;
	
  @Test
  public void dropdownoptions() throws InterruptedException {
	  driver.get("https://redmine.org/account/register");
	  Thread.sleep(3000);
	//  new Select(driver.findElement(By.xpath("//select[@id='user_language']"))).selectByVisibleText("Korean (한국어)");
	  //   new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]"))).selectByValue("de");
	//  new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]"))).selectByIndex(12);
	  Select c=new Select (driver.findElement(By.xpath("//select[@id='user_language']")));
	  c.selectByValue("de");
	  
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}

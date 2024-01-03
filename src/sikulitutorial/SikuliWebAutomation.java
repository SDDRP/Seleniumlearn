package sikulitutorial;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class SikuliWebAutomation {
	WebDriver driver;
	Screen s = new Screen();
	
  @Test
  public void webautomation() throws Exception {
	  driver.get("http://seleniumlearn.com/");
	  Thread.sleep(3000);
	  s.click("D:\\Lib\\C:\\Users\\user\\OneDrive\\Pictures\\Screenshots\\Simage.png");
	  Thread.sleep(3000);
	  s.type("C:\\Users\\user\\OneDrive\\Pictures\\Screenshots\\Search.png, Java");
	  
	  
	  
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}

package enteroptions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class GoogleSearch {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver=new ChromeDriver();
	}
    @Disabled
	@Test
	void test() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Login");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Login"+Keys.ENTER);
		Thread.sleep(2000);
     //	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.name("q")).submit();
		
	}
	
	@Test
	void testclear() throws InterruptedException {
		driver.get("http://hyderabadreport.com/user");
		driver.findElement(By.name("name")).sendKeys("Divya");
		driver.findElement(By.name("pass")).sendKeys("hello@123");
		driver.findElement(By.id("edit-submit")).click();
		driver.findElement(By.id("edit-name")).clear();
		driver.findElement(By.name("name")).sendKeys("Shaheena");
		driver.findElement(By.name("pass")).sendKeys("shahee@123");
		
		
		
	}

}

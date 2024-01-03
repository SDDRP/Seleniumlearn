package junittutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Junitdemotwo {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
    
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}
    @Disabled //This Annotation only for junit5
	@Test
	void test1() {
		driver.get("https://www.google.com");
		
	}
	@Test
	void test2() {
		driver.get("https://www.facebook.com");
		
	}
	@Test
	void test3() {
		driver.get("https://www.twitter.com");
		
	}
	@Disabled
	@Test
	void test4() {
		driver.get("https://www.selenium.dev");
		
	}
	@Ignore //this annotation only for JUnit 3and 4
	@Test
	void test5() {
		driver.get("https://www.redmine.org");
		
	}

	
}

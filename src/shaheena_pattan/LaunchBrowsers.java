package shaheena_pattan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowsers {
	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException { 
		
		driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		//driver.manage().window().minimize();
		
		//driver=new EdgeDriver();
		//driver.manage().window().maximize();
		
		//driver=new FirefoxDriver();
		
		
		
		
		
		
		
	

	}

}

package sikulitutorial;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class SikuliDesktopAutomation {
	Screen s = new Screen();
	
  @Test
  public void desktop() throws FindFailed, Exception {
	  s.click("D:\\Lib\\Sikuli\\windows.PNG");
	  Thread.sleep(3000);
	  s.click("D:\\Lib\\Sikuli\\WiFi.PNG");
	  
	  
  }
}

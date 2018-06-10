package week4day1;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class WdSeMethodsTest extends SeMethods {
	
	@Test
	
	public void Test() {
		
		startApp("Chrome", "http://leaftaps.com/opentaps/control/main");
		
		locateElement("linkText", "Docs Wiki");
		
		
//		closeAllBrowsers();
		
		
	}
	
	

}

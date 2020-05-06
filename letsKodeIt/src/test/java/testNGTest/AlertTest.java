package testNGTest;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import functions.HomePageFunction;
import mainFunction.Util;
import xpath.PracticePageXPath;

public class AlertTest extends Util{
	
	HomePageFunction hpf = new HomePageFunction();
	PracticePageXPath ppx = new PracticePageXPath();
	
	@Test
	public void testAlert() {
		openBrowser("chrome");
		hpf.clickPracticeButton();
		sleep(2000);
		
		sendText(ppx.alertText, "Lhakpa");
		clickElement(ppx.alertConfirmButton);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
	}

}

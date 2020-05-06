package testNGTest;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import functions.CoursesPageFunction;
import functions.HomePageFunction;
import mainFunction.Util;
import xpath.CoursesPageXPath;
import xpath.PracticePageXPath;

public class MouseHoverTest extends Util{
	
	HomePageFunction hpf = new HomePageFunction();
	PracticePageXPath ppx = new PracticePageXPath();
	
	@Test
	public void testMouseHover() {
		openBrowser("chrome");
		hpf.clickPracticeButton();
		sleep(2000);
		
		Actions ac = new Actions(driver);	
		ac.moveToElement(getWebElement(ppx.mouseHoverButton)).perform();
		sleep(1000);
		clickElement(ppx.mouseHoverTopBottom);

	}

}

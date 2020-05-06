package testNGTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import functions.HomePageFunction;
import mainFunction.Util;
import xpath.CoursesPageXPath;
import xpath.PracticePageXPath;

public class TestIFrames extends Util {

	HomePageFunction hpf = new HomePageFunction();
	PracticePageXPath ppx = new PracticePageXPath();
	CoursesPageXPath cpx = new CoursesPageXPath();

	@Test
	public void testFrames() {
		openBrowser("chrome");
		hpf.clickPracticeButton();
		
		driver.switchTo().frame(getWebElement(ppx.iFrame));
		
		sendText(cpx.searchCourseBox, "Ms.Lama-Chen");
		sleep(2000);
		clickElement(cpx.clickSearchBox);
		
		sleep(3000);

	}

}

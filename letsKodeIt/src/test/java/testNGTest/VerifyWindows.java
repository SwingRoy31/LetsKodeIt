package testNGTest;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import functions.CoursesPageFunction;
import functions.HomePageFunction;
import functions.PracticePageFunction;
import mainFunction.Util;

public class VerifyWindows extends Util {

	HomePageFunction hpf = new HomePageFunction();
	PracticePageFunction ppf = new PracticePageFunction();
	CoursesPageFunction cpx = new CoursesPageFunction();


	@Test
	public void testWindows() {

		openBrowser("chrome");
		hpf.clickPracticeButton();
		String windowHandle1 = driver.getWindowHandle();

		ppf.clickNewWindow();	
		Set<String> windowHandles = driver.getWindowHandles(); // grab all window ids
		
		
		Iterator<String> it = windowHandles.iterator();
		String w1 = it.next();
		String w2 = it.next();
		
		System.out.println(w1);
		System.out.println(w2);
		
		
		for(String i:windowHandles) {	
			
			if(!i.equals(windowHandle1)) {
				driver.switchTo().window(i);
			}
			System.out.println(i);
		}
		
		cpx.clickLogin();
		
	}

}

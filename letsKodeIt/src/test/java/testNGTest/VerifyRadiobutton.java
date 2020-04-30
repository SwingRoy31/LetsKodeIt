package testNGTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import functions.HomePageFunction;
import functions.PracticePageFunction;
import mainFunction.Util;
import xpath.HomePage;
import xpath.PracticePage;

public class VerifyRadiobutton extends Util {

	PracticePage pp = new PracticePage();
	HomePage hp = new HomePage();
	HomePageFunction hpf = new HomePageFunction();
	PracticePageFunction ppf = new PracticePageFunction();
	
	//	public VerifyRadiobutton(WebDriver driver) {
	//		super(driver);
	//	}

	//@Test
	public void verifyBmwRadioButton() {
		openBrowser("chrome");
		hpf.clickPracticeButton();
		ppf.clickBmwRadioButton();
		ppf.clickColorButton();
		ppf.clickCheckButton();
		assertEquals(verifyText("bmw",pp.bmwRadioText), true);
		System.out.println(ppf.getBmwRadioText());
	}
	
	@Test
	public void verifyAllRadioButtons() {
		openBrowser("chrome");
		hpf.clickPracticeButton();
		sleep(2000);
		ppf.clickBmwRadioButton();
		sleep(2000);
		ppf.clickBenzRadioButton();
		sleep(2000);
		ppf.clickHondaRadioButton();
		
		
	}

}


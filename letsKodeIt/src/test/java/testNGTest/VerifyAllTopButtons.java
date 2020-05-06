package testNGTest;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import functions.HomePageFunction;
import functions.PracticePageFunction;
import mainFunction.Util;
import xpath.HomePageXPath;
import xpath.PracticePageXPath;

public class VerifyAllTopButtons extends Util {

	PracticePageXPath pp = new PracticePageXPath();
	HomePageXPath hp = new HomePageXPath();
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

	//@Test
	public void verifyAllRadioButtons() {
		openBrowser("chrome");
		hpf.clickPracticeButton();
		sleep(2000);
		List <WebElement> allRadioButton = driver.findElements(By.xpath(pp.allRadioButtons));
		for(int i = 0; i<allRadioButton.size(); i++) {
			allRadioButton.get(i).click();
		}

		//		ppf.clickBmwRadioButton();
		//		sleep(2000);
		//		ppf.clickBenzRadioButton();
		//		sleep(2000);
		//		ppf.clickHondaRadioButton();
	}

	@Test
	public void verifyRadioAndCheckBoxButton() {
		openBrowser("chrome");
		hpf.clickPracticeButton();
		List <WebElement> radioAndCheckBoxButton = driver.findElements(By.xpath(pp.radioAndCheckBoxButton));
		for(int i = 0; i<radioAndCheckBoxButton.size(); i++) {
			boolean isSelected = radioAndCheckBoxButton.get(i).isSelected();
			if (isSelected == false) {
				radioAndCheckBoxButton.get(i).click();
			}
		}
	}

}


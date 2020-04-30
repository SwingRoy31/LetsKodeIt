package mainFunction;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Util extends MainDriver {

//	public Util(WebDriver driver) {
//		super(driver);
//	}

	public void takeScreenshot(String pictureName) {

		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screen, new File ("C:\\Users\\verc8\\Documents\\ScreenShots"+pictureName+".jpg"));

		}
		catch (Exception R){

			System.out.println("Error Screenshot not taken");

		}

	}
	public void sleep(int mls) {

		try {
			Thread.sleep(mls);
		} catch (InterruptedException e) {
			System.out.println("Error");	}
	}

	public void clickElement(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}

	public void sendText(String xpath1, String value) {
		driver.findElement(By.xpath(xpath1)).sendKeys(value);
	}
	
	public String getText(String xpath) {
		return driver.findElement(By.xpath(xpath)).getText();
	}

	public boolean verifyText(String expectedText, String xpath) {
		String actualText = driver.findElement(By.xpath(xpath)).getText();
		if (actualText.equalsIgnoreCase(expectedText)) {
			System.out.println("Test passed "+actualText + "matches "+ expectedText);
			return true;
		}else {
			System.out.println("Test failed "+actualText + "doesn't match "+ expectedText);
			return false;
		}
	}

		public boolean notVerifiedText(String expectedText, String xpath) {
			String actualText = driver.findElement(By.xpath(xpath)).getText();
			if (actualText.equalsIgnoreCase(expectedText)) {
				System.out.println("Test failed "+actualText + "doesn't match "+ expectedText);
				return false;
			}else {
				System.out.println("Test passed "+actualText + " matches "+ expectedText);
				return true;
			}
	}
}

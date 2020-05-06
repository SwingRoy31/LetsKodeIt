package mainFunction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainDriver {
	
//	public MainDriver(WebDriver driver) {
//		super();
//		this.driver = driver;
//	}

	public static WebDriver driver;

	public void openBrowser(String browser) {

		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\verc8\\Downloads\\WebDrivers\\chromedriver81\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://google.com");
			driver.get("https://learn.letskodeit.com/");
			driver.manage().window().maximize();
			
		}
		else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\verc8\\Downloads\\WebDrivers\\geckodriver.exe");
			driver= new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https;//google.com");
			driver.manage().window().maximize();
		}
		else {
			System.out.println("System Error");
		}
	}

	

	
}

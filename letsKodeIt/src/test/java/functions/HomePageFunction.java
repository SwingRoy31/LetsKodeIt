package functions;

import mainFunction.Util;
import xpath.HomePageXPath;

public class HomePageFunction extends Util {
	
	HomePageXPath hp = new HomePageXPath();
	

	public void clickPracticeButton() {
		clickElement(hp.practice);
	}
}

package functions;

import mainFunction.Util;
import xpath.HomePage;

public class HomePageFunction extends Util {
	
	HomePage hp = new HomePage();
	

	public void clickPracticeButton() {
		clickElement(hp.practice);
	}
}

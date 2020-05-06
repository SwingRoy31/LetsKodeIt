package functions;

import mainFunction.Util;
import xpath.CoursesPageXPath;

public class CoursesPageFunction extends Util{
	
	CoursesPageXPath cpx = new CoursesPageXPath();
	
	public void clickLogin() {
		clickElement(cpx.loginButton);
	}

}

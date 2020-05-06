package functions;

import mainFunction.Util;
import xpath.PracticePageXPath;

public class PracticePageFunction extends Util {
	
	PracticePageXPath pp = new PracticePageXPath();

	public void clickBmwRadioButton() {
		clickElement(pp.bmwRadioButton);
	}
	public void clickBenzRadioButton() {
		clickElement(pp.benzRadioButton);
	}
	public void clickHondaRadioButton() {
		clickElement(pp.hondaRadioButton);
	}
	
	
	
	public String getBmwRadioText() {
		return getText(pp.bmwRadioText);
	}

	public void getBenzDropDown() {
		clickElement (pp.benzDropdown);
	}

	public void clickColorButton() {
		clickElement(pp.peachColor);
	}

	public void clickCheckButton() {
		clickElement(pp.hondaCheckBox);
	}
	
	
	
	public void clickNewWindow() {
		clickElement(pp.openWindow);
	}
	
	
}

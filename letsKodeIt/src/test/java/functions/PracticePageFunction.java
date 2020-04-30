package functions;

import mainFunction.Util;
import xpath.PracticePage;

public class PracticePageFunction extends Util {
	
	PracticePage pp = new PracticePage();

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
}

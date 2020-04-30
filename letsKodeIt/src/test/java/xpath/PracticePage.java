package xpath;

public class PracticePage {

	public String bmwRadioButton = "//input[@id='bmwradio']";
	public String benzRadioButton ="//input[@id='benzradio']";
	public String hondaRadioButton ="//input[@id='hondaradio']";
	
	public String bmwRadioText =  "//div[@id='radio-btn-example']//label[1]";
	public String benzRadioText = "//div[@id='radio-btn-example']//label[2]";
	public String hondaRadioText = "//div[@id='radio-btn-example']//label[3]";

	
	public String bmwDropdown = "//option[contains(text(),'BMW')";
	public String benzDropdown = "//option[contains(text(),'Benz')";
	public String hondaDropdown = "//option[contains(text(),'Honda')";
	
	public String appleColor ="//option[contains(text(),'Apple')]";
	public String orangeColor ="//option[contains(text(),'Orange')]";
	public String peachColor ="//option[contains(text(),'Peach')]";
	
	public String bmwCheckBox ="//input[@id='bmwcheck']";
	public String benzCheckBox ="//input[@id='benzcheck']";
	public String hondaCheckBox ="//input[@id='hondacheck']";
}

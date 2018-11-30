package pl.lait.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pl.lait.selenium1.Init;

public class ReservationPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div/table/tbody"
			+ "/tr/td[2]/table/tbody/tr[4]/td"
			+ "/table/tbody/tr/td[2]/table/tbody"
			+ "/tr[5]/td/form/table/tbody/tr[2]"
			+ "/td[2]/b/font/input[2]")
	WebElement oneWayRadio;
	
	@FindBy(xpath = "/html/body/div/table/tbody"
			+ "/tr/td[2]/table/tbody/tr[4]/td"
			+ "/table/tbody/tr/td[2]/table/tbody"
			+ "/tr[5]/td/form/table/tbody/tr[2]"
			+ "/td[2]/b/font/input[1]")
	WebElement roundTripRadio;
	
	@FindBy(name = "passCount")
	WebElement passCount;
	
	@FindBy(name = "fromPort")
	WebElement fromPort;
	@FindBy(name = "fromMonth")
	WebElement fromMonth;
	@FindBy(name = "fromDay")
	WebElement fromDay;
	
	@FindBy(name = "toPort")
	WebElement toPort;
	@FindBy(name = "toMonth")
	WebElement toMonth;
	@FindBy(name = "toDay")
	WebElement toDay;
	
	@FindBy(xpath = "/html/body/div/table/tbody/"
			+ "tr/td[2]/table/tbody/tr[4]/td/table"
			+ "/tbody/tr/td[2]/table/tbody/tr[5]/td/"
			+ "form/table/tbody/tr[9]/td[2]/font/font/input[1]")
	WebElement businessClass;
	
	@FindBy(name = "airline")
	WebElement airline;
	
	@FindBy(name = "findFlights")
	WebElement continueBtn;
	
	public ReservationPage() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void oneWayRadioClick() {
		oneWayRadio.click();
	}
	public void roundTripRadioClick() {
		roundTripRadio.click();
	}
	
	public void fromPort(String portValue) {
		Select p = new Select(fromPort);
		p.selectByValue(portValue);
	}
	
	public void passengersCount(String count) {
		Select passCountSelect = new Select(passCount);
		passCountSelect.selectByValue(count);
	}
	
	public void on(String month, String day) {
		Select m = new Select(fromMonth);
		m.selectByValue(month);
		Select d = new Select(fromDay);
		d.selectByValue(day);
		
	}
	
	public void to(String month, String day) {
		Select m = new Select(toMonth);
		m.selectByValue(month);
		Select d = new Select(toDay);
		d.selectByValue(day);
	}
	
	public void toPort(String portValue) {
		Select p = new Select(toPort);
		p.selectByValue(portValue);
	}
	
	
	public void businessClass() {
		businessClass.click();
	}
	
	/**
	 * <select name="airline"><br>
	 *No Preference<br>
	 *Blue Skies Airlines<br>
	 *Unified Airlines<br>
	 *Pangea Airlines<br>
	 * @param line
	 */
	public void airline(String line) {
		Select l = new Select(airline);
		l.selectByVisibleText(line);
	}
	
	public void continueBtnClick() {
		continueBtn.click();
	}

}

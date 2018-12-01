package pl.lait.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pl.lait.selenium1.Init;

public class Reservation2Page {
	
	WebDriver driver;
	
	// ---- 2 poziom rezerwacji START ----
	@FindBy(xpath = "/html/body/div/table/"
			+ "tbody/tr/td[2]/table/tbody/"
			+ "tr[4]/td/table/tbody/tr/td[2]"
			+ "/table/tbody/tr[5]/td/form/table[1]"
			+ "/tbody/tr[5]/td[1]/input")
	WebElement radio2;
	
	@FindBy(xpath = "/html/body/div/table/"
			+ "tbody/tr/td[2]/table/tbody/"
			+ "tr[4]/td/table/tbody/tr/td[2]/"
			+ "table/tbody/tr[5]/td/form/table[2]"
			+ "/tbody/tr[5]/td[1]/input")
	WebElement radio6;
	
	@FindBy(name = "reserveFlights")
	WebElement continueBtn;
	// ---- 2 poziom rezerwacji END ----
	// ---- 3 poziom rezerwacji START ----
	@FindBy(name = "passFirst0")
	WebElement passFirst0;
	@FindBy(name = "passLast0")
	WebElement passLast0;
	@FindBy(name = "pass.0.meal")
	WebElement pass0meal;
	@FindBy(name = "creditCard")
	WebElement creditCard;
	@FindBy(name = "creditnumber")
	WebElement creditnumber;
	@FindBy(name = "buyFlights")
	WebElement secureP;
	
	public Reservation2Page() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
	// ---- 2 poziom rezerwacji START ----
	public void radio2Click() {
		radio2.click();
	}
	public void radio6Click() {
		radio6.click();
	}
	public void continueBtnClick() {
		continueBtn.click();
	}
	// ---- 2 poziom rezerwacji END ----
	// ---- 3 poziom rezerwacji START ----
	public void pass0(String firstName, String lastName, String meal) {
		passFirst0.sendKeys(firstName);
		
		passLast0.sendKeys(lastName);
		
		Select m = new Select(pass0meal);
		m.selectByVisibleText(meal);
	}
	public void creditCard(String name) {
		Select c = new Select(creditCard);
		c.selectByVisibleText(name);
	}
	public void creditNumber(String number) {
		creditnumber.sendKeys(number);
	}
	public void securePurchaseClick() {
		secureP.click();
	}
	
}

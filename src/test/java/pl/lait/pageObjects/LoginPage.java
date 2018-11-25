package pl.lait.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.lait.selenium1.Init;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(linkText = "SIGN-ON")
	WebElement signOnLink;
	
	@FindBy(name = "userName")
	WebElement loginInput;
	
	@FindBy(name = "password")
	WebElement passwdInput;
	
	@FindBy(name = "login")
	WebElement loginBtn;
	
	
	
	public LoginPage() {
		System.out.println("wewnatrz konstruktora w LoginPage");
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void goToLoginPage() {
		System.out.println("wewnatrz goToLoginPage");
		signOnLink.click();
	}
	
	/**
	 * Loguje się jako user z danymi 
	 * przekazanymi w parametrach
	 * @param login
	 * @param pass
	 */
	public void loginAs(String login, String pass) {
		System.out.println("wewnatrz loginAs - nadal klikamy po stronie...");
		loginInput.sendKeys(login);
		passwdInput.sendKeys(pass);
		loginBtn.click();
	}
	
}

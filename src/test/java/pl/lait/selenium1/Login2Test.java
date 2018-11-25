package pl.lait.selenium1;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import pl.lait.pageObjects.LoginPage;
import pl.lait.pageObjects.ReservationPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Login2Test {

	WebDriver driver = null;

	@Before
	public void openPage() {
		System.out.println("wewnatrz openPage (before)");
		driver = Init.getDriver();
		System.out.println("wewnatrz openPage (koniec before)");
	}
	
	@Test
	public void login() {
		System.out.println("wewnatrz testu - login");
		LoginPage loginPage = new LoginPage();
		loginPage.goToLoginPage();
		loginPage.loginAs("adamdz", "qwe123");
		System.out.println("koniec testu login");
	}
	
	@Test
	public void reservation() {
		
		
	}
	
	@After
	public void close() {
		System.out.println("wewnatrz klasy Login2Test - close");
		Init.endTest();
		System.out.println("wewnatrz klasy login2test - koniec close");
	}

}

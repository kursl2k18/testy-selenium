package pl.lait.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
/**
 * Hello world!
 *
 */
public class App 
{
	
	static WebDriver driver;

    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "/Users/adam/Documents/LAIT/chromedriver");
    	DesiredCapabilities cap = DesiredCapabilities.chrome();
    	driver = new ChromeDriver();
    	driver.get("http://newtours.demoaut.com");
    	String pageTitle = driver.getTitle();
    	System.out.println(pageTitle);
    	driver.findElement(By.linkText("SIGN-ON")).click();
    	driver.findElement(By.name("userName")).sendKeys("adamdz");
    	driver.findElement(By.name("password")).sendKeys("qwe123");
    	driver.findElement(By.name("login")).click();
    }
    
    
    
    
}




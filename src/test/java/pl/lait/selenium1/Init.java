package pl.lait.selenium1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Init {
	
	static WebDriver driver;
	
	public static WebDriver getDriver() {
		System.out.println("wewnatrz getDriver");
		System.setProperty("webdriver.chrome.driver", "/Users/adam/Documents/LAIT/chromedriver");
    	DesiredCapabilities cap = DesiredCapabilities.chrome();
    	System.out.println("### decyduję czy wykonać new ChromeDriver");
    	URL url = null;
		try {
			url = new URL("http://192.168.0.119:4444/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	if(driver==null) {
    		System.out.println("### TAK ###");
    		//driver = new ChromeDriver();
    		driver = new RemoteWebDriver(url, cap);
        	System.out.println("get http...");
        	driver.get("http://newtours.demoaut.com");
        	return driver;
    	} else {
    		System.out.println("### NIE ###");
    		return driver;
    	}
    	//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    	//sleep(2);
	}
	
	public static void endTest() {
		System.out.println("wewnatrz endTest");
		driver.quit();
		driver = null;
		System.out.println("po endTest");
	}
	
	/**
	 * Metoda wstrzymuje wykonywanie programu na X sekund
	 * @param seconds
	 */
	public static void sleep(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}

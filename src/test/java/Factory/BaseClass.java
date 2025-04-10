package Factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	static WebDriver Driver;
	
	public static WebDriver LocalBrowser() {
		Driver = new ChromeDriver();
		Driver.manage().deleteAllCookies();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		return Driver; //Driver is used in Hooks of Step Definition
	}
	
	public static WebDriver getDriver() {
		return Driver; // Driver is used for new Objects of Step Definition
		}
}

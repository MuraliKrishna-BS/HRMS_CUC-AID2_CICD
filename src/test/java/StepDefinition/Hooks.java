package StepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Factory.BaseClass;
import PageObject.HomePage;
import io.cucumber.java.*;

public class Hooks {
	
	static WebDriver Driver;
	
	
	@Before
	public void Setup() {
		Driver=BaseClass.LocalBrowser();
		Driver.get("https://hrms.arms.aero/adrenalin/login.aspx");
		
	}
	
	//@AfterStep
	@After(order =1)
	public void addscreenshot(Scenario scenario) {
		
		if (scenario.isFailed()) {
			
			TakesScreenshot  ts = (TakesScreenshot) Driver;
		byte[]	screenshot=ts.getScreenshotAs(OutputType.BYTES);
		//scenario.attach(screenshot, "image/png", scenario.getName());
		scenario.attach(screenshot, "image/png", "shot");
		}
		
	}
	@After(order =0)
	public static void TearDown() {
		Driver.quit();
	}

}

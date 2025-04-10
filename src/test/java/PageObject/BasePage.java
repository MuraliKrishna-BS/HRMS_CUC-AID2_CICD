package PageObject;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
WebDriver Driver;
	
	public BasePage(WebDriver Driver) { //this Constructor is used for StepDefinition
	this.Driver=Driver;	
	PageFactory.initElements(Driver, this);
	}

	public static String CurrentMonth() {
		
		 SimpleDateFormat M = new SimpleDateFormat("MMM"); 
		 String strMonth= M. format(new Date()); 
		 return strMonth;
	}
}

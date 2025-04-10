package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	

	public HomePage(WebDriver Driver) {
		super(Driver);
			}

	// Elements
	@FindBy(xpath="//input[@id='txtID']") WebElement txtUserID;
	@FindBy(xpath="//input[@id='txtPwd']") WebElement txtPassword;
	@FindBy(xpath="//label[@id='lblLogin']") WebElement btnLogin;
	
	// Actions
	public void EnterUserName(String Name) {
		
		txtUserID.sendKeys(Name);
					}
	public void EnterPassword(String Password) {
		txtPassword.sendKeys(Password);
	}
	
	public void ClickLogin() {
		btnLogin.click();
	}
}

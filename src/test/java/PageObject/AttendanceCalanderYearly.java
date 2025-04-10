package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.opentelemetry.internal.shaded.jctools.queues.MessagePassingQueue.WaitStrategy;

public  class AttendanceCalanderYearly extends BasePage{
	 
	public AttendanceCalanderYearly(WebDriver Driver) {
		super(Driver);
			}
	
	//Elements
	@FindBy(xpath="//iframe[@id='IFRRSLIDING0']") WebElement Frame1;
	@FindBy(xpath="//iframe[@id='iBox']") WebElement Frame2;
	String Month ="//a[normalize-space()='%Replace%']";// For Dynamic Xpath
	@FindBy(xpath="//input[@id='btnRefresh']") WebElement btnRefresh;
	
	//Actions
	public void SwitchFrames() {
		//Driver.switchTo().frame(Frame1);
		//Driver.switchTo().frame(Frame2);
	}
	public void ClickCurremtMonth() {
		Driver.switchTo().frame(Frame1);
		Driver.switchTo().frame(Frame2);
		String DynXpath= Month.replace("%Replace%", CurrentMonth());
		Driver.findElement(By.xpath(DynXpath)).click();
		Driver.switchTo().defaultContent();
		}
	public void ClickRefresh() {
		Driver.switchTo().frame(Frame1);
		Driver.switchTo().frame(Frame2);
		btnRefresh.click();
		Driver.switchTo().defaultContent();
	}
	
	public void SwitchOutFrame() {
		//Driver.switchTo().defaultContent();
	}
}

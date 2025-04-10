package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelfServicesApps extends BasePage {

	public SelfServicesApps(WebDriver Driver) {
		super(Driver);
			}
	
	//Elements
	@FindBy(xpath="//span[normalize-space()='Workflow']") WebElement PageConfirm;
	@FindBy(xpath="//span[@title='Forms pending for your approval']") WebElement lnkPendingApproval;
	@FindBy(xpath="//iframe[@id='iFrameMain']") WebElement Frame1;
	@FindBy(xpath="//iframe[@class='cboxIframe']") WebElement Frame2;
	@FindBy(xpath="//iframe[@id='iframeNewSummary']") WebElement Frame3;
	@FindBy(xpath="//select[@id='ddlFormName']/child::option[@value !=''][1]") WebElement DropDownSelFirstRecord;
	@FindBy(xpath="//tr[@class='rgRow']//input[@type='checkbox']") WebElement SelFirstChkbox;
	@FindBy(xpath="//input[@class='formfield']") WebElement txtComments;
	
	//Action
	public boolean PageCofirmation() {
		boolean Status= PageConfirm.isDisplayed();
		return Status;
		
	}
		public void ClickPendingforApproval() {
		lnkPendingApproval.click();
		}
		
		public void DropDownSelectforApproval() {
			Driver.switchTo().frame(Frame2);
			Driver.switchTo().frame(Frame3);
			DropDownSelFirstRecord.click();
			}
		
		public void Select1stChk() {
			SelFirstChkbox.click();
			}
		
		public void EnterComments() {
			txtComments.sendKeys("Approved");
			}

}

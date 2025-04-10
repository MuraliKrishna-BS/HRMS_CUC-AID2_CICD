package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage {

	public DashBoardPage(WebDriver Driver) {
		super(Driver);
			}
	
	//Elements
	@FindBy(xpath="//img[@id='imgpoverdby']") WebElement imgStart;
	@FindBy(xpath="//*[@id=\"RAD_SLIDING_PANE_ICON_RSLIDING0\"]") WebElement SldbtnCal;
	@FindBy(xpath="//iframe[@id='iFrameMain']") WebElement Frame1;
	@FindBy(xpath="//img[@title='Self Service']") WebElement imgSelfService;
	
	//Actions
	public boolean ConfirmDashbord() {
			return imgStart.isDisplayed();
			}
	public void ClickForCalender() {
			SldbtnCal.click();
			}
	public void SwitchFrameMain() {
			Driver.switchTo().frame(Frame1);
			}
	public void SwitchoutFrameMain() {
			Driver.switchTo().defaultContent();
	}
	public void ClickSelfService() {
			
			imgSelfService.click();
			
			}
	
}

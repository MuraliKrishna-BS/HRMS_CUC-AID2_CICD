package StepDefinition;

import org.openqa.selenium.WebDriver;

import Factory.BaseClass;
import PageObject.AttendanceCalanderYearly;
import PageObject.DashBoardPage;
import PageObject.HomePage;
import io.cucumber.java.en.*;

public class AttendanceVerification {
	
	WebDriver  Driver ;
	HomePage hp = new HomePage(BaseClass.getDriver());
	DashBoardPage dbp = new DashBoardPage(BaseClass.getDriver());
	AttendanceCalanderYearly acy= new AttendanceCalanderYearly(BaseClass.getDriver());
	
	@Given("Open the HRMS Application")
	public void open_the_hrms_application() {
	  
	  // url is given in Hook
	}

	@Given("Login to the HRMS Application")
	public void login_to_the_hrms_application() {
	    
		hp.EnterUserName("9076");
		hp.EnterPassword("sds2@murkri");
		hp.ClickLogin();
		
	}

	@When("Click on Calender bar")
	public void click_on_calender_bar() {
	  dbp.ClickForCalender();
	  
	}

	@When("Click on Current Month Link Label")
	public void click_on_current_month_link_label() {
	  acy.ClickCurremtMonth();
	}

	@When("Click on Refresh")
	public void click_on_refresh() {
	   acy.ClickRefresh();
	}

	@Then("Verify the Current Month Calender")
	public void verify_the_current_month_calender() {
	    
	}
}

package StepDefinition;

import Factory.BaseClass;
import PageObject.DashBoardPage;
import PageObject.SelfServicesApps;
import io.cucumber.java.en.*;


public class PendingApprovals {
	
	DashBoardPage dbp = new DashBoardPage(BaseClass.getDriver());
	SelfServicesApps ssa= new SelfServicesApps(BaseClass.getDriver());
	
	@When("Click on Self Service Button")
	public void click_on_self_service_button() {
	    dbp.SwitchFrameMain();
		dbp.ClickSelfService();
	}

	@When("Click on Forms Pending for Approval")
	public void click_on_forms_pending_for_approval() {
	   
		ssa.ClickPendingforApproval();
	}

	@When("Select the Record for Approval")
	public void select_the_record_for_approval() {
	    ssa.DropDownSelectforApproval();
	}

	@When("Enter the Apporval Text as Approved")
	public void enter_the_apporval_text_as_approved() {
	   ssa.EnterComments();
	}

	@Then("Verify Record is Approved")
	public void verify_record_is_approved() {
	    
	}


}

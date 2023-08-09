package upskill.utilites;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class AfterAction {
	Screenshots ScreenshotsObj = new Screenshots();
	
	@After
	public void afterActions(Scenario Scenario) throws Exception{

		if(Scenario.isFailed()) {
			ScreenshotsObj.screenshot();
		}
		SetupDrivers.tearDownDriver();
		System.out.println(" ------Test Complete, Browser Closed ");
	}
	 

	}
package upskill.Amazon.stepDef;

import cucumber.api.java.en.Then;
import upskill.Amazaon.pageAction.AmazonSarchResultAction;

public class AmazonSearchResultDef {
	
	AmazonSarchResultAction AmazonSarchResultActionObj= new AmazonSarchResultAction();
	


	//Verify Best Seller
	@Then("^User should be able to see all Best Sellers items$")
	public void user_should_be_able_to_see_all_Best_Sellers_items() throws Throwable {
		AmazonSarchResultActionObj.verifyBestSeller();
}
	@Then("^User should be able to see Customer Service page$")
	public void user_should_be_able_to_see_Customer_Service_page() throws Throwable {
		AmazonSarchResultActionObj.verifyCustomerSercvice();
	}
}

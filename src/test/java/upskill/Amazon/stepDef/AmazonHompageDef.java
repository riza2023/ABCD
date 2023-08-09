package upskill.Amazon.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import upskill.Amazaon.pageAction.AmazonHompageAction;

//git practice
public class AmazonHompageDef {

	AmazonHompageAction AmazonHompageActionObj= new AmazonHompageAction(); 
		
	
	//Open Home page for Best Seller 
	@Given("^Open Amazon Hompage$")
	public void open_Amazon_Hompage() throws Throwable {

	}
	
	
	//Click on Best Seller 
	@When("^Click on Best Sellers$")
	public void click_on_Best_Sellers() throws Throwable {
		AmazonHompageActionObj.clickonBestSellers();
		
	}
	
	//click on Amazon Customer Service 
	
	@When("^Click on Customer Service$")
	public void click_on_Customer_Service() throws Throwable {
		AmazonHompageActionObj.clickCustomerService();
	}
}

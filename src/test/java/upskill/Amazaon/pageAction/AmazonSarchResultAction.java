package upskill.Amazaon.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.Amazaon.pageElements.AmazonSarchResultLocators;
import upskill.utilites.SetupDrivers;

public class AmazonSarchResultAction {
AmazonSarchResultLocators AmazonSarchResultLocatorsObj;

public AmazonSarchResultAction() {
AmazonSarchResultLocatorsObj= new  AmazonSarchResultLocators();
PageFactory.initElements(SetupDrivers.driver, AmazonSarchResultLocatorsObj);

}
//Best Seller will appear
public void verifyBestSeller() throws Exception	{
AmazonSarchResultLocatorsObj.txtBestSeller.isDisplayed();
Thread.sleep(5000);
}

//Customer Service page will appear
public void verifyCustomerSercvice() throws Exception {
	AmazonSarchResultLocatorsObj.txtCustomerService.isDisplayed();
	Thread.sleep(5000);
	
}
}

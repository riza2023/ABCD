package upskill.Amazaon.pageAction;

import org.openqa.selenium.support.PageFactory;
import upskill.Amazaon.pageElements.AmazonHompageLocators;

import upskill.utilites.SetupDrivers;

public class AmazonHompageAction {
	
	AmazonHompageLocators AmazonHompageLocatorsObj;
	
public AmazonHompageAction() {
	AmazonHompageLocatorsObj = new AmazonHompageLocators();
	PageFactory.initElements(SetupDrivers.driver, AmazonHompageLocatorsObj);
}

	

//Click on Best Seller 
public void clickonBestSellers() {
	AmazonHompageLocatorsObj.clickBestSeller.click();
	
}
//Click on Customer Service
public void clickCustomerService() {
	AmazonHompageLocatorsObj.clickCustomerService.click();
}
	
}

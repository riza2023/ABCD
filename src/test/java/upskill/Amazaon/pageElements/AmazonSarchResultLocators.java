package upskill.Amazaon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSarchResultLocators {

//verify Best Seller 	
@FindBy(xpath="//span[text()= 'Amazon Best Sellers']")
public WebElement txtBestSeller;

//verify Customer Service
@FindBy(xpath="(//a[text()='Customer Service'])[2]")
public WebElement txtCustomerService;


}

package upskill.Amazaon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHompageLocators {

//Click Best Seller	
@FindBy(xpath="(//a[text()= 'Best Sellers'])[1]")
public WebElement clickBestSeller;

//Click Customer Service
@FindBy(xpath="//a[text()='Customer Service']")
public WebElement clickCustomerService;

//ScreenShot Practice
//@FindBy(xpath="//a[text()='Customer Servic']")
//public WebElement clickCustomerService;


	
}

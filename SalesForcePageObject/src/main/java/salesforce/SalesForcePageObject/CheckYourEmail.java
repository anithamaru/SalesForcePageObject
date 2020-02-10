package salesforce.SalesForcePageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.Resuable;
import Resources.baseSF;

public class CheckYourEmail extends baseSF{
Resuable reuse = new Resuable();
	
	public CheckYourEmail() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[contains(text(),'ve sent you an email with a link')]")	WebElement displayMessage;
	
	public void displayMessage(String msg) throws Exception {
		Thread.sleep(5000);
		reuse.validateText(displayMessage, msg);
	}
}

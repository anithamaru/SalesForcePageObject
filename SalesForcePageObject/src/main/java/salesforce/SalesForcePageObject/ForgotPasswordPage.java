package salesforce.SalesForcePageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.Resuable;
import Resources.baseSF;

public class ForgotPasswordPage extends baseSF{
	Resuable reuse = new Resuable();
	
	public ForgotPasswordPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="un")	WebElement provideUsername;
	@FindBy(id="continue")	WebElement continueButton;
	
	public void provideUsername(String input,String text_name) {
		reuse.enterData(provideUsername, input, text_name);
	}
	
	public CheckYourEmail continueButton(String text_name) {
		reuse.clickButton(continueButton, text_name);
		return new CheckYourEmail();
	}
}

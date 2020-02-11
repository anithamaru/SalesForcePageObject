package salesforce.SalesForcePageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.Resuable;
import Resources.baseSF;

public class HomePageSF extends baseSF{
	public HomePageSF() {
		PageFactory.initElements(driver, this);
	}
	Resuable reuse = new Resuable();
	@FindBy(id="userNavButton")	WebElement userMenu;
	@FindBy(linkText="Logout") WebElement Logout;
	//@FindBy(id="userNavMenu") WebElements
	
	public void getButton(String text_name) {
		reuse.clickButton(userMenu, text_name);
}
	public loginPage LogoutButton(String text_name) {
		reuse.clickButton(Logout, text_name);
		return new loginPage();
}
	String[] list = { "My Profile", "My Settings", "Developer Console", "Switch to Lightning Experience",
	"Logout" };


}
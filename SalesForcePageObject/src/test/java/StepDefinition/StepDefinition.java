package StepDefinition;

import static org.testng.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;

import com.relevantcodes.extentreports.LogStatus;

import Resources.ExtendReports;
import Resources.baseSF;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import salesforce.SalesForcePageObject.CheckYourEmail;
import salesforce.SalesForcePageObject.ForgotPasswordPage;
import salesforce.SalesForcePageObject.HomePageSF;
import salesforce.SalesForcePageObject.loginPage;

public class StepDefinition extends baseSF {
	//loginPage lp = new loginPage();
	HomePageSF hp=new HomePageSF();
	
	@Before
	public void setUp() throws Exception {
		baseSF.initializeDriver();
		baseSF.Reporting();
		logger=reports.startTest("SalesForce");
	}
	
	@Given("^: Launch the URL$")
	public void launch_the_URL() throws Throwable {
		
		//baseSF.initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		logger.log(LogStatus.PASS, "The Browser is launched");
	}

	@Then("^: Enter username \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_username(String arg1, String text_name) throws Throwable {
		loginPage lp = new loginPage();
		
		lp.getUsername(arg1, text_name);
		
		logger.log(LogStatus.PASS, "Entered "+text_name+" in the text box.");
	}

	@Then("^: Enter password \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_password(String arg1, String text_name) throws Throwable {
		loginPage lp = new loginPage();
		
		lp.getPassword(arg1, text_name);
		
		 logger.log(LogStatus.PASS, "Entered "+text_name+" in the text");
		 
	}

	@Then("^: Click the Button \"([^\"]*)\"$")
	public void click_the_Button(String text_name) throws Throwable {
		loginPage lp = new loginPage();
		lp.getButton(text_name);
	}

	@Then("^: Validate the message \"([^\\\"]*)\"$")
	public void validate_the_message(String msg) throws Throwable {
		loginPage lp = new loginPage();
		lp.getErrorMessage(msg);
		
	}
	@Then("^: Validate the Page \"([^\"]*)\"$")
	public void validate_the_Page(String title) throws Throwable {
		loginPage lp = new loginPage();
		System.out.println(title);
		lp.VerifyTitle(title);
		}
	@Then("^: Validate Username \"([^\"]*)\"$")
	public void validate_Username(String expected) throws Throwable {
		loginPage lp = new loginPage();
		String actual=lp.getUsernameVerify();
		Assert.assertEquals(expected, actual);
		logger.log(LogStatus.PASS, expected+"is displayed as expected ");
	}
	@Then("^: Select the Button \"([^\"]*)\"$")
	public void select_the_Button(String arg1) throws Throwable {
		loginPage lp = new loginPage();
		lp.checkBox(arg1);
	}
	@Then("^: Click the HPButton \"([^\"]*)\"$")
	public void click_the_HPButton(String arg1) throws Throwable {
		HomePageSF hp=new HomePageSF();
		hp.getButton(arg1);
	}
	@Then("^: Click the LogoutButton \"([^\"]*)\"$")
	public void click_the_LogoutButton(String arg1) throws Throwable {
		HomePageSF hp=new HomePageSF();
		loginPage lp = new loginPage();
		lp=hp.LogoutButton(arg1);
		Thread.sleep(5000);
	}
	@Then("^: Provide username \"([^\"]*)\" \"([^\"]*)\"$")
	public void provide_username(String arg1,String text_name) throws Throwable {
		ForgotPasswordPage fp=new ForgotPasswordPage();
		fp.provideUsername(arg1,text_name);
	}

	@Then("^: Click continue button \"([^\"]*)\"$")
	public void click_continue_button(String arg1) throws Throwable {
		ForgotPasswordPage fp=new ForgotPasswordPage();
		CheckYourEmail cy=new CheckYourEmail();
		cy=fp.continueButton(arg1);
	}

	@Then("^: Validate Display Message \"([^\"]*)\"$")
	public void validate_Display_Message(String msg) throws Throwable {
		CheckYourEmail cy=new CheckYourEmail();
		cy.displayMessage(msg);
	}
	@Then("^: Click forgot Password \"([^\"]*)\"$")
	public void click_forgot_Password(String arg1) throws Throwable {
		loginPage lp = new loginPage();
		lp.forgotPassword(arg1);
	}

	

	@After
	public static void TearDown() throws InterruptedException {
		Thread.sleep(3000);
		baseSF.Report_Close();
		driver.quit();

	}

}

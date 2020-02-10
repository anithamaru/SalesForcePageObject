package Resources;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Resuable extends baseSF{
	//public static ExtentTest logger;
public void enterData(WebElement Obj,String input,String text_name) {
	if (Obj.isDisplayed() == true) {
		if (Obj.isEnabled() == true) {
			Obj.sendKeys(input);
			logger.log(LogStatus.PASS, input +" is entered in the "+text_name);
			
	}
}
}

public void clickButton(WebElement Obj,String text_name) {
	if (Obj.isDisplayed() == true) {
		Obj.click();
		logger.log(LogStatus.PASS, text_name+" is clicked");
	}else logger.log(LogStatus.FAIL, text_name+" is NOT clicked");
}

public void validateText(WebElement Obj,String msg){
	String actual=Obj.getText();
	Assert.assertEquals(actual, msg);
	logger.log(LogStatus.PASS, msg+" Text is displayed as expected ");
	
}
public void validateTitle(String input,String ObjName) {
	String title=driver.getTitle();
	Assert.assertEquals(title, input);
	logger.log(LogStatus.PASS, input+" Title is displayed as expected ");
}
public void checkBox(WebElement Obj,String text_name) {
	Obj.click();
	logger.log(LogStatus.PASS, text_name+" is clicked");
}
}

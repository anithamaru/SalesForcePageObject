package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class baseSF {
	public static WebDriver driver;
	public static Properties prop;
	public static ExtentReports reports;
	public static ExtentTest logger;
	
	
	public static WebDriver initializeDriver() throws Exception {
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Java_Anitha\\SalesForcePageObject\\src\\main\\java\\Data\\config.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			// execute in chrome browser
			System.setProperty("webdriver.chrome.driver", "C:\\Java_Anitha\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			// execute in firefox
		} else if (browserName.equals( "IE")) {
			// execute in IE
		}driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void Reporting() {

		String fileName = new SimpleDateFormat("'SampleTestExtentDemo_'yyyyMMddHHmm'.html'").format(new Date());
		String reportPath = "C:\\Java_Anitha\\SalesForcePageObject\\ExtendReport\\" + fileName;
		//logger = new ExtentTest("test name", "test desc");
		reports = new ExtentReports(reportPath);

	}
	
	
	public static void Report_Close() {
		reports.endTest(logger);
		reports.flush();
		}
	public static void getScreenshot(String result) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Java_Anitha\\SalesForcePageObject\\Screenshots\\"+result+"screenshot.png"));
		
	}
}

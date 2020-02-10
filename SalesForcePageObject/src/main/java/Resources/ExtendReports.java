package Resources;

import java.text.SimpleDateFormat;
import java.util.Date;



import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class  ExtendReports {
	public static ExtentReports reports;
	public static ExtentTest logger;
	
	
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
}
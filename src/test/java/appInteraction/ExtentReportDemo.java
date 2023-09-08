package appInteraction;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {

	public static void main(String[] args)
	{

		  //create instance
		  ExtentReports report = new ExtentReports();
		  //to provide path of report
		  ExtentSparkReporter spark = new ExtentSparkReporter("./"+"/reports/Spark.html");
		  //To set some configurations
		  spark.config().setReportName("AutomationReport");
		  spark.config().setDocumentTitle("Sprint 1 Automation Report");
		  spark.config().setTheme(Theme.DARK);
		  //attach spark report to extent report
		  report.attachReporter(spark);
		  
		  //create test
		  ExtentTest test=report.createTest("Login Test");
		  //set logs
		  test.pass("LoginTest Pass");
		  test.fail("Test is fail");
		  test.skip("Test is skip");
		  
		  report.flush();
		  
	}

}

package genericLibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class ListenersImplimentationClass implements ITestListener {
	ExtentReports report ;
	javaUtility jutil = new javaUtility();
	ExtentTest test ;
	

	@Override
	public void onTestStart(ITestResult result) {
		String methodname =result.getMethod().getMethodName();
		Reporter.log("This "+ methodname + "started");
	 test = report.createTest(methodname);
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodname =result.getMethod().getMethodName();
		Reporter.log("This "+ methodname + "was sucessfull");
		test.log(Status.PASS, methodname+ "successfull");
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodname =result.getMethod().getMethodName();
		test.log(Status.FAIL, methodname+"Failed");
		test.log(Status.INFO, result.getThrowable());
	String dateTimeStamps = jutil.handlingCalendar("dd-mm-yyyy");
	
		TakesScreenshot ts = (TakesScreenshot)BaseClass.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\ScreenShots\\" + methodname + dateTimeStamps + ".png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodname =result.getMethod().getMethodName();
		Reporter.log("This "+ methodname + "skipped");
		test.log(Status.SKIP, methodname+"skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		
		String dateTimeStamp = jutil.handlingCalendar("dd-mm-yyyy");
		// configuration of test reports
		ExtentSparkReporter htmlReport = new ExtentSparkReporter(".\\htmlReport\\report "+ dateTimeStamp +".html");
		htmlReport.config().setDocumentTitle("Vtiger application execution");
		htmlReport.config().setTheme(Theme.DARK);
		htmlReport.config().setReportName("zahir");
		
		// creation of report
		report = new ExtentReports();
		report.attachReporter(htmlReport);
		report.setSystemInfo("base url", "http:8888");
		report.setSystemInfo("Website", "Vtiger");
		report.setSystemInfo("environment", "test environment");
		report.setSystemInfo("Tester", "test dept");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
		
	}
	

}

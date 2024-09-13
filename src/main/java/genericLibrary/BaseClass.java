package genericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import pomClassOrObjectrepository.HomePage;
import pomClassOrObjectrepository.LoginPage;

public class BaseClass {
	
	public static WebDriver driver= null ;
	PropertyUtility pUtil = new PropertyUtility();
	@BeforeSuite(alwaysRun = true)
	public void LoginDB() throws Exception
	{
		pUtil.readDataFromUtility("DataBase Started");
		
	}
//	@Parameters("browser")
	@BeforeClass (alwaysRun = true)
	
	public void LauncingBrowser(/*String browser*/) throws Exception
	{
		driver = new ChromeDriver();
		
		String Url = pUtil.readDataFromUtility("url");
//		if(browser.contains("chrome")) {
//		driver = new ChromeDriver();
//		}
//		if(browser.contains("edge"))
//		{
//			driver= new EdgeDriver();
//		}
		driver.get(Url);
		 SeleniumUtility su = new SeleniumUtility();
		 su.ImplicitWaitTime(driver, 10);
		 su.maximizecurrentwebpage(driver);
		 
		 System.out.println("browser launch");
	}
	@BeforeMethod(alwaysRun = true)
	public void loginSystem() throws Exception
	{
		String UN= pUtil.readDataFromUtility("username");
		String PN = pUtil.readDataFromUtility("password");
		LoginPage lp = new LoginPage(driver);
			lp.loginToApplication(UN, PN);
			System.out.println("login successfull");
	}
	@AfterMethod(alwaysRun = true)
	public void LogoutSystem()
	{
		HomePage hm = new HomePage(driver);
		hm.HomePageGetSignout(driver);
	}
	@AfterClass(alwaysRun = true)
	public void CloseBrowser()
	{
		driver.quit();
	}
	@AfterSuite(alwaysRun = true)
	public void closeDB()
	{
		System.out.println("DataBase closed successfull");
	}

}


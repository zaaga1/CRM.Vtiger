package testcase_repo;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import genericLibrary.ExcelUtility;
import pomClassOrObjectrepository.CreateNewLeadpage;
import pomClassOrObjectrepository.HomePage;
import pomClassOrObjectrepository.LeadsPage;
import pomClassOrObjectrepository.LoginPage;

public class LE_02 extends BaseClass {
	@Test
	public void le_02TC() throws Exception {
		HomePage hp= new HomePage(driver);
		hp.HomePageGetLeads();
		LeadsPage lp = new LeadsPage(driver);
		lp.ClickOnCreateLead();
		ExcelUtility Eutil = new ExcelUtility();
		String fname= Eutil.readFromExcel("Leads",4,1);
		String lname=Eutil.readFromExcel("Leads",4,2);
		String company= Eutil.readFromExcel("Leads",4,3);
		String title= Eutil.readFromExcel("Leads",4,4);
		String Mobile= Eutil.readFromExcel("Leads",4,5);
		String country= Eutil.readFromExcel("Leads",4,6);
		
		
		CreateNewLeadpage cnl = new CreateNewLeadpage(driver);
		cnl.InsideDetails(fname,lname,company,title,Mobile,country);
		System.out.println();
		
		
	
	
	}
		
	

}

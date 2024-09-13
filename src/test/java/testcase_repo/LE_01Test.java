package testcase_repo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import genericLibrary.ExcelUtility;
import pomClassOrObjectrepository.CreateNewLeadpage;
import pomClassOrObjectrepository.HomePage;
import pomClassOrObjectrepository.LeadsPage;

@Listeners(genericLibrary.ListenersImplimentationClass.class)
public class LE_01Test extends BaseClass {
	@Test
	public void le_01TC() throws Exception
	{
		HomePage hp= new HomePage(driver);
		hp.HomePageGetLeads();
		LeadsPage lp = new LeadsPage(driver);
		lp.ClickOnCreateLead();
		ExcelUtility Eutil = new ExcelUtility();
		String fname=Eutil.readFromExcel("Leads",1,1);
		String lname= Eutil.readFromExcel("Leads",1,2);
		String company= Eutil.readFromExcel("Leads",1,3);
		
		
		
		CreateNewLeadpage cnl = new CreateNewLeadpage(driver);
		cnl.InsideDetails1(fname, lname, company);
		
		
		
		
	}

}

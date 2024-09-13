package pomClassOrObjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	@FindBy(xpath= "//a[text()='Calendar']")
	private WebElement Calendar;
	@FindBy(xpath="//td[@class='tabUnSelected']/a[text()='Leads']")
	private WebElement Leads;
	@FindBy(xpath="//td[@class='tabUnSelected']//a[text()='Organizations']")
	private WebElement Orgnaisation;
	@FindBy(xpath="//td[@class='small']/img[@style='padding: 0px;padding-left:5px']")
	private WebElement PaddingSignOut;
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement SignOut;

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getCalendar() {
		return Calendar;
	}
	public WebElement getLeads() {
		return Leads;
	}
	public WebElement getOrgnaisation() {
		return Orgnaisation;
	}
	public WebElement getSignOut() {
		return PaddingSignOut;
	}
	public void HomepageGetCalendar()
	{
		getCalendar().click();
	}
	public void HomePageGetLeads()
	{
		getLeads().click();
	}
	public void HomepageGetOrganisation()
	{
		getOrgnaisation().click();	
	}

	public void HomePageGetSignout(WebDriver driver)
	{
		Actions a = new Actions(driver);
		a.moveToElement(PaddingSignOut).perform();
		a.moveToElement(SignOut).click().perform();

	}


}

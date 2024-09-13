package pomClassOrObjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeadpage {
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement FirstName;
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement LastName;
	@FindBy(xpath="//input[@name='company']")
	private WebElement Company;
	@FindBy(xpath="//input[@name='designation']")
	private WebElement Title;
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement Mobile;
	@FindBy(xpath="//input[@name='country']")
	private WebElement Country;
	public CreateNewLeadpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getCompany() {
		return Company;
	}
	public WebElement getTitle() {
		return Title;
	}
	public WebElement getMobile() {
		return Mobile;
	}
	public WebElement getCountry() {
		return Country;
	}
	public void InsideDetails(String FirstName,String LastName,String Company,String Title,String Mobile,String Country)
	{
		getFirstName().sendKeys(FirstName);
		getLastName().sendKeys(LastName);
		getCompany().sendKeys(Company);
		getTitle().sendKeys(Title);
		getMobile().sendKeys(Mobile);
		getCountry().sendKeys(Country);
		
	}
	public void InsideDetails1(String FirstName, String LastName,String Company)
	{
		getFirstName().sendKeys(FirstName);
		getLastName().sendKeys(LastName);
		getCompany().sendKeys(Company);
	}
	
	

}

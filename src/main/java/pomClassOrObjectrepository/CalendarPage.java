package pomClassOrObjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {

	@FindBy(xpath="//a[text()='Day']")
	private WebElement Day;
	@FindBy(xpath="//td[@class='calAddButton']")
	private WebElement calAddButton;
	@FindBy(xpath="//a[text()='Call']")
	private WebElement CallButton;
	@FindBy(xpath="//a[text()='Meeting']")
	private WebElement MeetingButton;
	@FindBy(xpath="//a[text()='To Do']")
	private WebElement To_DOButton;
	
	public CalendarPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getDay() {
		return Day;
	}

	public WebElement getCalAddButton() {
		return calAddButton;
	}

	public WebElement getCallButton() {
		return CallButton;
	}

	public WebElement getMeetingButton() {
		return MeetingButton;
	}

	public WebElement getTo_DOButton() {
		return To_DOButton;
	}
public void clickDay()
{
	getDay().click();
}
public void MoveToAddButton(WebDriver driver)
{
	Actions a = new Actions(driver);
	a.moveToElement(CallButton);
}
public void clickOnCall()
{
	getCalAddButton().click();
	
}
public void ClickOnMeeting()
{
	getMeetingButton().click();
}
public void ClickOnToDo()
{
	getTo_DOButton().click();
}
}

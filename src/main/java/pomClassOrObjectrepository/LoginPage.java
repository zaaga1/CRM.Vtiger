package pomClassOrObjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this is to define the x path
 */
public class LoginPage {
	@FindBy(xpath="//input[@name='user_name']")
	 private WebElement userName ;
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement password;
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement loginButton;
	/**
	 * this is to initialize 
	 * @param driver
	 */
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
		
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	/**
	 * this is a business library to perform login operation to the application
	 * @param username
	 * @param password
	 */
	public void loginToApplication(String username , String password)
	{
		getUserName().sendKeys(username);
		getPassword().sendKeys(password);
		getLoginButton().click();
	}
	

}

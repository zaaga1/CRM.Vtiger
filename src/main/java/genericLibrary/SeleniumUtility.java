package genericLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class SeleniumUtility {
	
	
	
	public void maximizecurrentwebpage(WebDriver driver)
	{
		
		driver.manage().window().maximize();
	}
	public void ImplicitWaitTime(WebDriver driver,int seconds)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
		
	}
//	public void moveCursorToElment(WebElement element)
//	{
//		Actions act =new Actions(null);
//		act.moveToElement(element).perform();
//	}
//	public void draganddropandelement(WebElement src, WebElement tar)
//	{
//		act.dragAndDrop(src, tar).perform();
//	}
//	public void acceptAlert()
//	{
//		driver.switchTo().alert().accept();
//	}
//	public void dismissAlert()
//	{
//		driver.switchTo().alert().dismiss();
//	}
}

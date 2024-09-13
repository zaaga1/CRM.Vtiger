package Sample1;

import org.testng.Assert;
import org.testng.annotations.Test;


public class retryPractice  {
	@Test (retryAnalyzer = genericLibrary.RetryAnalyserImplementation.class)
	public void RetryPractice()
	{
		Assert.fail();
		System.out.println("hello");
	}

}

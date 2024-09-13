package genericLibrary;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtility {
	public String readDataFromUtility(String data ) throws Exception
	
	{
		FileInputStream fis = new FileInputStream(IconstantUtility.propertiesPath);
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(data);
		return value;
	}

}

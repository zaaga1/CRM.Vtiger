package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class readData {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\commondata\\commonData\\a.property");
		Properties pobj = new Properties();
		pobj.load(fis);
		String Url =pobj.getProperty("url");
		String UN =pobj.getProperty("username");
	String pass = 	pobj.getProperty("password");
		System.out.println(Url+UN+pass);
		

	}

}

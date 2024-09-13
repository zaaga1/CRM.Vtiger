package genericLibrary;

public class ExecutionClass {

	public static void main(String[] args) throws Exception {
		PropertyUtility p = new PropertyUtility();
//		String URL =p.readDataFromUtility("url");
//		System.err.println(URL);
		String UN=p.readDataFromUtility("username");
		System.err.println(UN);
		String PW=p.readDataFromUtility("password");
		System.err.println(PW);
		
	}

}

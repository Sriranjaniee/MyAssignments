package practice;

public class LoginTestData extends TestData {
	
	public void enterUsername()

	{
		System.out.println("Please enter the username");
	}
	public void enterPassword()
	{
		System.out.println("Please enter the password");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginTestData ld=new LoginTestData();
		ld.enterCredentials();
		ld.navigateToHomePage();
		ld.enterPassword();
		ld.enterUsername();
		

	}

}

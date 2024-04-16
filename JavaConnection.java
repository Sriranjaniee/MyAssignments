package practice;

public class JavaConnection extends MySqlConnection {
	
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("the execution update is yet to be shared");
	}
    public void testMethod()
    {
    	System.out.println("test method will get executed from concrete class");
    }

	public static void main(String[] args) {
		
		JavaConnection jc=new JavaConnection();
		jc.executeUpdate();
		jc.executeQuery();
		jc.connect();
		jc.disconnect();
		jc.testMethod();
      
	}

	
}

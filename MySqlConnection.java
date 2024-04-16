package practice;

public abstract class MySqlConnection implements DatabaseConnection{

	public void connect()
	{
		System.out.println("the database connection is completed");
	}
	public void disconnect()
	{
		System.out.println("The system is not disconnected");
		
	}
	//public void executeUpdate()
	//{
	//	System.out.println("the execution update is yet to be shared");
	//}
	public void executeQuery()
	{
		System.out.println("Given query is executed");
	}
	
}

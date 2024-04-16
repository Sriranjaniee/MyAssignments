package practice;

public class APIClientAssignment {
	
	public void sendRequest(String endpoint)
	{
		System.out.println(endpoint +" ");
	}
public void sendRequest(String endpoint,String requestBody,boolean requestStatus)
{
	System.out.println(endpoint + " " + requestBody + " " + requestStatus);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		APIClientAssignment apa=new APIClientAssignment();
		apa.sendRequest("endpoint is Active");
		apa.sendRequest("endpoint is Active", "\nrequest is aprroved",true);
		
		
	}

}

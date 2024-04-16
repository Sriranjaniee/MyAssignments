package practice;

public class CustomButton extends Button {
	public void clickCheckButton()
	{
	 System.out.println("the check button is clicked");
	 
	}
	public static void main(String[] args)
	{
		CustomButton cb=new CustomButton();
		cb.click();
		cb.setText("inactive");
		cb.submit();
		cb.clickCheckButton();
		
		
	}

}

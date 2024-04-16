package practice;

public class TextField extends Button {
	public void getText(String text1)
	{
		System.out.println("the given text displayed is :"+text1);
		
	}
	public static void main(String[] args)
	{
		TextField tf=new TextField();
		tf.click();
		tf.submit();
		tf.getText("called from Textfield class");
		tf.setText("called from TextField class");
				
	}

}

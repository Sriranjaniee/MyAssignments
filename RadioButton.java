package practice;

public class RadioButton extends Button {
	public void selectRadioButton()
	{
		System.out.println("the radio button is selected");
	}
public static void main(String[] args)
{
	RadioButton rb=new RadioButton();
	rb.click();
	rb.selectRadioButton();
	rb.setText("called from radiobutton class");
	rb.submit();
	
}
}

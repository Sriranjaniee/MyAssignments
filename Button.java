package practice;

public class Button extends WebElement {
	public void submit()
	{
		System.out.println("the button is submitted");
	}
public static void main(String[] args)
{
	Button b=new Button();
	b.submit();
	b.click();
	b.setText("button class");
}
}

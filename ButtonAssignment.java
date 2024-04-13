package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 ChromeDriver driver=new ChromeDriver();

 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 driver.get("https://leafground.com/button.xhtml");
 driver.manage().window().maximize();
 Thread.sleep(1000);
 driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']/parent::button[@id='j_idt88:j_idt90']")).click();
 String title=driver.getTitle();
 System.out.println(title);
 Thread.sleep(2000);
 driver.navigate().to("https://leafground.com/button.xhtml");
 //(((RemoteWebDriver)driver.findElement(By.xpath("//div[@class='route-bar']/parent::div[@class='layout-main']")))).navigate();
 System.out.println(driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']/parent::button[@id='j_idt88:j_idt92']")).isEnabled());
 WebElement Posbutton=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']"));
 Rectangle submitButtonLeft=Posbutton.getRect();
 System.out.println(submitButtonLeft.getX());
 System.out.println(submitButtonLeft.getY());
 
 System.out.println(driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-secondary mr-2 mb-2']")).getCssValue("background"));
 WebElement Hwbutton=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']"));
 Dimension submitButtonDim= Hwbutton.getSize();
 System.out.println(submitButtonDim.getWidth());
 System.out.println(submitButtonDim.getHeight());
 
	
	
	
	}

}

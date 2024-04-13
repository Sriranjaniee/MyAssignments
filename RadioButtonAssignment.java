package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();

		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.leafground.com/radio.xhtml");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@id='j_idt87:console1:0']/ancestor::div[@class='ui-radiobutton ui-widget']")).click();
		 Thread.sleep(1000);
		 ////*[@id="j_idt87:city2"]/div/div[1]/div/div[2]
		 driver.findElement(By.xpath("//input[@id='j_idt87:city2:0']/ancestor::div[@class='ui-radiobutton ui-widget']")).click();
		 Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='j_idt87:city2:0']/ancestor::div[@class='ui-radiobutton ui-widget']")).click();
		 Thread.sleep(1000);
		 System.out.println(driver.findElement(By.xpath("//input[@id='j_idt87:city2:0']/ancestor::div[@class='ui-radiobutton ui-widget']")).isSelected());
		 driver.findElement(By.xpath("//input[@id='j_idt87:console2:2']/ancestor::div[@class='ui-radiobutton ui-widget']")).click();
		 System.out.println(driver.findElement(By.xpath("//input[@id='j_idt87:console2:2']/ancestor::div[@class='ui-radiobutton ui-widget']")).isEnabled());
		 driver.findElement(By.xpath("//input[@id='j_idt87:age:1']/ancestor::div[@class='ui-radiobutton ui-widget']")).click();
		 
		 

	}

}

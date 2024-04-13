package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookHomeAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();

driver.findElement(By.linkText("Create new account")).click();
Thread.sleep(15000);
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tinker");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("bell");
driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("nsriranjaniee@gmail.com");
driver.findElement(By.id("password_step_input")).sendKeys("kerBell");
WebElement dropdown=driver.findElement(By.id("day"));
Select dd= new Select(dropdown);
dd.selectByValue("1");
Thread.sleep(500);
WebElement dropdown1=driver.findElement(By.id("month"));
Select dd1=new Select(dropdown1);
dd1.selectByValue("1");
WebElement dropdown2=driver.findElement(By.id("year"));
Select dd2=new Select(dropdown2);
dd2.selectByValue("2010");
driver.findElement(By.className("_58mt")).click();
Thread.sleep(10000);














	}

}

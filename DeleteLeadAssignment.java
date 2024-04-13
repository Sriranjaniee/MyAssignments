package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeadAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get(" http://leaftaps.com/opentaps/");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.linkText("Phone")).click();
driver.findElement(By.name("phoneNumber")).sendKeys("7339576789");
Thread.sleep(3000);
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.linkText("10038")).click();
driver.findElement(By.linkText("Delete")).click();
Thread.sleep(3000);
driver.findElement(By.linkText("Find Leads")).click();
Thread.sleep(3000);
driver.findElement(By.name("id")).sendKeys("10038");
Thread.sleep(5000);
driver.findElement(By.className("x-btn-center")).click();
Thread.sleep(10000);










	}

}

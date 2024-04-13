package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadAssignment {

	public static void main(String[] args) {
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
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TCS");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Sriranjani");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("N");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Sri");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Automation");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Web Application Automation Engineer");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("sriranjani@gmail.com");
		WebElement dropdown=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd=new Select(dropdown);
		dd.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.xpath("(//div[@class='frameSectionExtra']/a)[3]")).click();
		driver.findElement(By.xpath("//td[@colspan='4']/textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.xpath("//td[@colspan='4']/textarea[@id='updateLeadForm_importantNote']")).sendKeys("XYZ");
		driver.findElement(By.xpath("//td[@colspan='4']/input[@value='Update']")).click();
		String text=driver.getTitle();
		System.out.println(text);
		driver.close();
		
		
		
		}

}

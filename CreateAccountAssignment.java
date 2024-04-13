package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountAssignment {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Sriranjani");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement dropdown=driver.findElement(By.name("industryEnumId"));
		Select dd=new Select(dropdown);
		dd.selectByVisibleText("Computer Software");
		Thread.sleep(1000);
		WebElement dropdown1= driver.findElement(By.name("ownershipEnumId"));
		Select dd1=new Select(dropdown1);
		dd1.selectByVisibleText("S-Corporation");
		Thread.sleep(1000);
		WebElement dropdown2=driver.findElement(By.id("dataSourceId"));
		Select dd2=new Select(dropdown2);
		dd2.selectByValue("LEAD_EMPLOYEE");
		Thread.sleep(1000);
		WebElement dropdown3=driver.findElement(By.id("marketingCampaignId"));
		Select dd3=new Select(dropdown3);
		dd3.selectByIndex(6);
		Thread.sleep(1000);
		WebElement dropdown4=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dd4= new Select(dropdown4);
		dd4.selectByValue("TX");
		Thread.sleep(1000);
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(10000);
		driver.close();
		
		
		//eCommerce Site Internal Campaign
		
		
		
		
		//dd.selectByVisibleText(null)
		
		
		
		


	}

}

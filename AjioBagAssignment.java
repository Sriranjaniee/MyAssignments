package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioBagAssignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("Bags");
		driver.findElement(By.xpath("//button[@class='rilrtl-button']")).click();
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/parent::div[@class='facet-linkhead']")).click();
		//facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags
		Thread.sleep(2000);
	    WebElement text=driver.findElement(By.xpath("//div[contains(@aria-label,' Items Found')]"));
	    String txt=text.getText();
		System.out.println(txt);
		List<WebElement> brandsWE = driver.findElements(By.xpath("//div[@class='brand']"));
		List<String> brandNames = new ArrayList<String>();
		for(int i = 0; i <brandsWE.size(); i++)
		{
			String brandName = brandsWE.get(i).getText();
			System.out.println(brandName);
			brandNames.add(brandName);
		}
		System.out.println(brandNames);
		List<WebElement> brandsWE1 = driver.findElements(By.xpath("//div[@class='brand']/following::div[@class='nameCls']"));
		List<String> brandNM=new ArrayList<String>();
		for(int i=0;i<brandsWE1.size();i++)
		{
			String BrandName=brandsWE1.get(i).getText();
			System.out.println(BrandName);
			brandNM.add(BrandName);
		}
		System.out.println(brandNM);
	}


		
		
		
		
		
	}



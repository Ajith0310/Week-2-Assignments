package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			
			driver.findElement(By.className("decorativeSubmit")).click();
			
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			driver.findElement(By.linkText("Leads")).click();
			
			driver.findElement(By.linkText("Find Leads")).click();
			
			driver.findElement(By.linkText("Phone")).click();
			
			driver.findElement(By.name("phoneNumber")).sendKeys("1112223334");
			
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			
			Thread.sleep(3000);
			
			String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]")).getText();
			System.out.println(text);
			
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]")).click();
			
			driver.findElement(By.linkText("Delete")).click();
			
			driver.findElement(By.linkText("Find Leads")).click();
			
			driver.findElement(By.name("id")).sendKeys(text);
			
			driver.findElement(By.linkText("Find Leads")).click();
			
			driver.close();
			
			
	}

}

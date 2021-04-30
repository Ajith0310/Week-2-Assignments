package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Ajith");
		
		driver.findElement(By.id("lastNameField")).sendKeys("Kumar");
		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("A");
		
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("K");
		
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Fin");
		
		driver.findElement(By.id("createContactForm_description")).sendKeys("Invest");
		
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("xyz@gmail.com");
		
		WebElement dropDown1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd1 = new Select(dropDown1);
		dd1.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Any text");
		
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}

}

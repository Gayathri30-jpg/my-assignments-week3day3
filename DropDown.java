package week2day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on the Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the CRMSFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on the Leads link
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on the CreateLead link
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//Enter the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
		
		//Enter the last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
		
		
		//Handling dropdown
		//Step1: Find the element
		WebElement sourceElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//Step2: Create an Object for Select Class
		Select options1=new Select(sourceElement);
		
		//Step3: Use the method to select to Select the value
		//options.selectByIndex(3);
		//options.selectByVisibleText("Employee");
		options1.selectByValue("LEAD_EXISTCUST");
		
		//Click on the Create Lead button
		//driver.findElement(By.name("submitButton")).click();
WebElement industryElement = driver.findElement(By.id("createLeadForm_industryEnumId"));
	Select options2 = new Select(industryElement);
	options2.selectByVisibleText("Computer Software");
	}
}
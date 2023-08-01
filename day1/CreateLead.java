package week2.day1;
//Assignment 1:Create Lead
//1. Launch URL "http://leaftaps.com/opentaps/control/login"
//2. Enter UserName and Password Using Id Locator
//3. Click on Login Button using Class Locator
//4. Click on CRM/SFA Link
//5. Click on Leads Button
//6. Click on Create Lead 
//7. Enter CompanyName Field Using id Locator
//8. Enter FirstName Field Using id Locator
//9. Enter LastName Field Using id Locator
//10. Enter FirstName(Local) Field Using id Locator
//11. Enter Department Field Using any Locator of Your Choice
//12. Enter Description Field Using any Locator of your choice 
//13. Enter your email in the E-mail address Field using the locator of your choice
//14. Click on Create Button
 //15. Get the Title of Resulting Page. refer the video  using driver.getTitle()
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//HomeAssignment
public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
	    WebElement Username = driver.findElement(By.id("username"));
		   Username.sendKeys("demoSalesManager");
		   driver.findElement(By.id("password")).sendKeys("crmsfa");
		   driver.findElement(By.className("decorativeSubmit")).click();
		   driver.findElement(By.linkText("CRM/SFA")).click();
		   driver.findElement(By.linkText("Leads")).click();
		   driver.findElement(By.linkText("Create Lead")).click();
		   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("abc");
		   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("firstname");
		   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lastname");
		   driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("firstloacalname");
		   driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("dep123");
		   driver.findElement(By.id("createLeadForm_description")).sendKeys("desc123");
		   driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		   driver.findElement(By.name("submitButton")).click();
		   String title = driver.getTitle();
		   System.out.println(title);
		  
		   
		
		   

	}

}

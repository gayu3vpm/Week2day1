package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchSalesForce {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
	    WebElement Username = driver.findElement(By.id("username"));
		   Username.sendKeys("hari.radhakrishnan@qeagle.com");
		   driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		   driver.findElement(By.id("Login")).click();
	}

}

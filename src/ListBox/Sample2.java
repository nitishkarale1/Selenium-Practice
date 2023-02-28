package ListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Sample2
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		
		WebElement manageBooking = driver.findElement(By.xpath("//div[contains(text(),'Booking')]"));
		Actions act=new Actions(driver);
		act.click(manageBooking).perform();
		
		WebElement showMyTicket=driver.findElement(By.xpath("//span[contains(text(),'My Ticket')]"));
		
		act.click(showMyTicket).perform();
	}
	
}

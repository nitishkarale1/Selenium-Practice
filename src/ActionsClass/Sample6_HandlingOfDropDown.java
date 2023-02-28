package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample6_HandlingOfDropDown 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.airindia.in/");
		
		WebElement offers = driver.findElement(By.xpath("(//a[text()='Offers'])[2]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(offers).perform();
		
		WebElement prefferedSeat = driver.findElement(By.xpath("(//a[@class='nav-link'])[23]"));
		
		act.click(prefferedSeat).perform();
		
		String text=driver.findElement(By.xpath("//h1[@class='title']")).getText();
		
		System.out.println(text);
	}
	
}

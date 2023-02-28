package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample7_HandlingOfDropDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.apple.com/in/");
		
		WebElement iphone= driver.findElement(By.xpath("//span[text()='iPhone']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(iphone).perform();
		Thread.sleep(2000);
		
		WebElement iphone13 = driver.findElement(By.xpath("//a[text()='iPhone 13']"));
		act.click(iphone13).build().perform();
		
		String text=driver.findElement(By.xpath("//h1[text()='Buy iPhone 13']")).getText();
		System.out.println(text);
		
		Thread.sleep(3000);
		driver.close();
	}
	
}

package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement src = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement dest=driver.findElement(By.xpath("(//ol[@align='center'])[2]"));
		Actions act=new Actions(driver);
		
		//act.moveToElement(src).clickAndHold().moveToElement(dest).release().build().perform();
		
		act.dragAndDrop(src, dest).perform();
		
		Thread.sleep(3000);
		driver.close();
	}
}

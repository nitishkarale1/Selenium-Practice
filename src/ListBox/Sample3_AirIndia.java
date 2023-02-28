package ListBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample3_AirIndia
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.airindia.in/");
		
		driver.findElement(By.xpath("//label[@id='lblOneWay']")).click();
		
		//Autosuggestion handled
		driver.findElement(By.xpath("//input[@id='from']")).sendKeys("Aur");
		List<WebElement> allEle = driver.findElements(By.xpath("(//ul[contains(@class,'ui-autocomplete ui-front')])[2]/li"));
		for(WebElement e1:allEle)
		{
			String act_text=e1.getText();
			String exp_text="Aurangabad, Chikkalthana Airport, IXU, India, IN";
			if(act_text.equals(exp_text))
			{
				e1.click();
				break;
			}
		}
		
		
		driver.findElement(By.xpath("//input[@id='to']")).sendKeys("Del");
		List<WebElement> allEle1 = driver.findElements(By.xpath("(//ul[contains(@class,'ui-autocomplete ui-front')])[3]/li"));
		
		for(WebElement e2:allEle1)
		{
			String act_text2=e2.getText();
			String exp_text2="Delhi, Indira Gandhi International Airport, DEL, India, IN";
			
			if(act_text2.equals(exp_text2))
			{
				e2.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("(//img[@title='Date Picker'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='20'])[1]")).click();
		
		WebElement concessionType = driver.findElement(By.xpath("//select[@id='concessionaryType1']"));
		Select s1=new Select(concessionType);
		s1.selectByValue("Student");
		
		WebElement classType=driver.findElement(By.xpath("//select[@id='_classType1']"));
		Select s2=new Select(classType);
		s2.selectByValue("Economy");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='submit'])[4]")).click();
		Thread.sleep(3000);
		
	}
	
}

package SeleniumStarted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAMINEENABLED
{
	public static void main(String[]args) throws InterruptedException
	{
ChromeDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Mitravarun/Downloads/learningHTML1.html");
driver.manage().window().maximize();
WebElement e1=driver.findElement(By.id("121"));
if(e1.isDisplayed()&& e1.isEnabled())
{
	e1.sendKeys("manish1710");
}
else
{
System.out.println("cant perform action since it is not displayed or Enabled");	
}
WebElement baby=driver.findElement(By.id("321"));
if(baby.isSelected())
{
	System.out.println("");
}
else
{
baby.click();	
}

	}
}

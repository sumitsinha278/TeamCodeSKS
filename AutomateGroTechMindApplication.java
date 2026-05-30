package SeleniumStarted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateGroTechMindApplication {
public static void main(String[]args) throws InterruptedException
{
ChromeDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Mitravarun/Downloads/learningHTML1.html");
driver.manage().window().maximize();
WebElement e1=driver.findElement(By.id("1"));
if(e1.isEnabled()&& e1.isDisplayed())
{	
e1.sendKeys("Sumit Sinha");
}
else
{
System.out.println("cant perform action because control is not enabled.");	
}
WebElement e2=driver.findElement(By.id("121"));
if(e2.isDisplayed()&&e2.isEnabled())
{
e2.sendKeys("Sinha");	
}
else
{
System.out.println("Last name is not enabled");	
}
WebElement e3 =driver.findElement(By.id("321"));
if(e3.isSelected())
{
System.out.println("it is selected already");
}
else
{
e3.click();
}
}
}

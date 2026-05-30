package SeleniumStarted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonClickOnMobile
{
	public static void main(String[]args) throws InterruptedException
	{
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.manage().window().maximize();
Thread.sleep(3000);
WebElement li=driver.findElement(By.className("gLFyf"));
li.sendKeys("India Country");
	}
}

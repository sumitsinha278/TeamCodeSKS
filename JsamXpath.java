package SeleniumStarted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsamXpath {
	public static void main(String[]args) throws InterruptedException
	{
ChromeDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Mitravarun/Downloads/learningHTML1.html");
driver.manage().window().maximize();
WebElement e1=driver.findElement(By.xpath("(/html/body/input[i]"));
Thread.sleep(2000);
e1.sendKeys("Manish123");
	}
}

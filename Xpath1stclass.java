package SeleniumStarted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1stclass {
public static void main(String[]args)
{
ChromeDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Mitravarun/Downloads/learningHTML1.html");
driver.manage().window().maximize();
WebElement e1=driver.findElement(By.xpath("(html/body/input)[1]"));
e1.sendKeys("Harsh");
WebElement e2=driver.findElement(By.xpath(("((/html/body/form)[2]/input)[2]")));
e2.click();
WebElement e3=driver.findElement(By.xpath("/html/body/a"));
e3.click();
}
}

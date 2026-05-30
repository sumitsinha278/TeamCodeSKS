package SeleniumStarted;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLink {
	public static void main(String[]args) throws InterruptedException
	{
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.in");
driver.manage().window().maximize();
Thread.sleep(2000);
List<WebElement> list=driver.findElements(By.tagName("a"));
Thread.sleep(2000);
for(int i=0;i<list.size();i++)
{
	//getText method is an abstract method of web element 
	//WAP to print each URL of all the links in the given page of a website
	//getDomAttribute method give the value of all the mentioned item like id,URL
	WebElement e1=list.get(i);
	String s1=e1.getText();
	String url=e1.getDomAttribute("href");
	System.out.println(s1);
	System.out.println(url);
}

	}
}

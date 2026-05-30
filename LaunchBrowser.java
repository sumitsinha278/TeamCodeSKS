package SeleniumStarted;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
public class LaunchBrowser {
public static void main(String[]args) throws InterruptedException
{
ChromeDriver driver=new ChromeDriver();	
driver.get("https://www.amazon.in");
Thread.sleep(3000);
String title=driver.getTitle();
System.out.println(title);
//EdgeDriver driver1=new EdgeDriver();
String url=driver.getCurrentUrl();
System.out.println(url);
String Parentid=driver.getWindowHandle();
System.out.println(Parentid);
Set<String>pcid=driver.getWindowHandles();
System.out.println(pcid);
Options ol= driver.manage();
Window w1=ol.window();
w1.maximize();
WebElement SearchTextBox=driver.findElement(By.id("twotabsearchtextbox"));
SearchTextBox.sendKeys("mens shoes");
WebElement SearchProduct=driver.findElement(By.id("nav-search-submit-button"));
driver.manage().window().maximize();
SearchProduct.click();
WebElement item=driver.findElement(By.className("_c2Itd_image_3UiYm _c2Itd_center_23yFZ"));
item.click();
}
}

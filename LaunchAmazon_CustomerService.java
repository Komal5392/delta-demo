//Launch Amazon click on Customerservice using Linktext locator
package PracticeSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchAmazon_CustomerService {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.linkText("Customer Service"));
		e1.sendKeys(Keys.ENTER);
	}
}
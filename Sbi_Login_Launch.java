package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sbi_Login_Launch {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement e1=driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		e1.click();
		
		WebElement e2=driver.findElement(By.id("username"));
		e2.sendKeys("Komal");
		
		WebElement e3=driver.findElement(By.id("label2"));
		e3.sendKeys("Komal");
		
		WebElement e4=driver.findElement(By.id("Button2"));
		e4.click();
	}

}

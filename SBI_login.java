package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		e1.click();
		
		WebElement e2=driver.findElement(By.name("userName"));
		e2.sendKeys("Komal");
		e2.click();
		
		WebElement e3=driver.findElement(By.name("password"));
		e3.sendKeys("Komal");
		e3.click();
	}

}

package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.xpath("(//div[.='Fashion'])[1]"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		
		WebElement e2=driver.findElement(By.xpath("//a[.='Men Footwear']"));
		a1.moveToElement(e2).perform();
		
		WebElement e3=driver.findElement(By.linkText("Men's Sports Shoes"));
		Thread.sleep(3000);
		e3.click();
		
	}

}

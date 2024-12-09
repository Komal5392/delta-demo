package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAM {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dell/Downloads/grotechminds.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("1")).sendKeys("Komal");
		driver.findElement(By.id("2")).sendKeys("Enter Your name");
		driver.findElement(By.id("3")).sendKeys("Komal");
		driver.findElement(By.name("fname")).sendKeys("Komal");
		driver.findElement(By.linkText("Submit")).click();
	}

}

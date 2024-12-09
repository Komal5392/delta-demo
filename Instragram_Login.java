package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instragram_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("komalsah943@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Abs@1234");
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
	}

}

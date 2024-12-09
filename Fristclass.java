package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fristclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://www.amazon.in");
		c1.manage().window().maximize();
		c1.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
		c1.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	}

}

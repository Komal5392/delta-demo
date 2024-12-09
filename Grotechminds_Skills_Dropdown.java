package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Grotechminds_Skills_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1=driver.findElement(By.id("Skills"));
		Select s1=new Select(e1);
		s1.selectByIndex(1);
		Thread.sleep(3000);
		s1.selectByValue("none");
		Thread.sleep(3000);
		s1.selectByVisibleText("Non-Technical Skills");
		Thread.sleep(3000);
		driver.close();
	}

}

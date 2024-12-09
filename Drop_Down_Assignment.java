//WAP to select the dropdowns skills,country and Religion in the Grotechminds registration page
package DropDown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Drop_Down_Assignment {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.id("Skills"));
		Select s1=new Select(e1);
		s1.selectByIndex(2);
		Thread.sleep(3000);
		
		WebElement e2=driver.findElement(By.id("Country"));
		Select s2=new Select(e2);
		s2.selectByValue("Bhutan");
		Thread.sleep(3000);
		
		WebElement e3=driver.findElement(By.name("Relegion"));
		Select s3=new Select(e3);
		s3.selectByVisibleText("Hindu");
		Thread.sleep(3000);
		driver.close();
	}

}

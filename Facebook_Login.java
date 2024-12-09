package PracticeSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class Facebook_Login {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("komalsah943@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abc@1234");
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
		//Thread.sleep(5000);
		//driver.close();
	}

}

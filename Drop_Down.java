package DropDown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Drop_Down {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(e1);
		//s1.selectByIndex(2);
		//s1.selectByValue("search-alias=appliances");
		s1.selectByVisibleText("Audible Audiobooks");
		Thread.sleep(3000);
		driver.close();
	}

}

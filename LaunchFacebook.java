//"Assignment 79- Wap to login to facebook application using selenium"
package PracticeSelenium;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchFacebook {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
}
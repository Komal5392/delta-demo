package launcingAmazon;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class launchQuit {
	@BeforeMethod
	public void launch() {
		System.out.println("Launching Browser");
	}
	@AfterMethod
	public void quit() {
		System.out.println("logout Closing Browser");
	}
}

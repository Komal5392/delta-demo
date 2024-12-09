package PracticeSelenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Skip_Program {
@Test
public void login() {
	Assert.assertTrue(false);
}
@Test(dependsOnMethods="login")
public void logout() {
	
}
}

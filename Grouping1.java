import org.testng.annotations.Test;

public class Grouping1 {
@Test(groups= {"smoke","system"})
	public void method1() {
	
}
@Test(groups= {"sanity"})
public void method2() {
	
}
@Test(groups= {"smoke"})
public void method3() {
	
}
@Test
public void method4() {
	
}
@Test(groups= {"smoke"})
public void method5() {
	
}}
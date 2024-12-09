//"Assignment 13 WAP on thread class (thread.sleep)"
package ab46;
public class assignment13 {
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			System.out.println(Math.random());
			Thread.sleep(3000);
		}
	}
}
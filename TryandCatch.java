package ab46;

public class TryandCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int [] numbers= {1,2,3};
			System.out.println("Ele inx 3"+numbers [3]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error");
			
		}
	}

}

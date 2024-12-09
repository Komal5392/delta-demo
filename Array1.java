package ab46;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a1[]=new String[3];
		a1[0]="Komal";
		a1[1]="Vishal";
		a1[2]="Avinash";
		//System.out.println(Arrays.toString(a1));
		for (int i=0;i<a1.length;i++) {
			//System.out.println(a1[i]);
		}
		for (String ele : a1) {
			System.out.println(ele);
		}
		
	}

}

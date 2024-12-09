package ab46;

import java.util.LinkedList;

public class LinkedList_Program {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(15);
		l.addFirst(20);
		l.addLast(25);
//		l.add(0, 15);
		l.add(15);
//		l.add(null);
//		l.add(null);
		l.add(14);
		System.out.println(l);
		//Collections c=l.sort(null);
	}

}

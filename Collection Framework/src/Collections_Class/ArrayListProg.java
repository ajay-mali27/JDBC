package Collections_Class;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProg {
	public static void main(String[] args) {
		ArrayList<Integer> AL = new ArrayList<>();

		AL.add(45);
		AL.add(23);
		AL.add(98);
		AL.add(87);
		AL.add(5);
		AL.add(4);

//		System.out.println(AL);
//		We want to sort this elements
//		Collections.sort(AL);
//		System.out.println("After Sorting :"+AL);

//		Duplicate Elements Allowed. But not in insertion order.

//		Collections.shuffle(AL);
//		System.out.println(AL);
		
//		Print Maxium No
//		System.out.println(Collections.max(AL));
//		System.out.println(Collections.min(AL));
		Collections.reverse(AL);
		System.out.println(AL);
	}
}

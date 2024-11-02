package ArraysListConcept;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String[] args) {
		
		//Default capacity = 10.
		ArrayList<Object> ar = new ArrayList<Object>();
		
		System.out.println(ar.size()); //Physical capacity = 0
		
		ar.add(100);
		
		System.out.println(ar.size()); //Physical capacity = 1
		
		ar.add(200);
		ar.add(300);
		ar.add(400);
		
		System.out.println(ar.size()); //Physical capacity = 4
		
		//Capacity = 20
		ArrayList<String> ar1 = new ArrayList<String>(20);
		ar1.add("hello");
		
		
	}

}

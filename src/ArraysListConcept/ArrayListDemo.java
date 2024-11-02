package ArraysListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//ArrayList implements List interface
		//Dynamic array
		
		//1. Default generics:
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(100);
		ar.add(200);
		ar.add("testing");
		ar.add('t');
		ar.add(12.33);
		ar.add(true);
		
		System.out.println(ar); //[100, 200, testing, t, 12.33, true]
		System.out.println(ar.get(2)); //testing
	//	System.out.println(ar.get(6)); //IndexOutOfBoundsException
	//	System.out.println(ar.get(-1)); //IndexOutOfBoundsException
		
		System.out.println(ar.size()); //6
		
		ar.add(400);
		ar.add(14.56f);
		System.out.println(ar); //[100, 200, testing, t, 12.33, true, 400, 14.56]
		System.out.println(ar.size()); //8
		
		System.out.println("**********");
		
		//Iterating elements in arraylist:
		//using for loop:
		for(Object ele : ar) {
			System.out.println(ele);
		}
		
		System.out.println("**********");
		
		//JDK 8 - streams with lambda:
		ar.stream().forEach(ele -> System.out.println(ele));
		
		System.out.println("**********");
		
		//iterator::
		Iterator<Object> it = ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//List with other collection:
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Java","Python","C","C++","PHP"));
		System.out.println(names);
		names.add("Ruby");
		System.out.println(names);
		
		
		
		
		
	}

}

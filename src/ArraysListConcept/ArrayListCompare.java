package ArraysListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		
		//1. Sort and then equals:
		ArrayList<String> s1 = new ArrayList<String>(Arrays.asList("A", "B","C","D","F"));
		ArrayList<String> s2 = new ArrayList<String>(Arrays.asList("A", "B","C","D","E"));
		ArrayList<String> s3 = new ArrayList<String>(Arrays.asList("B", "A","C","D","F"));
		
		/** sorting lists*/
		Collections.sort(s1);
		Collections.sort(s2);
		Collections.sort(s3);
		
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1.equals(s3)); //true
		
		//2. compare two lists - find out the additional elements:
		ArrayList<String> s4 = new ArrayList<String>(Arrays.asList("A", "B","C","D","F"));
		ArrayList<String> s5 = new ArrayList<String>(Arrays.asList("A", "B","C","D","E"));
		
//		s4.removeAll(s5);
//		System.out.println(s4); //[F]
		
		//3. find out missing elements:
//		s5.removeAll(s4);
//		System.out.println(s5); //[E]
		
		//4. find out the common elements:
		s4.retainAll(s5);
		System.out.println(s4); //[A, B, C, D]
		
		
		
		
	}

}

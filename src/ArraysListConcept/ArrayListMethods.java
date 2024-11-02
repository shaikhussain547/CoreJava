package ArraysListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("java");
		ar1.add("python");
		ar1.add("ruby");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("testing");
		ar2.add("dev ops");
		ar2.add("ruby"); //ArrayList allows duplicate values
		
//		ar1.addAll(ar2);
		System.out.println(ar1); //[java, python, ruby, testing, dev ops, ruby]
		
//		ar1.addAll(2, ar2);
		System.out.println(ar1); //[java, python, testing, dev ops, ruby, ruby]
		
//		ar1.clear();
		System.out.println(ar1); //[]
		
//		ar1.remove(2);
		System.out.println(ar1); //[java, python]
		
		ArrayList<String> cloneList = (ArrayList<String>)ar1.clone();
		System.out.println("Clone list"+ cloneList);
		
		System.out.println(ar1.contains("python")); //true
		System.out.println(ar1.contains("js")); //false
		
		System.out.println(ar1.indexOf("python")); //1
		System.out.println(ar1.indexOf("python") > 0); //true
		
		ArrayList<String> ar3 = new ArrayList<String>(Arrays.asList("John","Tom","Wick","Nick","Wick"));
		System.out.println(ar3); //[John, Tom, Wick, Nick,Wick]
		System.out.println(ar3.lastIndexOf("Wick")); //4
		ar3.remove("Wick");
		System.out.println(ar3); //[John, Tom, Nick, Wick]
		
		
		ArrayList<Integer> ar4 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		ar4.removeIf(num -> num % 2 == 0);
		System.out.println(ar4); //[1, 3, 5, 7, 9]
		
		ArrayList<String> ar5 = new ArrayList<String>(Arrays.asList("John","Tom","Wick","Nick","Wick"));
		ar5.retainAll(Collections.singleton("Wick"));
		System.out.println(ar5); //[Wick, Wick]
		
		ArrayList<Integer> ar6 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		ArrayList<Integer> sublist = new ArrayList<Integer>(ar6.subList(2, 6));
		System.out.println(sublist); //[3, 4, 5, 6]
		
		Object arr[] = ar6.toArray();
		System.out.println(Arrays.toString(arr)); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		
		for (Object num : arr) {
			System.out.print(num);
		}
		
		System.out.println();
		
		
		
	}

}

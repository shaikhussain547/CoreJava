package CollectionsInterviewQues;

import java.util.*;

public class SortTwoArrays {

	public static void main(String[] args) {
		
        int[] arr1 = {4, 2, 3, 1};
        int[] arr2 = {7, 5, 6, 8};
        
        ArrayList al1 = new ArrayList();
        ArrayList al2 = new ArrayList();
        
        for(int num : arr1) {
        	al1.add(num);
        }
        
        System.out.println(al1);
        
        for(int num : arr2) {
        	al2.add(num);
        }
        
        System.out.println(al2);
        
        al1.addAll(al2);
        Collections.sort(al1);
        System.out.println(al1);

        
        

	}


}

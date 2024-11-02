package BasicJava;

public class ArrayConcept {

	//An array is a collection which can store multiple values of same data type.
	//It holds a fixed number of values, decided at the time of array declaration.
	//Each value stored in an array is called as an element.
	//Each element in an array is accessed, stored and retrieved using its position in the array, called index.
	//
	
	public static void main(String[] args) {
		int[] marks = {200, 250, 234, 280}; //Type 1
		System.out.println(marks.length);//4
		System.out.println(marks[2]);
		
		for(int j=0;j<marks.length;j++) {
			System.out.println(marks[j]);
		}
		
		String names[] = {"Ravi","Balu","Soni","Venky"};
		System.out.println(names.length);//4
		System.out.println(names[1]);
		
		double [] CGPA = new double[3]; //Type 2
		CGPA[0] = 68.55;
		CGPA[1] = 76.44;
		CGPA[2] = 84.66;
		System.out.println(CGPA.length);//3
		
		long numbers[] = new long [2];
		numbers[0] = 987654321L;
		numbers[1] = 765483212L;
		System.out.println(numbers.length);//2
		
		for(int j=0;j<names.length;j++) {
			System.out.println(names[j]);
		}
		
		
		//Object Array : To stores multiple datatypes values.
		Object [] details = new Object[6];
		details[0] = "Hussain";
		details[1] = 100123;
		details[2] = 172.5;
		details[3] = '$';
		details[4] = 9177223322L;
		details[5] = 143.45f;
		
		System.out.println(details.length);
		System.out.println(details[3]);
		for(int j=0;j<details.length;j++) {
			System.out.println(details[j]);
		}
		
		Object[] info = {"ravi",180,12.33,'#'};
		for(int j=0;j<info.length;j++) {
			System.out.println(info[j]);
		}
	}
}
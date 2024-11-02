package BasicJava;

import java.util.Scanner;

public class InputConcept {

	/* Input in Java
	 *  1. Scanner class can be used to take input from the user.
	 *  2. We create a Scanner object named scanner that reads from the standard input stream (System.in).
	 *  3. scanner.nextLine() --> to read the input as String.
	 *  4. scanner.nextInt() --> to read the input as Int.
	 *  5. scanner.nextDouble() --> to read the input as Double.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String fullName;
		System.out.print("Enter name : ");
		fullName = sc.nextLine();
		System.out.println("Name : "+fullName);
		
		int age;
		System.out.print("Enter age : ");
		age = sc.nextInt();
		System.out.println("Age : "+age);
		
		double height;
		System.out.print("Enter height : ");
		height = sc.nextDouble();
		System.out.println("Height : "+height);
		
		String name;
		System.out.print("Enter name : ");
		name = sc.next();
		System.out.println("Name : "+name);
		
		sc.close();
		
		
	}

}

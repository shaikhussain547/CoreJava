package interviewQuestions;

import java.util.Scanner;

public class InputUsingScanner {

	public static void main(String[] args) {
		int num;
		float b;
		String s;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
		s = in.nextLine();
		System.out.println("You entered string "+s);
		System.out.println("Enter an integer");
		num = in.nextInt();
		System.out.println("You entered integer "+num);
		System.out.println("Enter a float");
		b = in.nextFloat();
		System.out.println("You entered float "+b);
	}

}

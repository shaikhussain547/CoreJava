package interviewQuestions;

import java.util.Scanner;

public class MaximumInThree {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter num2");
		int num2 = sc2.nextInt();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter num3");
		int num3 = sc3.nextInt();
		
		System.out.println(num1+", "+num2+", "+num3);
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1);
		}else if(num2 > num3) {
			System.out.println(num2);
		}else {
			System.out.println(num3);
		}
		
		
		
	}

}

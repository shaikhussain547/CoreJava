package BasicJava;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1. Patterns :
/*		char st = '*';
		int num = 5;
		for(int i=1; i <= num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(st+"  ");
			}
			System.out.println();
		}
*/		
		//2. Patterns :
/*		for(int i=num; i >= 1; i--) {
			for(int j=1; j <= i; j++) {
				System.out.print(st+"  ");
			}
			System.out.println();
		}
*/		
		//3. Sum of digits in a number : while
/*		int num;
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		int sum = 0;
		while(num > 0) {
			int temp = num;
			sum = sum + temp%10;
			num = num/10;
		}
		System.out.println("Sum : "+sum);
*/		
		//3. Sum of digits in a number : do-while
/*		int num;
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		int sum = 0;
		do {
			int temp = num;
			sum = sum + temp%10;
			num = num/10;
		}while(num > 0);
		System.out.println("Sum : "+sum);
*/
		//Largest of three numbers :
/*		int a = 2100, b = 250, c = 350;
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		System.out.println("Max : "+max);
*/
		//Largest of three numbers :
/*		int a = 100, b = 250, c = 350;
		int max = Math.max(a, Math.max(b, c));
		System.out.println(max);
*/
		//Alphabet case check :
/*		char ch = '%';
		if(ch > 'a' && ch < 'z') {
			System.out.println("Lower Case");
		}else if(ch > 'A' && ch < 'Z'){
			System.out.println("Upper Case");
		}else {
			System.out.println("Other character");
		}
*/
		//Fibonacci number :0, 1, 1, 2, 3, 5,8 , 13,....
/*		int a = 0; //first number
		int b = 1; //second number
		int n = 5;
		int fbn = 0;
		for(int i=3; i <= n; i++) {
			int c = a +b;
			fbn = c;
			a = b;
			b = c;
		}
		System.out.println("fibonacci number : "+fbn);
*/	
		//Sum of first n natural numbers :
/*		int num; //1, 2, 3,....n
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		int sum = 0;
		while(num > 0) {
			sum = sum + num;
			num = num - 1;
		}
		System.out.println("Sum : "+sum);
*/
		//Reverse of a number :
/*		int num;
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		int rev = 0;
		while (num > 0) {//123
			int temp = num%10;
			rev = rev*10 + temp;
			num = num/10;
		}
		System.out.println("Reverse of the number is : "+rev);
*/		
		//Counting occurence :
/*		int fn = 142227;
		int sn = 2;
		int count = 0;
		while(fn > 0) {
			int rem = fn%10;
			if(rem == sn) {
				count++;
			}
			fn = fn/10;
		}
		System.out.println(count);
*/
		//Char pyramid : A -> 65, a -> 97
		char ch = 'A';
		int num = 5;
		for(int i = 1; i < num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}

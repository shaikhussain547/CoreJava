package interviewQuestions;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 10;
		
		//Swap with using third var : t
		int t;
		t = x; //5
		x = y; //10
		y = t; //5
		System.out.println("x value: "+x);
		System.out.println("y value: "+y);
		
		//Swap without using third var: x = 10, y = 5, using + operator:
		x = x+y; //15
		y = x-y; //10
		x = x-y; //5
		
		System.out.println("x value: "+x);
		System.out.println("y value: "+y);
		
		//Swap without using third var: x = 5, y = 10, using * operator:
		x = x*y; //50
		y = x/y; //5
		x = x/y; //10
		
		System.out.println("x value: "+x);
		System.out.println("y value: "+y);
		
		//Swap without using third var: x = 10, y = 5, using ^(XOR) operator:
		
		x = x ^ y; 
		y = x ^ y; //10
		x = x ^ y; //5
		
		System.out.println("x value: "+x);
		System.out.println("y value: "+y);
		
	}
}

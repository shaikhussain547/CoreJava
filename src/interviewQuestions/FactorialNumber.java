package interviewQuestions;

public class FactorialNumber {
	
	//fact of 3 = 3 * 2 * 1 = 6
	//fact of 4 = 4 * 3* 2* 1 = 24
	//fact of 5 = 5 * 4 * 3 * 2 * 1 = 120
	
	//1. without recursive -- use for loop
	public static int getFactorial(int num) {
		int fact = 1;
		for(int i=num; i>0; i--) {
			fact = fact * i;
		}
		return fact;
	}

	//2. with Recursive function: a funciton is calling itself
	public static int getFact(int num) {
		if(num==0)
			return 1;
		else
			return (num * getFact(num-1));
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(getFactorial(0));
		System.out.println(getFact(4));
		
		
		
	}

}

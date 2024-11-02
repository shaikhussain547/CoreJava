package interviewQuestions;

public class DivideByZero {

	public static void main(String[] args) {
		
		//Number = Integer, Double, Float,..
		
	//	System.out.println(9/0); //ArithmeticException
	//	System.out.println(9.0/0); //Infinity
		System.out.println(12.33f/0); //Infinity
		System.out.println(10/0.0); //Infinity
		System.out.println(19.9999d/0); //Infinity
	//	System.out.println(0/0); //ArithmeticException
		System.out.println(0.0/0); //Nan
		System.out.println(0/0.0); //Nan
		System.out.println(0.0/0.0); //Nan
		System.out.println(12.33/0.0); //Infinity
	}

}

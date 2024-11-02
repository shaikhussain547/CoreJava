package interviewQuestions;

public class NotANumber {
//DivideByZero.java
	public static void main(String[] args) {
		
		System.out.println(0.0/0); //Nan
		System.out.println(0/0.0); //Nan
		System.out.println(0.0/0.0); //Nan
		
		System.out.println(Float.NaN == Float.NaN); //false
		System.out.println(Float.NaN != Float.NaN); //true
		
		//Two NaN cannot be compare:
		
	}

}

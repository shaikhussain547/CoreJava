package ExceptionHandling;

public class Application {
	
	//An Exception is an unwanted event that interrupts the normal flow of the program.
	//The runtime errors shown previously are called as exceptions and the process of handling the exceptions is known as Exception Handling.
	//The try block contains a set of statements where an exception can occur.
	//A catch block is where you handle the exceptions, i.e., the catch block specifies what is to be done when an exception occurs.
	
	//When a try-catch block is present inside another try block then it is called a nested try-catch block. 
	//If the inner catch block is not able to handle the exception raised in the inner try block, then the execution moves to the outer catch block.
	
	//A finally block contains all the crucial statements that must be executed irrespective of whether an exception occurs or not.
	//The statements present in this block will always execute regardless of whether an exception occurs in a try block or not. 
	//finally block is optional and can be used only with a try-catch block.
	
	//In Java, we can define our own set of conditions or rules and throw an exception explicitly using throw keyword.
	
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		try {
			m3();
		}catch(ArithmeticException e) {
			System.out.println("AE is coming....");
			//report -- PASS/FAIL
			//screenshot
			//logs
		}
	}
	
	public void m3() {
		System.out.println("m3 method");
		int i = 9/0;
	}

	public static void main(String[] args) {
		
		Application obj = new Application();
		
		obj.m1();
		
		System.out.println("Bye");
	}

}

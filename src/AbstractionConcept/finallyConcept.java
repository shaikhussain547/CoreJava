package AbstractionConcept;

public class finallyConcept {
	//finally is a block
	public static void main(String[] args) {
		
		test1();
		division();
		
	
	}
	
	public static void test1() {
		try {
			System.out.println("Inside test1 method");
			throw new RuntimeException("test");
		}catch(Exception e) {
			System.out.println("Inside catch block");
		}
		
		finally {
			System.out.println("Inside finally blcok");
		}
		
	}
	//
	public static void division() {
		int i = 10;
		try {
			System.out.println("Inside try block - division method");
			int k = i/0;
		}catch(ArithmeticException e) {
			System.out.println("Inside catch block - division method");
			System.out.println("Divide by zero error");
		}finally {
			System.out.println("execute this code even after any exception");
		}
	}
	
	
}

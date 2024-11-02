package functionsOrMethodsInJava;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		int result = obj.pqr();
		System.out.println(result);
		obj.division(10, 5);
		
		
	}
	
	//1. Non - Static methods
	
	//void -- does not return any value
	//return type = void
	public void test() { //no input, no output
		System.out.println("Test method");
	}
	
	//return type = int
	public int pqr() { //no input, some output
		System.out.println("Pqr method");
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
	}
	
	//x,y --> input parameters/arguments
	public int division(int x, int y) {//some input, some output
		System.out.println("division method");
		int d = x/y;
		System.out.println(d);
		return d;
	}
	
	
}

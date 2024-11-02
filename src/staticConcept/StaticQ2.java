package staticConcept;

public class StaticQ2 {
	
	static {
		System.out.println("Static block");
	}
	
	public static void test() {
		System.out.println("test method");
	}
	
	public static void cover() {
		System.out.println("cover method");
		test();
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method");
		test(); //without create obj, can call static methods
		StaticQ2.test(); //can call static methods with class name
		cover();
	}

}

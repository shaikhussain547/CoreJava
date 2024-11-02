package staticConcept;

public class StaticQ4 {
	
//	static int age = 22;
//	static final int age = 22;
	final int age = 22;
	
	static {
		System.out.println("Static block1");
	}
	static {
		System.out.println("Static block2");
	}
	static {
		System.out.println("Static block3");
	}
	
}

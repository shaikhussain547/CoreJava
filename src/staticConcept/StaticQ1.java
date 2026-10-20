package staticConcept;

public class StaticQ1 {
	
	//Static block execute before main method
	//In Java, static blocks (also called static initializers) are blocks of code used to initialize static variables 
	//or execute some logic when a class is loaded.
	//A class can have multiple static blocks. They execute in the order in which they appear in the source code.
	static {
		System.out.println("Static block1");
	}
	static {
		System.out.println("Static block2");
	}
	static {
		System.out.println("Static block3");
	}

	public static void main(String[] args) {
		
		System.out.println("Main method");
		
	}
	
	static {
		System.out.println("Static block4");
	}
	
}

package staticConcept;

public class StaticQ1 {
	
	//Static block execute before main method
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

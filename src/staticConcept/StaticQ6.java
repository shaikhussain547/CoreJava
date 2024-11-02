package staticConcept;

public class StaticQ6 {
	
	static {
		System.out.println("Static Block");
	}
	
	{
		System.out.println("Instance Initialization Block");
	}

	StaticQ6(){
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		
		System.out.println("Main method");
		new StaticQ6();
	}

}

package oopConcept;

public class TestSuperConcept extends SuperConcept {
	
	TestSuperConcept(){
		super();
		System.out.println("Child Class Constructor -- Test Super Concept Class");
	}

	public static void main(String[] args) {
		TestSuperConcept tsc = new TestSuperConcept();
	}

}

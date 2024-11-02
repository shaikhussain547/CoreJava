package staticConcept;

public class TestBlock {

	public static void main(String[] args) {
		
	//	StaticQ3 obj = new StaticQ3(); //can not able to create obj for private const class
		
		System.out.println(StaticQ3.createObj());
		
	//	StaticQ4 q4 = new StaticQ4();
	//	System.out.println(StaticQ4.age);
		System.out.println(new StaticQ4().age);
		
	}

}

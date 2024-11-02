package staticConcept;

public class StaticQ5 {
	
	String name;
	static int age;
	
	static {
		StaticQ5 obj = new StaticQ5();
		obj.name = "John";
		age = 35;
		System.out.println(obj.name+" -- "+age);
	}

	public static void main(String[] args) {
		
		
	}

}

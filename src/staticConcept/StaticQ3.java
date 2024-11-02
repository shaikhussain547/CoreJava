package staticConcept;

public class StaticQ3 {
	//How can we create objects if we make the constructor private
	int age;
	
	static {
		StaticQ3 obj1 = new StaticQ3();
	}
	
	public static int createObj() {
		StaticQ3 obj2 = new StaticQ3();
		obj2.age = 40;
		return obj2.age;
	}
	
	private StaticQ3(){
		age = 30;
		System.out.println("constructor : "+age);
	}

	public static void main(String[] args) {
		
		StaticQ3 obj = new StaticQ3();
		System.out.println("main : "+obj.age);
		
	}

}

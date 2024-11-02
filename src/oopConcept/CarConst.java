package oopConcept;

public class CarConst {
	
	String name;
	int price;
	String engine;
	
	//"this" is a reference variable that refers to the current object. 
	// this() is used to invoke the constructor of the current class
	// Since no parameters are specified, parameterless constructor will be invoked.
	
	public CarConst() {
		System.out.println("Parameterless constructor");
	}
	
	public CarConst(String name, int price, String engine) {
		this();
		this.name = name;
		this.price = price;
		this.engine = engine;
	}
	
	public void details() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(engine);
	}

	public static void main(String[] args) {
		
		CarConst obj1 = new CarConst("BMW", 10, "Automatic");
//		CarConst obj2 = new CarConst("Audi", 20, "Automatic");
//		CarConst obj3 = new CarConst("Honda", 5, "Manual");
		
		obj1.details();
//		obj2.details();
//		obj3.details();
		
	}

}

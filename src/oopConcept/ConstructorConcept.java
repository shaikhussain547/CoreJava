package oopConcept;

public class ConstructorConcept {
	
	//Class variables:
	String name;
	int age;
	
	public ConstructorConcept() {//0 parameter constructor
		System.out.println("Default Constructor");
	}
	
	public ConstructorConcept(int i) {//1 parameter constructor
		System.out.println("1 parameter Constructor");
		System.out.println(i);
	}
	
	public ConstructorConcept(int i, int j) {//2 parameters constructor
		System.out.println("2 parameters Constructor");
		System.out.println(i+"  "+j);
	}
	
	public ConstructorConcept(String name, int age) {
		this.name = name; //"this" means current class
		this.age = age; //this.class_var = local_var
	}
	
	public void details() {
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10,20);
		ConstructorConcept obj3 = new ConstructorConcept("Tom",25);
//		obj2.details();//null,0
		obj3.details();//Tom,25
		
	}
	
	//Constructor is not a function/method.
	//Constructor name is same as class name.
	//A constructor in Java is a special method that is used to initialize class variables at the time of object creation. 
	
}

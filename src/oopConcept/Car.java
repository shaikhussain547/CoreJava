package oopConcept;
//Class and Objects
public class Car {
	
	//Global or Class variables:
	int mod;
	int wheel;
	
	public static void main(String[] args) {
		
		//new Car(); --> is a object of Class Car
		//new keyword is used to create the object
		//a,b,c -->object reference variables
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2015;
		a.wheel = 4;
		
		b.mod = 2016;
		b.wheel = 4;
		
		c.mod = 2014;
		c.wheel = 4;
		
		System.out.println("Before assigning the references");
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		System.out.println(b.mod);
		System.out.println(b.wheel);
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		System.out.println("After assigning the references");
		
		a=b;
		b=c;
		c=a;
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		System.out.println(b.mod);
		System.out.println(b.wheel);
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		a.mod = 10;
		System.out.println(a.mod); //10
		System.out.println(c.mod); //10
		c.mod = 20;
		System.out.println(a.mod); //20
		System.out.println(c.mod); //20
		
		
		
	}
}

package inheritanceConcept;

public class TestCar {
	//Polymorphism is the ability of an object to take different forms, i.e., a single action that can be performed in different ways.
	//So, polymorphism means many forms.
	public static void main(String[] args) {
		
		//static polymorphism / compile-time polymorphism:
		//Polymorphism that gets resolved during compile time is known as static polymorphism or compile time polymorphism.
		//This polymorphism is achieved using overloading of the methods in the same class, called as Method overloading.
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		System.out.println("******");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		System.out.println("******");
		
		//Top casting
		Car c1 = new BMW(); //child class object can be referred by parent class reference variable -- dynamic polymorphism --> run time polymorphism
		c1.start();
		c1.stop();	//only overriden methods and parent methods can be accessible by using run time/dynamic polymorphism.
		c1.refuel(); //This type of polymorphism is achieved using overriding the parent method in the child class, called as Method Overriding.
		c1.engine();
		
		//Down casting is not allowed
		//BMW b1 = (BMW)new Car(); //ClassCastException
		
		
		
	}

}

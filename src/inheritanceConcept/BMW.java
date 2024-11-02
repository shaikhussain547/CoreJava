package inheritanceConcept;
//Method Overriding
public class BMW extends Car{//"has-a relationship"
	
	//Method overriding - When same method is present in parent class as well as in child class
	//with the same name and same number of arguments, is called Method Overriding.
	
	public void start() {//Overridden method
		System.out.println("BMW----start");
	}
	
	public void theftSafety() {
		System.out.println("BMW----theftSafety");
	}
	
}

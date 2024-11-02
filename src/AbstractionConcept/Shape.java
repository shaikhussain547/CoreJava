package AbstractionConcept;
//Abstract class

/* Similarly, objects in OOP provide an abstraction that hides the internal implementation details. 
 *  You just need to know the methods that are available to call and the input parameters required to call a method -
 *  - but you don’t need to know how the method is implemented.
 */
public abstract class Shape {
	
	//hiding the implementation logic -- is called Abstraction
	//partial abstraction
	//Abs class can have abs methods and non abs methods
	//can not create the object of abstract classes
	
	Shape(){
		System.out.println("Shape class constructor");
	}
	
	int color;
	
	abstract void drawing();
	
	public void fill() {
		System.out.println("Shape -- fill");
	}
	
	//can not create object of interface
	
	/* Access modifiers : They are used to specify access levels to control the visibility of a class and its members.
	 * 		Public : Accessible from any other class.
	 * 		Private : Accessible only inside its own class.
	 * 		Protected : Accessible inside the same package and to the sub-classes in different packages.
	 * 		Default : Accessible inside the same package. Members created without any access modifier will have this access.
	 */
	
}

package InterfaceConcept;

public interface RBI {
	
	public void educationLoan();
	
	public void homeLoan();
	
	public void carLoan();
	
	/*Polymorphism is the ability of an object to take different forms, i.e., a single action that can be performed in different ways. 
	 * So, polymorphism means many forms. Polymorphishm is of two types:
	 * 
	 * 1. Static polymorphism:
	 * 		-> Polymorphism that gets resolved during compile time is known as static polymorphism or compile time polymorphism.
	 * 		-> This polymorphism is achieved using overloading of the methods in the same class, called as Method overloading.
	 * 		-> Method overloading allows the programmer to have multiple methods with the same name in the same class, but differing in their signature.
	 * 		-> Signature can differ by
	 * 				a. the number of parameters, the data type of parameters, the order of the parameters.
	 * 		-> Note: We cannot overload methods by their return type, i.e., two or more methods are not overloaded if they differ only in their return type.
	 * 
	 * 2. Dynamic polymorphism
	 * 		-> Similar to static polymorphism or compile time polymorphism, polymorphism can also be achieved at runtime.
	 * 		-> Such type of polymorphism is known as dynamic polymorphism.
	 * 		-> This type of polymorphism is achieved using overriding the parent method in the child class, called as Method Overriding.
	 * 
	 * 		-> Overriding feature allows the programmer to have a different implementation of parent methods with the same signature in the child classes.
	 * 		-> Such parent methods are said to be overridden.
	 * 				a. When we override a method in the child class, it should have the same signature as that of the parent class.
	 * 				b. The method should not have a weaker access modifier.
	 * 				c. Private methods are not overridden.
	 * 
	 * 
	 * Super() keyword:: The super keyword can be used to invoke the constructor of a parent class.
	 * The super keyword can also be used for:
	 * 		->  Invoking a parent class method from a child class method.
	 * 		->  Accessing a parent class instance variable in the child class in case there is a variable in the child class also with the same name.
	 */
}

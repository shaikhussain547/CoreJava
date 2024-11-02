package inheritanceConcept;
//Inheritance
public class Vechile {
	/* When a class inherits from another class, then those classes are said to have inheritance relationship. 
	 * The class which is inheriting is called the child/sub/derived class.
	 * The class which is getting inherited is called the parent/super/base class. 
	 * Inheritance is also called as "is-A" relationship. Inheritance (is-a) is denoted by a line with an arrow head. 
	 * In terms of OOP, a child class inherits all the non-private attributes and methods.
	 * In Java, a child class inherits the parent class using the "extends" keyword.
	 */
	
	int model = 1998;
	
	public void engine() {
		System.out.println("Vechile -- Engine");
	}
}

/*Single Inheritance : one class is extended by only one class.
 * Multilevel inheritance : a class extends another class which extends another class.
 * Hierarchical Inheritance : When more than one class extends the same base class.
 * Multiple Inheritance: In Multiple Inheritance, one class extends multiple classes.(Not supported in Java).
 */

//Advantages of inheritance :
/* 1. Code reusability - The codes are defined only once and can be used multiple times. 
 * 									We define the functionalities in the parent class and any number of child classes can use the functionalities at any time.
 * 2. Saves time and effort due to reusability of code.
 * 3. Inheritance makes the application code more flexible to changes.
 * 4. Inheritance results in better organization of codes into smaller and simpler compilation units which makes the code more readable and easy to debug
 */









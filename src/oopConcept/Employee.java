package oopConcept;
//Class and Object
public class Employee {
	
/*		1. Class is a group of Objects which has common properties.
		2. A class is template or blueprint from which we can create one or more objects.
		3. A class can contains variables and methods.
		4. A class is logical entity.
		5. A prototype or template that helps us design an object's state and behavior.
		
		1. An object is an instance(result) of a class.
		2. Object is a physical entity.
		3. It is a real-world entity of class.			*/
	

	//Global or Instance Variables or class variables
	int empID;
	String empName;
	double salary;
	
	//Method
	public void display() {
		System.out.println(empID);
		System.out.println(empName);
		System.out.println(salary);
	}
	
	//Constructor
/*	Employee(int ID, String Name, double sal)
	{
		empID = ID;
		empName = Name;
		salary = sal;
	}	*/
	
	//initialize the variables of a class by using method:
	public void initialize(int ID, String Name, double sal)
	{
		empID = ID;
		empName = Name;
		salary = sal;
	}

	public static void main(String[] args) {
//		Different ways to initialize the variables of a class
//		1. Using object reference
		
/*		Employee emp1 = new Employee();
		emp1.empID = 1001;
		emp1.empName = "John";
		emp1.salary = 10234.34;
		emp1.display();
		
		System.out.println("-----------------------");
		
		Employee emp2 = new Employee();
		emp2.empID = 1002;
		emp2.empName = "Wick";
		emp2.salary = 10234.34;
		emp2.display(); 		*/
		
//		2. Using constructor
/*		Employee emp = new Employee(1003, "Steve", 11234.55);
		emp.display();		*/
		
//		3. Using method
		Employee emp3 = new Employee();
		emp3.initialize(1004, "Robort", 12344.66);
		emp3.display();
	}

}

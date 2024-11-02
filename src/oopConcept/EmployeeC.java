package oopConcept;
//Constructor
public class EmployeeC {
	
	int empID;
	String empName;
	double salary;
	
	EmployeeC(){
		System.out.println("Default Constructor");
		empID = 1;
		empName = "John";
		salary = 7865343.45;
	}
	
/*	EmployeeC(int id, String name, double sal){
		empID = id;
		empName = name;
		salary = sal;
	}	*/
	
	EmployeeC(int empID, String empName, double salary){
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println(empID);
		System.out.println(empName);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		
		EmployeeC defEmp = new EmployeeC();
		defEmp.display();
		
		EmployeeC emp = new EmployeeC(1001, "Wick", 987987.23);
		emp.display();
	}

}

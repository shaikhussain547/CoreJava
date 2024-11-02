package encapsulationConcept;

public class EmployeeData {
	
	//Encapsulation is also called data hiding.
	//how to implement Encapsulation:
	
	//1. Private data variables: so that these vars can not be accessed directly from outside the class.
	private int ssn;
	private String empName;
	private int empAge;
	
	public static void main(String[] args) {
		
		EmployeeData emp = new EmployeeData();
		emp.setEmpName("Tom Peter");
		emp.setEmpAge(25);
		emp.setSsn(127653);
		
		System.out.println("Employee name is: "+emp.getEmpName());
		System.out.println("Employee age is: "+emp.getEmpAge());
		System.out.println("Employee ssn is: "+emp.getSsn());
		
		
	}

	//2. getter and setter methods: to set and get the values of the fields.
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}

package oopConcept;

public class StaticConcept {
	
	int studentId;
	String studentName;
	static String collegeName="ABC Institute";
	
	StaticConcept(int id, String name){
		studentId = id;
		studentName = name;
	}
	
	void display() {
		System.out.println(studentId);
		System.out.println(studentName);
		System.out.println(collegeName);
	}
	static void displayCollege() {
		System.out.println(collegeName);
	}

	public static void main(String[] args) {
		
		StaticConcept st1 = new StaticConcept(101, "John");
		st1.display();
		
		StaticConcept st2 = new StaticConcept(102, "Wick");
		StaticConcept.collegeName = "XYZ Institute";
		st2.display();	
		
		
		
	}

}

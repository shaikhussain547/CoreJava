package oopConcept;

public class ThisConcept {
	
	//this() calls another constructor in the same class.
	//super() calls a constructor in the parent class.
	
	int id;
    String name;

    public ThisConcept() {
        this(101, "Rahul"); // Calls parameterized constructor
        System.out.println("Default constructor");
    }

    public ThisConcept(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Parameterized constructor");
    }

	public static void main(String[] args) {
		ThisConcept tc = new ThisConcept();
        System.out.println(tc.id + " " + tc.name);
	}

}

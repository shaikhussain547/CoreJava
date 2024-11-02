package functionsOrMethodsInJava;

public class LocalVsGlobalVariable {
	
	//Global Variables or class variables
	String name = "Tom";
	int age = 25;
	

	public static void main(String[] args) {
		
		int i = 10; // local variable for main method
		
		LocalVsGlobalVariable obj = new LocalVsGlobalVariable();
		System.out.println(obj.age + 5);
	}
	
	public void sum() {
		int i = 15; // local variable for sum method
		int j = 20;
		int age = 25;
	}
}

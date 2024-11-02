package functionsOrMethodsInJava;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 20);
	}
	
//we can overload main method also but different input parameters/arguments	
//you cannot crate a method inside a method.
//duplicate methods -- i.e, same method name with same number of arguments are not allowed.	
//Method Overloading -- When the method name is same with different arguments/input parameter within the same class
	public void sum() {// 0 input parameter
		System.out.println("SUM method -- zero paramerter");
	}
	
	public void sum(int i) {// 1 input parameters
		System.out.println("Sum method -- 1 input parameters");
		System.out.println(i);
	}
	
	public void sum(double i) {
		System.out.println("Sum method -- double data type");
	}
	public void sum(int k, int l) {// 2 input parameters
		System.out.println("Sum method -- 2 input parameters");
		System.out.println(k+l);
	}
	
}

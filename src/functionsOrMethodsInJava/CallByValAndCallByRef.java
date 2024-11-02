package functionsOrMethodsInJava;

public class CallByValAndCallByRef {
	
	int p;
	int q;
/* Call by value / Pass by value : 
 * 		Whenever a value of a primitive data type is passed, the values are copied from the actual parameters to the formal parameters. 
 * 		This kind of parameter passing is known as pass by value.
 * 		In pass by value, both the actual and formal parameters point to different memory locations and the values are copied in both the memory locations.
 * 
 * Call by ref / pass by ref :
 * 		When an object is passed as a parameter, the formal and the actual parameters both refer to the same object and hence the same memory location.
 * 		Therefore, the changes made inside the method to the formal parameters are reflected in the actual parameters also. 
 * 		This kind of parameter passing is known as pass by reference. 
 */
	public static void main(String[] args) {
		
		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		int x = 10;
		int y = 20;
		obj.testSum(x, y);//Call by value or Pass by value
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		//after swap
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	
	
	public int testSum(int a, int b) {
		a = 30;
		b = 40;
		int c = a+b;
		return c;
	}
	
	//call by reference
	public void swap(CallByValAndCallByRef t) {
		int temp;
		temp = t.p; //temp = 50
		t.p = t.q; //t.p = 60
		t.q = temp; //t.q = 50
	}
	
}

package oopConcept;
//Methods
public class Calculation {
	
	int a, b;
	
	//Method with no parameters
	public void sum() { 
		System.out.println("Sum method called: "+(a+b));
	}
	
	//Method with parameters
	public void multiplication(int x, int y) {
		a= x;
		b=y;
		System.out.println("Multiplication method called: "+(a*b));
	}

	public int sub(int x, int y) {
		a= x;
		b=y;
		return (a-b);
	}
	
	public int rem() {
		return (a%b);
	}
	
	
	
	public static void main(String[] args) {

		Calculation calc = new Calculation();
		
		calc.a = 30;
		calc.b = 20;
		calc.sum(); //Calling Sum method.
		System.out.println(calc.a+" "+calc.b);//10,20
		
		calc.multiplication(23, 2);//Calling Multiplication method 
		System.out.println(calc.a+" "+calc.b); // 23,2
		
		int res = calc.sub(31, 15);
		System.out.println(res);
		
		int res1 = calc.rem();
		System.out.println(res1);
	}

}

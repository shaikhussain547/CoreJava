package BasicJava;

public class TypeConversionConcept {

	/*Type conversion refers to the process of converting one data type into another.
	 * There are two types of type conversion :
	 * Implicit (Widening) : When a value of a data type with smaller range is assigned to a variable of a compatible data type with larger range.
	 * 	Explicit (Narrowing) : Explicit Conversion is used when you want to assign a value of larger range data type to a smaller range data type.
	 */
	public static void main(String[] args) {
		
		int a = 10;
		float b = a;
		System.out.println(b);	// 10.0
		
		double tp = 200.45;
		int np = (int)tp;
		System.out.println(np);	 //200
		
		float sp = (float)tp;
		System.out.println(sp); 	 //200.45
		
	}

}

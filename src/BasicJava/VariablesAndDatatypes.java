package BasicJava;

public class VariablesAndDatatypes {

	public static void main(String[] args) {
		
		//Variables : Variables are used to store data in a program. A variable is a named memory location which holds some value. 
							//The value stored in a variable can vary during the execution of the program.
		//Declaration : In Java, you declare a variable by specifying its data type followed by the variable name.
		//Initialization : After declaring a variable, you can assign it a value through a process called initialization.
		//the default values are not applicable to the variables declared inside a method.
		//The variables declared inside a method must be initialized with a value before printing their value or performing any operation on them.
		//In Java, variable names should be nouns starting with lowercase letter. 
		//If it contains multiple words, then every inner word must start with capital letter. This type of casing is called camel casing.
		
		int varSample;		//Declaration
		varSample = 10;	//Initialization
		System.out.println("samle variable var :"+varSample);
		
		/*Data Types : Data type defines the type of data that can be stored in the variable and the memory required by it.
		 * Java has primitive data types and non - primitive data types.
		 * 		Primitive data types :- Variables of Primitive Data Types hold the value of the data item.
		 * 		Non - Primitive data types  :- Variables of Non-Primitive Data Types hold the reference of the memory location where the data object is stored.
		 * 														These are also called as Reference Data Types.
		 * Understanding data types is crucial for memory allocation and manipulation.
		*/
		
		//1. byte : (-128 to 127) or (-2^7 to (2^7)-1)
		byte a = 127;
		System.out.println("byte "+a);
		
		//2. short : (-32768 to 32767) or (-2^15 to (2^15)-1)
		short b = 32767;
		System.out.println("short "+b);
		
		//3. int :  (-2^31 to (2^31)-1)
		int c = 2147483647;
		System.out.println("int "+c);
		
		//4. long :  (-2^63 to (2^63)-1)
		long d = 3256875789l;
		System.out.println("long "+d);
		
		//5. float : Stores fractional numbers with 6-7 decimal digits.
		float e = 32.123457f;
		System.out.println("float "+e);	//32.123456
		
		//6. double : Stores fractional numbers with with up to 15 decimal digits.
		double f = 12.12345678912345;
		System.out.println("double "+f);
		
		//7. char - Any character
		char g = 'H';
		g = '%';
		System.out.println("char "+g);
		
		//4.boolean DataType - True/False
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("boolean "+b1);
		System.out.println("boolean "+b2);
	}

}

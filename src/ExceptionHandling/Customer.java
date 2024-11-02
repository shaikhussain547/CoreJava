package ExceptionHandling;

public class Customer {
	
	String name;

	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		Customer obj = new Customer();
		obj = null;
		
		try {
			int i = 9/3;
			obj.name = "Tom";
			System.out.println("Hello");
		} catch (NullPointerException  | ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("exception is coming");
			e.printStackTrace();
		}
		
		/* There are two different types of exceptions in Java:
		 * 
		 *  Checked Exception:- All exceptions other than runtime exceptions are known as Checked Exceptions as the compiler checks them 
		 *  during compilation to see whether the programmer has handled them or not. 
		 *  If these exceptions are not handled/declared in the program, you will get a compilation error. 
		 *  In this case, the programmers are forced to either handle these exceptions or declare to allow their propagation.
		 *   E.g. - SQLException, IOException, etc. are Checked Exceptions
		 *  
		 *  Unchecked Exception:- Unchecked exceptions are runtime exceptions. These exceptions are not checked at compile-time. 
		 *  So, the compiler does not check whether the programmer has handled them or not.
		 *  In this case, the programmers are not forced to handle or declare their propagation.
		 *  E.g. - ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. are Unchecked Exceptions.
		 */
		
		
		
		
	}

}

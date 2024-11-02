package ExceptionHandling;

public class MyException  extends RuntimeException{
	
	public MyException(String mesg) {
		super(mesg);
	}
	
	/*In Java, exception is basically of two types – Checked and Unchecked Exception.
	 * Exception can be handled with try, catch and finally block.
	 * A single try block can have any number of catch blocks.
	 * A single try block must be followed by at least one catch block or finally block.
	 * A generic catch block can handle all the exceptions.
	 * If no exception occurs in try block, then the catch blocks are completely ignored.
	 * Generic catch block must be the last catch block of try-catch.
	 * Finally block is optional.
	 * A finally block gets executed irrespective of whether an exception occurs or not.
	 * A finally block must be associated with a try block, you cannot use finally without a try block.
	 * An exception in the finally block behaves exactly like any other exception.
	 * Exception can be raised explicitly also by using throw keyword.
	 * If you are propagating the exception to the method call using throw, then method must be declared with throws keyword.
	 * Programmer can define their own exception, i.e., create User-defined exception.
	 * User-defined exception must extend Exception class.
	 */
	
}

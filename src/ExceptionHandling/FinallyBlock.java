package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("A");

		try {
			int i = 9 / 0;// AE
		} 
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finally block");
			//close browser
			//disconnect DB
			//close connection with excel/csv/text/file
			
		}		
		System.out.println("Bye");
		
		
		
		
		
		
	}

}

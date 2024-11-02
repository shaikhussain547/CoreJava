package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		String data = null;
		if(data == null) {
		//	throw new RuntimeException("DATA NOT FOUND EXCEPTION");
			throw new MyException("Data not found exception");
		}
		
		System.out.println("Completed");
		
		
		
		
		
	}

}

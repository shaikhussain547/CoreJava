package interviewQuestions;

public class IntegerCachingConcept {

	public static void main(String[] args) {
		
		// Java keeps a integer cache of integer
        // instances in range of -128 to 127.
		
		Integer a = 110;
		Integer b = 110;
		
		if(a == b) { // a and b will point to the same object reference.
			System.out.println("both are equal");
		}else {
			System.out.println("both are not equal");
		}
		
		Integer x = 128;
		Integer y = 128;
		
		if(x == y) { // x and y will point to the different memory location.
			System.out.println("both are equal");
		}else {
			System.out.println("both are not equal");
		}
		
		
	}

}

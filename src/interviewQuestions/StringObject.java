package interviewQuestions;

public class StringObject {

	public static void main(String[] args) {
		
		String n1 = new String("Hello World");
		String n2 = new String("Hello World");
		
		System.out.println(n1==n2); //false
		
		String s1 = "Hello World";
		String s2 = "Hello World";
		String s3 = "Hello World";
		
		/** Comparing objects */
		System.out.println(s1==s2); //true
		System.out.println(s2==s3); //true
		System.out.println(s1==s3); //true
		
		System.out.println(s1==n2); //false
		
		/** Values are being compared in the above three cases and thus equals() */
		System.out.println(n1.equals(n2)); //true
		System.out.println(n1.equals(s1)); //true
		System.out.println(s1.equals(n1)); //true
		
	}

}

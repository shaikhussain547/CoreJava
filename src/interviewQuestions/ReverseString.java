package interviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Selenium";	 //String is immutable object
		String rev = "";
		int len = s.length(); //8
		
		//1. using for loop:
		for(int i=(len-1); i >= 0; i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		
		//2. using StringBuffer class:	StringBuffer is mutable class
		s = "Hello World";
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
		
		
		
	}

}

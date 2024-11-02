package interviewQuestions;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int num = 12345;
		int rev = 0;
		
		//1. Basic method::
		while(num > 0) {
			rev = (rev*10) + num%10;
			num = num/10;
		}
		System.out.println("Reverse of the number: "+rev);
		
		//2. Using StringBuffer method::
		int num1 = 123456;
		String s = String.valueOf(num1);
		StringBuffer sf = new StringBuffer(s);
		System.out.println("Reverse of the number: "+sf.reverse());
//		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
	}

}

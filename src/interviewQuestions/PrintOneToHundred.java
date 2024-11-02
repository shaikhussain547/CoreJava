package interviewQuestions;

public class PrintOneToHundred {

	public static void main(String[] args) {
		// Print 1 to 100  without using any numbers in code:
		
		int one = 'A'/'A';  //1
		String s1 = "..........";  // length : 10
		
		System.out.println(one);
		System.out.println(s1.length());
		
		for(int i = one; i <= ( s1.length() * s1.length() ); i++) {
			System.out.println(i);
		}
		
		//a-97, b = 98, c = 99, d = 100
		for(int i = one; i <= 'd'; i++) {
			System.out.println(i);
		}
		
	}
}

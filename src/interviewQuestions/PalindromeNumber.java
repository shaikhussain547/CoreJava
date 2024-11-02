package interviewQuestions;

public class PalindromeNumber {
	
	public static boolean isPalindromeNumber(int num) {
		int temp = num;
		int rev = 0;
		while(num != 0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		if(rev == temp) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		System.out.println(isPalindromeNumber(121));
		System.out.println(isPalindromeNumber(545));
		System.out.println(isPalindromeNumber(123));

	}
}

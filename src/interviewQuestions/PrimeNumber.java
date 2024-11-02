package interviewQuestions;

public class PrimeNumber {
	//2 is the lowest prime number
	//3
	
	public static boolean isPrimeNumber(int num) {
		if(num<=1) {
			return false;
		}else if(num>2 && num%2 == 0) {
			return false;
		}
		return true;
	}
	
	public static void getPrimeNumbers(int num) {
		for(int i=2; i<=num; i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i+" is prime");
			}
		}
	}

	public static void main(String[] args) {
		
		System.out.println(isPrimeNumber(2));
		System.out.println(isPrimeNumber(4));
		System.out.println(isPrimeNumber(3));
		System.out.println(isPrimeNumber(0));
		System.out.println(isPrimeNumber(-2));
		
		getPrimeNumbers(4);
		getPrimeNumbers(7);
	}

}

package interviewQuestions2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int num = 10; // Length of Fibonacci series to display
        System.out.print("Fibonacci Series up to " + num + " terms: ");
		printFibonacci(num);
	}
	
	public static void printFibonacci(int num) {
		int first = 0;
		int second = 1;
		for(int i=0; i<num; i++) {
			System.out.print(first+" "); //0 1
            // Calculate the next Fibonacci number
            int next = first + second;
            first = second;
            second = next;
		}
	}

}

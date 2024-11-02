package interviewQuestions;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int a[] = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 10};
		//1+2+4+5 = 12
		//1+2+3+4+5 = 15
		//15-12 = 3
		
		int sum = 0;
		for(int i=a[0]; i<=a[a.length-1]; i++) {
			sum = sum+i;
		}
		System.out.println("Total sum: "+sum);
		
		int asum = 0;
		for(int i=0; i < a.length; i++) {
			asum = asum + a[i];
		}
		System.out.println("Actual sum: "+asum);
		System.out.println("Missing numebr is: "+(sum-asum));
		
	}
}

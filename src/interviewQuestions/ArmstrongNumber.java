package interviewQuestions;

public class ArmstrongNumber {
	
	//153
	//1*1*1 = 1
	//5*5*5 = 125
	//3*3*3 = 27
	//1+125+27 = 153
	
	public static int getCube(int num) {
		int cube = num*num*num;
		return cube;
	}
	
	public static void isArmstrongNumber(int num) {
		int temp = num;
		int sum = 0;
		while(num != 0) {
			sum = sum + getCube(num%10);
			num = num/10;
		}
		if(sum==temp) {
			System.out.println(temp+" is Armstrong number.");
		}else {
			System.out.println(temp+" is not Armstrong number.");
		}
	}

	public static void main(String[] args) {
		isArmstrongNumber(153);
		isArmstrongNumber(407);
		isArmstrongNumber(123);
		isArmstrongNumber(370);
		isArmstrongNumber(1634);
		System.out.println(isArmNum(1634));
	}
	
	public static boolean isArmNum(int num) {
		
		if(num < 0) return false;
		
		int temp = num;
		int numDigits = 0;
		while(temp>0) {
			numDigits++;
			temp = temp/10;
		}
		
		if(num == 0) {
			numDigits=1;
		}
		
		int sum=0;
		temp = num;
		while(temp>0) {
			int digit = temp%10;
			sum += Math.pow(digit, numDigits);
			temp = temp/10;
		}
		if(sum == num) {
			return true;
		} else {
			return false;
		}
		
		
	}

}

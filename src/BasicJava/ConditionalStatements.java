package BasicJava;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		
		// if-else : The if-else statements allows you to execute a block of code if a specified condition is true
						// and another block of code if the condition is false.
		//else if : The else if statement is used to test multiple conditions.
		
		//Even or odd :
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num+" is even");
		}else {
			System.out.println(num+" is odd");
		}
		
		//Income Tax Calculator :
		int income = 50000;
		if(income < 50000) {
			System.out.println("No tax");
		}else if(income == 50000) {
			System.out.println("Tax : "+ (income * 0.1));
		}else {
			System.out.println("Tax : "+ (income * 0.2));
		}
		
		//Nested if
		String custType = "Regular"; //Regular,Guest
		int quantity;
		System.out.print("Enter quantity : ");
		quantity = sc.nextInt();
		int unitPrice = 10;
		double totalPrice = quantity * unitPrice;
		int discount = 5;
		int deliveryCharge = 5;
		double tempPrice;
		if(custType.equals("Regular")) {
			System.out.println("Total price : "+totalPrice);
			if(totalPrice >= 25) {
				totalPrice = totalPrice*(1-(discount/100));
				System.out.println("Total price after discount : "+totalPrice);
			}
		}else if(custType.equals("Guest")){
			totalPrice  += deliveryCharge;
			System.out.println("Total price with delivery charge : "+totalPrice);
		}else {
			System.out.println("Invalid customer type");
		}
		
		//Largest of three numbers :
		int a=1000, b=3200, c=3000;
		String largest ="";
		largest = (a>b && a>c) ? "A": (b>a && b>c) ? "B": (c>a && c>b) ? "C": "" ;
		System.out.println(largest);
		
		//Switch - case
		String orderedFood = "Pizza";
		switch (orderedFood) {
		case "Burger":
			System.out.println("You have ordered Burger. Unit price: $10");
			break;
		case "Pizza":
			System.out.println("You have ordered Pizza. Unit price: $15");
			break;
		case "Sandwich":
			System.out.println("You have ordered Sandwich. Unit price: $8");
			break;
		default:
			System.out.println("Invalid selection");
		}
		
		sc.close();
	}

}

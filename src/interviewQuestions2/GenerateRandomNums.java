package interviewQuestions2;

import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNums {

	public static void main(String[] args) {
		
		//Generate random value:
		//Provide min and max values in parameters:
		int random = ThreadLocalRandom.current().nextInt(1, 9999);
		
		System.out.println(random);
		
		
		
		
		
		
		
	}

}

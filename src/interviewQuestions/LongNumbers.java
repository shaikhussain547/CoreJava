package interviewQuestions;

public class LongNumbers {

	public static void main(String[] args) {
		
		long longNumberWithoutL = 1000*60*60*24*365;
		long longNumberWithL = 1000*60*60*24*365L;
		
		System.out.println(longNumberWithoutL); //1471228928
		System.out.println(longNumberWithL); //31536000000
		
		//31536000000  --36 bits
		//11101010111101100010010110000000000
		//{ <1110> remove } 1010111101100010010110000000000 --> 1471228928  
		
	}

}

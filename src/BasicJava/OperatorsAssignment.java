package BasicJava;

public class OperatorsAssignment {

	public static void main(String[] args) {
		
		//
		int a = 12*3-9/2;
		int b = 14*4 + 175/8;
		if(a++ % 2 ==0) {
			if(b-- % 4 == 0) {
				System.out.println("a = "+a+" b = "+ b);
			}else {
				System.out.println("a = "+a+" b = "+ b);
			}
		}else {
			System.out.println("a = "+a+" b = "+ --b);
		}
		
		//
		int i = -1, j = -1;
		switch (i) {
		case 1:
			j = 1;
		case -1:
			j = 2;
		case 3:
			j = 4;
			break;
		default:
			j = 0;
		}
		System.out.println("j = "+j);	//2
		
		//
		int k =1;
		switch(k) {
		default :
			System.out.println("Hello");
		case 1:
			System.out.println("Welcome");
		case 2:
			System.out.println("To");
		case 3:
			System.out.println("Infosys");
			break;
		}
		
		
		
		
	}

}

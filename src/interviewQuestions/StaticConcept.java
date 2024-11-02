package interviewQuestions;

public class StaticConcept {

	public static void main(String[] args) {
		
		System.out.println(Main.X);

	}
	
}
class Main {
//	 public static final int X = 100;
	 public static int X = 100;
	 static {
		 System.out.println("main -- class static block");
	 }
 }




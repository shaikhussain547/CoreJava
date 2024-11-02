package interviewQuestions;

public class SwapString {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		String s3;
		
		System.out.println(s1.substring(0, s1.length()-2)); //
		
		//Swap strings with using third var: s3
		s3 = s1;
		s1 = s2;
		s2 = s3;
		
		System.out.println(s1); //World
		System.out.println(s2); //Hello
		
		//Swap strings without using third var:
		String a = "Hello";
		String b = "World";
		
		System.out.println("before swapping: a: "+a+", b: "+b);
		
		//append a and b:
		a = a+b; //HelloWorld
		//Store initial string a in String b:
		b = a.substring(0, a.length()-b.length()); //Hello
		//Store initial string b in String a:
		a = a.substring(b.length()); //World
		System.out.println("Afte swapping: a: "+a+", b: "+b);
		
		
		
		
		
		
		
	}
}
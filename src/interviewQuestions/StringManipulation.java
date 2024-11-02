package interviewQuestions;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "The movie has been started";
		String str1 = "The movie Has been started";
		
		//Length:
		System.out.println("Length of str is: "+str.length()); //26
		
		//CharAt:
		System.out.println(str.charAt(4)); //m
		
		//IndexOf:
		System.out.println(str.indexOf('v')); //6
		
		System.out.println(str.indexOf('e')); //2, 1st occurence of e
		
		System.out.println(str.indexOf('e', 3));	//8, 2nd occurence of e
		
		System.out.println(str.indexOf('e', str.indexOf('e')+1));	//8, 2nd occurence of e
		
		System.out.println(str.indexOf("movie"));	//4
		
		System.out.println(str.indexOf("more"));	//-1
		
		//String comparison:
		System.out.println(str.equals(str1)); 	//false, java is case sensitive
		System.out.println(str.equalsIgnoreCase(str1)); 	//true
		
		//Substring:
		System.out.println(str.substring(4, 9));	//movie
		System.out.println(str.substring(14, 16)); //be
		
		//trim:
		String s = "     Hello   World   ";
		System.out.println(s.trim()); //Hello   World
		System.out.println(s.replace(" ", "")); //HelloWorld
		
		String date = "01-02-2017";
		System.out.println(date.replace("-", "/")); //01/02/2017
		
		//Split:
		String test = "Hello_World_Test_Selenium";
		System.out.println(test.split("_")[3]); //Selenium
		String testArr[] = test.split("_");
		for(String eachTest: testArr) {
			System.out.println(eachTest);
		}
		
		//Concat:
		String s2 = "Course";
		System.out.println(test.concat(s2));
		
		int a = 100;
		int b = 200;
		String s3 = "Training";
		
		System.out.println(s2+s3);
		System.out.println(a+b);
		System.out.println(s2+s3+a+b);
		System.out.println(a+b+s2+s3);
		System.out.println(s2+s3+(a+b));
		
		//Why String is immutable and Final ?
		//Immutable :- Cannot change the value.
		String s4 = "Java";
		String s5 = "Java";
		s5 = "Wick";
		System.out.println(s4);
		System.out.println(s5);
		
		
		
		
	}
}
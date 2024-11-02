package BasicJava;

public class StringConcept {

	public static void main(String[] args) {
		
		//String is used to store a sequence of characters.
		//String is a predefined class in Java and comes with many methods which can help us perform various operations on it.
		//There are two ways to create a string: 
		//1. String literal :
		String fName = "John";
		//2. Using new() keyword
		String lName = new String("Wick");
		
		String name = new String("John");
		
		System.out.println(fName == name); //false
		
		//String methods :
		//1. length : Returns number of characters in a string.
		System.out.println(fName.length()); //4,int
		
		//2. Concat : Concatenates or joins two strings and returns third string as the result.
		System.out.println(fName.concat(" "+lName)); // John Wick
		
		//3. Equals : Checks case sensitive equality of the string.
		System.out.println(lName.equals("Wick")); //Wick
		
		//4. EqualsIgnoreCase : Checks case insensitive equality of the string.
		System.out.println(fName.equalsIgnoreCase("john")); //true
		
		//5. to LowerCase() : converts all the characters of the source string to lower case.
		System.out.println(fName.toLowerCase()); //john
		
		//6. to UpperCase() : converts all the characters of the source string to upper case.
		System.out.println(lName.toUpperCase()); //WICK
		
		//7. charAt(index) : returns a char value at the given index.
		System.out.println(fName.charAt(3)); //n
		
		//8. Substring : Returns substring from begin index to end index.
		System.out.println(fName.substring(1, 3)); //oh
		
		//9. Contains : Returns true if the character sequence is present in the string.
		System.out.println(lName.contains("ick"));
		
		//10. Replace : Replaces all the occurence of the spcified character with new char.
		System.out.println(lName.replace('W', 'R'));
			
	}

}

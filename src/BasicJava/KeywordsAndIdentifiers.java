package BasicJava;

public class KeywordsAndIdentifiers {
	
	/* Keywords ::
	 * Every programming language has a set of keywords which are reserved words having a predefined meaning. 
	 * Each keyword represents a specific functionality in the language.
	 * 
	 * Some of the keywords in Java language are listed below: 
	 * 			abstract		else			return
	 * 			break			final			static
	 * 			case				for			switch
	 * 			class				if				throw
	 * 			continue		import		try
	 * 			default			interface	this
	 * 			do					new			while
	 */
	
	/* Identifier ::
	 * Similarly, in Java, an identifier is the name given to a variable, method or class to uniquely identify it. 
	 * In Java, following rules apply to the identifier name:
	 * 		1. It can contain alphanumeric characters([a-z], [A-Z], [0-9]), dollar sign ($), underscore (_)
	 * 		2. It should not start with a digit ([0-9])
	 * 		3. It should not have spaces
	 * 		4. It should not be a Java keyword
	 * 		5. It is case-sensitive
	 * 		6. It has no length restrictions
	 */

	public static void main(String[] args) {
		
		int _num = 9;
		String $rupee = "Fifty";
		int count112 = 547;
		
		System.out.println(_num);
		System.out.println($rupee);
		System.out.println(count112);
		
	}

}

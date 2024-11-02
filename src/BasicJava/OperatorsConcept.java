package BasicJava;

public class OperatorsConcept {

	public static void main(String[] args) {
		
		//Operators : Operators are the symbols used to perform specific operations. 
		//There are various operators that can be used for different purposes.
		
		//1. Arithmetic Operators : { +, -, *, /, %(Modulus) }
				//Arithmetic operators are used to perform basic mathematical operations like addition, subtraction, multiplication and division. 
		System.out.println(10/3); // 3
		System.out.println(10%3); // 1
		
		//2. Unary Operator : { ++, --, ! }
				//Unary operators act upon only one operand and perform operations such as increment, decrement, 
				//negating an expression or inverting a boolean value.
		
		//3. Relational Operators : { ==, !=, >, <, >=, <= }
				//Relational operators are used to compare two values. The result of all the relational operations is either true or false. 
		
		//4. Logical Operators : &&, ||, !
				//Logical operators are used to combine two or more relational expressions or to negate the result of a relational expression. 
		
		//5. Assignment Operators : =, +=, -=, *=, /=, %=
				//Assignment operator is used to assign the value on the right hand side to the variable on the left hand side of the operator.
		
		//6. Ternary operator is used as a single line replacement for if-then-else statements and acts upon three operands. 
				// Syntax : <condition> ? <value if condition is true> : < value if condition is false> 
		int numOne = 10;
		int numTwo = 5;
		int min = (numOne < numTwo) ? numOne : numTwo;
		System.out.println(min); //5
		
		//Operator Precedence :
			/*		()
			 * 		++, -- (postfix)
			 * 		++, --, +, -, ~, ! (unary, prefix)
			 * 		*, /, %
			 * 		+, -
			 * 		<<, >>, >>>
			 * 		<, >, <=, >=
			 * 		==, !=
			 * 		&&
			 * 		||
			 * 		?: (ternary)
			 * 		=, +=, -=, *=, <<=, >>=, >>>=
			 */
		
		//++ Increment
				//-- Decrement
				
				int i = 10;
				int j = i++; //Post Increment
				
				System.out.println(i); //11
				System.out.println(j); //10
				
				int a = 10;
				int b = ++a;
				
				System.out.println(a); //11
				System.out.println(b); //11
				
				int m = 20;
				int n = m--;
				
				System.out.println(m); //19
				System.out.println(n); //20
				
				int p = 20;
				int q = --p;
				
				System.out.println(p); //19
				System.out.println(q); //19 
				
				int num = 10;
				System.out.println(10/5);
				System.out.println(10%5);
		
		
		
	}

}

package interviewQuestions2;

import java.util.Arrays;

public class RemoveConsecutivelyRepeated {
	
	public static String removeConsecutiveLetters(String s) {
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for(int i=0; i<s.length(); i=j) {
			j=i;
			//increase j count if consecutive chars are same
			while(j<s.length() && s.charAt(j)==s.charAt(i)) {
				j++;
			}
			//Add character only if it is occuring once
			if(j-i == 1) {
				sb.append(s.charAt(i));
			}
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		
		String s = "aabbbcabcbb";
		System.out.println(removeConsecutiveLetters(s));
		
	}

}

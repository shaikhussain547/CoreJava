package interviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		
		//Hey java is java best language is java
		// java : 3
		// is : 2
		
/*		String s = "Hey java is java best language is java";
		String[] sl = s.split(" ");
		Set<String> ss = new HashSet<String>();
		for(String str : sl) {
			if(ss.add(str) == false) {
				System.out.println(str+" is duplicate word");
			}
		}	*/
		
		findDuplicateWords("Hey java is java best language is java");

	}
	
	public static void findDuplicateWords(String inputString) {
		String[] words = inputString.split(" ");
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		for(String word : words) {
			if(wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word)+1);
			}else {
				wordCount.put(word, 1);
			}
		}
		//extracting all the keys of map - wordCount
		Set<String> wordsInString = wordCount.keySet();
		for(String eachWord : wordsInString) {
			if(wordCount.get(eachWord)>1) {
				System.out.println(eachWord+" : "+wordCount.get(eachWord));
			}
		}
	}

}

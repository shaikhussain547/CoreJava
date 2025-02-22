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
		
		findDuplicateWords("Hey java is java best language is java");
		finddDuplicateWords2("Hey java is java best language is java");
		findDuplicateWords3("Hey java is java best language is java");

	}
	
	/** *****************************************************************************/
	
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
	
	/** *****************************************************************************/
	
	public static void finddDuplicateWords2(String sentence) {
		String words[] = sentence.split(" ");
		Set<String> ss = new HashSet<String>();
		for(String word : words) {
			if(! ss.add(word)) {
				System.out.println("Duplicate word is : "+word);
			}
		}
	}
	
	/** *****************************************************************************/
	
	public static void findDuplicateWords3(String sentence) {
		String words[] = sentence.split(" ");
		
		for(int i=0; i<words.length; i++) {
			int count = 1;
			for(int j=i+1; j<words.length; j++) {
				if(words[i].equals(words[j])) {
					count++;
				}
			}
			if(count > 1) {
				System.out.println("Duplicate word is : "+words[i]);
			}
		}
	}

}

package ArraysCoding;

import org.testng.annotations.Test;

public class NumberOfWordInString {
	
	//How To Count Words in a String
	
	@Test
	
	public static void numberOfWords() {
		String str = "Raja Rani venkat venky king stigen mrkp";
		int count = 1;
		
		for(int i = 0; i < str.length() ; i++) {
			
			char letter = str.charAt(i);
			if(letter == ' ') {
				count++;
			}
			//System.out.println(str.charAt(i));
		}
		System.out.println("number of words in string " + count);
	}
	@Test
	public static void wordsInString() {
		
		String s = "hyd bang kan size lenght king";
		int count = 1;
		for(int i = 0 ; i < s.length() ; i++) {
			if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ') {
				
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	

}

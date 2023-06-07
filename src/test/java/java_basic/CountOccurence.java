package java_basic;

import org.testng.annotations.Test;

public class CountOccurence {
	//How To Count Occurrences of a Character in a String
	
	
	@Test
	public static void occurence() {
		
		String name = "RajaRaja";
		
		int lenthOfString = name.length();
		
		int after_remove = name.replace("a", "").length();  
		
		int occurence = lenthOfString - after_remove ;
		
		System.out.println("Char occurence int string " + occurence);
		
	}
	@Test
	public static void CharOccurence() {
		String s ="Stigentechssss";
		
		char seach = 's';
		int count = 0;
		
		for(int i =0 ; i< s.length() ; i++  ) {
			char letter =s.charAt(i);
			
			if(letter == seach) {
				count++;
			}
			System.out.println(letter);
		}
		System.out.println(" Number of char occurence int String " + count);
	}

}

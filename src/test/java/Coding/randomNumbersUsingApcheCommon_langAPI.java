package Coding;

import org.apache.commons.lang3.RandomStringUtils;

public class randomNumbersUsingApcheCommon_langAPI {

	public static void main (String[]  args) {

		String number =RandomStringUtils.randomNumeric(10); //RandomStringUtils - class
		System.out.println(number);

		
		System.out.println(RandomNumber(4));
		
		
		String radLetters =  RandomStringUtils.randomAlphabetic(5);
		System.out.println(radLetters);
		
	
		System.out.println(RadomAplhabets(3));
		
	}
	
    // by using  Function for RandomNumber with number of digits 
	public static String RandomNumber(int number_of_digits) {

		String number =RandomStringUtils.randomNumeric(number_of_digits);
		return number;

	}
	
	// Using Function for  RandomAlphabets with number of characters
	 public static String RadomAplhabets(int numberofletters) {
		 String character = RandomStringUtils.randomAlphabetic(numberofletters);
		 return character;
	 }

}

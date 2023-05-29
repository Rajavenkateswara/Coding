package Coding;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenarateRandomNumbers_and_Srings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// using Approch 01; 
        // By using Random class
		/* Random rdm = new Random();
		int radomnumber =rdm.nextInt(20); // 20 (0-19),100 (0-99)
		System.out.println(radomnumber);
		*/
		System.out.println(RandomNumbers(9));
		System.out.println(RandomDouble());
		
		//using approach 02
		double rNumber = Math.random();  // Math -class and random static method 
		System.out.println(rNumber); // randam double.
	}
	
	public static int RandomNumbers(int num) {
		Random rdm = new Random();
		int random =rdm.nextInt(num);
		return random;
	}
	
	public static Double RandomDouble() { // 0.0 and Less Than one 
		Random rdm = new Random();
		Double randomNumber = rdm.nextDouble();
		return randomNumber;
	}
	
	

}

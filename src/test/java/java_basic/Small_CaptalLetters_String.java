package java_basic;

import org.testng.annotations.Test;

public class Small_CaptalLetters_String {
	
	
	
	
	@Test
	
	public void letter() {
		String str = "raja";
		int loweCount = 0;
		int upperCount = 0;
		
		for(int i = 0; i < str.length() ; i++) {
			//System.out.println(str.charAt(i));
			
			 char letter =  str.charAt(i);
			 if(letter > 'a' && letter < 'z') {
				 loweCount++;
			 }
			 else if(letter > 'A' && letter < 'Z'){
				 upperCount++;
			 }
		}
		System.out.println("Upper count " + upperCount);
		System.out.println("lower Count " + loweCount);
	
	}
	

}

package java_basic;

import org.testng.annotations.Test;

public class RemoveSplCharacterFromString {
	
	
	@Test
	public static void removeSpecialCharacterFromString() {
		
		String str = "!@#$%asdffsse Rajavenkateswarlu";
		
		String s = "12345!@#$%^&^% Venkat Raja";
		
		str=s.replaceAll("[^a-zA-z0-9]", "");
		
		System.out.println(str);
	}

}

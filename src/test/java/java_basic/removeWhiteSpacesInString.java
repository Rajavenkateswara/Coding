package java_basic;

import org.testng.annotations.Test;

public class removeWhiteSpacesInString {
	
	
	
	@Test
	public static void remove () {
		String name = "Raja   venkateswarlu   karravula";
		
		name=name.replaceAll("\\s","");
		System.out.println(name);
		
	}

}

package java_basic;

import org.testng.annotations.Test;

public class splitting_String_with_delimeter {



	@Test
	public void split() {

		String str = "Java,Selenium,TestNg,Maven,Jenkins,CICD";

		String word[] = str.split(",");
		int strlenght =word.length;
		System.out.println(strlenght);

		for(int i = 0 ; i< strlenght -1 ; i++) {
			System.out.println(word[i]);
		}

	}
	@Test
	public void concatinate() {
		String s1 = "abc";
		String s2 = "xyz";
		String s3 = "raaja";
		
		String result = s1+s2+s3;
		System.out.println(result);
		String result1 =s1.concat(s2);
		String sen = result1.concat(s3);
		System.out.println(sen);
		
		System.out.println("Final result :" + s1.concat(s2).concat(s3));
		

	}

}

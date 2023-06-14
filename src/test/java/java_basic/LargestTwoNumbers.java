package java_basic;

import org.testng.annotations.Test;

public class LargestTwoNumbers {
	
	
	@Test
	public void largestTwoNumbers() {
		
		int a = 100;
		int b = 20;
		
		int large =a > b ? a : b; 
		System.out.println(large);
		int small = a<b ? a:b;
		System.out.println(small);
		
		
	}

}

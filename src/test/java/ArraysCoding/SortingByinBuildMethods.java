package ArraysCoding;

import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;

public class SortingByinBuildMethods {
	
	
	
	
	@Test
	(priority = 1)
	public static void sort() {
		int a[] = {12,4,5,1,3,6,8,10};
		String str =Arrays.toString(a);
		System.out.println("Before sorting" + str);
		Arrays.parallelSort(a);

		System.out.println("After sorting elements " + Arrays.toString(a));
	}
	
		@Test
		(priority = 2)
		public static void approach() {
			int b[] = {12,4,5,1,3,6,8,10,12,43,23,7,8,9};
			System.out.println("Before sorting approach- " + Arrays.toString(b));
			
			Arrays.sort(b);
			
			System.out.println("After sorting in approach- " + Arrays.toString(b));
		}
		@Test
		public static void reverseOrder() {
			Integer number[] = {1,2,3,4,5,6,9,12,98,76,54,32,12,34};
			
			Arrays.sort(number,Collections.reverseOrder());
			
			System.out.println("Reversing order " + Arrays.toString(number));
			
		
		
		
		
	}

}

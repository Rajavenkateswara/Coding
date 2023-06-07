package java_basic;

import java.util.Arrays;

import org.testng.annotations.Test;

public class BinarySearch_Array {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array should in sorted order
	// Binary searching
	@Test
    public static void Binary() {
		int a[] = {12,32,33,45,56,78,88,99};
		boolean status = false;
		int key = 0;

		int lower = 0;
		int higher = a.length-1;
		
		while( lower <= higher) {
			int m = (lower + higher) / 2 ;
			if(a[m] == key) {
				System.out.println("The key value is : " + a[m]);
				status = true;
				break;
			}
			if(a[m] < key) {
				lower = m + 1;
			}
			if(a[m] > key) {
				higher = m - 1;
			}

		}

		if(status == false) {
			System.out.println("Element not found");
		}
		
		// Approach -2 using Arrays.binarysearch()
		
		int b[] = {2,4,6,8,9,10,12,14,16,18,20,22,24,26,22,28};
		int search = Arrays.binarySearch(b, 20);
		System.out.println(search);

	}

}

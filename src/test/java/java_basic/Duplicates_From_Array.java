package java_basic;

import java.util.HashSet;

public class Duplicates_From_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Using comparison
		boolean status = false;
		// int a[] = { 5,6,7,8,9,10,11,12,13,14,15,16,17};
		/*
		for(int i = 0; i < a.length ; i++) {
			for(int j = i+1; j< a.length; j++) {
				if(a[i] == a[j]) {
					status = true;
					System.out.println("Duplicates values are found " + a[i]);
				}
			}

		}
		if(status == false) {

			System.out.println("elements not found");
		}
		 */

		HashSet<Integer> vaues = new HashSet<Integer>();
		int a[] = { 5,6,7,8,9,10,11,12,12,13,14,15,16,17};

		//	System.out.println(vaues.add(12) + " " + vaues.add(13)+ " "+vaues.add(12)) ;

		for( Integer value :a) {

			if(vaues.add(value) == false ) {
				status  = true;
				System.out.println("Duplicate Element are :" + value);
			}
		}
		if(status == false) {
			System.out.println("Element are found not found");

	}



}

}

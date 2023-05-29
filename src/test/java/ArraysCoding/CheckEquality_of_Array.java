package ArraysCoding;

import java.util.Arrays;

public class CheckEquality_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[] = { 1,2,3,4,5,12};
		int a2[] = { 1,2,3,4,5,10};
		// Uisng Arrays method
		/*
		boolean status = Arrays.equals(a1, a2);

		if(status == true ) {
			System.out.println("Both Arrays are equal");
		}else {
			System.out.println("Both arrays are not eqal");
		}
		 */
		// With out Using Arrays method

		//	1 - We have to check both arrays are Equal or not
		// 2 - 

		boolean status = true;

		if(a1.length == a2.length) {
			for(int i = 0; i < a1.length; i++) {
				if(a1[i] != a2[i]) {
					status = false;
				}
			}

		}
		else 
		{
			status = false;
		}
		if(status == true ) {
			System.out.println("Arrays are Equal");
		}
		else {
			System.out.println("Arrays are not Equal");
		}


	}

}

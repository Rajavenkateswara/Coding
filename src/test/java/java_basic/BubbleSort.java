package java_basic;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a[] = {19,34,46,3,4,5,6,7,8,10,11,12,18};
		System.out.println("Before sorting Elements " + Arrays.toString(a));

		for(int i = 0; i<a.length-1 ; i++) {

			for(int j = 0 ; j< a.length-1 ; j++) {

				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}

		}
		System.out.println("After sorting : " + Arrays.toString(a));

	}

}

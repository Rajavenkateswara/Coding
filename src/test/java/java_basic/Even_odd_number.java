package java_basic;

public class Even_odd_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,20};

		System.out.println(isEven(12) + " "+ isOdd(5));

		int even_count = 0;
		int odd_count = 0;
      /*
		for(int i = 0 ; i < a.length ; i++) {
			if(isEven(a[i])) {
				even_count++;
				System.out.println("Even number is " + a[i]);
			}else {
				odd_count++;
				System.out.println("Odd number is " + a[i]);
			}

		}
		System.out.println("Even count " + even_count);
		System.out.println("Odd count " + odd_count);

*/
		// Enhanced for loop
		
		for(int value : a) {
			if(isEven(value)) {
				System.out.println(value);
			}else {
				System.out.println("odd");
			}
		}

	}

	public static boolean isEven(int num) {
		if(num % 2 == 0 ) {
			return true;
		}
		else {
			return false;
		}

	}

	public static boolean isOdd(int num) {
		if(num % 2 != 0) {
			return true;
		}else {
			return false;
		}
	}
}

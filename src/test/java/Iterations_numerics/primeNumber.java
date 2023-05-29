package Iterations_numerics;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello wordl" );
		System.out.println(numberOfDivisor(23));
		System.out.println(isPrime(13));

		for(int i = 1 ; i< 100; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	// These method will give number of parameters 
	public static int numberOfDivisor( int num) {
		int factcount = 0;
		if(num > 1) {
			for(int i = 1; i <=num ; i++) {
				if(num % i == 0) {
					factcount++;
				}
			}

		} return factcount;
	}
	// It wull check prime or Not i..e if(number having two factors one the ThemSeleve"
	public static boolean isPrime ( int num) {
		if(numberOfDivisor(num) == 2) {
			return true;
		}else {
			return false;
		}
	} 

}

package java_basic;

public class Factorial_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number =4;
		long factorial =1;
		 
		//Lower to higher 1 * 2 * 3* 4* 5
		/*
		for(int i = 1 ; i <= number; i++) {
			factorial = factorial *i;
		}
		System.out.println(" Factorial of a number is " +number +" "+ factorial);
		
		*/
		for(int i = number ;i>=1; i--) {
			
			factorial = factorial * i;
			
		}System.out.println(" Factorial of a number is " +number +" "+ factorial);
		
		System.out.println(factorial(4));
		System.out.println(factorialRev(4));

	}
	
	// These fucntion belongs to 1*2*3*4*5 .......
	public static int factorial(int num) {
		int factorial = 1;
		for(int i =1 ; i<=num; i++) {
			factorial = factorial * i;
			 
		}return factorial;
	}
	// These fucntion belongs to 5, 4, 3, 4 .......
	public static int factorialRev(int num) {
		int factorai = 1;
		
		for(int i = num ; i>=1; i--) {
			factorai = factorai * i;
		}
		return factorai;
	}
	

}

package java_basic;

public class sumOfDigitsInNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12;
		int sum = 0;
		while(number > 0) {
			
			sum = sum + number %10;
			number = number /10;
			
		}
		System.out.println("sum of digits : " + sum);

	}

}

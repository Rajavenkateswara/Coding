package Coding;

public class DigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 123432;
		int count = 0;
		while(number > 0) {
			int last = number % 10;
			System.out.println(last);
			count++;
			number = number / 10;
		}
		System.out.println(count);

	}

}

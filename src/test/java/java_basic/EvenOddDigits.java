package java_basic;

public class EvenOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1236789;
		int even_count = 0;
		int odd_count = 0;

		while(num > 0) {
			int last = num % 10;
			if(last % 2 ==0) {
				System.out.println("Even " +last);
				even_count++;
			}else {
				System.out.println("Odd " +last);
				odd_count++;
			}
			num = num/10;
		}
		System.out.println(even_count);
		System.out.println(odd_count);
	}
}

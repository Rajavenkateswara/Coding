package Coding;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palidromeNumber(13242);

	}
	
	public  static int revNumber( int num) {
		int rev = 0;
		while (num != 0) {
			rev = rev*10 +num % 10;
			num = num / 10;
		}
		return rev;
	}
	
	public static void palidromeNumber(int num) {
		if(revNumber(num) == num) {
			System.out.println("palindrome");
		}else {
			System.out.println("Number is not palindrome");
		}
	}

}

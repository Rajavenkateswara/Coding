package Coding;

public class fibanociesSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n1 = 0;
		int n2 = 1;
		int sum =0;
		System.out.println(n1 + " " + n2);
		for(int i = 2 ; i< 10; i++) {
			 sum = n1 + n2;
			 
			 n1 = n2;
			 n2 = sum;
			 System.out.print(" " +sum );
			 
		}
		
	}

}

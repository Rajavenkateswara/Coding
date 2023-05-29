package ArraysCoding;

public class Sum_of_Elements_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		int marks[] = new int[6];
		int lenghtMarks =marks.length;
		System.out.println(lenghtMarks);

		marks [0] = 20;
		marks [1] = 30;
		marks [2] = 40;
		marks [3] = 50;
		marks [4] = 4;
		marks [5] = 12;

		int sum = 0;
		// For Each loop
		/* 
		for(int m : marks) {
			System.out.println(m);
		}
		 
		for(int i = 0 ; i < marks.length; i++) {
			sum = sum+ marks[i];
			System.out.println(marks[i]);
		}
		System.out.println("sum of Arrays Elements : " +sum   );
*/

		int num[] = {1,2,3,4,5,6,7,8,9,10,11};

		int sum1 = 0;
		
		
		for( int value  : num) {
			sum1 = sum1+value;
			}
		System.out.println(sum1 + "value");
		
		/* for(int i = 0; i< num.length ;i++) {
			 sum1 = sum1 + num[i];

		}
		 //System.out.println("Sum of Elements in Array  " + sum1);
		 
		 
		int  marks[] = {40,50,60};
		System.out.println(sumOfElements(marks));
		
*/
	}
	/*
	public static int sumOfElements(int marks[]) {
		
		int sum =0;
		for(int i = 0; i< marks.length ; i++) {
			sum = sum + marks[i];
		}
		return sum;
	}*/
	
	public static int sumOfElements(int marks[]) {
		int sum = 0;
		int i = 0;
		while( i < marks.length) {
			sum = sum + marks[i];
			i++;
		}return sum;
		
	}
}

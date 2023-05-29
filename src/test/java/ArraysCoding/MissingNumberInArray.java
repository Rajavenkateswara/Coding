package ArraysCoding;

public class MissingNumberInArray {
	// Missing number in Array
	//	note 1 : Array should not have duplicates
	// note 2 : Arrays no need to be sorted order
	// note 3 : Values should be proper range

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,5,6,7,8,9};

		// sum2 = sum of values in with in the range
		//  sum1 =  sum of values in array 
     /*
		int sum1 = 0;
		for(int i =0; i< a.length; i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println("Sum of elements in Arrays sum1 :" + sum1);

		int sum2 =0;
		for(int i = 1; i <=9; i++) {
			sum2 = sum2 + i;
		}
		System.out.println("Sum of elements in the range : " + sum2);


		int missingNumber = sum2 -sum1;
		System.out.println("Missing number " + missingNumber);

*/
		
		int sum1 =sumOfElementsArray(a);
		int sum2 =sumOfRange(1, 9);
		int miss = missingNumber(sum1, sum2);
		System.out.println(miss);
		
		
		
	}
	public static int sumOfElementsArray (int a[]){
		int sum = 0 ;
		for(int i = 0; i < a.length ;i++) {
			sum = sum +a[i];
		}
		return sum;
	}
	
	public static int sumOfRange ( int start , int limit) {
		int sum = 0;
		for(int i  = start ; i <=limit ; i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	public static int missingNumber (int sum1, int sum2) {
		int missing_number = sum2 -sum1; 
		return missing_number;
	}

}

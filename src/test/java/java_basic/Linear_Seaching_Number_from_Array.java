package java_basic;

public class Linear_Seaching_Number_from_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Seaching the elements from arrays
		int number[] = {1,23,12,34,67,34,123,56,234};
		int seachValue = 234;
		boolean status  = false;
		for(int i = 0; i< number.length ; i++) {
			if(seachValue == number[i]) {
				status = true;
				System.out.println("Number is search element is : " + number[i]);
			}
		}
		if( status == false) {
			System.out.println("Seach value is  not available " );
		}

	}

}

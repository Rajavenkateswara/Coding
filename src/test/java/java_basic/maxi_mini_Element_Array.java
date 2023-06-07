package java_basic;

public class maxi_mini_Element_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int a[] = {12,2,4,6,7,13,30,55,0};
		int maxi = a[0];
		int min = a[0];
		/*
		for(int i =1 ; i< a.length ; i++) {
			if(a[i] > maxi) {
				maxi = a[i] ;
			}
		}
		System.out.println("Maximum form Array " + maxi);
	*/
		
		for (int i = 0 ; i< a.length; i++) {
			if(a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(" Minimum value "  + min);
	}

}

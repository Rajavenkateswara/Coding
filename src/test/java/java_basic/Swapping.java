package java_basic;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Swapping the two numbers
		//By using 3rd variable 
		int a = 200;
		int b = 300;
		
		System.out.println("Before Swapping the number  : a = " + a + ", b = "+b);
		/*
		int temp =a;
		a = b;
		b = temp;
		
		System.out.println("After Swapping the number  : a = " + a + ", b = "+b);
		 // With out using 3rd variable By multification
		int x = 10;
		int y = 20;
		
		System.out.println("Before x = "+ x +":" + "y =" + y);
		x = x*y;
		y = x/y;
		x = x/y;
		System.out.println("After x = "+ x +":" + "y =" + y);
		
		// by using + and -
		int x1 = 200;
		int x2 = 400;
		System.out.println("before x = "+ x1 +":" + "y =" + x2);
		x1 = x1+x2;
		x2 = x1-x2;
		x1 = x1-x2;
		System.out.println("After x = "+ x1 +":" + "y =" + x2);
		
		*/
		b = a+b - (a=b);
		System.out.println("Before Swapping the number  : a = " + a + ", b = "+b);
		
		
	}

}

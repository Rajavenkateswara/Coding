package Iterations_numerics;

public class largestOfThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;int b =100; int c =450;
		/*
		if(a>b && a> c) {
			System.out.println("Largest Number a : " +a);
		}else if(b>a && b>c) {
			System.out.println("Largest number is b " + b);
		}else {
			System.out.println("lagest number is c " + c);
		}
		*/
		
		int largest =a > b ? a : b;
		System.out.println("largest number " + largest);
		
	    int larg1 = largest > c ? largest : c ;
	    System.out.println(larg1);
	    
	    int x=10;int y =2000; int z = 400;
	    
	    int l = (x >y ? x : y) > z ? (x >y ? x : y) : z ;
	    System.out.println(l);
	
	

	}

}

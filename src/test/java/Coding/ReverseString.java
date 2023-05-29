package Coding;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Rajavenkateswarlu";
		/*
		for(int i = str.length() -1 ; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
*/
		/*
		char []name = str.toCharArray();
		
		for(int i = name.length-1; i >= 0; i--) {
			System.out.println(name[i]);
		}
		*/
		StringBuffer stb = new StringBuffer(str);
		stb.append(str);
		System.out.println(stb.reverse());
	
		
	}

}

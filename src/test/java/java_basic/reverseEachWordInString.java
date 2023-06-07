package java_basic;

public class reverseEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str = "Welcome to selenium";
/*
		String[] words =str.split(" ");

		String reveseString = "";
		for( String w : words) {
			String revWord = "";
			for(int i = w.length()-1 ; i >=0; i--) {
				revWord = revWord + w.charAt(i);
			}
			System.out.println(revWord);
			reveseString = reveseString + revWord+ " ";
		}
		System.out.println(reveseString);
*/
		
		
		String words[] = str.split("\\s");
		
		String reverseString ="";
		
		for(String w : words) {
			
			StringBuffer sb = new StringBuffer(w);
			sb.reverse();
			
			//System.out.println(sb.toString());
			reverseString = reverseString + sb.toString()+ " ";
			//System.out.println(reverseString);
		}
		System.out.println(reverseString);


	}

}

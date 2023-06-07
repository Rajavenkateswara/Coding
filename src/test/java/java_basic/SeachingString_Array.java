package java_basic;

public class SeachingString_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name[] = {"Raja","Venkateswarlu","Karravula" , "Kdaparajupalli"};
		
		searchString(name, "r");

	}
	
	public static void searchString(String name[] , String identify) {
		for(int i = 0; i< name.length ;i++) {
			if(name[i].contains(identify)) {
				
				System.out.println(name[i]);
				
			}
		}
	}

}

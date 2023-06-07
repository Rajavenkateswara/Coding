package java_basic;

import java.util.HashSet;

public class Duplicates_Elements_String {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean status = false;
		
		int repat_count = 0;
		
		
		String name[] = {"Raja", "Venkateswarlu" , "Venkate","Rajesh","Raja","Raja"};
		/*
		for(int i = 0; i< name.length; i++) {
			for(int j = i+1; j<name.length ; j++) {
				if(name[i] == name[j]) {
					status = true;
					repat_count++;
					System.out.println("Elements are found " + name[i]);
				}
			}
		}
		System.out.println(repat_count);
		if(status == false) {
			System.out.println("Element are not found " );
		}
*/
		HashSet<String> nm = new HashSet<>();
		for(String names : name) {
			if(nm.add(names) == false) {
				status = true;
				repat_count++;
				System.out.println("Duplicates Elements are found " + names);
			}
			
		}
		System.out.println(repat_count);
		if(status == false) {
			System.out.println("Elements are not found");
		}
	}

}

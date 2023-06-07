package java_basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     ///C:\Users\rajav\Documents\AbstracClass.txt
		
		String file_path = "C:\\Users\\rajav\\Documents\\AbstracClass.txt";
		
		/*
		
		FileReader file = new FileReader(file_path);
		 
		BufferedReader br = new BufferedReader(file);
		
		String str;
		
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
		*/
		
		
		File file = new File (file_path);
		
		Scanner sc = new Scanner(file);
		
		
		//String str ; 
		/*
		while( sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		*/
		
		// With out using iterator
		sc.useDelimiter("\\z");
		System.out.println(sc.next());
		
		 
	}

}

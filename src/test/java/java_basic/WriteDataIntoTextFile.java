package java_basic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String file = "C:\\Users\\rajav\\Documents\\sample.txt";
		
		FileWriter fl = new FileWriter(file);
		
		BufferedWriter bw = new BufferedWriter(fl);
		bw.write("Raja venkateswarlu");
		bw.write("Stigentech");
		bw.write("Hyderabed");
		
		System.out.println("Finished!!!!");
		
		bw.close();
		

	}

}

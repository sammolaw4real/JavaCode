package day.Seven.fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendIO {

	
	
	
	public static void main(String[] args) {
		tryWithResource();
		
	
		
		
		
	}	
	public static void tryWithResource() {
			
			try(BufferedWriter br = new BufferedWriter(new FileWriter("Demo.text"))){
				
				String str = "This is demo File";
				br.write(str);
				br.newLine();
				br.write(str);
				
				
				
			}
			catch(IOException e) {
				System.out.println("File not found");
			}
		}

}

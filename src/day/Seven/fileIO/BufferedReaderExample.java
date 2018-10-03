package day.Seven.fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderExample {

	
	
	public static void main(String[] args) {
		tryWithResource();
		
		
		
		BufferedReader bufferedReader = null;
		
		try {
			
			String currLine;
			
			bufferedReader = new BufferedReader(new FileReader("Demo.text"));
			
			while((currLine = bufferedReader.readLine()) !=null ) {
				System.out.println(currLine);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (bufferedReader != null)
					bufferedReader.close();
			}
			catch(IOException ex) {
				ex.printStackTrace();
			}
		}

	}
	
	
	public static void tryWithResource() {
		
		try(BufferedReader br = new BufferedReader(new FileReader("Demo.text"))){
			
			
		}
		catch(IOException e) {
			System.out.println("File not found");
		}
	}
	
}
		

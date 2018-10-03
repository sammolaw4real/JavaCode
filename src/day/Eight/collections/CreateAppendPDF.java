package day.Eight.collections;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateAppendPDF {

	
	
	public static void main(String[] args) {
		
		try {
			
			String words = "\nI'm trying to do my part of the project" + 
							" I think doing it is very important if I really want to be a good programmer";
			
			File file = new File("test.pdf");
			
			if(!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file,true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(words);
			bw.close();
		
		} catch (IOException e) {
			
			System.out.println("Exception error occured");
			e.printStackTrace();
			
		
		}

	}

}

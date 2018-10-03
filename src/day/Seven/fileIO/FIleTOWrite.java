package day.Seven.fileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FIleTOWrite {
	
	
	
	public static void main(String[] args) {
		tryWithResource();

		
		try {
			
			String content = "Hello Java Student";
			File file =  new File("JavaStudent.txt");
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(content);
			bw.close();
			
			
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public static void tryWithResource() {
		
		try(BufferedWriter wb = new BufferedWriter(new FileWriter("Demo.text"))){
			
			String str = "Hello learner this is try with resuorce class and method";
			wb.write(str);
		}
		catch(IOException e) {
			System.out.println("An IO excdption");
			e.getMessage();
		}
	}

}

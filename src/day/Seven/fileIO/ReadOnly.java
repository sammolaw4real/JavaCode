package day.Seven.fileIO;

import java.io.File;

public class ReadOnly {

	
	static File file = new File("Demo.text");
	
	public static void main(String[] args) {
		readOnly();

		file.setWritable(true);
		
		File newfile = new File("DemoNew.txt.");
		file.renameTo(newfile);

	}
	
	private static void readOnly() {
		File file = new File("Demo.text");
		
		if(file.exists()) {
			
			file.setReadOnly();
		}
		else {
			
			System.out.println("File not found");
		}
		
		
		
	}

}

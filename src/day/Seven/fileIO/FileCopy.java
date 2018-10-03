package day.Seven.fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopy {

	
	
	public static void main(String[] args) throws IOException {
		//fileCopyUsingNIOFiles();
		fileCopyUsingFileChannelClass();
		

	}

	
	private static void fileCopyUsingNIOFiles() throws IOException {
		
		Path source = Paths.get("DemoOne.text");
		Path destination = Paths.get("DemoNew.txt.");
		
		Files.copy(source, destination,StandardCopyOption.REPLACE_EXISTING);
		
	}
	
	private static void fileCopyUsingFileChannelClass() throws IOException {
		
		File fileToCopy = new File("test.txt");
		FileInputStream fileInputStream = new FileInputStream(fileToCopy);
		FileChannel in = fileInputStream.getChannel();
		
		File newFile = new File("TestCopy.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(newFile);
		FileChannel out = fileOutputStream.getChannel();
		
		in.transferTo(0, fileToCopy.length(), out);
		//in.close();
		//out.close();
				
			
		
	}
}

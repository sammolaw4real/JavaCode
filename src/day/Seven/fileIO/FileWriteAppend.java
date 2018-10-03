package day.Seven.fileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteAppend {

	
	
	public static void main(String[] args) throws IOException {
		usingPrinterWriter();
		usingFileOutPutStream();

	}
	
	
	public static void usingPrinterWriter() throws IOException {
		
		String text = "Using PrinterWriter class";
		FileWriter fileWriter = new FileWriter("Demo.text", true);
		
		PrintWriter pw = new PrintWriter(fileWriter);
		pw.println(text);
		pw.print(text);
		pw.close();
	}
	
	public static void usingFileOutPutStream() throws IOException {
		
		String text = "Using File Out Put  Stream";
		FileOutputStream fps = new FileOutputStream("DemoOne.text",true);
		byte[]strTobytes = text.getBytes();
		fps.write(strTobytes);
		fps.close();
		
	}

}

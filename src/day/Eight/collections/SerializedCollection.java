package day.Eight.collections;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;

public class SerializedCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<String> nameList = new HashSet<>();
		
		nameList.add("Alex");
		nameList.add("Brian");
		nameList.add("Charles");
		
		System.out.println(nameList);
		
		try {
			FileOutputStream outputStream = new FileOutputStream("NameList.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
			objectOutputStream.writeObject(nameList.toString());
			objectOutputStream.close();
			outputStream.close();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

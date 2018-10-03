package day.Eight.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class CompareTwoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		compareTwoList();

	}
	
	
	public static void compareTwoList() {
		LinkedList<String> listOne= new LinkedList<>(Arrays.asList("A","B","B","C","D","E","B"));
		LinkedList<String> listTwo = new LinkedList<>(Arrays.asList("A","B","B","C","D","F"));
		
		Collections.sort(listOne);
		Collections.sort(listTwo);
		
		boolean isEqual = listOne.equals(listTwo);
		System.out.println(isEqual);
		
//		listOne.removeAll(listTwo);
//		System.out.println(listOne);
//		
//		listTwo.removeAll(listOne);
//		System.out.println(listTwo);
		
		listOne.retainAll(listTwo);
		System.out.println(listOne);
		
		System.out.println(listOne.get(3));
		System.out.println(listTwo.indexOf("B"));
		
		int lastIndex = listOne.lastIndexOf("B");
		System.out.println(lastIndex);
		
		ArrayList<String> subList = new ArrayList<>(listOne.subList(2, 4));
		System.out.println(subList);
	
		
		
	
	}

}

package day.Eight.collections;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
		list1.add(3);
		list1.add(5);
		list1.add(7);
		
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(100);
		list2.add(200);
		
		System.out.println(list2);
		
		list1.addAll(list2);
		System.out.println(list1);
		
		list1.clear();
		System.out.println(list1);
		
		
	}

}

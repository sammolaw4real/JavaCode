package day.Eight.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	
	
	public static void main(String[] args) {
		
		ArrayLIstInt();
		
		/*List<String> list = new ArrayList<>();
		ArrayList<String> list1 = new ArrayList<>();
		
		list.add("Steve");
		list.add("Tom");
		list.add("Path");
		list.add("Chanele");
		list.add("Lashana");
		list.add("Steve");
		list.add("Timmy");
		list.add("Guy");
		list.add("Michelle");
		
		list1.add("Agela");
		list1.add("Angel");
		list1.add("Chenaya");
		list1.add("David");
		list1.add("Chris");
		list1.add("Agela");
		
		System.out.println(list);
		System.out.println(list.remove("Steve"));
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list1);
		
		
		for (String st : list) {
			
			System.out.print(st);
			System.out.print("\t");
		}*/
		

	}
	
	public static void ArrayLIstInt() {
		
		List<Integer> newList = new ArrayList<>();
		
		System.out.println(newList.size());
		
		newList.add(4);
		newList.add(3);
		newList.add(5);
		newList.add(2);
		newList.add(8);
		
		System.out.println(newList.size());
		
		System.out.println(newList.remove(1));
		System.out.println(newList.remove(3));
		System.out.println(newList.size());
		
		for (Integer num : newList) {
			
			System.out.print(num);
		
		}
	}

}

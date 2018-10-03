package day.Eight.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class LinkedListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Falls Church");
		linkedList.add("Mclean");
		linkedList.add("DC");
		
		
 		System.out.println(linkedList);
		System.out.println("Size Of linked list is  :" + linkedList.size());
 		linkedList.add(1, "Alexandira");
		System.out.println(linkedList);
 		for (String str : linkedList) {
			System.out.println(str);
		}
 		Iterator it = linkedList.iterator();
		while (it.hasNext()) {
			System.out.println("This is via iterator class " + it.next());
		}
		
		Vector<String> vector = new Vector<>();
	}

}

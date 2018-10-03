package day.Eight.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SortingMaps {

	public static void main(String[] args) {
		
		
		HashMap <Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(5, "A");
		hmap.put(11, "C");
		hmap.put(4, "Z");
		hmap.put(77, "Y");
		hmap.put(9, "P");
		hmap.put(66, "Q");
		hmap.put(0, "R");
		
		
		
		//Code for sorting by value not by key//
		
		System.out.println("Before Sorting");
		System.out.println(hmap);
		
		Map<Integer, String> map = new TreeMap<>(hmap);
		
		System.out.println("After Sorting");
		System.out.println(map);
		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			
			Map.Entry me = (Map.Entry)it.next();
			System.out.println("Key: " + me.getKey() + "  Values: " + me.getValue());

	
		}
	}

}

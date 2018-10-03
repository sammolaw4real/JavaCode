package day.Eight.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortingMap2 {

	
	
	
	public static void main(String[] args) {
		
		System.out.println("Before sorting " + getHashMap());
		Map<Integer, String> map = new TreeMap<>(getHashMap());
		System.out.println(map);
		

	}

	public static HashMap getHashMap() {
		
		HashMap <Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(5, "A");
		hmap.put(11, "C");
		hmap.put(4, "Z");
		hmap.put(77, "Y");
		hmap.put(9, "P");
		hmap.put(66, "Q");
		hmap.put(0, "R");
		return hmap;
		
	}
	
}

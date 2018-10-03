package day.Eight.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIntro {

	
	
	
	
	
	public static void main(String[] args) {
		
		
		// Name of classs <K,V> name of map = new name of the map<K,V>();
		
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(1, "Java");
		hmap.put(2, "C#");
		hmap.put(3, "Python");
		
		System.out.println(hmap);
		
		for(Map.Entry me: hmap.entrySet()) {
			
			System.out.println("Key: "+ me.getKey() + " Value: " + me.getValue());
			
		}

		Iterator it = hmap.entrySet().iterator();
		while(it.hasNext()) {
			
			Map.Entry me = (Map.Entry)it.next();
			System.out.println("Key: " + me.getKey() + "  Values: " + me.getValue());
			
		}
		
	}

}

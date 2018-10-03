package day.Six.OOP3;

import java.util.HashMap;

public class FIndSameString {

	static void sameFindString(String st) {
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		String[] s = st.split(" ");
		
		for (String hold : s) {
			
			if(hm.get(hold)!= null) {
				hm.put(hold, hm.get(hold) + 1);
			}
			
			else{
				hm.put(hold, 1);
			}
			
		}
		
		System.out.println(hm);
		
		for () {
			
		}
	}
	
	public static void main(String[] args) {
		
		sameFindString("Jesus is the great great teacher");
		
	}

}

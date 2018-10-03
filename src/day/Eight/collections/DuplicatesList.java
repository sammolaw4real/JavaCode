package day.Eight.collections;

import java.util.ArrayList;

public class DuplicatesList {

	
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		
		list2.add(5);
		list2.add(6);
		list2.add(8);
		list2.add(9);
		
		
		
		list1.addAll(list2);
		
		System.out.println(list1);
		
		for (int i = 0; i < list1.size(); i++)  {
			
			for (int j=  i+ 1; j < list1.size(); j++) {
				
				if(list1.get(i)==(list1.get(j))){ 
				
					list1.remove(j);
					
					//System.out.println(list1);
				}
				
			}
			
			
		}
		System.out.println(list1);
	}

}
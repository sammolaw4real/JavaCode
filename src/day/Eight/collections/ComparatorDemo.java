package day.Eight.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	
	
	public static void main(String[] args) {
		
		List<Author> list = new ArrayList<>();
		
		list.add(new Author("Henry", "Tropic of Can", 45));
		list.add(new Author("Nalo", "300", 56));
		list.add(new Author("Frank", "Men search for meaning", 89));
		list.add(new Author("Deborah", "Sky boys", 62));
		list.add(new Author("George", "Game of throne", 38));
		
		
		System.out.println("Sorting with First Name============");
		Collections.sort(list);
		for (Author au : list) {
			System.out.println(au);
		}
		
		System.out.println("Sorting with Author's Age============");
		Collections.sort(list, new AutorAge());
		for (Author au : list) {
			System.out.println(au);
		}
		
		System.out.println("Sorting with Book Name============");
		Collections.sort(list, new BookName());
		for (Author au : list) {
			System.out.println(au);
		}
		

	}

}

class Author implements Comparable<Author>{
	
	String fName, bookName;
	int auAge;
	
	public Author(String fName, String bookName, int auAge) {
		super();
		this.fName = fName;
		this.bookName = bookName;
		this.auAge = auAge;
	}
	
	
	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public int getAuAge() {
		return auAge;
	}


	public void setAuAge(int auAge) {
		this.auAge = auAge;
	}


	@Override
	public String toString() {
		return "Author [fName=" + fName + ", bookName=" + bookName + ", auAge=" + auAge + "]";
	}


	@Override
	public int compareTo(Author o) {
		// TODO Auto-generated method stub
		return this.fName.compareTo(o.fName);
	}
	
}
	
	



class AutorAge implements Comparator<Author>{

	@Override
	public int compare(Author o1, Author o2) {
		
			
			if(o1.auAge == o2.auAge) {
				return 0;
			}
			else if(o1.auAge > o2.auAge){
				return 1;
			}
			else {
				return -1;
				
			}
		
	
	}
	
}

class BookName implements Comparator<Author>{

	@Override
	public int compare(Author o1, Author o2) {
		
		return o1.bookName.compareTo(o2.bookName);
	}
	
	
}
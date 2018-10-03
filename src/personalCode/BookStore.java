package personalCode;

public class BookStore {

	String name;
	int price; 
	
	BookStore(String name, int price){
		this.name = name;
		this.price = price;
	
	}
	
	void display() {
		System.out.println("Book Name: " + name);
		System.out.println("Price: " + "$" + price);
	}
	
	
	public static void main(String[] args) {
		
		BookStore bs = new BookStore( "Java Beginner", 30);
		
		BookStore bs1 = new BookStore( "Learn Programming", 40);
		
		bs.display();
		
		bs1.display();

	}

}

package day.Eight.collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class ComparatorAssign {
	//fname, lname, payment, date, id using comparator
	
	
	public static void main(String[] args) throws ParseException {
	
		List<CustomerDetail> newList = new ArrayList<>();
		
		newList.add(new CustomerDetail("Tom", "Brady", 10000, 001,new SimpleDateFormat("MM/dd/yyyy").parse("03/12/1980")));
		
		newList.add(new CustomerDetail("Jim", "Scot", 12000, 005,new SimpleDateFormat("MM/dd/yyyy").parse("08/11/1976")));
		
		newList.add(new CustomerDetail("Zack", "Vishawn", 13000, 002,new SimpleDateFormat("MM/dd/yyyy").parse("05/09/1999")));
		
		
		
		System.out.println("Sorting by Date===========");
		Collections.sort(newList);
		
		for (CustomerDetail cd : newList) {
			
			System.out.println(cd);
		}
			
		System.out.println("\nSorting by First-name=============");
		Collections.sort(newList, new Payment());
		
		for (CustomerDetail cd : newList) {
			
			System.out.println(cd);
		}
		
	}
	
}

	
	class CustomerDetail implements Comparable<CustomerDetail>{
		
		String fName, lName;
		int payment;
		int id;
		Date date;
		
		
		
		
		
		@Override
		public int compareTo(CustomerDetail o) {
			// TODO Auto-generated method stub
			return this.date.compareTo(o.date);
		}


		public CustomerDetail(String fName, String lName, int payment, int id, Date date) {
			super();
			this.fName = fName;
			this.lName= lName;
			this.payment = payment;
			this.id = id;
			this.date = date;
		}
		
		
		
		public String getfName() {
			return fName;
		}


		public void setfName(String fName) {
			this.fName = fName;
		}


		public String getlName() {
			return lName;
		}


		public void setlName(String lName) {
			this.lName = lName;
		}


		public int getPayment() {
			return payment;
		}


		public void setPayment(int payment) {
			this.payment = payment;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public Date getDate() {
			return date;
		}


		public void setDate(Date date) {
			this.date = date;
		}


		@Override
		public String toString() {
			return "CustomerDetail [fName=" + fName + ", lName=" + lName + ", payment=" + payment + ", id=" + id
					+ ", date=" + date + "]";
		}


	}
	
class FName implements Comparator<CustomerDetail>{

	@Override
	public int compare(CustomerDetail o1, CustomerDetail o2) {
		// TODO Auto-generated method stub
		return o1.fName.compareTo(o2.fName);
	}
	
	
}


class Payment implements Comparator<CustomerDetail>{

	@Override
	public int compare(CustomerDetail o1, CustomerDetail o2) {
		// TODO Auto-generated method stub
		
		if(o1.payment == o2.payment) {
			return 0;
		}
		else if(o1.payment > o2.payment){
			return 1;
		}
		else {
			return -1;
			
		}
		
	}
	
	
	
	
}



















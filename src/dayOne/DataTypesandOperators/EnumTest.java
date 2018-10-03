package dayOne.DataTypesandOperators;


public class EnumTest {

	
	public static void main(String[] args) {
		

		Week w1 = Week.MON;
		Week w2 = Week.TUES;
		Week w3 = Week.WED;
		Week w4 = Week.THUR;
		Week w5 = Week.FRI;
		Week w6 = Week.SAT;
		Week w7 = Week.SUN;
		
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);
		System.out.println(w4);
		System.out.println(w5);
		System.out.println(w6);
		System.out.println(w7);
		
		
	}
	
	enum Week{
		
		MON,TUES,WED,THUR,FRI,SAT,SUN 
		
		
	}

}

package dayTwo.Expression;

public class TypeCasting {

	//Implicit Casting - Widening the range
	//Explicit Casting - Narrowing the range
	
	
	public static void main(String[] args) {
		
		int i = 100;
		
		long l = i;
		
		float f = l;
		
		char c = 'c';
		
		int num = 66; 
		
		c = (char)num;
		
		byte b = (byte)num;
		
		double d = 110.24;
		long l1 = (long)d;
		
		System.out.println(b);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		
		System.out.println(c);
		
		System.out.println(l1);
		
	}

}
